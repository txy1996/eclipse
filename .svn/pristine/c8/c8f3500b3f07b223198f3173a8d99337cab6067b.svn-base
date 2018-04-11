package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import entity.Project;
import entity.TechVo;
/**
 * 
 * @ProjectMapper.java
 * @author 谭加益
 * @time 2018年3月27日上午11:12:12
 */
public interface ProjectMapper {
	/**
	 * 根据不同角色登陆,传入不同参数查询所有项目信息
	 * @return List<Project>
	 */
	public List<Project> findAllProject(@Param(value="role_id")int role_id);
	/**
	 * 通过VO更新项目
	 * @param vo
	 */
	public void UpdateProjectAdd(Project pj);
	/**
	 * 通过id查询项目详细信息
	 * @param id
	 * @return
	 */
	public Project findById(int id);
	/**
	 * //点击模式重置 根据项目 id 项目表供应商外键为0，工程师总数为0
	 * @param pr
	 */
	public void updateSuAndAr(Project pr);
	/**
	 * 根据项目名称修改项目经理名称
	 * @param projectName
	 * @param projectMgr void
	 */
	public void updateProjectMgr(@Param(value="projectMgr")String projectMgr,@Param(value="projectName")String projectName);
	/**
	 * 根据项目id查询技术人员
	 * @param proId
	 * @return
	 */
	public List<Project> selectArtByProid(int proId);
}
