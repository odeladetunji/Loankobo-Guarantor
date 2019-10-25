package com.entities;


import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "guarantor")
public class Guarantor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    public Long Id;

}
