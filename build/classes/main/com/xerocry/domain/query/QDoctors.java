package com.xerocry.domain.query;

import com.xerocry.domain.Doctors;
import com.xerocry.domain.query.assoc.QAssocDepartments;
import io.ebean.EbeanServer;
import io.ebean.typequery.PInteger;
import io.ebean.typequery.PLocalDate;
import io.ebean.typequery.PLong;
import io.ebean.typequery.PString;
import io.ebean.typequery.TQRootBean;
import io.ebean.typequery.TypeQueryBean;

/**
 * Query bean for Doctors.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@TypeQueryBean
public class QDoctors extends TQRootBean<Doctors,QDoctors> {

  private static final QDoctors _alias = new QDoctors(true);

  /**
   * Return the shared 'Alias' instance used to provide properties to 
   * <code>select()</code> and <code>fetch()</code> 
   */
  public static QDoctors alias() {
    return _alias;
  }

  public PLong<QDoctors> id;
  public PInteger<QDoctors> experience;
  public PString<QDoctors> skills;
  public PLocalDate<QDoctors> hireDate;
  public QAssocDepartments<QDoctors> departId;


  /**
   * Construct with a given EbeanServer.
   */
  public QDoctors(EbeanServer server) {
    super(Doctors.class, server);
  }

  /**
   * Construct using the default EbeanServer.
   */
  public QDoctors() {
    super(Doctors.class);
  }

  /**
   * Construct for Alias.
   */
  private QDoctors(boolean dummy) {
    super(dummy);
  }

  /**
   * Provides static properties to use in <em> select() and fetch() </em>
   * clauses of a query. Typically referenced via static imports. 
   */
  public static class Alias {
    public static PLong<QDoctors> id = _alias.id;
    public static PInteger<QDoctors> experience = _alias.experience;
    public static PString<QDoctors> skills = _alias.skills;
    public static PLocalDate<QDoctors> hireDate = _alias.hireDate;
    public static QAssocDepartments<QDoctors> departId = _alias.departId;
  }
}
