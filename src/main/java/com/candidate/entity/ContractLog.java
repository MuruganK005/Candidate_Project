package com.candidate.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "contractLog")
@AllArgsConstructor
@NoArgsConstructor
public class ContractLog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "contract_log_id")
    private Long contractLogId;

}
