package com.mb.graphql.demo.api.persistance.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "to_do_tasks")

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ToDoTask
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "is_completed")
	private Boolean isCompleted;
	
	@Column(name = "is_favorite")
	private Boolean isFavorite;
	
}
