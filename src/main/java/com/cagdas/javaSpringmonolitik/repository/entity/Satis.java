package com.cagdas.javaSpringmonolitik.repository.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name = "tblsatis")
@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Satis {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    String musteriad;
    String urunad;
    Double fiyat;

}
