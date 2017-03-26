package com.xerocry.domain;

import io.ebean.Model;
import io.ebean.annotation.EnumValue;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by raskia on 2/24/2017.
 */
@Entity
@Getter
@Setter
public class Patients extends Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patient_id")
    Long patientId;

    @Column(name = "reg_date")
    LocalDate regDate;

    String city;

    @Column(name = "p_name", nullable = false)
    String name;

    @Column(name = "dob", nullable = false)
    LocalDate birthDate;

    public enum Gender {
        @EnumValue("M")
        MALE,
        @EnumValue("F")
        FEMALE,
    }

    @Column(nullable = false)
    Gender gender;

    @OneToMany(mappedBy = "patientId")
    List<Treatment> treatments = new ArrayList<>();

    @ManyToMany
    @JoinTable(name = "PAYMENT_PATIENT",
            joinColumns = @JoinColumn(name = "patient_id", referencedColumnName = "patient_id"),
            inverseJoinColumns = @JoinColumn(name = "payment_id", referencedColumnName = "payment_id"))
    Set<Payments> payments = new HashSet<>();

    public Patients(String name, LocalDate birthDate, Gender gender) {
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
    }

    public Patients(Patients patient) {
        this.regDate = patient.regDate;
        this.city = patient.city;
        this.name = patient.name;
        this.birthDate = patient.birthDate;
        this.gender = patient.gender;
//        this.treatments = patient.treatments;
//        this.payments = patient.payments;
    }


}
