package com.tectoro.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.yaml.snakeyaml.events.Event.ID;

import com.tectoro.model.EmployeeModel;
@Repository
public interface Dao_Interface extends JpaRepository<EmployeeModel, Integer>
{

}
