package com.candidate.dto;

import com.candidate.entity.ResourceType;
import com.candidate.entity.Role;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResourceDTO {
    private Long resourceId;
    private String resourceNo;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private Boolean active=false;
    private Role role;
    private ResourceType resourceType;
}
