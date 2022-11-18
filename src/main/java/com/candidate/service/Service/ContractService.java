package com.candidate.service.Service;

import com.candidate.entity.Contract;

import java.util.Optional;

public interface ContractService {
    String createContract(Contract contract);

    String updateContract(Contract contract);

    String deleteContract(Long id);

    String deleteAll();

    Optional<Contract> getContract(Long id);

    Iterable<Contract> getAllContract();
}
