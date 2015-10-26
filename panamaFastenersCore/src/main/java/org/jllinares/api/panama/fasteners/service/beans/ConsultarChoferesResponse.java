package org.jllinares.api.panama.fasteners.service.beans;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jllinares.api.panama.fasteners.commons.beans.BaseBean;

// TODO: Auto-generated Javadoc
/**
 * The Class ConsultarChoferesResponse.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="CONSULTAR_CHOFERESResponse", namespace="FASTENERS_SERVICES_API", propOrder={"headerSalida", "bodySalida"})
public class ConsultarChoferesResponse extends BaseBean
  implements Serializable
{
  
  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 7575855090647760471L;

  /** The header salida. */
  @XmlElement(name="HEADER_SALIDA", required=true)
  private HeaderSalidaBean headerSalida;

  /** The body salida. */
  @XmlElement(name="BODY_SALIDA_CONSULTAR_CHOFERES", required=false)
  private BodySalidaConsultarChoferesBean bodySalida;

  /**
   * Gets the header salida.
   *
   * @return the header salida
   */
  public HeaderSalidaBean getHeaderSalida()
  {
    return this.headerSalida;
  }

  /**
   * Sets the header salida.
   *
   * @param headerSalida the new header salida
   */
  public void setHeaderSalida(HeaderSalidaBean headerSalida)
  {
    this.headerSalida = headerSalida;
  }

  /**
   * Gets the body salida.
   *
   * @return the body salida
   */
  public BodySalidaConsultarChoferesBean getBodySalida()
  {
    return this.bodySalida;
  }

  /**
   * Sets the body salida.
   *
   * @param bodySalida the new body salida
   */
  public void setBodySalida(BodySalidaConsultarChoferesBean bodySalida)
  {
    this.bodySalida = bodySalida;
  }
}