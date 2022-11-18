package com.candidate.service.Service;

import com.candidate.dto.RoleDTO;

public interface RoleService {
    String createRole (RoleDTO roleDTO);

    String updateRole(RoleDTO roleDTO);

    String deleteRole(Long id);

    String deleteAll();

    RoleDTO getRole(Long id);

    RoleDTO getAllRole();
}
