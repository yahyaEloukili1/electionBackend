package com.dsic.elections.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.dsic.elections.entitis.Candidat;
import com.dsic.elections.entitis.Cercle;
import com.dsic.elections.entitis.Commune;
import com.dsic.elections.entitis.Election;
import com.dsic.elections.projections.CandidatProjection;
import com.dsic.elections.projections.ElectionProjection;
@CrossOrigin(origins = "*")
@RepositoryRestResource(path = "elections", excerptProjection = ElectionProjection.class)
public interface ElectionRepository extends JpaRepository<Election, Integer>{
	List<Election> findByCommuneId(Integer id);
	List<Election> findByCommuneIdAndCercleNum(Integer id,int i);
	ElectionProjection findById(Integer candidatId, Class<ElectionProjection> class1);
	List<Candidat> findAllByOrderByIdAsc();
}
