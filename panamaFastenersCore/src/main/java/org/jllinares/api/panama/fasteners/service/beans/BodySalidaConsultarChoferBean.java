package org.jllinares.api.panama.fasteners.service.beans;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jllinares.api.panama.fasteners.commons.beans.BaseBean;

// TODO: Auto-generated Javadoc
/**
 * The Class BodySalidaConsultarChoferBean.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="BODY_SALIDA_CONSULTAR_DETALLE_CHOFER", namespace="FASTENERS_SERVICES_API", propOrder={"chofer"})
public class BodySalidaConsultarChoferBean extends BaseBean
  implements Serializable
{
  
  /** The Constant BODY_SALIDA_NAME. */
  public static final String BODY_SALIDA_NAME = "BODY_SALIDA_CONSULTAR_DETALLE_CHOFER";
  
  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1627986892821659722L;

  /** The chofer. */
  @XmlElement(name="CHOFER", required=true)
  private ChoferBean chofer;

  /**
   * Gets the chofer.
   *
   * @return the chofer
   */
  public ChoferBean getChofer()
  {
    return this.chofer;
  }

  /**
   * Sets the chofer.
   *
   * @param chofer the new chofer
   */
  public void setChofer(ChoferBean chofer)
  {
    this.chofer = chofer;
  }
}