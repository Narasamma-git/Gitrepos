package com.technoelevate.springmaven.dao;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.technoelevate.springmaven.dto.EmployeeDTO;
@Component
public class  EmployeeDaoImpl implements EmployeeDaoInterface {	
	JdbcTemplate template;
	

	public JdbcTemplate getTemplate() {
		return template;
	}
ApplicationContext context=new ClassPathXmlApplicationContext("/com/technoelevate/springmaven/dao/config.xml");
	 template=context.getBean("jdbctemplate",JdbcTemplate.class);

	public boolean createDetails(EmployeeDTO empdto) {
		boolean insert=false;
		try {
			String query="Insert into employee values(?,?,?)";
			template.update(query,empdto.getId(),empdto.getName(),empdto.getPassword());
		insert=true;
		}
		
		catch( Exception e){
			e.printStackTrace();
		}
		return insert;
		
	}
	
	public EmployeeDTO authenticateDetails(EmployeeDTO empdto) {
		int id =empdto.getId();
			String query="SELECT * FROM  employee where empid=?";
		return template.queryForObject(query,new RowMapperImp(),id);
	}
	
	@Override
	public boolean deleteDetails(EmployeeDTO empdto) {
		boolean insert=false;
		int id =empdto.getId();
		System.out.println(id);
		try {
			String query="Delete from employee where id=?";
			template.update(query,id);
			insert=true;
		}
		catch( Exception e){
			e.printStackTrace();
		}
		return insert;
	}
	
	public List<EmployeeDTO> getDetails() {
		RowMapper<EmployeeDTO> mapper=new RowMapperImp();
		String q="SELECT * FROM employee;";
		List<EmployeeDTO> list=template.query(q, mapper);
		return list;
}

@Override
	public EmployeeDTO searchDetails(EmployeeDTO empdto) {
	int id =empdto.getId();
	String query="SELECT * FROM  details where empid=?";
return template.queryForObject(query,new RowMapperImp(),id);
		
	}
@Override
public boolean updateDetails(EmployeeDTO empdto) {
	boolean insert=false;
	int id =empdto.getId();
	String name =empdto.getName();
	String password =empdto.getPassword();
	
	try {
		String query="Update details set name=?,password=? where empid=?";
		template.update(query,id,name,password);
		insert=true;
	}
	catch( Exception e){
		e.printStackTrace();
	}
	return insert;
}
		
	}

