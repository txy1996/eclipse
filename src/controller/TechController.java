package controller;

import java.util.List;
import org.apache.ibatis.annotations.ResultMap;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import entity.Artisan;
import entity.Project;
import entity.Role;
import entity.Tech;
import entity.Supplier;
import entity.TechVo;
import entity.WorkFlow;
import service.TechService;

/**
 * 
 * @author 陈光辉 技术经理页面 2018年3月27日
 */
@Controller
public class TechController {

	@Autowired
	private TechService ts;
	/**
	 * 项目库
	 */
	@RequestMapping("/zhiliaotang/project.action")
	public @ResponseBody
	List<Project> findProject(Role rl) {
		System.out.println(rl);
		ModelAndView mv = new ModelAndView();
		List<Project> pro = ts.findProject(rl);
		System.out.println(pro.get(0).getId());
		System.out.println(pro.get(1).getId());
		System.out.println(pro.get(2).getId());
		System.out.println("什么鬼呀");
		return pro;
		
	}
	@RequestMapping("/zhiliaotang/myproject.action")
	public void findMyProject() {
		
	}
	/**
	 * FP透视
	 * 
	 * @return
	 */
	// 查找供应商名称
	@RequestMapping("/zhiliaotang/Supplier.action")
	public @ResponseBody
	List<Supplier> findBySupplier() {
		TechVo vo = ts.findBySupplier();
		return vo.getSuppliers();

	}
	//查找供应商名称对应的技术类型
	@RequestMapping("/zhiliaotang/Tech.action")
	public @ResponseBody
	Supplier findTechBySupplierId(Supplier su) {
		su.setId(1);
		TechVo vo = ts.findTechBySupplierId(su);
		return vo.getSupplier();
	}
	
	//传入3个外键
	// 查询数量根据供应商类型和技术类型数量
	@RequestMapping("/zhiliaotang/ArtisanCount.action")
public  @ResponseBody
		TechVo findArtisanByTechIdAndSupIdAndCount(Artisan at) {
		System.out.println(at);
		TechVo vo = ts.findArtisanByTechIdAndSupIdAndCount(at);
		System.out.println(vo);
		return vo;
	
	}

	// 根据供应商，技术类型，没在工作状态的员工
	@RequestMapping("/zhiliaotang/Artisan.action")
	public @ResponseBody
	List<Artisan> findArtisanByTechIdAndSupIdANDState(Artisan at) {
		/*at.setState(1);//固定
		at.setSup_id(1);
		at.setTech_id(1);*/
		System.out.println(at);
		return ts.findArtisanByTechIdAndSupIdANDState(at);

	}
	
/*	@RequestMapping("/zhiliaotang/findCount.action")
	public void findArtisanByTechIdAndSupIdAndCount() {
		
		
		
		
		
		
	}*/
	
	
	
	
	
	
	
	//供应商id 技术类型id 技术人员id 项目id
	//返回已分配未分配人数
	@RequestMapping("/zhiliaotang/updateArtisan.action")
	public void updateArtisanAndWorkflowAndProjectAndSup_tech(Artisan at , Project pr) {
		
		at.setId(1);
		at.setSup_id(1);
		at.setTech_id(1);
		System.out.println(at);
		pr.setId(1);
		
		// 返回的是已分配未分配的人数
		TechVo vo = ts.updateArtisanAndWorkflowAndProjectAndSup_techAdd(at,pr);
		// 没在工作状态的员工具体的
		List<Artisan> list = ts.findArtisanByTechIdAndSupIdANDState(at);
		
	}
	/**
	 * 	//点击模式重置 根据项目 id 项目表供应商外键为0，工程师总数为0，供应商外键为0，
		//人员表 根据项目 id 全部为技术表ID为0，项目id为0状态为1
		//工作流程表根据项目id 删除
	 * @param 陈光辉
	 */
	@RequestMapping("/zhiliaotang/updateMode.action")
	public void updateMode(Project pr) {
		

		ts.updateMode(pr);
		

	}
	@ResponseBody
	@RequestMapping("findTechTypeByProjectName.action")
	public List<Tech> findAllTech(String projectName){
		return ts.findAllTech(projectName);
	}

}