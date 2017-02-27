package com.xerocry.domain.query.assoc;

import com.xerocry.domain.Doctors;
import com.xerocry.domain.query.QDoctors;
import io.ebean.typequery.PInteger;
import io.ebean.typequery.PLocalDate;
import io.ebean.typequery.PLong;
import io.ebean.typequery.PString;
import io.ebean.typequery.TQAssocBean;
import io.ebean.typequery.TQProperty;
import io.ebean.typequery.TypeQueryBean;

/**
 * Association query bean for AssocDoctors.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@TypeQueryBean
public class QAssocDoctors<R> extends TQAssocBean<Doctors,R> {

  public PLong<R> id;
  public PInteger<R> experience;
  public PString<R> skills;
  public PLocalDate<R> hireDate;
  public QAssocDepartments<R> departId;

  /**
   * Eagerly fetch this association loading the specified properties.
   */
  @SafeVarargs
  public final R fetch(TQProperty<QDoctors>... properties) {
    return fetchProperties(properties);
  }

  /**
   * Eagerly fetch this association using a 'query join' loading the specified properties.
   */
  @SafeVarargs
  public final R fetchQuery(TQProperty<QDoctors>... properties) {
    return fetchQueryProperties(properties);
  }

  /**
   * Use lazy loading for this association loading the specified properties.
   */
  @SafeVarargs
  public final R fetchLazy(TQProperty<QDoctors>... properties) {
    return fetchLazyProperties(properties);
  }

  public QAssocDoctors(String name, R root) {
    super(name, root);
  }
}
