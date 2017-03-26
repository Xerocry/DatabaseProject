package com.xerocry.service;

/**
 * Created by raskia on 2/23/2017.
 */

import com.xerocry.domain.*;
import io.ebean.Ebean;
import io.ebean.EbeanServer;
import io.github.benas.randombeans.randomizers.range.IntegerRangeRandomizer;

import java.io.IOException;
import java.time.LocalDate;
import java.util.*;

public class LoadExampleData {

    private static boolean runOnce;

    private static EbeanServer server = Ebean.getServer(null);

    static PatientsGenerator patientGen;
    static DepartmentsGenerator departGen;
    static DiseasesGenerator disGen;
    static DiseasesTypesGenerator disTypesGen;
    static DoctorsGenerator doctorsGen;
    static DrugsGenerator drugsGen;
    static GrantsGenerator grantsGen;
    static PaymentsGenerator paymentsGen;
    static ServicesGenerator servicesGen;
    static TreatmentGenerator treatmentGen;

    public static synchronized void load() throws IOException {
        patientGen = new PatientsGenerator();
        departGen = new DepartmentsGenerator();
        disGen = new DiseasesGenerator();
        disTypesGen = new DiseasesTypesGenerator();
        doctorsGen = new DoctorsGenerator();
        drugsGen = new DrugsGenerator();
        grantsGen = new GrantsGenerator();
        paymentsGen = new PaymentsGenerator();
        servicesGen = new ServicesGenerator();
        treatmentGen = new TreatmentGenerator();

        if (runOnce) {
            return;
        }

        final LoadExampleData me = new LoadExampleData();

        server.execute(() -> {
//            if (Country.find.query().findCount() > 0) {
//                return;
//            }
//            me.deleteAll();
            for (int i = 0; i < 100; i++) {
//                new Departments(departGen.random.nextObject(Departments.class)).save();
//                new Doctors(doctorsGen.random.nextObject(Doctors.class)).save();
//                new Patients(patientGen.random.nextObject(Patients.class)).save();
//                new DiseasesTypes(disTypesGen.random.nextObject(DiseasesTypes.class)).save();
//                new Diseases(disGen.random.nextObject(Diseases.class)).save();
//                new Drugs(drugsGen.random.nextObject(Drugs.class)).save();
//                new Services(servicesGen.random.nextObject(Services.class)).save();
//                new Grants(grantsGen.random.nextObject(Grants.class)).save();
//                new Payments(paymentsGen.random.nextObject(Payments.class)).save();
//                new Treatment(treatmentGen.random.nextObject(Treatment.class)).save();
            }
        });
        generateSome(10);
        runOnce = true;
    }

    public void deleteAll() {
        Ebean.execute(() -> {

            // Ebean.currentTransaction().setBatchMode(false);

            // orm update use bean name and bean properties
            server.createUpdate(Departments.class, "delete from departments").execute();
            server.createUpdate(Diseases.class, "delete from diseases").execute();
            server.createUpdate(Doctors.class, "delete from doctors").execute();
            server.createUpdate(Drugs.class, "delete from drugs").execute();
            server.createUpdate(DiseasesTypes.class, "delete from diseasesTypes").execute();
            server.createUpdate(Grants.class, "delete from grants").execute();
            server.createUpdate(Patients.class, "delete from patients").execute();
            server.createUpdate(Services.class, "delete from services").execute();
            server.createUpdate(Treatment.class, "delete from treatment").execute();

//            // sql update uses table and column names
//            server.createSqlUpdate("delete from o_country").execute();
//            server.createSqlUpdate("delete from o_product").execute();
        });
    }


    public void insertPatients() {
        server.execute(() -> {
            new Patients("Andrey", LocalDate.now(), Patients.Gender.MALE).save();
            new Patients("Marina", LocalDate.now(), Patients.Gender.FEMALE).save();
            new Patients("Derek", LocalDate.now(), Patients.Gender.MALE).save();
        });
    }

