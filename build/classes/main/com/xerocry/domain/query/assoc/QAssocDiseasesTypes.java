package com.xerocry.domain.query.assoc;

import com.xerocry.domain.DiseasesTypes;
import com.xerocry.domain.query.QDiseasesTypes;
import io.ebean.typequery.PLong;
import io.ebean.typequery.PString;
import io.ebean.typequery.TQAssocBean;
import io.ebean.typequery.TQProperty;
import io.ebean.typequery.TypeQueryBean;

/**
 * Association query bean for AssocDiseasesTypes.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@TypeQueryBean
public class QAssocDiseasesTypes<R> extends TQAssocBean<DiseasesTypes,R> {

  public PLong<R> type_id;
  public PString<R> disType;

  /**
   * Eagerly fetch this association loading the specified properties.
   */
  @SafeVarargs
  public final R fetch(TQProperty<QDiseasesTypes>... properties) {
    return fetchProperties(properties);
  }

  /**
   * Eagerly fetch this association using a 'query join' loading the specified properties.
   */
  @SafeVarargs
  public final R fetchQuery(TQProperty<QDiseasesTypes>... properties) {
    return fetchQueryProperties(properties);
  }

  /**
   * Use lazy loading for this association loading the specified properties.
   */
  @SafeVarargs
  public final R fetchLazy(TQProperty<QDiseasesTypes>... properties) {
    return fetchLazyProperties(properties);
  }

  public QAssocDiseasesTypes(String name, R root) {
    super(name, root);
  }
}
