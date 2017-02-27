package com.xerocry.domain.query;

import com.xerocry.domain.Treatment;
import com.xerocry.domain.query.assoc.QAssocDiseases;
import com.xerocry.domain.query.assoc.QAssocDoctors;
import com.xerocry.domain.query.assoc.QAssocDrugs;
import com.xerocry.domain.query.assoc.QAssocPatients;
import com.xerocry.domain.query.assoc.QAssocServices;
import io.ebean.EbeanServer;
import io.ebean.typequery.PLocalDate;
import io.ebean.typequery.PLong;
import io.ebean.typequery.PString;
import io.ebean.typequery.TQRootBean;
import io.ebean.typequery.TypeQueryBean;

/**
 * Query bean for Treatment.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@TypeQueryBean
public class QTreatment extends TQRootBean<Treatment,QTreatment> {

  private static final QTreatment _alias = new QTreatment(true);

  /**
   * Return the shared 'Alias' instance used to provide properties to 
   * <code>select()</code> and <code>fetch()</code> 
   */
  public static QTreatment alias() {
    return _alias;
  }

  public PLong<QTreatment> id;
  public QAssocPatients<QTreatment> patientId;
  public QAssocDoctors<QTreatment> doctorId;
  public QAssocDiseases<QTreatment> diseaseId;
  public PLocalDate<QTreatment> startDate;
  public PLocalDate<QTreatment> endDate;
  public PString<QTreatment> treatment;
  public QAssocDrugs<QTreatment> drugs;
  public QAssocServices<QTreatment> services;


  /**
   * Construct with a given EbeanServer.
   */
  public QTreatment(EbeanServer server) {
    super(Treatment.class, server);
  }

  /**
   * Construct using the default EbeanServer.
   */
  public QTreatment() {
    super(Treatment.class);
  }

  /**
   * Construct for Alias.
   */
  private QTreatment(boolean dummy) {
    super(dummy);
  }

  /**
   * Provides static properties to use in <em> select() and fetch() </em>
   * clauses of a query. Typically referenced via static imports. 
   */
  public static class Alias {
    public static PLong<QTreatment> id = _alias.id;
    public static QAssocPatients<QTreatment> patientId = _alias.patientId;
    public static QAssocDoctors<QTreatment> doctorId = _alias.doctorId;
    public static QAssocDiseases<QTreatment> diseaseId = _alias.diseaseId;
    public static PLocalDate<QTreatment> startDate = _alias.startDate;
    public static PLocalDate<QTreatment> endDate = _alias.endDate;
    public static PString<QTreatment> treatment = _alias.treatment;
    public static QAssocDrugs<QTreatment> drugs = _alias.drugs;
    public static QAssocServices<QTreatment> services = _alias.services;
  }
}
