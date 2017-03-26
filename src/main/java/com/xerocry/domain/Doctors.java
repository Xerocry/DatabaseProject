package com.xerocry.domain;

import io.ebean.Model;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Created by raskia on 2/23/2017.
 */
@Entity
@Table(name = "DOCTORS")
@Getter
@Setter
public class Doctors extends Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "doctor_id")
    Long id;

/*    @OneToMany(mappedBy = "Doctors")
    @Column(name = "treatment_id")
    List<Treatment> treatmentId = new ArrayList<>();*/

    @Column(name = "years_of_experience")
    Integer experience;

    @Column(length=50, name = "skill_desc")
    String skills;

    @Column(nullable = false, name = "hire_date")
    LocalDate hireDate;

    @ManyToOne(optional = false)
    @Column(name = "depart_id")
    Departments departId;

    public Doctors(Integer experience, String skills, LocalDate hireDate) {
        this.experience = experience;
        this.skills = skills;
        this.hireDate = hireDate;
    }

    public Doctors(Doctors other) {
//        this.id = other.id;
        this.experience = other.experience;
        this.skills = other.skills;
        this.hireDate = other.hireDate;
//        this.departId = other.departId;
    }
}
