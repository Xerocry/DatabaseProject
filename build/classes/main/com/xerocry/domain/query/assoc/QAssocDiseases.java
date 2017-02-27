package com.xerocry.domain.query.assoc;

import com.xerocry.domain.Diseases;
import com.xerocry.domain.query.QDiseases;
import io.ebean.typequery.PLong;
import io.ebean.typequery.PString;
import io.ebean.typequery.TQAssocBean;
import io.ebean.typequery.TQProperty;
import io.ebean.typequery.TypeQueryBean;

/**
 * Association query bean for AssocDiseases.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@TypeQueryBean
public class QAssocDiseases<R> extends TQAssocBean<Diseases,R> {

  public PLong<R> diseaseId;
  public PString<R> symptoms;
  public QAssocDiseasesTypes<R> disType;
  public PString<R> disName;

  /**
   * Eagerly fetch this association loading the specified properties.
   */
  @SafeVarargs
  public final R fetch(TQProperty<QDiseases>... properties) {
    return fetchProperties(properties);
  }

  /**
   * Eagerly fetch this association using a 'query join' loading the specified properties.
   */
  @SafeVarargs
  public final R fetchQuery(TQProperty<QDiseases>... properties) {
    return fetchQueryProperties(properties);
  }

  /**
   * Use lazy loading for this association loading the specified properties.
   */
  @SafeVarargs
  public final R fetchLazy(TQProperty<QDiseases>... properties) {
    return fetchLazyProperties(properties);
  }

  public QAssocDiseases(String name, R root) {
    super(name, root);
  }
}
