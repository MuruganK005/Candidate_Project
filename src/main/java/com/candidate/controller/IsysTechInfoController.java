package com.candidate.controller;

import com.candidate.dto.IsysDTO;
import com.candidate.service.Impl.IsysTechInfoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/isys")
public class IsysTechInfoController {


    @Autowired
    private IsysTechInfoImpl service;

    @PostMapping("create_isys")
    public Object createIsys(@RequestBody IsysDTO isys) throws Exception {
        return service.createIsys(isys);
    }

}
