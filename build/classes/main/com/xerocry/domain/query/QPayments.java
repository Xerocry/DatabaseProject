package com.xerocry.domain.query;

import com.xerocry.domain.Payments;
import com.xerocry.domain.query.assoc.QAssocPatients;
import io.ebean.EbeanServer;
import io.ebean.typequery.PDouble;
import io.ebean.typequery.PLong;
import io.ebean.typequery.TQRootBean;
import io.ebean.typequery.TypeQueryBean;

/**
 * Query bean for Payments.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@TypeQueryBean
public class QPayments extends TQRootBean<Payments,QPayments> {

  private static final QPayments _alias = new QPayments(true);

  /**
   * Return the shared 'Alias' instance used to provide properties to 
   * <code>select()</code> and <code>fetch()</code> 
   */
  public static QPayments alias() {
    return _alias;
  }

  public PLong<QPayments> paymentId;
  public PDouble<QPayments> discount;
  public PDouble<QPayments> balance;
  public QAssocPatients<QPayments> patients;


  /**
   * Construct with a given EbeanServer.
   */
  public QPayments(EbeanServer server) {
    super(Payments.class, server);
  }

  /**
   * Construct using the default EbeanServer.
   */
  public QPayments() {
    super(Payments.class);
  }

  /**
   * Construct for Alias.
   */
  private QPayments(boolean dummy) {
    super(dummy);
  }

  /**
   * Provides static properties to use in <em> select() and fetch() </em>
   * clauses of a query. Typically referenced via static imports. 
   */
  public static class Alias {
    public static PLong<QPayments> paymentId = _alias.paymentId;
    public static PDouble<QPayments> discount = _alias.discount;
    public static PDouble<QPayments> balance = _alias.balance;
    public static QAssocPatients<QPayments> patients = _alias.patients;
  }
}
