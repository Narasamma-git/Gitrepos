package com.technoelevate.springmaven.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.technoelevate.springmaven.dto.EmployeeDTO;

@Controller
public class MyController{
		@Autowired
		Service service;
		
		@GetMapping(path="/home")
		public String home() {
			return "register";
		}
		
		@PostMapping(path="/create")
		public String addDetails(ModelMap map,EmployeeDTO empd) {
			if(empd.getId()!=(null) && empd.getId()!=(""))  {
			service.serviceToInsert(empd);
			map.addAttribute("empd",empd);
			return "details";}
			else 
				return "error";
		}
		
		@GetMapping(path="/login")
		public String login() {
			return "login";
		}
		
		@PostMapping(path="/loginc")
		public String login(ModelMap map,EmployeeDTO empd,HttpServletRequest request) {
			if(empd.getId()!=(null)&&empd.getId()!=("")) {
			EmployeeDTO loginInfo=service.serviceToAuthenticate(empd);
			HttpSession session=request.getSession();
			session.setAttribute("empd",loginInfo);
			if(loginInfo!=null) {
				map.addAttribute("empd",loginInfo);
				map.addAttribute("msg","LOGIN SUCCESSFULL");
				return "logindetails";
			}
			else
				return "backtologin";
				}
			else {
				 return "error";
			}
			}
		
		@PostMapping(path="/details")
		public String showDetails() {
			return "show";
		}
		
		@PostMapping(path="/showdetails")
		public String allDetails(ModelMap map) {

			List<EmployeeDTO> details=service.alldetails();
			map.addAttribute("empd", details);
			return "alldetails";
		}
		
		@PostMapping(path="/searchdetails")
		public String search(ModelMap map,EmployeeDTO empd) {
			if(empd.getId()!=(null)&&empd.getId()!=("")) {
			EmployeeDTO loginInfo=service.serviceToSearch(empd);
				map.addAttribute("empd",loginInfo);
				return "searchjsp";}
			else {
				 return "error";
			}
			}
		
		@PostMapping(path="/delete")
		public String delete(ModelMap map,EmployeeDTO empd) {
			boolean in=service.serviceDelete(empd);
			if(in==true) {
				return "delete";
			}
			else
			return "error";
		}
		
		@PostMapping(path="/logout")
		public String logout() {
			return "logout";
		}
		
		@PostMapping(path="/update")
		public String update() {
			return "update";
		}
		
		@PostMapping(path="/updated")
		public String updated(EmployeeDTO empd,ModelMap map) {
			boolean in=service.serviceToUpdate(empd);
			if(in==true) {
				map.addAttribute("msg","UPDATE SUCCESSFULL");
				return "updated";
			}
			else {
				return "error";
			}
			 
		}
}