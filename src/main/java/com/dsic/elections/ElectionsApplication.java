package com.dsic.elections;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.projection.ProjectionFactory;
import org.springframework.data.projection.SpelAwareProxyProjectionFactory;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.dsic.elections.dao.CandidatRepository;
import com.dsic.elections.dao.CercleRepository;
import com.dsic.elections.dao.CommuneRepository;
import com.dsic.elections.dao.ElectionRepository;
import com.dsic.elections.dao.PartieRepository;
import com.dsic.elections.entitis.AppRole;
import com.dsic.elections.entitis.AppUser;
import com.dsic.elections.entitis.Candidat;
import com.dsic.elections.entitis.Cercle;
import com.dsic.elections.entitis.Commune;
import com.dsic.elections.entitis.Election;
import com.dsic.elections.entitis.Partie;
import com.dsic.elections.services.AccountService;


@SpringBootApplication
public class ElectionsApplication implements CommandLineRunner {
	@Autowired
	private RepositoryRestConfiguration restConfiguration;
	@Autowired
	private CommuneRepository communeRepository;
	@Autowired
	private CercleRepository cercleRepository;
	@Autowired
	private CandidatRepository candidatRepository;
	@Autowired
	private PartieRepository partieRepository;
	@Autowired
	private ElectionRepository electionRepository;
	@Autowired
	@Lazy
	private AccountService accountService;
	public static void main(String[] args) {
		SpringApplication.run(ElectionsApplication.class, args);
	}
	@Bean
	public BCryptPasswordEncoder getBPE() {
		return new BCryptPasswordEncoder();
	}
	@Bean
	public ProjectionFactory projectionFactory() {
	    return new SpelAwareProxyProjectionFactory();
	}
	@Override
	public void run(String... args) throws Exception {
		restConfiguration.exposeIdsFor(Commune.class);
		restConfiguration.exposeIdsFor(Candidat.class);
		restConfiguration.exposeIdsFor(Partie.class);
		restConfiguration.exposeIdsFor(Cercle.class);
	
		if(accountService.finduserByUsrname("rnpPdi")==null) {
			accountService.save(new AppUser(null,"rnpPdi","Laayoune2022@",null,null));
			accountService.saveRole(new AppRole(null,"ADMIN"));
			accountService.saveRole(new AppRole(null,"USER"));
			accountService.addRoleToUser("rnpPdi","ADMIN");
			accountService.addRoleToUser("rnpPdi","USER");
		}
		if(communeRepository.findByDesignation("بوكراع")==null) {
		
		
		Commune c1= new Commune("بوكراع");
		Commune c2= new Commune("الدشيرة");
		Commune c3= new Commune("الواد فوم");
		Commune c4= new Commune("العيون");
		Commune c5= new Commune("المرسى");
		communeRepository.save(c1);
		communeRepository.save(c2);
		communeRepository.save(c3);
		communeRepository.save(c4);
		communeRepository.save(c5);
		Partie p = new Partie("MA","احزب لاستقلال");
		Partie p2 = new Partie("PDI","حزب الحركة الشعبية");
		
		partieRepository.save(p);
		partieRepository.save(p2);
		for(int i=1;i<24;i++) {
		Cercle cercle =	cercleRepository.save(new Cercle(i,c1));
		Election e = new Election(0, null, 0, 0, 0, 0, 0, null, null, null, 0, c1, cercle, null);
		electionRepository.save(e);
		Candidat candidat1 = new Candidat(null,null,null,1,e,cercle,c1,p);
		Candidat candidat2 = new Candidat(null,null,null,2,e,cercle,c1,p2);
		Candidat candidat3 = new Candidat(null,null,null,3,e,cercle,c1,null);
		candidatRepository.save(candidat1);
		candidatRepository.save(candidat2);
		candidatRepository.save(candidat3);
		}
	
		for(int i=1;i<24;i++) {
			Cercle cercle =	cercleRepository.save(new Cercle(i,c2));
			Election e = new Election(0, null, 0, 0, 0, 0, 0, null, null, null, 0, c2, cercle, null);
			electionRepository.save(e);
			Candidat candidat1 = new Candidat(null,null,null,1,e,cercle,c2,null);
			Candidat candidat2 = new Candidat(null,null,null,2,e,cercle,c2,null);
			Candidat candidat3 = new Candidat(null,null,null,3,e,cercle,c2,null);
			candidatRepository.save(candidat1);
			candidatRepository.save(candidat2);
			candidatRepository.save(candidat3);
			}

		for(int i=1;i<24;i++) {
			Cercle cercle =	cercleRepository.save(new Cercle(i,c3));
			Election e = new Election(0, null, 0, 0, 0, 0, 0, null, null, null, 0, c3, cercle, null);
			electionRepository.save(e);
			Candidat candidat1 = new Candidat(null,null,null,1,e,cercle,c3,null);
			Candidat candidat2 = new Candidat(null,null,null,2,e,cercle,c3,null);
			Candidat candidat3 = new Candidat(null,null,null,3,e,cercle,c3,null);
			candidatRepository.save(candidat1);
			candidatRepository.save(candidat2);
			candidatRepository.save(candidat3);
			}

		for(int i=1;i<24;i++) {
			Cercle cercle =	cercleRepository.save(new Cercle(i,c4));
			Election e = new Election(0, null, 0, 0, 0, 0, 0, null, null, null, 0, c4, cercle, null);
			electionRepository.save(e);
			Candidat candidat1 = new Candidat(null,null,null,1,e,cercle,c4,null);
			Candidat candidat2 = new Candidat(null,null,null,2,e,cercle,c4,null);
			Candidat candidat3 = new Candidat(null,null,null,3,e,cercle,c4,null);
			candidatRepository.save(candidat1);
			candidatRepository.save(candidat2);
			candidatRepository.save(candidat3);
			}

		for(int i=1;i<24;i++) {
			Cercle cercle =	cercleRepository.save(new Cercle(i,c5));
			Election e = new Election(0, null, 0, 0, 0, 0, 0, null, null, null, 0, c5, cercle, null);
			electionRepository.save(e);
			Candidat candidat1 = new Candidat(null,null,null,1,e,cercle,c5,p);
			Candidat candidat2 = new Candidat(null,null,null,2,e,cercle,c5,p2);
			Candidat candidat3 = new Candidat(null,null,null,3,e,cercle,c5,null);
			candidatRepository.save(candidat1);
			candidatRepository.save(candidat2);
			candidatRepository.save(candidat3);
			}
		}
	
	
		
	}

}
