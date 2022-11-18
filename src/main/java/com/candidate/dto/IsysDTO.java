package com.candidate.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class IsysDTO {
    private String isysStaticId;
    private String companyName;
    private String companyAddress;
    private String CompanyEmail;
    private String companyPhone;
    private String companyWebSiteUrl;
    private String companyHrEmail;
    private Date createdDate;
    private Date updatedDate;
    private String createdBy;
    private String updatedBy;
}
