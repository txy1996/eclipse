/**
 * LogService.java
 */
package service;

import java.util.List;

import entity.LogInfo;

/**
 * @author SGY
 * @date 2018年3月26日
 */
public interface LogService {
	/**
	 * 按项目名、登录用户、登录时间查询
	 * @param projectname
	 * @param username
	 * @param time
	 * @return
	 */
	public List<LogInfo> search(String projectname,String username,String time);
	/**
	 * 查询所有日志信息
	 * @return
	 */
	public List<LogInfo> searchAll();
}
