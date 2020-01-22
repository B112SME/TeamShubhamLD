package com.crts.app.sme.main.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.modelmapper.PropertyMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.ls.LSInput;

import com.crts.app.sme.main.model.Employee;
import com.crts.app.sme.main.model.EmployeeDTO;
import com.crts.app.sme.main.model.EmployeeDTO1;
import com.crts.app.sme.main.repository.EmployeeRepo;

@Service
public class ServiceImpl implements ServiceI {
	
	@Autowired
	EmployeeRepo er;

	public List<Employee> findAll() {
		
		return (List<Employee>) er.findAll();
	}

	@Override
	public void save(Employee e) {
		
		er.save(e);
	}

	@Override
	public List<EmployeeDTO> getempdto() {

		List<Employee> emplist = (List<Employee>) er.findAll();
		List<EmployeeDTO> empdtolist = new ArrayList<EmployeeDTO>();
		ModelMapper m = new ModelMapper();
		for (Employee employee : emplist) 
		{			
			EmployeeDTO e = m.map(employee, EmployeeDTO.class);
			empdtolist.add(e);
		}

		return empdtolist;
	}

	@Override
	public void save1(EmployeeDTO e) {
		// TODO Auto-generated method stub
		ModelMapper m = new ModelMapper();
		Employee emp = m.map(e, Employee.class);
		er.save(emp);
	}

	@Override
	public void saveDto(EmployeeDTO1 e) {
		
		System.out.println(e);
		ModelMapper m=new ModelMapper();
		
		m.addMappings(new PropertyMap<EmployeeDTO1, Employee>() 
		{
			@Override
			protected void configure() 
			{		
				map().setEmpname(e.getEmpname());
				map().setEmpaddress(e.getAddress());
			}
		});
		Employee emp=m.map(e, Employee.class);
		System.out.println(e);
		System.out.println(emp);
		Employee emp1=new Employee();
		emp1.setEmpname(e.getEmpname());
		emp1.setEmpaddress(e.getAddress());
		er.save(emp1);
	}

	@Override
	public Employee getemployee(String name) {
		
//		Employee e=er.findByEmpname(name);
//		ModelMapper m=new ModelMapper();
//		EmployeeDTO edto=m.map(e, EmployeeDTO.class);
		return er.findByEmpname(name);
	}	
}