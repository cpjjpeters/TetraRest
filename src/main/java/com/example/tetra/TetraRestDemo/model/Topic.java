package com.example.tetra.TetraRestDemo.model;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
public class Topic {
	@Id
	private String id;
	private String name;
	private String description;
	

}
