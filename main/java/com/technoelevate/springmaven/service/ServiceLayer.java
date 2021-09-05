package com.technoelevate.springmaven.service;

import java.util.List;

import com.technoelevate.springmaven.dto.EmployeeDTO;

public interface ServiceLayer {
	
public boolean serviceToInsert(EmployeeDTO empd);
	
	public EmployeeDTO serviceToAuthenticate(EmployeeDTO empd);
	
	public boolean serviceDelete(EmployeeDTO empd);
	
	public List<EmployeeDTO> alldetails();
	
	public EmployeeDTO serviceToSearch(EmployeeDTO empd);
	
	 public boolean serviceToUpdate(EmployeeDTO empd);


}
