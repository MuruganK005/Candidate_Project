package com.candidate.service.Impl;

import com.candidate.dto.RoleDTO;
import com.candidate.entity.Role;
import com.candidate.repo.RoleRepo;
import com.candidate.service.Service.RoleService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    private RoleRepo repo;

    @Override
    public String createRole(RoleDTO roleDTO) {
      //use ModelMapper to  map the RoleDTO objects  into the Role objects
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setAmbiguityIgnored(true);
        Role role = modelMapper.map(roleDTO, Role.class);
        repo.save(role);
        return " role has been created successfully";

    }

    @Override
    public String updateRole(RoleDTO roleDTO) {
        //use ModelMapper to  map the RoleDTO objects  into the Role objects
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setAmbiguityIgnored(true);
        Role role = modelMapper.map(roleDTO, Role.class);
        repo.save(role);
        return " role has been updated successfully";
    }

    @Override
    public String deleteRole(Long id) {
        //use ModelMapper to  map the RoleDTO objects  into the Role objects
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setAmbiguityIgnored(true);
        repo.deleteById(id);
        //repo.delete(role);
        return " role has been deleted successfully";
    }

    @Override
    public String deleteAll() {
        repo.deleteAll();
        return "all roles has been deleted successfully";
    }

    @Override
    public RoleDTO getRole(Long id) {
        Optional<Role> roleOptional = repo.findById(id);
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setAmbiguityIgnored(true);
        return roleOptional.isPresent()? modelMapper.map(roleOptional.get(), RoleDTO.class) : null;
    }

    @Override
    public RoleDTO getAllRole() {
        List<Role> roles = repo.findAll();
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration().setAmbiguityIgnored(true);
        return modelMapper.map(roles, RoleDTO.class);
    }
}
