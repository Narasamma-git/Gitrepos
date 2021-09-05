package com.technoelevate.springmaven.dao;

import java.util.List;

import com.technoelevate.springmaven.dto.EmployeeDTO;

public interface EmployeeDaoInterface {

public boolean createDetails(EmployeeDTO empd);
	
	public EmployeeDTO authenticateDetails(EmployeeDTO empd);
	
	public boolean deleteDetails(EmployeeDTO empd);
	
	public List<EmployeeDTO> getDetails();
	
	public EmployeeDTO searchDetails(EmployeeDTO empd);
	
	public boolean updateDetails(EmployeeDTO empd);


	

}
