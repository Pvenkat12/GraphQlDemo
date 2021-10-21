package com.veera.graphql.GraphQlDemo.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.veera.graphql.GraphQlDemo.model.Students;
import com.veera.graphql.GraphQlDemo.repo.StudentRepo;

@Service
public class StudentService {

	@Autowired
	private StudentRepo studentRepo;
	
	public Students createStudents(final String name, final String dept, final String quot, final Integer colleageId) {
		final Students students = new Students();
		students.setDept(dept);
		students.setName(name);
		students.setQuot(quot);
		students.setColleageId(colleageId);
		return studentRepo.save(students);
	}
	
	public List<Students> getAll(){
		return studentRepo.findAll().stream().collect(Collectors.toList());
	}
	
	public Optional<Students> getById(Integer id) {
		return studentRepo.findById(id);
	}
}
