package com.nps.iso.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.Collection;

@javax.persistence.Entity
public class Currency {

    @Column(nullable = false)
    private String currency;

    @Id
    @Column
    private String alphabeticCode;

    @Column
    private String numericCode;

    @Column
    private String minorUnit;

    @OneToMany(mappedBy = "currency")
    @JsonManagedReference("currency")
    private Collection<Entity> entities;

    protected Currency() { }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAlphabeticCode() {
        return alphabeticCode;
    }

    public void setAlphabeticCode(String alphabeticCode) {
        this.alphabeticCode = alphabeticCode;
    }

    public String getNumericCode() {
        return numericCode;
    }

    public void setNumericCode(String numericCode) {
        this.numericCode = numericCode;
    }

    public String getMinorUnit() {
        return minorUnit;
    }

    public void setMinorUnit(String minorUnit) {
        this.minorUnit = minorUnit;
    }

    public Collection<Entity> getEntities() {
        return entities;
    }

    public void setEntities(Collection<Entity> entities) {
        this.entities = entities;
    }
}