    static boolean generateSome(int genAmount) {
        IntegerRangeRandomizer intRandomizer = new IntegerRangeRandomizer(0, genAmount - 1);

        server.execute(() -> {
            List<Departments> departments = new ArrayList<>();
            for (int i = 0; i < genAmount; i++) {
                Departments o = new Departments(departGen.random.nextObject(Departments.class));
                departments.add(o);
                o.save();

            }
            System.out.println(departments);

            List<Doctors> doctors = new ArrayList<>();
            for (int i = 0; i < genAmount; i++) {
                Doctors o = new Doctors(doctorsGen.random.nextObject(Doctors.class));
                o.setDepartId(departments.get(intRandomizer.getRandomValue()));
                doctors.add(o);
                o.save();
            }
            System.out.println(doctors);

            List<Patients> patients = new ArrayList<>();
            for (int i = 0; i < genAmount; i++) {
                Patients o = new Patients(patientGen.random.nextObject(Patients.class));
                patients.add(o);
                o.save();

            }
            System.out.println(patients);

            List<DiseasesTypes> diseasesTypes = new ArrayList<>();
            for (int i = 0; i < genAmount; i++) {
                DiseasesTypes o = new DiseasesTypes(disTypesGen.random.nextObject(DiseasesTypes.class));
                diseasesTypes.add(o);
                o.save();

            }
            System.out.println(diseasesTypes);

            List<Diseases> diseases = new ArrayList<>();
            for (int i = 0; i < genAmount; i++) {
                Diseases o = new Diseases(disGen.random.nextObject(Diseases.class));
                o.setDisType(diseasesTypes.get(intRandomizer.getRandomValue()));
                diseases.add(o);
                o.save();

            }
            System.out.println(diseases);

            List<Drugs> drugs = new ArrayList<>();
            for (int i = 0; i < genAmount; i++) {
                Drugs o = new Drugs(drugsGen.random.nextObject(Drugs.class));
                o.setTypeId(diseasesTypes.get(intRandomizer.getRandomValue()));
                o.save();
                drugs.add(o);
            }
            System.out.println(drugs);

            List<Services> services = new ArrayList<>();
            for (int i = 0; i < genAmount; i++) {
                Services o = new Services(servicesGen.random.nextObject(Services.class));
                o.save();
                services.add(o);
            }
            System.out.println(services);

            List<Grants> grants = new ArrayList<>();
            for (int i = 0; i < genAmount; i++) {
                Grants o = new Grants(grantsGen.random.nextObject(Grants.class));
                o.setDoctor(doctors.get(intRandomizer.getRandomValue()));
                o.setDrug(drugs.get(intRandomizer.getRandomValue()));
                o.setPatient(patients.get(intRandomizer.getRandomValue()));
                o.setService(services.get(intRandomizer.getRandomValue()));
                o.save();
                grants.add(o);
            }
            System.out.println(grants);

            List<Payments> payments = new ArrayList<>();
            for (int i = 0; i < genAmount; i++) {
                Payments o = new Payments(patientGen.random.nextObject(Payments.class));
                Set<Patients> patientsTo = new HashSet<>();
                patientsTo.add(patients.get(intRandomizer.getRandomValue()));
                o.setPatients(patientsTo);
                o.save();
                payments.add(o);
            }
            System.out.println(payments);

            List<Treatment> treatments = new ArrayList<>();
            for (int i = 0; i < genAmount; i++) {
                Treatment o = new Treatment(treatmentGen.random.nextObject(Treatment.class));

                o.setPatientId(patients.get(intRandomizer.getRandomValue()));
                o.setDoctorId(doctors.get(intRandomizer.getRandomValue()));

                Integer drugsToNum = intRandomizer.getRandomValue();
                Set<Drugs> drugsTo = new HashSet<>();
                for (int j = 0; j < drugsToNum; j++) {
                    drugsTo.add(drugs.get(intRandomizer.getRandomValue()));
                }
                o.setDrugs(drugsTo);

                Integer servicesToNum = intRandomizer.getRandomValue();
                Set<Services> servicesTo = new HashSet<>();
                for (int j = 0; j < servicesToNum; j++) {
                    servicesTo.add(services.get(intRandomizer.getRandomValue()));
                }
                o.setServices(servicesTo);
                o.save();
                treatments.add(o);
            }
            System.out.println(treatments);

        });
        return true;
    }


    public void insertDoctors() {
        server.execute(() -> {
            new Doctors(5, "Can heal", LocalDate.of(1995, 03, 12)).save();
        });
    }

    private static Departments insertDepartment(String name) {
        Departments department = new Departments(name);
        Ebean.save(department);
        return department;
    }

    public Doctors createDoctor(String skills, int exp, LocalDate hiredDate) {
        Departments department = insertDepartment("Depart" + UUID.randomUUID().toString());
        Doctors doctor = new Doctors(exp, skills, hiredDate);
        doctor.setDepartId(department);
        Ebean.save(doctor);
        return doctor;
    }

    public static DiseasesTypes insertType(String type) {
        DiseasesTypes disType = new DiseasesTypes(type);
        Ebean.save(disType);
        return disType;
    }

    public Diseases createDisease(String name) {
        Diseases dis = new Diseases(insertType("type" + UUID.randomUUID().toString()), name);
        Ebean.save(dis);
        return dis;
    }


    public static Patients createPatient(LocalDate regDate, String city, String name, LocalDate birthDate, Patients.Gender gender) {
        Patients patient = new Patients(name, birthDate, gender);
        if (regDate != null) {
            patient.setRegDate(regDate);
        }
        if (city != null) {
            patient.setCity(city);
        }
        Ebean.save(patient);
        return patient;
    }

    public void createTreatment(String treatment, LocalDate endDate, LocalDate startDate) {
        Treatment treatment1 = new Treatment(startDate);
        treatment1.setDoctorId(createDoctor(UUID.randomUUID().toString(), 10, LocalDate.of(1995, 10, 1)));
        treatment1.setPatientId(createPatient(LocalDate.now(), "Piter", "Andrey", LocalDate.now(), Patients.Gender.MALE));
        treatment1.setDiseaseId(createDisease("dis" + UUID.randomUUID().toString()));
        if (treatment != null) {
            treatment1.setTreatment(treatment);
        }
        if (endDate != null) {
            treatment1.setEndDate(endDate);
        }
        Ebean.save(treatment1);
    }
}
