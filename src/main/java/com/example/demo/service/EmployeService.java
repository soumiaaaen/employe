package com.example.demo.service;
import org.springframework.stereotype.Service;

import com.example.demo.entite.Employe; 
import com.example.demo.response.EmployeResponse;
import com.example.demo.repository.EmployeRepo; 
import org.modelmapper.ModelMapper; 
import org.springframework.beans.factory.annotation.Autowired; 
import java.util.Optional; 
 
@Service
public class EmployeService { 
    @Autowired
    private EmployeRepo employeRepo; 
    @Autowired
    private ModelMapper mapper;

    EmployeService(EmployeRepo employeRepo, ModelMapper mapper) {
        this.employeRepo = employeRepo;
        this.mapper = mapper;
    } 
    
	public EmployeService() {
		// TODO Auto-generated constructor stub
	}

	public EmployeResponse getEmployeById(int id) { 
        Optional<Employe> employee = employeRepo.findById(id); 
        EmployeResponse employeResponse = mapper.map(employee, EmployeResponse.class); 
        return employeResponse; 
    } 
}