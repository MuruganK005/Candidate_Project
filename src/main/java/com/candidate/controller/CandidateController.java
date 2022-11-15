package com.candidate.controller;

import com.candidate.entity.Candidate;
import com.candidate.service.CandidateServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CandidateController {

    @Autowired
    private CandidateServiceImpl service;

    @PostMapping("create_candidate")
    public Candidate createCandidate(@RequestBody Candidate candidate){
        return service.createCandidate(candidate);
    }
}
