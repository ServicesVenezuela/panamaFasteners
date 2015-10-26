package org.jllinares.api.panama.fasteners.service.beans;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jllinares.api.panama.fasteners.commons.beans.BaseBean;

// TODO: Auto-generated Javadoc
/**
 * The Class BodySalidaConsultarDetalleDocumentoBean.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="BODY_SALIDA_CONSULTAR_DETALLE_DOCUMENTO", namespace="FASTENERS_SERVICES_API", propOrder={"detalleDocumento"})
public class BodySalidaConsultarDetalleDocumentoBean extends BaseBean
  implements Serializable
{
  
  /** The Constant BODY_SALIDA_NAME. */
  public static final String BODY_SALIDA_NAME = "BODY_SALIDA_CONSULTAR_DETALLE_DOCUMENTO";
  
  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1863673400659680874L;

  /** The detalle documento. */
  @XmlElement(name="DETALLE_DOCUMENTO", required=true)
  private DetalleDocumentoBean detalleDocumento;

  /**
   * Gets the detalle documento.
   *
   * @return the detalle documento
   */
  public DetalleDocumentoBean getDetalleDocumento()
  {
    return this.detalleDocumento;
  }

  /**
   * Sets the detalle documento.
   *
   * @param detalleDocumento the new detalle documento
   */
  public void setDetalleDocumento(DetalleDocumentoBean detalleDocumento)
  {
    this.detalleDocumento = detalleDocumento;
  }
}