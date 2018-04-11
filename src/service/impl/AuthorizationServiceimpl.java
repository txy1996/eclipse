package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.Auth;
import entity.Dept;
import entity.Role;
import entity.User;
import entity.UserAndRole;
import mapper.AuthMapper;
import mapper.DeptMapper;
import mapper.RoleMapper;
import mapper.UserAndRoleMapper;
import mapper.UserMapper;
import service.AuthorizationService;
@Service
public class AuthorizationServiceimpl implements AuthorizationService{
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private DeptMapper deptMapper;
	@Autowired
	private RoleMapper roleMapper;
	@Autowired
	private UserAndRoleMapper userAndRoleMapper;
	@Autowired
	private AuthMapper authMapper;
	@Override
	public void saveUser(User user) {
		// TODO Auto-generated method stub
		userMapper.saveUser(user);
	}
	@Override
	public List<User> listUser() {
		// TODO Auto-generated method stub
		return userMapper.listUser();
	}
	@Override
	public List<Role> listRole() {
		// TODO Auto-generated method stub
		return roleMapper.listRole();
	}
	@Override
	public List<Dept> lisrDept() {
		// TODO Auto-generated method stub
		return deptMapper.listDept();
	}
	@Override
	public void saveRole(Role role) {
		// TODO Auto-generated method stub
		roleMapper.saveRole(role);
	}
	@Override
	public void saveDept(Dept dept) {
		// TODO Auto-generated method stub
		deptMapper.saveDept(dept);
	}
	@Override
	public void removeUser(User user) {
		// TODO Auto-generated method stub
		userAndRoleMapper.removeUserAndRole(user);
		userMapper.removeUser(user);
		
	}
	@Override
	public void removeRole(Role role) {
		// TODO Auto-generated method stub
		roleMapper.removeRole(role);
	}
	@Override
	public void removeDept(Dept dept) {
		// TODO Auto-generated method stub
		deptMapper.removeDept(dept);
	}
	@Override
	public void updateUserDept(User user) {
		// TODO Auto-generated method stub
		userMapper.updateUserDept(user);
	}
	@Override
	public void updateUserAndRole(UserAndRole userAndRole) {
		// TODO Auto-generated method stub
		if (userAndRoleMapper.getUserAndRole(userAndRole)!=null) {
			userAndRoleMapper.updateUserAndRole(userAndRole);//修改用户角色关系
		} else {
			userAndRoleMapper.saveUserAndRole(userAndRole);//新建用户角色关系
		}
		
	}
	/**
	 * 查询用户详细信息
	 */
	@Override
	public User getUserIdDetails(User user) {
		// TODO Auto-generated method stub
		return userMapper.getUserIdDetails(user);
	}
	/**
	 * 查询权限信息
	 */
	@Override
	public List<Auth> listAuth() {
		return authMapper.listAuth();
	}
}
