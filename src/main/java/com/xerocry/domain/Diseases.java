package com.xerocry.domain;

import io.ebean.Model;

import javax.persistence.*;

/**
 * Created by raskia on 2/23/2017.
 */
@Entity
public class Diseases extends Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "disease_id")
    Long diseaseId;

    @Column(length = 50)
    String symptoms;

    @ManyToOne(optional = false)
    DiseasesTypes disType;

    @Column(length = 50, nullable = false, name = "disease_name")
    String disName;

    public Diseases(DiseasesTypes disType, String disName) {
        this.disType = disType;
        this.disName = disName;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public DiseasesTypes getDisType() {
        return disType;
    }

    public void setDisType(DiseasesTypes disType) {
        this.disType = disType;
    }

    public String getDisName() {
        return disName;
    }

    public void setDisName(String disName) {
        this.disName = disName;
    }
}
