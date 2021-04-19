package com.lemsviat.springboot.homework25.entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "specialties")
@Data
public class Specialty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "specialty_id")
    private Integer specialtyId;

    @Column(name = "specialty_name")
    private String specialtyName;

    public Specialty() {
    }
}
