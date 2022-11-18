package com.candidate.controller;

import com.candidate.dto.RoleDTO;
import com.candidate.service.Impl.RoleServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class RoleController {

    @Autowired
    private RoleServiceImpl roleService;

    @PostMapping("/create_role")
    public String createRole(@RequestBody RoleDTO roleDTO) {
        return roleService.createRole(roleDTO);
    }
    @PutMapping("/update_role")
    public String updateRole(@RequestBody RoleDTO roleDTO) {
        return roleService.updateRole(roleDTO);
    }
    @DeleteMapping("/delete_role/{id}")
    public String deleteRole(@PathVariable Long id) {
        return roleService.deleteRole(id);
    }
    @DeleteMapping("/role_delete_all")
    public String deleteAll() {
        return roleService.deleteAll();
    }
    @GetMapping("/get_role/{id}")
    public RoleDTO getRole(@PathVariable Long id) {
        return roleService.getRole(id);
    }
    @GetMapping("/get_all_role")
    public RoleDTO getAllRole() {
        return roleService.getAllRole();
    }
}
