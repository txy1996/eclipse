/**
 * FpMgrService.java
 */
package service;

import java.util.List;

import entity.Artisan;
import entity.SupAndTech;
import entity.Supplier;

/**
 * @author SGY
 * @date 2018年3月26日
 * FP供应商管理、OTM资源管理
 */
public interface FpMgrService {
	/**
	 * 查询所有供应商
	 * @return
	 */
	public List<Supplier> searchAll();
	/**
	 * 根据供应商id查询所有技术类型
	 * @return
	 */
	public List<Supplier> searchBySupId(int supId);
	/**
	 * 根据供应商id和技术类型id查询所有技术人员
	 * @return
	 */
	public List<Artisan> searchBySupIdAndTechid(int supId,int techid);
	/**
	 * 增加供应商
	 * @param fp
	 */
	public void addFp(String fp);
	/**
	 * 增加技术类型
	 * @param fp
	 */
	public SupAndTech addTech(String fp,String tech);
	/**
	 * 增加技术人员
	 * @param fp
	 */
	public Artisan addEngin(String fp,String tech,String art,String level);
	/**
	 * 修改技术人员此时是否在项目的状态
	 *  void
	 */
	public boolean updateArtState(int art_id);
	/**
	 * 根据技术返回相关技术人员
	 * @param tech_name
	 * @return List<Artisan>
	 */
	public List<Artisan> findArtisanByTech(int id);
	/**
	 * 根据项目名称查询所做该项目的技术人员
	 * @param projectName
	 * @return List<Artisan>
	 */
	public List<Artisan> findArtByProjectName(String projectName);
	
	/**
	 * 删除供应商、技术类型、技术人员
	 * @param supId
	 * @param techId
	 * @param id
	 * @return
	 */
	public boolean delEngin(int supId,int techId,int id);
	/**
	 * 
	 * @param art_id
	 * @return String
	 */
	public List<Integer> calWorkFlow(int art_id);
}
