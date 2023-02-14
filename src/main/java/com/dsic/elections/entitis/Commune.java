package com.dsic.elections.entitis;
import java.util.List;

import javax.persistence.*;

import org.springframework.data.rest.core.annotation.RestResource;
@Entity
@Table(name = "commune")
public class Commune {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(name = "designation")
  private String designation;

  @OneToMany(mappedBy = "commune")
  //@RestResource(exported = false)
  private List<Cercle> cercles;

  
  public List<Candidat> getCandidats() {
	return candidats;
}

public void setCandidats(List<Candidat> candidats) {
	this.candidats = candidats;
}

@OneToMany(mappedBy = "commune")
  private List<Candidat> candidats;

  public Commune() {
  }

  public Commune(String designation) {
    this.designation = designation;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getDesignation() {
    return designation;
  }

  public void setDesignation(String designation) {
    this.designation = designation;
  }

  public List<Cercle> getCercles() {
    return cercles;
  }

  public void setCercles(List<Cercle> cercles) {
    this.cercles = cercles;
  }
}
