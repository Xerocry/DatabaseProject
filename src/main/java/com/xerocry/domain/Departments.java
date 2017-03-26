package com.xerocry.domain;

import io.ebean.Model;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

/**
 * Created by raskia on 2/23/2017.
 */
@Entity
@Getter
@Setter
public class Departments extends Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "depart_id")
    Long departId;

    @Column(length=50, nullable = false, name = "depart_name")
    String departName;

    @OneToMany(mappedBy = "departId")
    List<Doctors> doctors;

    public Departments(String depart_name) {
        this.departName = depart_name;
    }

    public Departments(Departments other) {
//        this.departId = other.departId;
        this.departName = other.departName;
        this.doctors = other.doctors;
    }
}
