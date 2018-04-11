/**
 * Artisan.java
 */
package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import entity.Artisan;
import entity.Project;
import entity.TechAndArVo;

/**
 * @author SGY
 * @date 2018年3月26日
 * 技术人员类dao
 */
public interface ArtisanMapper {
	/**
	 * 增加技术人员
	 * @param artisan
	 */
	public void insert(Artisan artisan);
	/**
	 * 根据id删除技术人员
	 * @param id
	 */
	public void delete(Artisan artisan);
	/**
	 * 根据供应商id和技术id查询技术人员
	 */
	public List<Artisan> findAllBySupAndTech(@Param(value="supid")int supid,@Param(value="techid")int techid);
	/**
	 * 
	 * 根据供应商和技术查询正在工作的数量
	 *
	 */
	//高级
	public int findArtisanByTechIdAndSupIdAndCountAndHsenior(Artisan at);
	//中级
	public int findArtisanByTechIdAndSupIdAndCountAndHmiddle(Artisan at);
	//低级
	public int findArtisanByTechIdAndSupIdAndCountAndHlow(Artisan at);
	/**
	 * 停止工作的数量
	 * @param at
	 * @return
	 */
	//高级
	public int findArtisanByTechIdAndSupIdAndCountAndSsenior(Artisan at);
	//中级
	public int findArtisanByTechIdAndSupIdAndCountAndSmiddle(Artisan at);
	//低级
	public int findArtisanByTechIdAndSupIdAndCountAndSlow(Artisan at);
	//查询员工具体的状态
	public List<Artisan> findArtisanByTechIdAndSupIdANDState(Artisan at);
	//根据ID查询技术员详细信息
	public Artisan findById(Artisan at);
	//根据ID修改技术人员
	public void updateById(Artisan as);
	//根据项目ID求技术和人员数
	public List<TechAndArVo> findTechAndArVo(Project pr);
	//根据项目id查询总数量
	public int findCount(Project pr);
	//人员表 根据项目 id 全部为技术表ID为0，项目id为0状态为1
	public void updateByPrId(Project pr);
	/**
	 * 根据技术人员修改是否在项目的状态
	 * @param artName void
	 */
	public void updateArtState(@Param(value="art_id")int art_id);
	/**
	 * 根据技术名称返回所有相关技术人员
	 * @param tech_name
	 * @return List<Artisan>
	 */
	public List<Artisan> findArtisanByTech(@Param(value="tech_id")int id);
	/**
	 * 根据项目名称查询所做该项目的技术人员
	 * @param projectName
	 * @return List<Artisan>
	 */
	public List<Artisan> findArtByProjectName(@Param(value="projectName")String projectName);


	
	
	
}
