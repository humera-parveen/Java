package com.tectoro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.tectoro.dao.Dao_Interface;
import com.tectoro.model.EmployeeModel;
@Service
public class Service_Implements implements Service_Interface {

	@Autowired
	Dao_Interface dao_Interface;
	//JpaRepository jpaRepository;
	@Override
	public List<EmployeeModel> getAllEmpDetails() {
		return dao_Interface.findAll();
	}

	@Override
	public void saveEmp(EmployeeModel model) 
	{
		this.dao_Interface.save(model);
		
	}

}












