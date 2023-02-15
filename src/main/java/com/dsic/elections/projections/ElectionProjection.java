package com.dsic.elections.projections;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.rest.core.config.Projection;

import com.dsic.elections.entitis.Candidat;
import com.dsic.elections.entitis.Cercle;
import com.dsic.elections.entitis.Commune;
import com.dsic.elections.entitis.Election;
import com.dsic.elections.entitis.Partie;

@Projection(name = "inlinePartie2", types = { Election.class })
public interface ElectionProjection {
 
         int getId();
	    int getNumeroBureau();
	    int getNumeroWinner();
	    String getSigneBureau();
	    String getNomWinner();
	    String getPrenomWinner();
	     String getPartieWinner();
	     String getPartieWinnerAr();
	     String getAddressBureau();
	     String getLieuBureau();
	     int getNbrPlaces();
	    int getIdOfWinner();
	int getNmbInscrits();
	   int getNmbMosa();
	  int getFeuillesSupprimes();
	int getVoix();
	float getPourcentage();
	 Boolean getConfirmationSum();
	 String getPremier();
	 String getPartieDuPremier();
	 int getNombreDesCheses();
		  Commune getCommune();
		
		  Cercle getCercle();
		  List<Candidat> getCandidats();
		
}
