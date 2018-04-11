package service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import entity.Auth;
import entity.User;
import mapper.UserMapper;
import service.LoginService;
@Service("loginService")
public class LoginServiceImpl implements LoginService {
	@Autowired
	public UserMapper userMapper;
	
	public User findUserNameAndPwd(String username, String password) {
		User user = userMapper.findUserNameAndPwd(username, password);
		return user;
	}

	@Override
	public List<Auth> findAuthName(String username) {
		List<Auth> auth = userMapper.findAuthName(username);
		return auth;
	}

}
