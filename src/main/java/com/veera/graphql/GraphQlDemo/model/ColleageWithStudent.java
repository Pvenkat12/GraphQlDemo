package com.veera.graphql.GraphQlDemo.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ColleageWithStudent {

	private String name;
	private List<Students> students;
}
