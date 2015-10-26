package org.jllinares.api.panama.fasteners.service.beans;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jllinares.api.panama.fasteners.commons.beans.BaseBean;

// TODO: Auto-generated Javadoc
/**
 * The Class BodyEntradaRegistrarResponsableBean.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="BODY_ENTRADA_REGISTRAR_RESPONSABLE", namespace="FASTENERS_SERVICES_API", propOrder={"nombre"})
public class BodyEntradaRegistrarResponsableBean extends BaseBean
  implements Serializable
{
  
  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = -1583828985297923356L;
  
  /** The Constant BODY_ENTRADA_NAME. */
  public static final String BODY_ENTRADA_NAME = "BODY_ENTRADA_REGISTRAR_RESPONSABLE";

  /** The nombre. */
  @XmlElement(name="NOMBRE_RESPONSABLE", required=true)
  private String nombre;

  /**
   * Gets the nombre.
   *
   * @return the nombre
   */
  public String getNombre()
  {
    return this.nombre;
  }

  /**
   * Sets the nombre.
   *
   * @param nombre the new nombre
   */
  public void setNombre(String nombre)
  {
    this.nombre = nombre;
  }
}