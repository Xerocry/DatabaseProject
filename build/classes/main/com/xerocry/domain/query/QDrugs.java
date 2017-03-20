package com.xerocry.domain.query;

import com.xerocry.domain.Drugs;
import com.xerocry.domain.query.assoc.QAssocDiseasesTypes;
import com.xerocry.domain.query.assoc.QAssocTreatment;
import io.ebean.EbeanServer;
import io.ebean.typequery.PInteger;
import io.ebean.typequery.PLong;
import io.ebean.typequery.PString;
import io.ebean.typequery.TQRootBean;
import io.ebean.typequery.TypeQueryBean;

/**
 * Query bean for Drugs.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@TypeQueryBean
public class QDrugs extends TQRootBean<Drugs,QDrugs> {

  private static final QDrugs _alias = new QDrugs(true);

  /**
   * Return the shared 'Alias' instance used to provide properties to 
   * <code>select()</code> and <code>fetch()</code> 
   */
  public static QDrugs alias() {
    return _alias;
  }

  public PLong<QDrugs> drugId;
  public QAssocDiseasesTypes<QDrugs> typeId;
  public PString<QDrugs> drugName;
  public PInteger<QDrugs> bff;
  public QAssocTreatment<QDrugs> treatments;


  /**
   * Construct with a given EbeanServer.
   */
  public QDrugs(EbeanServer server) {
    super(Drugs.class, server);
  }

  /**
   * Construct using the default EbeanServer.
   */
  public QDrugs() {
    super(Drugs.class);
  }

  /**
   * Construct for Alias.
   */
  private QDrugs(boolean dummy) {
    super(dummy);
  }

  /**
   * Provides static properties to use in <em> select() and fetch() </em>
   * clauses of a query. Typically referenced via static imports. 
   */
  public static class Alias {
    public static PLong<QDrugs> drugId = _alias.drugId;
    public static QAssocDiseasesTypes<QDrugs> typeId = _alias.typeId;
    public static PString<QDrugs> drugName = _alias.drugName;
    public static PInteger<QDrugs> bff = _alias.bff;
    public static QAssocTreatment<QDrugs> treatments = _alias.treatments;
  }
}
