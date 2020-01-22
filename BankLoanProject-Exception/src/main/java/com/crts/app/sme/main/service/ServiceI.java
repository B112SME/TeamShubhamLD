package com.crts.app.sme.main.service;

import java.util.List;

import com.crts.app.sme.main.model.Employee;
import com.crts.app.sme.main.model.EmployeeDTO;
import com.crts.app.sme.main.model.EmployeeDTO1;

public interface ServiceI {
	public List<Employee> findAll();
	public void save(Employee e);
	public List<EmployeeDTO> getempdto();
	public void save1(EmployeeDTO e);
	public void saveDto(EmployeeDTO1 e);
	public Employee getemployee(String name);
}
