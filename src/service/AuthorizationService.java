package service;

import java.util.List;

import entity.Auth;
import entity.Dept;
import entity.Role;
import entity.User;
import entity.UserAndRole;
import mapper.UserAndRoleMapper;
/**
 * 权限设置的service的接口类
 * @author 晓煜
 * @date2018年3月27日上午10:55:08
 * @version
 * @explain
 */
public interface AuthorizationService {
	/**
	 * 添加用户
	 * @param user
	 * 
	 */
	public void saveUser(User user);

	/**
	 * 刷新用户
	 * @return
	 */
	public List<User> listUser();
	/**
	 * 删除用户
	 * @param user
	 */
	public void removeUser(User user);
	/**
	 * 查询用户详细信息
	 * @param user
	 * @return
	 */
	public User getUserIdDetails(User user);
	/**
	 * 刷新角色
	 * @return
	 */
	public List<Role> listRole();
	
	
	/**
	 * 增加角色
	 * @param role
	 */
	public void saveRole(Role role);
	/**
	 * 删除角色
	 * @param role
	 */
	public void removeRole(Role role);
	/**
	 * 刷新部门
	 * @return
	 */
	public List<Dept>lisrDept();
	/**
	 * 添加部门
	 * @param dept
	 */
	public void saveDept(Dept dept);
	/**
	 * 删除部门
	 * @param dept
	 */
	public void removeDept(Dept dept);
	/**
	 * 修改员工部门
	 * @param user
	 */
	public void updateUserDept(User user);
	/**
	 * 修改用户角色
	 * @param userAndRole
	 */
	public void updateUserAndRole(UserAndRole userAndRole);
	/**
	 * 查询权限信息
	 * @return
	 */
	public List<Auth> listAuth();
}
