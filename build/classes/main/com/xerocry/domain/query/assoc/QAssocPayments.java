package com.xerocry.domain.query.assoc;

import com.xerocry.domain.Payments;
import com.xerocry.domain.query.QPayments;
import io.ebean.typequery.PDouble;
import io.ebean.typequery.PLong;
import io.ebean.typequery.TQAssocBean;
import io.ebean.typequery.TQProperty;
import io.ebean.typequery.TypeQueryBean;

/**
 * Association query bean for AssocPayments.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@TypeQueryBean
public class QAssocPayments<R> extends TQAssocBean<Payments,R> {

  public PLong<R> paymentId;
  public PDouble<R> discount;
  public PDouble<R> balance;
  public QAssocPatients<R> patients;

  /**
   * Eagerly fetch this association loading the specified properties.
   */
  @SafeVarargs
  public final R fetch(TQProperty<QPayments>... properties) {
    return fetchProperties(properties);
  }

  /**
   * Eagerly fetch this association using a 'query join' loading the specified properties.
   */
  @SafeVarargs
  public final R fetchQuery(TQProperty<QPayments>... properties) {
    return fetchQueryProperties(properties);
  }

  /**
   * Use lazy loading for this association loading the specified properties.
   */
  @SafeVarargs
  public final R fetchLazy(TQProperty<QPayments>... properties) {
    return fetchLazyProperties(properties);
  }

  public QAssocPayments(String name, R root) {
    super(name, root);
  }
}
