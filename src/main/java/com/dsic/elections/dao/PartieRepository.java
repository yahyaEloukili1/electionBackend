package com.dsic.elections.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.dsic.elections.entitis.Cercle;
import com.dsic.elections.entitis.Commune;
import com.dsic.elections.entitis.Partie;
@CrossOrigin(origins = "*")
@RepositoryRestResource
public interface PartieRepository extends JpaRepository<Partie, Integer>{


}
