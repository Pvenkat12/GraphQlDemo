package com.veera.graphql.GraphQlDemo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.veera.graphql.GraphQlDemo.model.ColleageWithStudent;
import com.veera.graphql.GraphQlDemo.model.Colleage;
import com.veera.graphql.GraphQlDemo.repo.ColleageRepo;
import com.veera.graphql.GraphQlDemo.repo.StudentRepo;

@Service
public class ColleageService {

	@Autowired
	private ColleageRepo colleageRepo;
	
	@Autowired
	private StudentRepo studentRepo;
	
	public Colleage createColleage(final String name) {
		Colleage college = new Colleage();
		college.setName(name);
		return colleageRepo.save(college);
	}
	
	public Optional<Colleage> getCollegeDetailsById(final Integer id) {
		return colleageRepo.findById(id);
	}
	
	public List<Colleage> getAllColleages(){
		return colleageRepo.findAll();
	}
	
	public ColleageWithStudent getAllStudentsWithColleageId(final Integer id) {
		ColleageWithStudent colleageWithStudent = new ColleageWithStudent();
		colleageWithStudent.setName(colleageRepo.findById(id).get().getName());
		colleageWithStudent.setStudents(studentRepo.findByColleageId(id));
		return colleageWithStudent;
	}
}
