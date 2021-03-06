package org.jllinares.api.panama.fasteners.service.beans;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jllinares.api.panama.fasteners.commons.beans.BaseBean;

// TODO: Auto-generated Javadoc
/**
 * The Class BodyEntradaConsultarLocalizacionDocumentoBean.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="BODY_ENTRADA_CONSULTAR_LOCALIZACION_DOCUMENTO", namespace="FASTENERS_SERVICES_API", propOrder={"numeroDocumento"})
public class BodyEntradaConsultarLocalizacionDocumentoBean extends BaseBean
  implements Serializable
{
  
  /** The Constant BODY_ENTRADA_NAME. */
  public static final String BODY_ENTRADA_NAME = "BODY_ENTRADA_CONSULTAR_LOCALIZACION_DOCUMENTO";
  
  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = -8966657112210039183L;

  /** The numero documento. */
  @XmlElement(name="NUMERO_DOCUMENTO", required=true)
  private int numeroDocumento;

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
}