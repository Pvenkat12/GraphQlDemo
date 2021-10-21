package com.veera.graphql.GraphQlDemo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.veera.graphql.GraphQlDemo.model.Colleage;

public interface ColleageRepo extends JpaRepository<Colleage, Integer> {

}
