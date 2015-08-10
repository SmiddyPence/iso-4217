package com.nps.iso.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;


import javax.persistence.*;

@javax.persistence.Entity
public class Entity {

    @Id
    @Column
    private String name;

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "alphabetic_code")
    private Currency currency;

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
