package com.xerocry.domain.query;

import com.xerocry.domain.Diseases;
import com.xerocry.domain.query.assoc.QAssocDiseasesTypes;
import io.ebean.EbeanServer;
import io.ebean.typequery.PLong;
import io.ebean.typequery.PString;
import io.ebean.typequery.TQRootBean;
import io.ebean.typequery.TypeQueryBean;

/**
 * Query bean for Diseases.
 * 
 * THIS IS A GENERATED OBJECT, DO NOT MODIFY THIS CLASS.
 */
@TypeQueryBean
public class QDiseases extends TQRootBean<Diseases,QDiseases> {

  private static final QDiseases _alias = new QDiseases(true);

  /**
   * Return the shared 'Alias' instance used to provide properties to 
   * <code>select()</code> and <code>fetch()</code> 
   */
  public static QDiseases alias() {
    return _alias;
  }

  public PLong<QDiseases> diseaseId;
  public PString<QDiseases> symptoms;
  public QAssocDiseasesTypes<QDiseases> disType;
  public PString<QDiseases> disName;


  /**
   * Construct with a given EbeanServer.
   */
  public QDiseases(EbeanServer server) {
    super(Diseases.class, server);
  }

  /**
   * Construct using the default EbeanServer.
   */
  public QDiseases() {
    super(Diseases.class);
  }

  /**
   * Construct for Alias.
   */
  private QDiseases(boolean dummy) {
    super(dummy);
  }

  /**
   * Provides static properties to use in <em> select() and fetch() </em>
   * clauses of a query. Typically referenced via static imports. 
   */
  public static class Alias {
    public static PLong<QDiseases> diseaseId = _alias.diseaseId;
    public static PString<QDiseases> symptoms = _alias.symptoms;
    public static QAssocDiseasesTypes<QDiseases> disType = _alias.disType;
    public static PString<QDiseases> disName = _alias.disName;
  }
}
