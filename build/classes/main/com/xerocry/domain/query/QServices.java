package com.xerocry.domain.query;

import com.xerocry.domain.Services;
import com.xerocry.domain.query.assoc.QAssocTreatment;
import io.ebean.EbeanServer;
import io.ebean.typequery.PInteger;
import io.ebean.typequery.PLong;
import io.ebean.typequery.PString;
import io.ebean.typequery.TQRootBean;
import io.ebean.typequery.TypeQueryBean;

/**
 * Query bean for Services.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@TypeQueryBean
public class QServices extends TQRootBean<Services,QServices> {

  private static final QServices _alias = new QServices(true);

  /**
   * Return the shared 'Alias' instance used to provide properties to 
   * <code>select()</code> and <code>fetch()</code> 
   */
  public static QServices alias() {
    return _alias;
  }

  public PLong<QServices> serviceId;
  public PString<QServices> serviceName;
  public PInteger<QServices> price;
  public QAssocTreatment<QServices> treatments;


  /**
   * Construct with a given EbeanServer.
   */
  public QServices(EbeanServer server) {
    super(Services.class, server);
  }

  /**
   * Construct using the default EbeanServer.
   */
  public QServices() {
    super(Services.class);
  }

  /**
   * Construct for Alias.
   */
  private QServices(boolean dummy) {
    super(dummy);
  }

  /**
   * Provides static properties to use in <em> select() and fetch() </em>
   * clauses of a query. Typically referenced via static imports. 
   */
  public static class Alias {
    public static PLong<QServices> serviceId = _alias.serviceId;
    public static PString<QServices> serviceName = _alias.serviceName;
    public static PInteger<QServices> price = _alias.price;
    public static QAssocTreatment<QServices> treatments = _alias.treatments;
  }
}
