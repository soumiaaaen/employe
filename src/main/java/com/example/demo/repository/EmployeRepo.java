package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entite.Employe;


public interface EmployeRepo extends JpaRepository<Employe,Integer> { 
} 
