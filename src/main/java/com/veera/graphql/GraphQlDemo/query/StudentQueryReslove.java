package com.veera.graphql.GraphQlDemo.query;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.veera.graphql.GraphQlDemo.model.Colleage;
import com.veera.graphql.GraphQlDemo.model.ColleageWithStudent;
import com.veera.graphql.GraphQlDemo.model.Students;
import com.veera.graphql.GraphQlDemo.service.ColleageService;
import com.veera.graphql.GraphQlDemo.service.StudentService;

@Component
public class StudentQueryReslove implements GraphQLQueryResolver{

	@Autowired
	private StudentService studentService;
	
	@Autowired
	private ColleageService colleageService;
	
	public List<Students> getAll(){
		return studentService.getAll();
	}
	
	public Optional<Students> getById(final Integer id){
		return studentService.getById(id);
	}
	
	public Optional<Colleage> getCollegeDetailsById(final Integer id){
		return colleageService.getCollegeDetailsById(id);
	}
	
	public List<Colleage> findAll(){
		return colleageService.getAllColleages();
	}
	
	public ColleageWithStudent findColleageWithStudents(final Integer id) {
		return colleageService.getAllStudentsWithColleageId(id);
	}
}
