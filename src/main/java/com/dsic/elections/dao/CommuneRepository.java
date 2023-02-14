package com.dsic.elections.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.dsic.elections.entitis.Candidat;
import com.dsic.elections.entitis.Cercle;
import com.dsic.elections.entitis.Commune;
@CrossOrigin(origins = "*")
@RepositoryRestResource
public interface CommuneRepository extends JpaRepository<Commune, Integer>{
 public Commune findByDesignation(String designation);
}
