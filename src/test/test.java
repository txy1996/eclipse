package test;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import entity.User;
import mapper.UserAndRoleMapper;
import mapper.UserMapper;



public class test {
	public static void main(String[] args) {
		ApplicationContext context=
				new ClassPathXmlApplicationContext("classpath:spring/applicationContext-mapper.xml");
			UserMapper userMapper=(UserMapper) context.getBean("userMapper");
			UserAndRoleMapper userAndRoleMapper=(UserAndRoleMapper) context.getBean("userAndRoleMapper");
			User user=new User(1, "txt", null, 1, null, 0);
			User user2=userMapper.getUserIdDetails(user);
			System.out.println(user2.toString());
//			userAndRoleMapper.saveUserAndRole(user);
//			userMapper.saveUser(user);
//			List<User>users=userMapper.listUser();
//			for (User user2 : users) {
//				System.out.println(user2.toString());
//			}
	}		
}
