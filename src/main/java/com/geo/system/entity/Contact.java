package com.geo.system.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class Contact {

    @Id
    @GeneratedValue
    @Getter
    private Integer id;

    @Getter
    @Setter
    private String name;

    @Getter
    @Setter
    private String phoneNumber;

    @Getter
    @Setter
    private String address;

    @Getter
    @Setter
    private String email;

}
