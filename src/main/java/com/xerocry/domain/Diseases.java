package com.xerocry.domain;

import io.ebean.Model;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * Created by raskia on 2/23/2017.
 */
@Entity
@Getter
@Setter
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

    public Diseases(Diseases other) {
//        this.diseaseId = other.diseaseId;
        this.symptoms = other.symptoms;
//        this.disType = other.disType;
        this.disName = other.disName;
    }
}
