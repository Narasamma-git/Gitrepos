package com.technoelevate.springmaven.dto;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;

@Data
public class EmployeeDTO implements Serializable {
	
	private int id;
	
	private String name;
	
	private String password;

	@Override
	public String toString() {
		return "EmployeeDTO [id=" + id + ", name=" + name + "]";
	}
	
	
}
