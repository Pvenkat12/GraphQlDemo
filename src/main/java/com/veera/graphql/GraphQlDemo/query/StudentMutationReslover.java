package com.veera.graphql.GraphQlDemo.query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.veera.graphql.GraphQlDemo.model.Colleage;
import com.veera.graphql.GraphQlDemo.model.Students;
import com.veera.graphql.GraphQlDemo.service.ColleageService;
import com.veera.graphql.GraphQlDemo.service.StudentService;

@Component
public class StudentMutationReslover implements GraphQLMutationResolver{

	@Autowired
	private StudentService studentService;

	@Autowired
	private ColleageService colleageService;
	
	public Students createStudent(final String name, final String dept, final String quot, final Integer colleageId) {
		return studentService.createStudents(name, dept, quot,colleageId);
	}
	
	public Colleage createColleage(final String name) {
		return colleageService.createColleage(name);
	}
}
