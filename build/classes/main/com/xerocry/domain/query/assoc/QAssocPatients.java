package com.xerocry.domain.query.assoc;

import com.xerocry.domain.Patients;
import com.xerocry.domain.Patients.Gender;
import com.xerocry.domain.query.QPatients;
import io.ebean.typequery.PEnum;
import io.ebean.typequery.PLocalDate;
import io.ebean.typequery.PLong;
import io.ebean.typequery.PString;
import io.ebean.typequery.TQAssocBean;
import io.ebean.typequery.TQProperty;
import io.ebean.typequery.TypeQueryBean;

/**
 * Association query bean for AssocPatients.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@TypeQueryBean
public class QAssocPatients<R> extends TQAssocBean<Patients,R> {

  public PLong<R> patientId;
  public PLocalDate<R> regDate;
  public PString<R> city;
  public PString<R> name;
  public PLocalDate<R> birthDate;
  public PEnum<R,Gender> gender;
  public QAssocTreatment<R> treatments;
  public QAssocPayments<R> payments;

  /**
   * Eagerly fetch this association loading the specified properties.
   */
  @SafeVarargs
  public final R fetch(TQProperty<QPatients>... properties) {
    return fetchProperties(properties);
  }

  /**
   * Eagerly fetch this association using a 'query join' loading the specified properties.
   */
  @SafeVarargs
  public final R fetchQuery(TQProperty<QPatients>... properties) {
    return fetchQueryProperties(properties);
  }

  /**
   * Use lazy loading for this association loading the specified properties.
   */
  @SafeVarargs
  public final R fetchLazy(TQProperty<QPatients>... properties) {
    return fetchLazyProperties(properties);
  }

  public QAssocPatients(String name, R root) {
    super(name, root);
  }
}
