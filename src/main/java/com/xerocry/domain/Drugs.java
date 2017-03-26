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

    @ManyToMany(mappedBy = "drugs")
    Set<Treatment> treatments = new HashSet<>();

    public Drugs(DiseasesTypes typeId, String drugName) {
        this.typeId = typeId;
        this.drugName = drugName;
    }

    public Drugs(Drugs other) {
//        this.drugId = other.drugId;
//        this.typeId = other.typeId;
        this.drugName = other.drugName;
//        this.treatments = other.treatments;
    }
}
