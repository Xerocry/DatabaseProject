package com.xerocry.domain;

import io.ebean.Model;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by raskia on 2/23/2017.
 */
@Entity
@Getter
@Setter
public class Drugs extends Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "drug_id")
    Long drugId;

    @ManyToOne(optional = false)
    @Column(name = "type_id")
    DiseasesTypes typeId;

    @Column(length = 50, name = "drug_name")
    String drugName;

    Integer price;

    @ManyToMany(mappedBy = "drugs")
    Set<Treatment> treatments = new HashSet<>();

    @JoinTable(name = "restrictions", joinColumns = {
            @JoinColumn(name = "drug1", referencedColumnName = "drug_id", nullable = false)}, inverseJoinColumns = {
            @JoinColumn(name = "drug2", referencedColumnName = "drug_id", nullable = false)})
    @ManyToMany
    Set<Drugs> restrictionsColl;


    public Drugs(DiseasesTypes typeId, String drugName) {
        this.typeId = typeId;
        this.drugName = drugName;
    }

    public Drugs(Drugs other) {
//        this.drugId = other.drugId;
        this.price = other.price;
        this.drugName = other.drugName;
//        this.treatments = other.treatments;
    }
}
