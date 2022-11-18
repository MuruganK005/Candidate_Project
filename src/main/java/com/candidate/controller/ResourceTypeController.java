package com.candidate.controller;

import com.candidate.dto.ResourceTypeDTO;
import com.candidate.service.Impl.ResourceTypeServiceimpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ResourceTypeController {

    @Autowired
    private ResourceTypeServiceimpl service;

    @PostMapping("/resource_type")
    //create resource type which will be returned resourceTypeDTO
    public ResourceTypeDTO create(@RequestBody ResourceTypeDTO resourceTypeDTO) {
        return service.create(resourceTypeDTO);
    }

    @PutMapping("/update_resource")
    //update resource type which will be returned resourceTypeDTO by id parameter
    public ResourceTypeDTO update(@RequestBody ResourceTypeDTO resourceTypeDTO) {
        return service.update(resourceTypeDTO);
    }

    @DeleteMapping("/delete_resource/{id}")

    public String delete(@PathVariable Long id) {
        return service.delete(id);
    }

    @DeleteMapping("/delete_all")
    public String deletAllResourceTypes(){
        return service.deletAllResourceTypes();
    }

    @GetMapping("/get_resource_type/{id}")
    public ResourceTypeDTO getResource(@PathVariable Long id) {
        return service.getResource(id);
    }

    @GetMapping("/get_all_resource_type")
    public List<ResourceTypeDTO> getAllResourceTypes() {
        return service.getAllResourceTypes();
    }
}
