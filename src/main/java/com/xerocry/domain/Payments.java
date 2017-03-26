package com.xerocry.domain;

import io.ebean.Model;
import io.ebean.annotation.EnumValue;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by raskia on 2/27/2017.
 */
@Entity
@Getter
@Setter
public class Payments extends Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id")
    Long paymentId;

    Double discount;

    @Column(nullable = false)
    Double balance;

    public enum State {
        @EnumValue("P")
        PAID,
        @EnumValue("N")
        NOT_PAID,
    }

    @ManyToMany(mappedBy = "payments")
    Set<Patients> patients = new HashSet<>();

    public Payments(Payments other) {
//        this.paymentId = other.paymentId;
        this.discount = other.discount;
        this.balance = other.balance;
//        this.patients = other.patients;
    }
}
