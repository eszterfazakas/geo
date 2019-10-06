package com.geo.system.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Calendar;

@Entity
public class Project {
    @Id
    @GeneratedValue
    @Getter
    private Integer id;

    @Getter
    @Setter
    private Integer userId;

    @Getter
    @Setter
    private String title;

    @Getter
    @Setter
    private String address;

    @Getter
    @Setter
    private Calendar registrationDate;

    @Getter
    @Setter
    private Calendar dueDate;

    @Getter
    @Setter
    private Integer contactId;

    @Getter
    @Setter
    private Integer projectTypeId;

}
