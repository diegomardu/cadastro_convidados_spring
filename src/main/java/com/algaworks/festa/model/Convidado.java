package com.algaworks.festa.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class Convidado implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@javax.persistence.Id
	@GeneratedValue
	private Long Id;
	
	private String nome;
	
	private Integer quantidadeAconpanhantes;
	
	

}
