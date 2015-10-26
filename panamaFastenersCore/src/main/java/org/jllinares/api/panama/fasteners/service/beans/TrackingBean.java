package org.jllinares.api.panama.fasteners.service.beans;

import java.io.Serializable;
import java.util.Date;
import org.jllinares.api.panama.fasteners.commons.beans.BaseBean;

// TODO: Auto-generated Javadoc
/**
 * The Class TrackingBean.
 */
public class TrackingBean extends BaseBean
  implements Serializable
{
  
  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 4520789442297055027L;
  
  /** The codigo localizacion. */
  private int codigoLocalizacion;
  
  /** The fecha registro. */
  private Date fechaRegistro;
  
  /** The numero documento. */
  private int numeroDocumento;
  
  /** The codigo cliente. */
  private String codigoCliente;
  
  /** The tipo documento. */
  private String tipoDocumento;

  /**
   * Gets the codigo localizacion.
   *
   * @return the codigo localizacion
   */
  public int getCodigoLocalizacion()
  {
    return this.codigoLocalizacion;
  }

  /**
   * Sets the codigo localizacion.
   *
   * @param codigoLocalizacion the new codigo localizacion
   */
  public void setCodigoLocalizacion(int codigoLocalizacion)
  {
    this.codigoLocalizacion = codigoLocalizacion;
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

  /**
   * Gets the codigo cliente.
   *
   * @return the codigo cliente
   */
  public String getCodigoCliente()
  {
    return this.codigoCliente;
  }

  /**
   * Sets the codigo cliente.
   *
   * @param codigoCliente the new codigo cliente
   */
  public void setCodigoCliente(String codigoCliente)
  {
    this.codigoCliente = codigoCliente;
  }

  /**
   * Gets the tipo documento.
   *
   * @return the tipo documento
   */
  public String getTipoDocumento()
  {
    return this.tipoDocumento;
  }

  /**
   * Sets the tipo documento.
   *
   * @param tipoDocumento the new tipo documento
   */
  public void setTipoDocumento(String tipoDocumento)
  {
    this.tipoDocumento = tipoDocumento;
  }
}