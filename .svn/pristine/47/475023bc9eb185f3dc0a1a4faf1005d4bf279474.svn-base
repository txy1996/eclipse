/**
 * LogServiceImpl.java
 */
package service.impl;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import entity.LogInfo;
import mapper.LogInfoMapper;
import service.LogService;

/**
 * @author SGY
 * @date 2018年3月26日
 */
@Service("logService")
public class LogServiceImpl implements LogService {
	@Resource
	private LogInfoMapper logInfoMapper;
	
	public LogInfoMapper getLoginfo() {
		return logInfoMapper;
	}

	public void setLoginfo(LogInfoMapper loginfo) {
		this.logInfoMapper = loginfo;
	}

	@Override
	public List<LogInfo> search(String projectname, String username, String time) {
		int timeSlot = 0;
		if("一天内".equals(time)){
			timeSlot = 1;
		}else if("一周内".equals(time)){
			timeSlot = 7;
		}else if("一个月内".equals(time)){
			timeSlot = 30;
		}
		return logInfoMapper.selectProAndNameAndDate(projectname, username, timeSlot);
	}

	/* (non-Javadoc)
	 * @see service.LogService#searchAll()
	 */
	@Override
	public List<LogInfo> searchAll() {
		return logInfoMapper.selectAll();
	}

}
