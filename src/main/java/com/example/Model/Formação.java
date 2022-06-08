package com.example.Model;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "formação_table")
public class Formação {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "faculdade_name", nullable = false)
	private String faculdade;
	
	@Column(name = "periodo", nullable = false)
	private String periodo;

	
	public Formação() {
			
	}
	
	public Formação(int id, String faculdade, String periodo) {
		super();
		this.id = id;
		this.faculdade = faculdade;
		this.periodo = periodo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInstituicao() {
		return faculdade;
	}

	public void setInstituicao(String faculdade) {
		this.faculdade = faculdade;
	}

	public String getConhecimento() {
		return periodo;
	}

	public void setConhecimento(String periodo) {
		this.periodo = periodo;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Formação other = (Formação) obj;
		return id == other.id;
	}
	
	
	
	
	
}
