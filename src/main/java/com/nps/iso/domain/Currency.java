package com.nps.iso.domain;

import com.fasterxml.jackson.annotation.*;

import javax.persistence.*;
import java.util.Collection;

@javax.persistence.Entity
public class Currency {

    @Column(nullable = false)
    private String name;

    @Id
    @Column
    private String alphabeticCode;

    @Column
    private String numericCode;

    @Column
    private String minorUnit;

    protected Currency() { }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

}
