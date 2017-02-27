package com.xerocry.domain.query.assoc;

import com.xerocry.domain.Departments;
import com.xerocry.domain.query.QDepartments;
import io.ebean.typequery.PLong;
import io.ebean.typequery.PString;
import io.ebean.typequery.TQAssocBean;
import io.ebean.typequery.TQProperty;
import io.ebean.typequery.TypeQueryBean;

/**
 * Association query bean for AssocDepartments.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@TypeQueryBean
public class QAssocDepartments<R> extends TQAssocBean<Departments,R> {

  public PLong<R> depart_id;
  public PString<R> depart_name;

  /**
   * Eagerly fetch this association loading the specified properties.
   */
  @SafeVarargs
  public final R fetch(TQProperty<QDepartments>... properties) {
    return fetchProperties(properties);
  }

  /**
   * Eagerly fetch this association using a 'query join' loading the specified properties.
   */
  @SafeVarargs
  public final R fetchQuery(TQProperty<QDepartments>... properties) {
    return fetchQueryProperties(properties);
  }

  /**
   * Use lazy loading for this association loading the specified properties.
   */
  @SafeVarargs
  public final R fetchLazy(TQProperty<QDepartments>... properties) {
    return fetchLazyProperties(properties);
  }

  public QAssocDepartments(String name, R root) {
    super(name, root);
  }
}
