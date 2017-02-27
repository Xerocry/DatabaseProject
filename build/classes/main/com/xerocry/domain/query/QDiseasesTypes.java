package com.xerocry.domain.query;

import com.xerocry.domain.DiseasesTypes;
import io.ebean.EbeanServer;
import io.ebean.typequery.PLong;
import io.ebean.typequery.PString;
import io.ebean.typequery.TQRootBean;
import io.ebean.typequery.TypeQueryBean;

/**
 * Query bean for DiseasesTypes.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@TypeQueryBean
public class QDiseasesTypes extends TQRootBean<DiseasesTypes,QDiseasesTypes> {

  private static final QDiseasesTypes _alias = new QDiseasesTypes(true);

  /**
   * Return the shared 'Alias' instance used to provide properties to 
   * <code>select()</code> and <code>fetch()</code> 
   */
  public static QDiseasesTypes alias() {
    return _alias;
  }

  public PLong<QDiseasesTypes> type_id;
  public PString<QDiseasesTypes> disType;


  /**
   * Construct with a given EbeanServer.
   */
  public QDiseasesTypes(EbeanServer server) {
    super(DiseasesTypes.class, server);
  }

  /**
   * Construct using the default EbeanServer.
   */
  public QDiseasesTypes() {
    super(DiseasesTypes.class);
  }

  /**
   * Construct for Alias.
   */
  private QDiseasesTypes(boolean dummy) {
    super(dummy);
  }

  /**
   * Provides static properties to use in <em> select() and fetch() </em>
   * clauses of a query. Typically referenced via static imports. 
   */
  public static class Alias {
    public static PLong<QDiseasesTypes> type_id = _alias.type_id;
    public static PString<QDiseasesTypes> disType = _alias.disType;
  }
}
