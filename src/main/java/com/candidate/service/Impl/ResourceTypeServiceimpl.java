package com.candidate.service.Impl;

import com.candidate.dto.ResourceTypeDTO;
import com.candidate.entity.ResourceType;
import com.candidate.repo.ResourceTypeRepo;
import com.candidate.service.Service.ResourceTypeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ResourceTypeServiceimpl implements ResourceTypeService {

    @Autowired
    private ResourceTypeRepo repo;

    @Override
    public ResourceTypeDTO create(ResourceTypeDTO resourceTypeDTO) {
        //use ModelMapper to change objects from ResourceTypeDTO into ResourceType
         ModelMapper mapper= new ModelMapper();
         mapper.getConfiguration().setAmbiguityIgnored(true);
         ResourceType resourceType= mapper.map(resourceTypeDTO,ResourceType.class);
         repo.save(resourceType);
        //return resourceTypeDTO
        return mapper.map(resourceType,ResourceTypeDTO.class);
    }

    @Override
    public ResourceTypeDTO update(ResourceTypeDTO resourceTypeDTO) {
        //use ModelMapper to change objects from ResourceTypeDTO into ResourceType
        ModelMapper mapper= new ModelMapper();
        mapper.getConfiguration().setAmbiguityIgnored(true);
        ResourceType resourceType= mapper.map(resourceTypeDTO,ResourceType.class);
        repo.save(resourceType);
        //return resourceTypeDTO
        return mapper.map(resourceType,ResourceTypeDTO.class);
    }

    @Override
    public String delete(Long id) {
        //delete the resource type from the repository based on the id
        Optional<ResourceType> resourceType= repo.findById(id);
        repo.delete(resourceType.get());
        //return the resource type id
        return id+" deleted successfully";
    }

    @Override
    public String deletAllResourceTypes() {
        repo.deleteAll();
        return "all resource types deleted successfully";
    }

    @Override
    public ResourceTypeDTO getResource(Long id) {
        //use ModelMapper to change objects from ResourceTypeDTO into ResourceType
        ModelMapper mapper= new ModelMapper();
        mapper.getConfiguration().setAmbiguityIgnored(true);
        ResourceType resourceType= mapper.map(repo.findById(id),ResourceType.class);
        return mapper.map(resourceType,ResourceTypeDTO.class);
    }

    @Override
    public List<ResourceTypeDTO> getAllResourceTypes() {
        //return the list of resource types that are available in the repository
        ModelMapper mapper= new ModelMapper();
        mapper.getConfiguration().setAmbiguityIgnored(true);
        return repo.findAll().stream().map(resourceType -> mapper.map(resourceType,ResourceTypeDTO.class)).collect(
                Collectors.toList());
    }
}
