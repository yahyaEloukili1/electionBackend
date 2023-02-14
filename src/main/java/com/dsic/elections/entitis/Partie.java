package com.dsic.elections.entitis;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.data.rest.core.annotation.RestResource;

@Entity
public class Partie {
	   @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;
	   private String designation;
	   private String designationArab;
	   public Partie(String designation, String designationArab) {
		super();
		this.designation = designation;
		this.designationArab = designationArab;
	}
	@OneToMany(mappedBy = "cercle")
	   private List<Candidat> candidats;
	public Partie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getDesignationArab() {
		return designationArab;
	}
	public void setDesignationArab(String designationArab) {
		this.designationArab = designationArab;
	}
	public Partie(String designation) {
		super();

		this.designation = designation;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public List<Candidat> getCandidats() {
		return candidats;
	}
	public void setCandidats(List<Candidat> candidats) {
		this.candidats = candidats;
	}

	   
}
