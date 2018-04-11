package mapper;

import entity.User;
import entity.UserAndRole;

/**
 * 用户角色关联表的接口类
 * @author 晓煜
 * @date2018年3月26日下午3:57:02
 * @version
 * @explain
 */
public interface UserAndRoleMapper {
	/**
	 * 给用户分配角色
	 * @param userAndRole
	 */
	public void saveUserAndRole(UserAndRole userAndRole);
	/**
	 * 删除用户角色关系
	 * @param userAndRole
	 */
	public void removeUserAndRole(User user);
	/**
	 * 修改用户角色关系
	 * @param userAndRole
	 */
	public void updateUserAndRole(UserAndRole userAndRole);
	/**
	 * 查询是否存在记录
	 * @param userAndRole
	 * @return
	 */
	public UserAndRole getUserAndRole(UserAndRole userAndRole);
	
}
