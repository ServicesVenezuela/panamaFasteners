package org.jllinares.api.panama.fasteners.service.beans;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jllinares.api.panama.fasteners.commons.beans.BaseBean;

// TODO: Auto-generated Javadoc
/**
 * The Class LocalizacionBean.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="LOCALIZACION", propOrder={"codigo", "descripcion"})
public class LocalizacionBean extends BaseBean
  implements Serializable
{
  
  /** The Constant NAME. */
  public static final String NAME = "LOCALIZACION";
  
  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = -4163542896984756922L;

  /** The codigo. */
  @XmlElement(name="CODIGO", required=true)
  private int codigo;

  /** The descripcion. */
  @XmlElement(name="DESCRIPCION", required=true)
  private String descripcion;

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
   * Gets the descripcion.
   *
   * @return the descripcion
   */
  public String getDescripcion()
  {
    return this.descripcion;
  }

  /**
   * Sets the descripcion.
   *
   * @param descripcion the new descripcion
   */
  public void setDescripcion(String descripcion)
  {
    this.descripcion = descripcion;
  }
}