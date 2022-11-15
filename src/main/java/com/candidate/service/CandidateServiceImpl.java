package com.candidate.service;

import com.candidate.entity.Candidate;
import com.candidate.repo.CandidateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CandidateServiceImpl implements CandidateService{

    @Autowired
    private CandidateRepo repo;

    @Override
    public Candidate createCandidate(Candidate candidate) {
        return repo.save(candidate);
    }
}
