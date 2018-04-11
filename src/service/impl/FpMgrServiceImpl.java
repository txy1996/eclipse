/**
 * FpMgrServiceImpl.java
 */
package service.impl;

import java.util.LinkedList;
import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;

import entity.Artisan;
import entity.SupAndTech;
import entity.Supplier;
import entity.Tech;
import entity.WorkFlow;
import mapper.ArtisanMapper;
import mapper.SupAndTechMapper;
import mapper.SupplierMapper;
import mapper.TechMapper;
import mapper.WorkFlowMapper;
import service.FpMgrService;

/**
 * @author SGY
 * @date 2018年3月27日
 */
@Service("fpMgrService")
public class FpMgrServiceImpl implements FpMgrService {
	@Resource
	private SupplierMapper supMapper;
	@Resource
	private ArtisanMapper artMapper;
	@Resource
	private TechMapper techMapper;
	@Resource
	private SupAndTechMapper satMapper;
	@Resource
	private WorkFlowMapper workFlowMapper;
	private static final int START = 1;//表示当时处于开始状态
	private static final int STOP = 0;//表示当前处于暂停状态

	/* (non-Javadoc)
	 * @see service.FpMgrService#searchAll()
	 */
	@Override
	public List<Supplier> searchAll() {
		return supMapper.selectAll();
	}

	/* (non-Javadoc)
	 * @see service.FpMgrService#searchBySupId(int)
	 */
	@Override
	public List<Supplier> searchBySupId(int supId) {
		return supMapper.findBySupid(supId);
	}

	/* (non-Javadoc)
	 * @see service.FpMgrService#searchBySupIdAndTechid(int, int)
	 */
	@Override
	public List<Artisan> searchBySupIdAndTechid(int supId, int techId) {
		return artMapper.findAllBySupAndTech(supId, techId);
	}

	/* (non-Javadoc)
	 * @see service.FpMgrService#addFp(java.lang.String)
	 */
	@Override
	public void addFp(String fp) {
		Supplier sup = new Supplier();
		sup.setSupperlier_name(fp);
		supMapper.insert(sup);
	}

	/* (non-Javadoc)
	 * @see service.FpMgrService#addTech(java.lang.String)
	 */
	@Override
	public SupAndTech addTech(String fp,String tech) {
		//判断有无此技术
		Tech t = null;
		t = techMapper.findByName(tech);
		if(t==null){
			t = new Tech();
			//增加技术类型
			t.setTech_name(tech);
			techMapper.insert(t);
			//获取技术类型id
			t = techMapper.findByName(t.getTech_name());
		}
		//获取供应商id
		Supplier supplier = new Supplier();
		supplier = supMapper.findBySupname(fp);
		//将技术类型添加到供应商
		SupAndTech sat = new SupAndTech();
		sat.setSup_id(supplier.getId());
		sat.setTech_id(t.getId());
		satMapper.insert(sat);
		return sat;
	}

	/* (non-Javadoc)
	 * @see service.FpMgrService#addEngin(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public Artisan addEngin(String fp, String tech, String art, String level) {
		//获取供应商id
		Supplier supplier = new Supplier();
		supplier = supMapper.findBySupname(fp);
		//获取技术类型id
		Tech t = new Tech();
		t = techMapper.findByName(tech);
		//增加技术人员
		Artisan artisan = new Artisan();
		artisan.setArt_name(art);
		artisan.setArt_type(level);
		artisan.setSalary(100);
		artisan.setSup_id(supplier.getId());
		artisan.setTech_id(t.getId());
		artMapper.insert(artisan);
		return artisan;
	}
	@Override
	public boolean updateArtState(int art_id) {
		artMapper.updateArtState(art_id);
		return true;
	}

	@Override
	public List<Artisan> findArtisanByTech(int tech_id) {
		return artMapper.findArtisanByTech(tech_id);
	}

	/* (non-Javadoc)
	 * @see service.FpMgrService#delEngin(int, int, int)
	 */
	@Override
	public boolean delEngin(int supId, int techId, int id) {
		if(supId>0 && techId>0 && id>0){//删除技术人员
			Artisan artisan = new Artisan();
			artisan.setId(id);
			artisan.setSup_id(supId);
			artisan.setTech_id(techId);
			artMapper.delete(artisan);
		}else if(supId>0 && techId>0 && id==-1){//删除供应商和技术类型关系
			SupAndTech sat = new SupAndTech();
			sat.setSup_id(supId);
			sat.setTech_id(techId);
			satMapper.delete(sat);
			Artisan artisan = new Artisan();
			artisan.setSup_id(supId);
			artisan.setTech_id(techId);
			artMapper.delete(artisan);
		}else if(supId>0 && techId==-1 && id==-1){//删除供应商
			//删除该供应商旗下所有技术人员
			Artisan artisan = new Artisan();
			artisan.setSup_id(supId);
			artMapper.delete(artisan);
			//删除供应商和技术类型关系
			SupAndTech sat = new SupAndTech();
			sat.setTech_id(supId);
			satMapper.delete(sat);
			//删除供应商
			supMapper.delete(supId);
		}else{
			return false;
		}
		return true;	
	}

	@Override
	public List<Integer> calWorkFlow(int art_id) {
		int hour;//每一段工作的时间差，以小时计算
		List<Integer> listhour = new LinkedList<Integer>();
		//查询该员工每一段的开始时间
		List<WorkFlow> listStart = workFlowMapper.findStartTime(art_id);
		//查询该员工每一段的结束时间
		List<WorkFlow> listEnd = workFlowMapper.findEndTime(art_id);
		for(int i=0;i<listEnd.size();i++){
			WorkFlow start = listStart.get(i);//得到每一段的开始时间
			WorkFlow end = listEnd.get(i);//得到每一段的结束时间
			String startDay = start.getStarttime();
			String str = startDay.substring(8, 10);//得到开始时间的日期
			String startHour = start.getStarttime();
			String str2 = startHour.substring(11, 13);//得到开始时间的小时
			String endDay = end.getEndtime();
			String str3 = endDay.substring(8, 10);//得到技术的日期
			String endHour = end.getEndtime();
			String str4 = endHour.substring(11, 13);//得到结束时间的小时
			int startD = Integer.parseInt(str);
			int startH = Integer.parseInt(str2);
			int endD = Integer.parseInt(str3);
			int endH = Integer.parseInt(str4);
			hour = 24*(endD-startD)+(endH-startH);
			listhour.add(hour);
		}
		if(listStart.size()>listEnd.size()){
			listhour.add(START);
		}else{
			listhour.add(STOP);
		}
		return listhour;
	}

	@Override
	public List<Artisan> findArtByProjectName(String projectName) {
		
		return artMapper.findArtByProjectName(projectName);
	}
}
