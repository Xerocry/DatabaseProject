package com.xerocry.domain;

import io.ebean.Model;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

/**
 * Created by raskia on 2/23/2017.
 */
@Entity
@Table(name = "Treatment")
@Getter
@Setter
public class Treatment extends Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "treatment_id")
    Long id;

    @ManyToOne(optional = false)
    @Column(name = "patient_id")
    Patients patientId;

    @ManyToOne(optional = false)
    @Column(name = "doctor_id")
    Doctors doctorId;

    @ManyToOne
    @Column(name = "disease_id")
    Diseases diseaseId;

    @Column(name = "start_date", nullable = false)
    LocalDate startDate;

    @Column(name = "end_date")
    LocalDate endDate;

    @Column
    String treatment;

    @ManyToMany
    @JoinTable(name = "TREATMENT_DRUGS",
        joinColumns = @JoinColumn(name = "treatment_id", referencedColumnName = "treatment_id"),
        inverseJoinColumns = @JoinColumn(name = "drug_id", referencedColumnName = "drug_id"))
    Set<Drugs> drugs;

    @ManyToMany
    @JoinTable(name = "TREATMENT_SERVICES",
            joinColumns = @JoinColumn(name = "treatment_id", referencedColumnName = "treatment_id"),
            inverseJoinColumns = @JoinColumn(name = "service_id", referencedColumnName = "service_id"))
    Set<Services> services;

    public Treatment(LocalDate startDate) {
//        this.patientId = patientId;
//        this.doctorId = doctorId;
//        this.diseaseId = diseaseId;
        this.startDate = startDate;
    }

    public Treatment(Treatment other) {
//        this.id = other.id;
//        this.patientId = other.patientId;
//        this.doctorId = other.doctorId;
//        this.diseaseId = other.diseaseId;
        this.startDate = other.startDate;
        this.endDate = other.endDate;
//        this.treatment = other.treatment;
//        this.drugs = other.drugs;
//        this.services = other.services;
    }

    public void addServices(Services service) {
        this.services.add(service);
    }
    public void addDrugs(Drugs drugs) {
        this.drugs.add(drugs);
    }
}
