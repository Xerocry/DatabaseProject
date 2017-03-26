package com.xerocry.domain;

import io.ebean.Model;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * Created by raskia on 2/24/2017.
 */
@Entity
@Getter
@Setter
public class Grants extends Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "grant_id")
    Long grantId;

    @Column(name = "grant_sum")
    Long sum;

    @Column(name = "grant_date", nullable = false)
    LocalDate date;

    @Column(name = "paid_up")
    Boolean paidUp;

    @ManyToOne
    @Column(name = "service_id")
    Services service;

    @ManyToOne
    @Column(name = "drug_id")
    Drugs drug;

    @ManyToOne
    @Column(name = "doctor_id")
    Doctors doctor;

    @ManyToOne
    @Column(name = "patient_id")
    Patients patient;

    public Grants(LocalDate date, Boolean paidUp, Doctors doctor, Patients patient) {
        this.date = date;
        this.paidUp = paidUp;
        this.doctor = doctor;
        this.patient = patient;
    }

    public Grants(Grants other) {
//        this.grantId = other.grantId;
        this.sum = other.sum;
        this.date = other.date;
        this.paidUp = other.paidUp;
//        this.service = other.service;
//        this.drug = other.drug;
//        this.doctor = other.doctor;
//        this.patient = other.patient;
    }
}
