package com.technoelevate.springmaven.dao;



import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.technoelevate.springmaven.dto.EmployeeDTO;

public class RowMapperImp implements RowMapper<EmployeeDTO> {
	
	EmployeeDTO empd;
@Override
public EmployeeDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
	EmployeeDTO empd=new EmployeeDTO();
	empd.setId(rs.getInt(1));
	empd.setName(rs.getString(2));
	empd.setPassword(rs.getString(3));
	return empd;
}
}