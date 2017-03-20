package com.xerocry.domain.query.assoc;

import com.xerocry.domain.Drugs;
import com.xerocry.domain.query.QDrugs;
import io.ebean.typequery.PInteger;
import io.ebean.typequery.PLong;
import io.ebean.typequery.PString;
import io.ebean.typequery.TQAssocBean;
import io.ebean.typequery.TQProperty;
import io.ebean.typequery.TypeQueryBean;

/**
 * Association query bean for AssocDrugs.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@TypeQueryBean
public class QAssocDrugs<R> extends TQAssocBean<Drugs,R> {

  public PLong<R> drugId;
  public QAssocDiseasesTypes<R> typeId;
  public PString<R> drugName;
  public PInteger<R> bff;
  public QAssocTreatment<R> treatments;

  /**
   * Eagerly fetch this association loading the specified properties.
   */
  @SafeVarargs
  public final R fetch(TQProperty<QDrugs>... properties) {
    return fetchProperties(properties);
  }

  /**
   * Eagerly fetch this association using a 'query join' loading the specified properties.
   */
  @SafeVarargs
  public final R fetchQuery(TQProperty<QDrugs>... properties) {
    return fetchQueryProperties(properties);
  }

  /**
   * Use lazy loading for this association loading the specified properties.
   */
  @SafeVarargs
  public final R fetchLazy(TQProperty<QDrugs>... properties) {
    return fetchLazyProperties(properties);
  }

  public QAssocDrugs(String name, R root) {
    super(name, root);
  }
}
