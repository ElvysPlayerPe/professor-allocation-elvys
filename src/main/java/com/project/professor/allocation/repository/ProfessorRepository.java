package com.project.professor.allocation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.professor.allocation.entity.Professor;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor, Long> {
	// How to Return all professors in a departmentId
	// findBy+Atributo da entidade da classe, verifico na entity Department
	// existe o atributo com Id, aqui buscamos por departmentId
	// no caso aqui seria find(ENCONTRE)By(PELO)DepartmentId(ID)
	// se existem varios professores, buscamos por uma LISTA de PROFESSORES
	// Banco de dados seria:

	// findByDepartmentId
	// SELECT * FROM profesor WHERE department_Id = ?1
	List<Professor> findByDepartmentId(Long departmentId); // É necessario parar o pareametro do atributo, aqui seira um
															// LONG

	// findByDepartmentId
	// SELECT * FROM profesor WHERE department_Id = ?1
	Professor findByCpf(String cpf);
	
	// SELECT * FROM profesor WHERE name = ?1
	List<Professor> findByName(String name);
}
