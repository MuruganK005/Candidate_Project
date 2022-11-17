package com.candidate.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class ContractDTO {
    private Long contractId;
    private Integer contractNo;
    private String description;
    private Date startDate;
    private Date endDate;
    private String status;
    private Date revisedEndDate;
}
