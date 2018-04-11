/**
 * LogAction.java
 */
package controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import entity.LogInfo;
import service.LogService;

/**
 * @author SGY
 * @date 2018年3月28日
 * 日志信息管理
 */
@Controller
public class LogAction {
	@Resource
	private LogService logService;
	
	public LogService getLogService() {
		return logService;
	}
	public void setLogService(LogService logService) {
		this.logService = logService;
	}

	@ResponseBody
	@RequestMapping("searchLog.action")
	public List<LogInfo> searchLog(){
		List<LogInfo> list = logService.searchAll();
		return list;
	}
	@ResponseBody
	@RequestMapping("searchLogByProAndRoleAndTime.action")
	public List<LogInfo> searchLogCondi(String proType, String roleName, String time){
		System.out.println(proType==null);
		return logService.search(proType, roleName, time);
	}
}
