-- apply changes
create table restrictions (
  drug1                         bigint not null,
  drug2                         bigint not null,
  constraint pk_restrictions primary key (drug1,drug2)
);

alter table restrictions add constraint fk_restrictions_drugs_1 foreign key (drug1) references drugs (drug_id) on delete restrict on update restrict;
create index ix_restrictions_drugs_1 on restrictions (drug1);

alter table restrictions add constraint fk_restrictions_drugs_2 foreign key (drug2) references drugs (drug_id) on delete restrict on update restrict;
create index ix_restrictions_drugs_2 on restrictions (drug2);

