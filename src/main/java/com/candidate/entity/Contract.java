package com.candidate.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Table(name = "contract")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Contract {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "contract_id")
    private Long contractId;
    @Column(name = "contract_no")
    private Integer contractNo;
    @Column(name = "description")
    private String description;
    @Column(name = "start_date")
    private Date startDate =new Date();
    @Column(name = "end_date")
    private Date endDate;
    @Column(name = "status")
    private String status;
    @Column(name = "revised_end_date")
    private Date revisedEndDate;

    @OneToOne(cascade= CascadeType.ALL,fetch = FetchType.LAZY)
    @JoinColumn(name = "contract_type_id",referencedColumnName = "contract_type_id")
    private ContractType contractType;

}
