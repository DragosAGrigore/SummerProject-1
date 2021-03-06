package com.siemens.core.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;


@Entity
@Table(name="broker")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Broker extends BaseEntity<Integer>{

    @Column(name="name")
    private String name;
    @Column(name="profit")
    private double profit;
    @Column(name="dividendFee")
    private float dividendFee;
    @Column(name="shareFee")
    private float shareFee;

    @OneToMany(mappedBy="broker", cascade = CascadeType.ALL)
    private Set<HoldingRecord> holdingRecords;
}
