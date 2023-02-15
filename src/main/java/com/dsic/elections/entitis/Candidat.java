package com.dsic.elections.entitis;
import java.time.LocalDate;
import java.util.Date;

import javax.persistence.*;

import org.springframework.data.rest.core.annotation.RestResource;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
public class Candidat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private int nombreVote;
    private int priorite;
    private int age;
    public Candidat(String firstName, String lastName, LocalDate dateOfBirth, int nombreVote, int priorite, int age,
			Election election, Cercle cercle, Commune commune) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nombreVote = nombreVote;
		this.priorite = priorite;
		this.age = age;
		this.election = election;
		this.cercle = cercle;
		this.commune = commune;
		
	}



	public Candidat(String firstName, String lastName, LocalDate dateOfBirth, int nombreVote, int priorite, int age,
			Election election, Cercle cercle, Commune commune, Partie partie) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nombreVote = nombreVote;
		this.priorite = priorite;
		this.age = age;
		this.election = election;
		this.cercle = cercle;
		this.commune = commune;
		this.partie = partie;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}

	@ManyToOne
	private Election election;
    public int getPriorite() {
		return priorite;
	}



	public int getNombreVote() {
		return nombreVote;
	}



	public void setNombreVote(int nombreVote) {
		this.nombreVote = nombreVote;
	}



	public Election getElection() {
		return election;
	}



	public void setElection(Election election) {
		this.election = election;
	}



	public void setPriorite(int priorite) {
		this.priorite = priorite;
	}

	public Candidat(String firstName, String lastName, LocalDate dateOfBirth, int nombreVote, int priorite,
			Election election, Cercle cercle, Commune commune, Partie partie) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nombreVote = nombreVote;
		this.priorite = priorite;
		this.election = election;
		this.cercle = cercle;
		this.commune = commune;
		this.partie = partie;
	}
	public Candidat(String firstName, String lastName, LocalDate dateOfBirth, int nombreVote, int priorite,
			Election election, Cercle cercle, Commune commune) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.nombreVote = nombreVote;
		this.priorite = priorite;
		this.election = election;
		this.cercle = cercle;
		this.commune = commune;
	
	}
	public Candidat(String firstName, String lastName, LocalDate dateOfBirth,int nombreVote,
			Election election, Cercle cercle, Commune commune) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	
		this.election = election;
		this.cercle = cercle;
		this.commune = commune;
		this.nombreVote = nombreVote;
	
	}



	public Candidat(String firstName, String lastName, LocalDate dateOfBirth, int priorite, Election election,
			Cercle cercle, Commune commune, Partie partie) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.priorite = priorite;
		this.election = election;
		this.cercle = cercle;
		this.commune = commune;
		this.partie = partie;
	}



	public Candidat(String firstName, String lastName, LocalDate dateOfBirth, int priorite, Cercle cercle,
			Commune commune, Partie partie) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.priorite = priorite;
		this.cercle = cercle;
		this.commune = commune;
		this.partie = partie;
	}

	@ManyToOne()
    @JoinColumn(name = "cercle_id")
	//@RestResource(exported = false)
    private Cercle cercle;

    @ManyToOne()
    @JoinColumn(name = "commune_id")
    //@RestResource(exported = false)
    private Commune commune;
    @ManyToOne()
    @JoinColumn(name = "partie_id")
   // @RestResource(exported = false)
    private Partie partie;
    public Partie getPartie() {
		return partie;
	}



	public void setPartie(Partie partie) {
		this.partie = partie;
	}



	public Candidat() {}

   




	public Candidat(Commune commune) {
		super();
		this.commune = commune;
	}



	public Candidat(String firstName, Commune commune) {
		super();
		this.firstName = firstName;
		this.commune = commune;
	}



	public Candidat(String lastName, LocalDate dateOfBirth, Cercle cercle) {
		super();
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.cercle = cercle;
	}



	public Candidat(String firstName, String lastName, LocalDate dateOfBirth, Cercle cercle, Commune commune,
			Partie partie) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.cercle = cercle;
		this.commune = commune;
		this.partie = partie;
	}



	public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Cercle getCercle() {
        return cercle;
    }

    public void setCercle(Cercle cercle) {
        this.cercle = cercle;
    }

    public Commune getCommune() {
        return commune;
    }

    public void setCommune(Commune commune) {
        this.commune = commune;
    }
}
