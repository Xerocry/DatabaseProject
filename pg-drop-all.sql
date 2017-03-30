alter table if exists diseases drop constraint if exists fk_diseases_dis_type_type_id;
drop index if exists ix_diseases_dis_type_type_id;

alter table if exists doctors drop constraint if exists fk_doctors_depart_id_depart_id;
drop index if exists ix_doctors_depart_id_depart_id;

alter table if exists drugs drop constraint if exists fk_drugs_type_id_type_id;
drop index if exists ix_drugs_type_id_type_id;

alter table if exists restrictions drop constraint if exists fk_restrictions_drugs_1;
drop index if exists ix_restrictions_drugs_1;

alter table if exists restrictions drop constraint if exists fk_restrictions_drugs_2;
drop index if exists ix_restrictions_drugs_2;

alter table if exists grants drop constraint if exists fk_grants_service_service_id;
drop index if exists ix_grants_service_service_id;

alter table if exists grants drop constraint if exists fk_grants_drug_drug_id;
drop index if exists ix_grants_drug_drug_id;

alter table if exists grants drop constraint if exists fk_grants_doctor_doctor_id;
drop index if exists ix_grants_doctor_doctor_id;

alter table if exists grants drop constraint if exists fk_grants_patient_patient_id;
drop index if exists ix_grants_patient_patient_id;

alter table if exists payment_patient drop constraint if exists fk_payment_patient_patients;
drop index if exists ix_payment_patient_patients;

alter table if exists payment_patient drop constraint if exists fk_payment_patient_payments;
drop index if exists ix_payment_patient_payments;

alter table if exists treatment drop constraint if exists fk_treatment_patient_id_patient_id;
drop index if exists ix_treatment_patient_id_patient_id;

alter table if exists treatment drop constraint if exists fk_treatment_doctor_id_doctor_id;
drop index if exists ix_treatment_doctor_id_doctor_id;

alter table if exists treatment drop constraint if exists fk_treatment_disease_id_disease_id;
drop index if exists ix_treatment_disease_id_disease_id;

alter table if exists treatment_drugs drop constraint if exists fk_treatment_drugs_treatment;
drop index if exists ix_treatment_drugs_treatment;

alter table if exists treatment_drugs drop constraint if exists fk_treatment_drugs_drugs;
drop index if exists ix_treatment_drugs_drugs;

alter table if exists treatment_services drop constraint if exists fk_treatment_services_treatment;
drop index if exists ix_treatment_services_treatment;

alter table if exists treatment_services drop constraint if exists fk_treatment_services_services;
drop index if exists ix_treatment_services_services;

drop table if exists departments cascade;

drop table if exists diseases cascade;

drop table if exists diseases_types cascade;

drop table if exists doctors cascade;

drop table if exists drugs cascade;

drop table if exists restrictions cascade;

drop table if exists grants cascade;

drop table if exists patients cascade;

drop table if exists payment_patient cascade;

drop table if exists payments cascade;

drop table if exists services cascade;

drop table if exists treatment cascade;

drop table if exists treatment_drugs cascade;

drop table if exists treatment_services cascade;

