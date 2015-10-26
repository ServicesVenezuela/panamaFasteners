package org.jllinares.api.panama.fasteners.service.beans;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jllinares.api.panama.fasteners.commons.beans.BaseBean;

// TODO: Auto-generated Javadoc
/**
 * The Class VendedorBean.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="VENDEDOR")
public class VendedorBean extends BaseBean
  implements Serializable
{
  
  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = -2517776886134254121L;
  
  /** The Constant NAME. */
  public static final String NAME = "VENDEDOR";

  /** The codigo. */
  @XmlElement(name="CODIGO", required=true)
  private String codigo;

  /** The tipo. */
  @XmlElement(name="TIPO", required=true)
  private String tipo;

  /** The nombre. */
  @XmlElement(name="NOMBRE", required=true)
  private String nombre;

  /** The cedula. */
  @XmlElement(name="CEDULA", required=true)
  private String cedula;

  /** The direccion1. */
  @XmlElement(name="DIRECCION_1", required=true)
  private String direccion1;

  /** The direccion2. */
  @XmlElement(name="DIRECCION_2", required=true)
  private String direccion2;

  /** The telefonos. */
  @XmlElement(name="TELEFONOS", required=true)
  private String telefonos;

  /** The fecha registro. */
  @XmlElement(name="FECHA_REGISTRO", required=true)
  private Date fechaRegistro;

  /**
   * Gets the codigo.
   *
   * @return the codigo
   */
  public String getCodigo()
  {
    return this.codigo;
  }

  /**
   * Sets the codigo.
   *
   * @param codigo the new codigo
   */
  public void setCodigo(String codigo)
  {
    this.codigo = codigo;
  }

  /**
   * Gets the tipo.
   *
   * @return the tipo
   */
  public String getTipo()
  {
    return this.tipo;
  }

  /**
   * Sets the tipo.
   *
   * @param tipo the new tipo
   */
  public void setTipo(String tipo)
  {
    this.tipo = tipo;
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

  /**
   * Gets the direccion1.
   *
   * @return the direccion1
   */
  public String getDireccion1()
  {
    return this.direccion1;
  }

  /**
   * Sets the direccion1.
   *
   * @param direccion1 the new direccion1
   */
  public void setDireccion1(String direccion1)
  {
    this.direccion1 = direccion1;
  }

  /**
   * Gets the direccion2.
   *
   * @return the direccion2
   */
  public String getDireccion2()
  {
    return this.direccion2;
  }

  /**
   * Sets the direccion2.
   *
   * @param direccion2 the new direccion2
   */
  public void setDireccion2(String direccion2)
  {
    this.direccion2 = direccion2;
  }

  /**
   * Gets the telefonos.
   *
   * @return the telefonos
   */
  public String getTelefonos()
  {
    return this.telefonos;
  }

  /**
   * Sets the telefonos.
   *
   * @param telefonos the new telefonos
   */
  public void setTelefonos(String telefonos)
  {
    this.telefonos = telefonos;
  }

  /**
   * Gets the fecha registro.
   *
   * @return the fecha registro
   */
  public Date getFechaRegistro()
  {
    return this.fechaRegistro;
  }

  /**
   * Sets the fecha registro.
   *
   * @param fechaRegistro the new fecha registro
   */
  public void setFechaRegistro(Date fechaRegistro)
  {
    this.fechaRegistro = fechaRegistro;
  }
}