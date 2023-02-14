package com.dsic.elections.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.dsic.elections.entitis.Candidat;
import com.dsic.elections.entitis.Cercle;
@CrossOrigin(origins = "*")
public interface CercleRepository extends JpaRepository<Cercle, Integer>{
	 
}
