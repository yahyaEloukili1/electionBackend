package com.dsic.elections.entitis;

import java.util.List;

import javax.persistence.*;

import org.springframework.data.rest.core.annotation.RestResource;

@Entity
@Table(name = "cercle")
public class Cercle {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @Column(name = "num")
  private Integer num;

  @ManyToOne()
  @JoinColumn(name = "commune_id")
  private Commune commune;
  
  @OneToMany(mappedBy = "cercle")
  private List<Candidat> candidats;

  public List<Candidat> getCandidats() {
	return candidats;
}

public void setCandidats(List<Candidat> candidats) {
	this.candidats = candidats;
}

public Cercle() {
  }

  public Cercle(Integer num) {
    this.num = num;
  }

  public Cercle(Integer num, Commune commune) {
	super();
	this.num = num;
	this.commune = commune;
}

public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getNum() {
    return num;
  }

  public void setNum(Integer num) {
    this.num = num;
  }

  public Commune getCommune() {
    return commune;
  }

  public void setCommune(Commune commune) {
    this.commune = commune;
  }
}
