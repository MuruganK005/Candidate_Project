package com.candidate.service.Service;

import com.candidate.entity.ContractType;

import java.util.Optional;

public interface ContractTypeService {
    String createContractType(ContractType contractType);

    String updateContractType(ContractType contractType);

    String deleteContractType(Long id);

    String deleteAllContractTypes();

    Optional<ContractType> getContractType(Long id);

    Iterable<ContractType> getAllContractTypes();
}
