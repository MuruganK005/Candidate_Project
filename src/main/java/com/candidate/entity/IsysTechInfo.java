package com.candidate.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "ISYS_TECH_INFO")
@AllArgsConstructor
@NoArgsConstructor
public class IsysTechInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "static_id")
    private Long isysStaticId;
    @Column(name = "company_name")
    private String companyName;
    @Column(name = "company_address")
    private String companyAddress;
    @Column(name = "company_email")
    private String CompanyEmail;
    @Column(name = "company_phone")
    private String companyPhone;
    @Column(name = "company_website_url")
    private String companyWebSiteUrl;
    @Column(name = "company_hr_mail")
    private String companyHrEmail;
    @Column(name = "created_date")
    private Date createdDate;
    @Column(name = "updated_date")
    private Date updatedDate;
    @Column(name = "created_by")
    private String createdBy;
    @Column(name = "updated_by")
    private String updatedBy;
}
