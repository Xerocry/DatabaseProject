package com.xerocry.domain;

import io.ebean.Model;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by raskia on 2/23/2017.
 */
@Entity
@Getter
@Setter
public class Services extends Model {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "service_id")
    Long serviceId;

    @Column(length = 50, nullable = false, name = "service_name")
    String serviceName;

    Integer price;

    @ManyToMany(mappedBy = "services")
    Set<Treatment> treatments = new HashSet<>();

    public Services(String serviceName, Integer price) {
        this.serviceName = serviceName;
        this.price = price;
    }

    public Services(Services other) {
//        this.serviceId = other.serviceId;
        this.serviceName = other.serviceName;
        this.price = other.price;
//        this.treatments = other.treatments;
    }
}
