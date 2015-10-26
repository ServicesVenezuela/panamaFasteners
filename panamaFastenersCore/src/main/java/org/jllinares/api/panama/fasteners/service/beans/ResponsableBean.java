package org.jllinares.api.panama.fasteners.service.beans;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jllinares.api.panama.fasteners.commons.beans.BaseBean;

// TODO: Auto-generated Javadoc
/**
 * The Class ResponsableBean.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="RESPONSABLE", propOrder={"codigo", "nombre"})
public class ResponsableBean extends BaseBean
  implements Serializable
{
  
  /** The Constant NAME. */
  public static final String NAME = "RESPONSABLE";
  
  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 9172251827728313273L;

  /** The codigo. */
  @XmlElement(name="CODIGO", required=true)
  private int codigo;

  /** The nombre. */
  @XmlElement(name="NOMBRE", required=true)
  private String nombre;

  /**
   * Gets the codigo.
   *
   * @return the codigo
   */
  public int getCodigo()
  {
    return this.codigo;
  }

  /**
   * Sets the codigo.
   *
   * @param codigo the new codigo
   */
  public void setCodigo(int codigo)
  {
    this.codigo = codigo;
  }

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