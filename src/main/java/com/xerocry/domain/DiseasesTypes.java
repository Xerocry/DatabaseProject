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
public class DiseasesTypes extends Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long type_id;

    @Column(length = 50, name = "dis_type")
    String disType;

    /*@OneToMany(mappedBy = "Diseases")
    List<Diseases> diseases;*/

    public DiseasesTypes(String disType) {
        this.disType = disType;
    }

    public DiseasesTypes(DiseasesTypes other) {
//        this.type_id = other.type_id;
        this.disType = other.disType;
    }
}
