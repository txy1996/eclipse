package controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import entity.Auth;
import entity.User;
import service.LoginService;

@Controller
public class LoginController {
	@Autowired
	public LoginService loginService;
	@RequestMapping(value="login.action",method={RequestMethod.POST})
	public String login(String username,String password,HttpServletRequest request){		
		User userDB = new User();
		System.out.println(username+password);	
		userDB = loginService.findUserNameAndPwd(username, password);
		HttpSession session = request.getSession();
		if(!"".equals(userDB)){
			session.setAttribute("user", userDB);
			 return "index";
		}else{
			return "login.html";
		}
	}
	@ResponseBody
	@RequestMapping(value="findAuth.action",method={RequestMethod.POST})
	public List<Auth> findAuth(HttpServletRequest request){
		System.out.println("查询角色对应菜单名称");
		User user = (User) request.getAttribute("user");
		return loginService.findAuthName(user.getUsername());
	}
}
