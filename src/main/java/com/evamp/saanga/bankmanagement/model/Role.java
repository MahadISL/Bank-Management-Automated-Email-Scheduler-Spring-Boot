package com.evamp.saanga.bankmanagement.model;

import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;
import org.hibernate.annotations.Cache;

@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Integer id;

    @Enumerated(EnumType.STRING)
    @Column(length = 20, name = "role")
    private ERole name;


    public Role() {

    }

    public Role(ERole name) {
        this.name = name;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ERole getName() {
        return name;
    }

    public void setName(ERole name) {
        this.name = name;
    }
}
