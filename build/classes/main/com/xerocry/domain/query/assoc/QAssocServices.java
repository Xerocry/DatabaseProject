package com.xerocry.domain.query.assoc;

import com.xerocry.domain.Services;
import com.xerocry.domain.query.QServices;
import io.ebean.typequery.PInteger;
import io.ebean.typequery.PLong;
import io.ebean.typequery.PString;
import io.ebean.typequery.TQAssocBean;
import io.ebean.typequery.TQProperty;
import io.ebean.typequery.TypeQueryBean;

/**
 * Association query bean for AssocServices.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@TypeQueryBean
public class QAssocServices<R> extends TQAssocBean<Services,R> {

  public PLong<R> serviceId;
  public PString<R> serviceName;
  public PInteger<R> price;
  public QAssocTreatment<R> treatments;

  /**
   * Eagerly fetch this association loading the specified properties.
   */
  @SafeVarargs
  public final R fetch(TQProperty<QServices>... properties) {
    return fetchProperties(properties);
  }

  /**
   * Eagerly fetch this association using a 'query join' loading the specified properties.
   */
  @SafeVarargs
  public final R fetchQuery(TQProperty<QServices>... properties) {
    return fetchQueryProperties(properties);
  }

  /**
   * Use lazy loading for this association loading the specified properties.
   */
  @SafeVarargs
  public final R fetchLazy(TQProperty<QServices>... properties) {
    return fetchLazyProperties(properties);
  }

  public QAssocServices(String name, R root) {
    super(name, root);
  }
}
