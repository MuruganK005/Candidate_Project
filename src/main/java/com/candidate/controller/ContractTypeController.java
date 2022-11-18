package com.candidate.controller;

import com.candidate.entity.ContractType;
import com.candidate.service.Impl.ContractTypeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class ContractTypeController {

    @Autowired
    private ContractTypeServiceImpl contractTypeService;

    @PostMapping("/create_contract_type")
    public String createContractType(@RequestBody ContractType contractType) {
        return contractTypeService.createContractType(contractType);
    }
    @PutMapping("/update_contract_type")
    public String updateContractType(@RequestBody ContractType contractType) {
        return contractTypeService.updateContractType(contractType);
    }
    @DeleteMapping("/delete_contract_type/{id}")
    public String deleteContractType(@PathVariable("id") Long id) {
        return contractTypeService.deleteContractType(id);
    }

    @DeleteMapping("/delete_all_contract_types")
    public String deleteAllContractTypes() {
        return contractTypeService.deleteAllContractTypes();
    }

    @GetMapping("/get_contract_type/{id}")
    public Optional<ContractType> getContractType(@PathVariable("id") Long id) {
        return contractTypeService.getContractType(id);
    }
    @GetMapping("/get_all_contract_types")
    public Iterable<ContractType> getAllContractTypes() {
        return contractTypeService.getAllContractTypes();
    }



}
