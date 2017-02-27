package com.xerocry.domain.query;

import com.xerocry.domain.Grants;
import com.xerocry.domain.query.assoc.QAssocDoctors;
import com.xerocry.domain.query.assoc.QAssocDrugs;
import com.xerocry.domain.query.assoc.QAssocPatients;
import com.xerocry.domain.query.assoc.QAssocServices;
import io.ebean.EbeanServer;
import io.ebean.typequery.PBoolean;
import io.ebean.typequery.PLocalDate;
import io.ebean.typequery.PLong;
import io.ebean.typequery.TQRootBean;
import io.ebean.typequery.TypeQueryBean;

/**
 * Query bean for Grants.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@TypeQueryBean
public class QGrants extends TQRootBean<Grants,QGrants> {

  private static final QGrants _alias = new QGrants(true);

  /**
   * Return the shared 'Alias' instance used to provide properties to 
   * <code>select()</code> and <code>fetch()</code> 
   */
  public static QGrants alias() {
    return _alias;
  }

  public PLong<QGrants> grantId;
  public PLong<QGrants> sum;
  public PLocalDate<QGrants> date;
  public PBoolean<QGrants> paidUp;
  public QAssocServices<QGrants> service;
  public QAssocDrugs<QGrants> drug;
  public QAssocDoctors<QGrants> doctor;
  public QAssocPatients<QGrants> patient;


  /**
   * Construct with a given EbeanServer.
   */
  public QGrants(EbeanServer server) {
    super(Grants.class, server);
  }

  /**
   * Construct using the default EbeanServer.
   */
  public QGrants() {
    super(Grants.class);
  }

  /**
   * Construct for Alias.
   */
  private QGrants(boolean dummy) {
    super(dummy);
  }

  /**
   * Provides static properties to use in <em> select() and fetch() </em>
   * clauses of a query. Typically referenced via static imports. 
   */
  public static class Alias {
    public static PLong<QGrants> grantId = _alias.grantId;
    public static PLong<QGrants> sum = _alias.sum;
    public static PLocalDate<QGrants> date = _alias.date;
    public static PBoolean<QGrants> paidUp = _alias.paidUp;
    public static QAssocServices<QGrants> service = _alias.service;
    public static QAssocDrugs<QGrants> drug = _alias.drug;
    public static QAssocDoctors<QGrants> doctor = _alias.doctor;
    public static QAssocPatients<QGrants> patient = _alias.patient;
  }
}
