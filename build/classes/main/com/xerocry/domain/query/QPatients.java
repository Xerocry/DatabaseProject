package com.xerocry.domain.query;

import com.xerocry.domain.Patients;
import com.xerocry.domain.Patients.Gender;
import com.xerocry.domain.query.assoc.QAssocPayments;
import com.xerocry.domain.query.assoc.QAssocTreatment;
import io.ebean.EbeanServer;
import io.ebean.typequery.PEnum;
import io.ebean.typequery.PLocalDate;
import io.ebean.typequery.PLong;
import io.ebean.typequery.PString;
import io.ebean.typequery.TQRootBean;
import io.ebean.typequery.TypeQueryBean;

/**
 * Query bean for Patients.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@TypeQueryBean
public class QPatients extends TQRootBean<Patients,QPatients> {

  private static final QPatients _alias = new QPatients(true);

  /**
   * Return the shared 'Alias' instance used to provide properties to 
   * <code>select()</code> and <code>fetch()</code> 
   */
  public static QPatients alias() {
    return _alias;
  }

  public PLong<QPatients> patientId;
  public PLocalDate<QPatients> regDate;
  public PString<QPatients> city;
  public PString<QPatients> name;
  public PLocalDate<QPatients> birthDate;
  public PEnum<QPatients,Gender> gender;
  public QAssocTreatment<QPatients> treatments;
  public QAssocPayments<QPatients> payments;


  /**
   * Construct with a given EbeanServer.
   */
  public QPatients(EbeanServer server) {
    super(Patients.class, server);
  }

  /**
   * Construct using the default EbeanServer.
   */
  public QPatients() {
    super(Patients.class);
  }

  /**
   * Construct for Alias.
   */
  private QPatients(boolean dummy) {
    super(dummy);
  }

  /**
   * Provides static properties to use in <em> select() and fetch() </em>
   * clauses of a query. Typically referenced via static imports. 
   */
  public static class Alias {
    public static PLong<QPatients> patientId = _alias.patientId;
    public static PLocalDate<QPatients> regDate = _alias.regDate;
    public static PString<QPatients> city = _alias.city;
    public static PString<QPatients> name = _alias.name;
    public static PLocalDate<QPatients> birthDate = _alias.birthDate;
    public static PEnum<QPatients,Gender> gender = _alias.gender;
    public static QAssocTreatment<QPatients> treatments = _alias.treatments;
    public static QAssocPayments<QPatients> payments = _alias.payments;
  }
}
