package com.example.demo.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.service.EmployeService; 
 
@Configuration 
public class EmployeeConfig { 
    @Bean 
    public EmployeService employeBean() { 
        return new EmployeService(); 
    } 
    @Bean 
    public ModelMapper modelMapperBean() { 
        return new ModelMapper(); 
    } 
} 

