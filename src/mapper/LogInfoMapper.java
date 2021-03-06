/**
 * LoginInfoMapper.java
 */
package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import entity.LogInfo;

/**
 * @author SGY
 * @date 2018年3月26日
 * 日志信息dao
 */
public interface LogInfoMapper {
	/**
	 * 增加日志信息
	 * @param log
	 */
	public void insert(LogInfo log);
	/**
	 * 按项目名、登录用户、登录时间查询
	 * 输入值为空即全查
	 * @param projectname
	 * @param username
	 * @param date
	 * @return
	 */
	public List<LogInfo> selectProAndNameAndDate(@Param(value="project_name")String projectname,@Param(value="login_username")String username,@Param(value="time")int date);
	/**
	 * 查询所有日志信息
	 * @return
	 */
	public List<LogInfo> selectAll();
}
