package com.candidate.service.Service;

import com.candidate.dto.ResourceTypeDTO;

import java.util.List;

public interface ResourceTypeService {
    ResourceTypeDTO create(ResourceTypeDTO resourceTypeDTO);

    ResourceTypeDTO update(ResourceTypeDTO resourceTypeDTO);

    String delete(Long id);

    String deletAllResourceTypes();

    ResourceTypeDTO getResource(Long id);

    List<ResourceTypeDTO> getAllResourceTypes();
}
