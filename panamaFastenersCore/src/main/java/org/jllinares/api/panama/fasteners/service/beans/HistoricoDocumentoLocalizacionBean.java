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
 * The Class HistoricoDocumentoLocalizacionBean.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="HISTORICO_LOCALIZACION", propOrder={"identificacionTrack", "codigoLocalizacion", "localizacion", "fechaRegistro", "codigoCliente"})
public class HistoricoDocumentoLocalizacionBean extends BaseBean
  implements Serializable
{
  
  /** The Constant NAME. */
  public static final String NAME = "HISTORICO_LOCALIZACION";
  
  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = -4936105007210544858L;

  /** The identificacion track. */
  @XmlElement(name="IDENTIFICACION_HISTORICO", required=true)
  private int identificacionTrack;

  /** The codigo localizacion. */
  @XmlElement(name="CODIGO_LOCALIZACION", required=true)
  private int codigoLocalizacion;

  /** The localizacion. */
  @XmlElement(name="DESCRIPCION_LOCALIZACION", required=true)
  private String localizacion;

  /** The fecha registro. */
  @XmlElement(name="FECHA_REGISTRO", required=true)
  private Date fechaRegistro;

  /** The codigo cliente. */
  @XmlElement(name="CODIGO_CLIENTE", required=true)
  private String codigoCliente;

  /**
   * Gets the identificacion track.
   *
   * @return the identificacion track
   */
  public int getIdentificacionTrack()
  {
    return this.identificacionTrack;
  }

  /**
   * Sets the identificacion track.
   *
   * @param identificacionTrack the new identificacion track
   */
  public void setIdentificacionTrack(int identificacionTrack)
  {
    this.identificacionTrack = identificacionTrack;
  }

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
   * Gets the localizacion.
   *
   * @return the localizacion
   */
  public String getLocalizacion()
  {
    return this.localizacion;
  }

  /**
   * Sets the localizacion.
   *
   * @param localizacion the new localizacion
   */
  public void setLocalizacion(String localizacion)
  {
    this.localizacion = localizacion;
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
}