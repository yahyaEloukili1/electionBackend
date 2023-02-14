package com.dsic.elections.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.dsic.elections.entitis.Candidat;
import com.dsic.elections.entitis.Cercle;
import com.dsic.elections.entitis.Commune;
import com.dsic.elections.projections.CandidatProjection;

@CrossOrigin(origins = "*")
@RepositoryRestResource(path = "candidats", excerptProjection = CandidatProjection.class)
public interface CandidatRepository extends JpaRepository<Candidat, Integer>{

	List<Candidat> findByCommuneId(Integer id);
	List<Candidat> findByCommuneIdAndCercleNum(Integer id,int i);
	List<Candidat> findByCercleNum(Integer i);
	CandidatProjection findById(Integer candidatId, Class<CandidatProjection> class1);
	List<Candidat> findAllByOrderByIdAsc();
}
