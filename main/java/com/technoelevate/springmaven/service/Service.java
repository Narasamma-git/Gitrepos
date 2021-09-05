package com.technoelevate.springmaven.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;


import com.technoelevate.springmaven.dao.EmployeeDaoImpl;
import com.technoelevate.springmaven.dao.EmployeeDaoInterface;
import com.technoelevate.springmaven.dto.EmployeeDTO;



@Component
public class Service implements ServiceLayer {
	@Autowired
	EmployeeDaoImpl dao;
	
	@Override
	public boolean serviceToInsert(EmployeeDTO empd) {
		if(empd==null) {
			return false;
		}
		return dao.createDetails(empd);
	}
	
	@Override
	public EmployeeDTO serviceToAuthenticate(EmployeeDTO empd) {
		EmployeeDTO loginInfo=dao.authenticateDetails(empd);
		if(empd.getName().equalsIgnoreCase(loginInfo.getName())&&(empd.getPassword().equals(loginInfo.getPassword()))) {
			return loginInfo;
		}
		else
		return null;
	}
@Override
	public List<EmployeeDTO> alldetails() {
		List<EmployeeDTO> list =dao.getDetails();
		return list;
	}
	@Override
	public boolean serviceDelete(EmployeeDTO empd) {
		if(empd==null) {
			return false;
		}
		return dao.deleteDetails(empd);
	}
@Override
public EmployeeDTO serviceToSearch(EmployeeDTO empd) {
	EmployeeDTO loginInfo=dao.searchDetails(empd);
		return loginInfo;
}
@Override
public boolean serviceToUpdate(EmployeeDTO empd) {
	
	return dao.updateDetails(empd);
}

	}
	
	
