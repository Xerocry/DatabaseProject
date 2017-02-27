package com.xerocry.domain.query.assoc;

import com.xerocry.domain.Treatment;
import com.xerocry.domain.query.QTreatment;
import io.ebean.typequery.PLocalDate;
import io.ebean.typequery.PLong;
import io.ebean.typequery.PString;
import io.ebean.typequery.TQAssocBean;
import io.ebean.typequery.TQProperty;
import io.ebean.typequery.TypeQueryBean;

/**
 * Association query bean for AssocTreatment.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@TypeQueryBean
public class QAssocTreatment<R> extends TQAssocBean<Treatment,R> {

  public PLong<R> id;
  public QAssocPatients<R> patientId;
  public QAssocDoctors<R> doctorId;
  public QAssocDiseases<R> diseaseId;
  public PLocalDate<R> startDate;
  public PLocalDate<R> endDate;
  public PString<R> treatment;
  public QAssocDrugs<R> drugs;
  public QAssocServices<R> services;

  /**
   * Eagerly fetch this association loading the specified properties.
   */
  @SafeVarargs
  public final R fetch(TQProperty<QTreatment>... properties) {
    return fetchProperties(properties);
  }

  /**
   * Eagerly fetch this association using a 'query join' loading the specified properties.
   */
  @SafeVarargs
  public final R fetchQuery(TQProperty<QTreatment>... properties) {
    return fetchQueryProperties(properties);
  }

  /**
   * Use lazy loading for this association loading the specified properties.
   */
  @SafeVarargs
  public final R fetchLazy(TQProperty<QTreatment>... properties) {
    return fetchLazyProperties(properties);
  }

  public QAssocTreatment(String name, R root) {
    super(name, root);
  }
}
