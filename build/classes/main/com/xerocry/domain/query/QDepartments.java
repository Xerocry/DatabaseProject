package com.xerocry.domain.query;

import com.xerocry.domain.Departments;
import io.ebean.EbeanServer;
import io.ebean.typequery.PLong;
import io.ebean.typequery.PString;
import io.ebean.typequery.TQRootBean;
import io.ebean.typequery.TypeQueryBean;

/**
 * Query bean for Departments.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@TypeQueryBean
public class QDepartments extends TQRootBean<Departments,QDepartments> {

  private static final QDepartments _alias = new QDepartments(true);

  /**
   * Return the shared 'Alias' instance used to provide properties to 
   * <code>select()</code> and <code>fetch()</code> 
   */
  public static QDepartments alias() {
    return _alias;
  }

  public PLong<QDepartments> depart_id;
  public PString<QDepartments> depart_name;


  /**
   * Construct with a given EbeanServer.
   */
  public QDepartments(EbeanServer server) {
    super(Departments.class, server);
  }

  /**
   * Construct using the default EbeanServer.
   */
  public QDepartments() {
    super(Departments.class);
  }

  /**
   * Construct for Alias.
   */
  private QDepartments(boolean dummy) {
    super(dummy);
  }

  /**
   * Provides static properties to use in <em> select() and fetch() </em>
   * clauses of a query. Typically referenced via static imports. 
   */
  public static class Alias {
    public static PLong<QDepartments> depart_id = _alias.depart_id;
    public static PString<QDepartments> depart_name = _alias.depart_name;
  }
}
