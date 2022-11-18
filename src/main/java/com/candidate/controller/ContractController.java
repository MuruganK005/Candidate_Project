package com.candidate.controller;

import com.candidate.entity.Contract;
import com.candidate.service.Impl.ContractServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class ContractController {

    @Autowired
    private ContractServiceImpl service;


    @PostMapping("/create_contract")
    public String createContract(@RequestBody Contract contract) {
        return service.createContract(contract);
    }

    @PutMapping("/update_contract")
    public String updateContract(@RequestBody Contract contract) {
        return service.updateContract(contract);
    }

    @DeleteMapping("/delete_contract/{id}")
    public String deleteContract(@PathVariable("id") Long id) {
        return service.deleteContract(id);
    }
    @DeleteMapping("/contract_delete_all")
    public String deleteAll() {
        return service.deleteAll();
    }

    @GetMapping("/get_contract/{id}")
    public Optional<Contract> getContract(@PathVariable("id") Long id) {
        return service.getContract(id);
    }

    @GetMapping("/get_all_contract")
    public Iterable<Contract> getAllContract() {
        return service.getAllContract();
    }


}
