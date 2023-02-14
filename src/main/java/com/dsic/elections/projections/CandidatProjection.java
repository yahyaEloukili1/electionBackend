package com.dsic.elections.projections;

import java.time.LocalDate;

import org.springframework.data.rest.core.config.Projection;

import com.dsic.elections.entitis.Candidat;
import com.dsic.elections.entitis.Cercle;
import com.dsic.elections.entitis.Commune;
import com.dsic.elections.entitis.Partie;

@Projection(name = "inlinePartie", types = { Candidat.class })
public interface CandidatProjection {
 
		  int getId();  
		  int getNombreVote();
		  int getAge();
		  String getFirstName();
		  String getLastName();
		  LocalDate getDateOfBirth();
		  int getPriorite();
		  Partie getPartie();
		  Commune getCommune();
		  Cercle getCercle();
		
}
