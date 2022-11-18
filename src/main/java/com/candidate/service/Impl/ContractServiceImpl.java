package com.candidate.service.Impl;

import com.candidate.entity.Contract;
import com.candidate.repo.ContractRepo;
import com.candidate.service.Service.ContractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ContractServiceImpl implements ContractService {


    @Autowired
    private ContractRepo repo;

    @Override
    public String createContract(Contract contract) {
        repo.save(contract);
        return "create contract";

    }
    @Override
    public String updateContract(Contract contract) {
        repo.save(contract);
        return "update contract";
    }

    @Override
    public String deleteContract(Long id) {
        repo.deleteById(id);
        return "delete contract";
    }

    @Override
    public String deleteAll() {
        repo.deleteAll();
        return "delete all";

    }

    @Override
    public Optional<Contract> getContract(Long id) {
        return repo.findById(id);
    }

    @Override
    public Iterable<Contract> getAllContract() {
        return repo.findAll();
    }
}
