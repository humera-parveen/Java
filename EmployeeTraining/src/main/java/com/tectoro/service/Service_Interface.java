package com.tectoro.service;

import java.util.List;

import com.tectoro.model.EmployeeModel;

public interface Service_Interface 
{
	List<EmployeeModel> getAllEmpDetails();
	public void saveEmp(EmployeeModel model);

}
