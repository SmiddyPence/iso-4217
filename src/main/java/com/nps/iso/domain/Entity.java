package com.nps.iso.domain;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@javax.persistence.Entity
public class Entity {

    @Id
    @Column
    private String entity;

    @ManyToOne
    @JoinColumn(name = "alphabetic_code")
    @JsonBackReference("currency")
    private Currency currency;

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public String getEntity() {
        return entity;
    }

    public void setEntity(String entity) {
        this.entity = entity;
    }
}
