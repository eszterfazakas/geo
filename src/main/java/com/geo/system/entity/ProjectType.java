package com.geo.system.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ProjectType {

    @Id
    @GeneratedValue
    @Getter
    private Integer id;

    @Getter
    @Setter
    private String typeName;

    @Getter
    @Setter
    private double price;


}
