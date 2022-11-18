package com.candidate.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "resourceLog")
@AllArgsConstructor
@NoArgsConstructor
public class ResourceLog {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "resource_log_id", nullable = false)
    private Long resource_log_id;

}
