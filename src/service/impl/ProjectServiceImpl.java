package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.Project;
import mapper.ProjectMapper;
import service.ProjectService;
@Service("projectService")
public class ProjectServiceImpl implements ProjectService {
	@Autowired
	public ProjectMapper projectMapper;
	/**
	 * 查询项目库信息
	 */
	public List<Project> findProject(int role_id) {
		List<Project> listproject = projectMapper.findAllProject(role_id);
		return listproject;
	}
	@Override
	public void updateProjectMgr(String projectMgr,String projectName) {
		projectMapper.updateProjectMgr(projectMgr,projectName);
	}
	/* (non-Javadoc)
	 * @see service.ProjectService#findArtByProid(int)
	 */
	@Override
	public List<Project> findArtByProid(int id) {
		return projectMapper.selectArtByProid(id);
	}

}
