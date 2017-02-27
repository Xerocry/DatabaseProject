package com.xerocry.domain.query.assoc;

import com.xerocry.domain.Grants;
import com.xerocry.domain.query.QGrants;
import io.ebean.typequery.PBoolean;
import io.ebean.typequery.PLocalDate;
import io.ebean.typequery.PLong;
import io.ebean.typequery.TQAssocBean;
import io.ebean.typequery.TQProperty;
import io.ebean.typequery.TypeQueryBean;

/**
 * Association query bean for AssocGrants.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@TypeQueryBean
public class QAssocGrants<R> extends TQAssocBean<Grants,R> {

  public PLong<R> grantId;
  public PLong<R> sum;
  public PLocalDate<R> date;
  public PBoolean<R> paidUp;
  public QAssocServices<R> service;
  public QAssocDrugs<R> drug;
  public QAssocDoctors<R> doctor;
  public QAssocPatients<R> patient;

  /**
   * Eagerly fetch this association loading the specified properties.
   */
  @SafeVarargs
  public final R fetch(TQProperty<QGrants>... properties) {
    return fetchProperties(properties);
  }

  /**
   * Eagerly fetch this association using a 'query join' loading the specified properties.
   */
  @SafeVarargs
  public final R fetchQuery(TQProperty<QGrants>... properties) {
    return fetchQueryProperties(properties);
  }

  /**
   * Use lazy loading for this association loading the specified properties.
   */
  @SafeVarargs
  public final R fetchLazy(TQProperty<QGrants>... properties) {
    return fetchLazyProperties(properties);
  }

  public QAssocGrants(String name, R root) {
    super(name, root);
  }
}
