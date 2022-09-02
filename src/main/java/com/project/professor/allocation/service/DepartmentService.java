package com.project.professor.allocation.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.professor.allocation.entity.Department;
import com.project.professor.allocation.repository.DepartmentRepository;

//INJEÇÃO DE DEPENDENCIA
@Service // SEMPRE FAZER AS ANOTAÇÕES COM @
public class DepartmentService {

	private final DepartmentRepository departmentRepository;

	public DepartmentService(DepartmentRepository departmentRepository) {
		super();
		this.departmentRepository = departmentRepository;
	}
	
	public List<Department> findAll(){
		return departmentRepository.findAll();
		
	}
	
}
