package com.project.professor.allocation.repository;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.TestPropertySource;

import com.project.professor.allocation.entity.Department;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
@TestPropertySource(locations = "classpath:application.properties")
public class DepartmentRepositoryTest {

	@Autowired
	DepartmentRepository departmentRepository;

	//read
	@Test
	public void findAll() {
		List<Department> listDpt = departmentRepository.findAll();
		System.out.println(listDpt);
	}

	//read
	@Test
	public void findById() {
		Optional<Department> dptId = departmentRepository.findById(2l);
		System.out.println(dptId.orElse(null));
	}

	//create
	@Test
	public void create() {
		Department dpt = new Department();
		dpt.setName("Departamento de Inglês");

	}

	//update
	@Test
	public void crudUpdate() {
		Department dpt = new Department();
		dpt.setName("Departamento Financeiro");
		dpt.setId(1l);

	}

	//delete by Id
	@Test
	public void crudDeletar() {
		departmentRepository.deleteById(3l);

	}

	//delete All
	@Test
	public void cruDeleteAll() {
		departmentRepository.deleteAllInBatch();
	}
	
	@Test
	public void testFindByProfessorId() {
		
	}

}
