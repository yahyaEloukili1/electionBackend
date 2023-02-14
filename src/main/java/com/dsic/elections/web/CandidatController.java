package com.dsic.elections.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dsic.elections.dao.CandidatRepository;
import com.dsic.elections.projections.CandidatProjection;

@RestController
public class CandidatController {

	private final CandidatRepository candidatRepository;

    public CandidatController(CandidatRepository candidatRepository) {
        this.candidatRepository = candidatRepository;
    }

    @GetMapping("/candidats2/{candidatId}")
    public CandidatProjection getCandidat(@PathVariable Integer candidatId) {
        return candidatRepository.findById(candidatId, CandidatProjection.class);
    }
}
