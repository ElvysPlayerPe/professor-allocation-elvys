package com.project.professor.allocation.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.project.professor.allocation.entity.Department;
import com.project.professor.allocation.repository.DepartmentRepository;

@Service
public class DepartmentService {

	private final DepartmentRepository departmentRepository;

	public DepartmentService(DepartmentRepository departmentRepository) {
		super();
		this.departmentRepository = departmentRepository;
	}

	public List<Department> findByNameContaining(String name) {
		return departmentRepository.findByNameContaining(name);

	}

	public Department findById(Long id) {
		return departmentRepository.findById(id).orElse(null);
	}

	public List<Department> findAll() {
		return departmentRepository.findAll();
	}

	public Department save(Department department) {
		department.setId(null);
		return departmentRepository.save(department);
	}

	public void deleteById(Long id) {

		if (departmentRepository.existsById(id)) {

			departmentRepository.deleteById(id);
		}

	}

}