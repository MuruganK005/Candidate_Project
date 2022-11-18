package com.candidate.service.Impl;

import com.candidate.entity.ContractType;
import com.candidate.repo.ContractTypeRepo;
import com.candidate.service.Service.ContractTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ContractTypeServiceImpl implements ContractTypeService {


    @Autowired
    private ContractTypeRepo repo;
    @Override
    public String createContractType(ContractType contractType) {
        repo.save(contractType);
        return "contractType has created Successfully";
    }

    @Override
    public String updateContractType(ContractType contractType) {
        repo.save(contractType);
        return "contractType has updated Successfully";
    }

    @Override
    public String deleteContractType(Long id) {
        repo.deleteById(id);
        return "contractType has deleted Successfully";
    }

    @Override
    public String deleteAllContractTypes() {
        repo.deleteAll();
        return "contractType has deleted Successfully";
    }

    @Override
    public Optional<ContractType> getContractType(Long id) {
        return repo.findById(id);
    }

    @Override
    public Iterable<ContractType> getAllContractTypes() {
        return repo.findAll();
    }
}
