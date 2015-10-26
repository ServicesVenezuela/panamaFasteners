package org.jllinares.api.panama.fasteners.service.beans;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jllinares.api.panama.fasteners.commons.beans.BaseBean;

// TODO: Auto-generated Javadoc
/**
 * The Class ConsultarChoferResponse.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="CONSULTAR_DETALLE_CHOFERResponse", namespace="FASTENERS_SERVICES_API", propOrder={"headerSalida", "bodySalida"})
public class ConsultarChoferResponse extends BaseBean
  implements Serializable
{
  
  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 2712837239431217220L;

  /** The header salida. */
  @XmlElement(name="HEADER_SALIDA", required=true)
  private HeaderSalidaBean headerSalida;

  /** The body salida. */
  @XmlElement(name="BODY_SALIDA_CONSULTAR_DETALLE_CHOFER", required=false)
  private BodySalidaConsultarChoferBean bodySalida;

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
  public BodySalidaConsultarChoferBean getBodySalida()
  {
    return this.bodySalida;
  }

  /**
   * Sets the body salida.
   *
   * @param bodySalida the new body salida
   */
  public void setBodySalida(BodySalidaConsultarChoferBean bodySalida)
  {
    this.bodySalida = bodySalida;
  }
}