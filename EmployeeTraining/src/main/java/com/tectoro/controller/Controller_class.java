package com.tectoro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tectoro.model.EmployeeModel;
import com.tectoro.service.Service_Interface;

@Controller
//@RequestMapping("/EmployeeHome")
public class Controller_class {
	@Autowired
	Service_Interface interface1;

	@GetMapping
	public String EmployeeViewPage() {
		return "EmployeeHome";
	}

	@GetMapping("/showEmployeePage")
	public String EmployeeViewHomePage(Model model) {
		model.addAttribute("ListEmployees", interface1.getAllEmpDetails());
		return "index.html";
	}

	@GetMapping("/showNewEmployeeForm")
	public String showEmployeeNewForm(Model model) {
		EmployeeModel employeeModel = new EmployeeModel();
		model.addAttribute("EmployeeModel", employeeModel);
		return "new_employee";
	}

	@PostMapping("/saveEmployee")
	public String saveEmployee(@ModelAttribute("EmployeeModel") EmployeeModel employeeModel) {
		interface1.saveEmp(employeeModel);
		return "redirect";
	}
	
	

}





















