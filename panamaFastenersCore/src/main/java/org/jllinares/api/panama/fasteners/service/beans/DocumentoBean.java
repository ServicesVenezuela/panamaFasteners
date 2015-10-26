package org.jllinares.api.panama.fasteners.service.beans;

import java.io.Serializable;
import org.jllinares.api.panama.fasteners.commons.beans.BaseBean;

// TODO: Auto-generated Javadoc
/**
 * The Class DocumentoBean.
 */
public class DocumentoBean extends BaseBean
  implements Serializable
{
  
  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = -1386685242573197988L;
  
  /** The numero documento. */
  private int numeroDocumento;
  
  /** The tipo documento. */
  private String tipoDocumento;

  /**
   * Gets the numero documento.
   *
   * @return the numero documento
   */
  public int getNumeroDocumento()
  {
    return this.numeroDocumento;
  }

  /**
   * Sets the numero documento.
   *
   * @param numeroDocumento the new numero documento
   */
  public void setNumeroDocumento(int numeroDocumento)
  {
    this.numeroDocumento = numeroDocumento;
  }

  /**
   * Gets the tipo documento.
   *
   * @return the tipo documento
   */
  public String getTipoDocumento()
  {
    return this.tipoDocumento;
  }

  /**
   * Sets the tipo documento.
   *
   * @param tipoDocumento the new tipo documento
   */
  public void setTipoDocumento(String tipoDocumento)
  {
    this.tipoDocumento = tipoDocumento;
  }
}