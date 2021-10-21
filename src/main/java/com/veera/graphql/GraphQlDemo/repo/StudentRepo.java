package com.veera.graphql.GraphQlDemo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.veera.graphql.GraphQlDemo.model.Students;

public interface StudentRepo extends JpaRepository<Students, Integer> {
	

	List<Students> findByColleageId(Integer id);
}
