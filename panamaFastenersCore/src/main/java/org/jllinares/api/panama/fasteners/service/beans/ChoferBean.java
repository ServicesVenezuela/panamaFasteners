package org.jllinares.api.panama.fasteners.service.beans;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jllinares.api.panama.fasteners.commons.beans.BaseBean;

// TODO: Auto-generated Javadoc
/**
 * The Class ChoferBean.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="CHOFER")
public class ChoferBean extends BaseBean
  implements Serializable
{
  
  /** The Constant NAME. */
  public static final String NAME = "CHOFER";
  
  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = -1523073246017044914L;

  /** The id. */
  @XmlElement(name="IDENTIFICADOR_CHOFER", required=false)
  private int id;

  /** The name. */
  @XmlElement(name="NOMBRE", required=true)
  private String name;

  /** The apellido. */
  @XmlElement(name="APELLIDO", required=true)
  private String apellido;

  /** The cedula. */
  @XmlElement(name="CEDULA", required=true)
  private String cedula;

  
  /**
   * Gets the id.
   *
   * @return the id
   */
  public int getId()
  {
    return this.id;
  }

  /**
   * Sets the id.
   *
   * @param id the new id
   */
  public void setId(int id)
  {
    this.id = id;
  }

  /**
   * Gets the name.
   *
   * @return the name
   */
  public String getName()
  {
    return this.name;
  }

  /**
   * Sets the name.
   *
   * @param name the new name
   */
  public void setName(String name)
  {
    this.name = name;
  }

  /**
   * Gets the apellido.
   *
   * @return the apellido
   */
  public String getApellido()
  {
    return this.apellido;
  }

  /**
   * Sets the apellido.
   *
   * @param apellido the new apellido
   */
  public void setApellido(String apellido)
  {
    this.apellido = apellido;
  }

  /**
   * Gets the cedula.
   *
   * @return the cedula
   */
  public String getCedula()
  {
    return this.cedula;
  }

  /**
   * Sets the cedula.
   *
   * @param cedula the new cedula
   */
  public void setCedula(String cedula)
  {
    this.cedula = cedula;
  }

}