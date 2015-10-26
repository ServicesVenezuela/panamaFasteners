package org.jllinares.api.panama.fasteners.service.beans;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.jllinares.api.panama.fasteners.commons.PropertiesApp;
import org.jllinares.api.panama.fasteners.commons.ServiceConstans;
import org.jllinares.api.panama.fasteners.commons.beans.BaseBean;

// TODO: Auto-generated Javadoc
/**
 * The Class HeaderSalidaBean.
 */
@XmlRootElement(name="HEADER_SALIDA", namespace="FASTENERS_SERVICES_API")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="HEADER_SALIDA", namespace="FASTENERS_SERVICES_API", propOrder={"tipoMensaje", "mensajeProgramadorSistema", "codigoMensajeProgramador", "mensajeUsuario", "codigoMensajeUsuario", "fechaSalidaMensaje", "horaSalidaMensaje"})
public class HeaderSalidaBean extends BaseBean
  implements Serializable
{
  
  /** The Constant HEADER_SALIDA. */
  public static final String HEADER_SALIDA = "HEADER_SALIDA";
  
  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = -3362470533385556400L;

  /** The tipo mensaje. */
  @XmlElement(name="TIPO_MENSAJE", required=true)
  private String tipoMensaje;

  /** The mensaje programador sistema. */
  @XmlElement(name="MENSAJE_PROGRAMADOR_SISTEMA", required=true)
  private String mensajeProgramadorSistema;

  /** The codigo mensaje programador. */
  @XmlElement(name="CODIGO_MENSAJE_PROGRAMADOR", required=true)
  private String codigoMensajeProgramador;

  /** The mensaje usuario. */
  @XmlElement(name="MENSAJE_USUARIO", required=true)
  private String mensajeUsuario;

  /** The codigo mensaje usuario. */
  @XmlElement(name="CODIGO_MENSAJE_USUARIO", required=true)
  private String codigoMensajeUsuario;

  /** The fecha salida mensaje. */
  @XmlElement(name="FECHA_SALIDA_MENSAJE", required=true)
  private String fechaSalidaMensaje;

  /** The hora salida mensaje. */
  @XmlElement(name="HORA_SALIDA_MENSAJE", required=true)
  private String horaSalidaMensaje;

  /**
   * Instantiates a new header salida bean.
   */
  public HeaderSalidaBean()
  {
    Date today = new Date();
    this.tipoMensaje = ServiceConstans.TYPE_MSJ_INFO.getValue();
    this.mensajeProgramadorSistema = ServiceConstans.MSJ_OK.getValue();
    this.codigoMensajeProgramador = ServiceConstans.CODE_OK.getValue();
    this.mensajeUsuario = ServiceConstans.MSJ_OK.getValue();
    this.codigoMensajeUsuario = ServiceConstans.CODE_OK.getValue();
    this.fechaSalidaMensaje = new SimpleDateFormat(PropertiesApp.getGenericProp().getProperty("FORMAT_DATE_RESPONSE_SERVICE")).format(today);
    this.horaSalidaMensaje = new SimpleDateFormat(PropertiesApp.getGenericProp().getProperty("FORMAT_TIME_RESPONSE_SERVICE")).format(today);
  }

  /**
   * Gets the tipo mensaje.
   *
   * @return the tipo mensaje
   */
  public String getTipoMensaje()
  {
    return this.tipoMensaje;
  }

  /**
   * Sets the tipo mensaje.
   *
   * @param tipoMensaje the new tipo mensaje
   */
  public void setTipoMensaje(String tipoMensaje)
  {
    this.tipoMensaje = tipoMensaje;
  }

  /**
   * Gets the mensaje programador sistema.
   *
   * @return the mensaje programador sistema
   */
  public String getMensajeProgramadorSistema()
  {
    return this.mensajeProgramadorSistema;
  }

  /**
   * Sets the mensaje programador sistema.
   *
   * @param mensajeProgramadorSistema the new mensaje programador sistema
   */
  public void setMensajeProgramadorSistema(String mensajeProgramadorSistema)
  {
    this.mensajeProgramadorSistema = mensajeProgramadorSistema;
  }

  /**
   * Gets the codigo mensaje programador.
   *
   * @return the codigo mensaje programador
   */
  public String getCodigoMensajeProgramador()
  {
    return this.codigoMensajeProgramador;
  }

  /**
   * Sets the codigo mensaje programador.
   *
   * @param codigoMensajeProgramador the new codigo mensaje programador
   */
  public void setCodigoMensajeProgramador(String codigoMensajeProgramador)
  {
    this.codigoMensajeProgramador = codigoMensajeProgramador;
  }

  /**
   * Gets the mensaje usuario.
   *
   * @return the mensaje usuario
   */
  public String getMensajeUsuario()
  {
    return this.mensajeUsuario;
  }

  /**
   * Sets the mensaje usuario.
   *
   * @param mensajeUsuario the new mensaje usuario
   */
  public void setMensajeUsuario(String mensajeUsuario)
  {
    this.mensajeUsuario = mensajeUsuario;
  }

  /**
   * Gets the codigo mensaje usuario.
   *
   * @return the codigo mensaje usuario
   */
  public String getCodigoMensajeUsuario()
  {
    return this.codigoMensajeUsuario;
  }

  /**
   * Sets the codigo mensaje usuario.
   *
   * @param codigoMensajeUsuario the new codigo mensaje usuario
   */
  public void setCodigoMensajeUsuario(String codigoMensajeUsuario)
  {
    this.codigoMensajeUsuario = codigoMensajeUsuario;
  }

  /**
   * Gets the fecha salida mensaje.
   *
   * @return the fecha salida mensaje
   */
  public String getFechaSalidaMensaje()
  {
    return this.fechaSalidaMensaje;
  }

  /**
   * Sets the fecha salida mensaje.
   *
   * @param fechaSalidaMensaje the new fecha salida mensaje
   */
  public void setFechaSalidaMensaje(String fechaSalidaMensaje)
  {
    this.fechaSalidaMensaje = fechaSalidaMensaje;
  }

  /**
   * Gets the hora salida mensaje.
   *
   * @return the hora salida mensaje
   */
  public String getHoraSalidaMensaje()
  {
    return this.horaSalidaMensaje;
  }

  /**
   * Sets the hora salida mensaje.
   *
   * @param horaSalidaMensaje the new hora salida mensaje
   */
  public void setHoraSalidaMensaje(String horaSalidaMensaje)
  {
    this.horaSalidaMensaje = horaSalidaMensaje;
  }
}