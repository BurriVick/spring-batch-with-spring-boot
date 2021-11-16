package com.coder.springbatchwithspringboot.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Table(name ="USER")
@Entity
public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(name ="NAME")
	private String name;
	
	@Column(name ="AGE")
	private Integer age;
	
	@Column(name ="SALARY")
	private Double salary;
	
	@Column(name ="TIME")
	private Date timestamp;
	
}