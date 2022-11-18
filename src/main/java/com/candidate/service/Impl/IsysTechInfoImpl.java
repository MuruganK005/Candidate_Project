package com.candidate.service.Impl;

import com.candidate.dto.IsysDTO;
import com.candidate.entity.IsysTechInfo;
import com.candidate.repo.IsysTechInfoRepo;
import com.candidate.service.Service.IsysTechInfoService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IsysTechInfoImpl implements IsysTechInfoService {

    @Autowired
    private IsysTechInfoRepo repo;

    @Override
    public Object createIsys(IsysDTO isys) {
        //use ModelMapper to change objects from IsysTechinfoDTO into IsysTechinfo
        ModelMapper mapper = new ModelMapper();
        mapper.getConfiguration().setAmbiguityIgnored(true);
        IsysTechInfo isysTechInfo=mapper.map(isys, IsysTechInfo.class);
        return repo.save(isysTechInfo);
    }
}
