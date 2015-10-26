package org.jllinares.api.panama.fasteners.service.beans;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import org.jllinares.api.panama.fasteners.commons.beans.BaseBean;

// TODO: Auto-generated Javadoc
/**
 * The Class HeaderEntradaBean.
 */
@XmlRootElement(name="HEADER_ENTRADA", namespace="FASTENERS_SERVICES_API")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="HEADER_ENTRADA", namespace="FASTENERS_SERVICES_API", propOrder={"identificadorUnicoGlobal", "identificacionCanal", "siglaAplicacion", "identificacionUsuario", "direccionIpConsumidor", "direccionIpCliente", "fechaEnvioMensaje", "horaEnvioMensaje", "atributoPagineo", "claveBusqueda", "cantidadRegistros"})
public class HeaderEntradaBean extends BaseBean
  implements Serializable
{
  
  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = -597445736520233286L;
  
  /** The Constant HEADER_ENTRADA. */
  public static final String HEADER_ENTRADA = "HEADER_ENTRADA";

  /** The identificador unico global. */
  @XmlElement(name="IDENTIFICADOR_UNICO_GLOBAL", required=true)
  private String identificadorUnicoGlobal;

  /** The identificacion canal. */
  @XmlElement(name="IDENTIFICACION_CANAL", required=true)
  private String identificacionCanal;

  /** The sigla aplicacion. */
  @XmlElement(name="SIGLA_APLICACION", required=true)
  private String siglaAplicacion;

  /** The identificacion usuario. */
  @XmlElement(name="IDENTIFICACION_USUARIO", required=true)
  private String identificacionUsuario;

  /** The direccion ip consumidor. */
  @XmlElement(name="DIRECCION_IP_CONSUMIDOR", required=true)
  private String direccionIpConsumidor;

  /** The direccion ip cliente. */
  @XmlElement(name="DIRECCION_IP_CLIENTE", required=true)
  private String direccionIpCliente;

  /** The fecha envio mensaje. */
  @XmlElement(name="FECHA_ENVIO_MENSAJE", required=true)
  private String fechaEnvioMensaje;

  /** The hora envio mensaje. */
  @XmlElement(name="HORA_ENVIO_MENSAJE", required=true)
  private String horaEnvioMensaje;

  /** The atributo pagineo. */
  @XmlElement(name="ATRIBUTO_PAGINEO", required=true)
  private String atributoPagineo;

  /** The clave busqueda. */
  @XmlElement(name="CLAVE_BUSQUEDA", required=true)
  private String claveBusqueda;

  /** The cantidad registros. */
  @XmlElement(name="CANTIDAD_REGISTROS", required=true)
  private int cantidadRegistros;

  /**
   * Gets the identificador unico global.
   *
   * @return the identificador unico global
   */
  public String getIdentificadorUnicoGlobal()
  {
    return this.identificadorUnicoGlobal;
  }

  /**
   * Sets the identificador unico global.
   *
   * @param identificadorUnicoGlobal the new identificador unico global
   */
  public void setIdentificadorUnicoGlobal(String identificadorUnicoGlobal)
  {
    this.identificadorUnicoGlobal = identificadorUnicoGlobal;
  }

  /**
   * Gets the identificacion canal.
   *
   * @return the identificacion canal
   */
  public String getIdentificacionCanal()
  {
    return this.identificacionCanal;
  }

  /**
   * Sets the identificacion canal.
   *
   * @param identificacionCanal the new identificacion canal
   */
  public void setIdentificacionCanal(String identificacionCanal)
  {
    this.identificacionCanal = identificacionCanal;
  }

  /**
   * Gets the sigla aplicacion.
   *
   * @return the sigla aplicacion
   */
  public String getSiglaAplicacion()
  {
    return this.siglaAplicacion;
  }

  /**
   * Sets the sigla aplicacion.
   *
   * @param siglaAplicacion the new sigla aplicacion
   */
  public void setSiglaAplicacion(String siglaAplicacion)
  {
    this.siglaAplicacion = siglaAplicacion;
  }

  /**
   * Gets the identificacion usuario.
   *
   * @return the identificacion usuario
   */
  public String getIdentificacionUsuario()
  {
    return this.identificacionUsuario;
  }

  /**
   * Sets the identificacion usuario.
   *
   * @param identificacionUsuario the new identificacion usuario
   */
  public void setIdentificacionUsuario(String identificacionUsuario)
  {
    this.identificacionUsuario = identificacionUsuario;
  }

  /**
   * Gets the direccion ip consumidor.
   *
   * @return the direccion ip consumidor
   */
  public String getDireccionIpConsumidor()
  {
    return this.direccionIpConsumidor;
  }

  /**
   * Sets the direccion ip consumidor.
   *
   * @param direccionIpConsumidor the new direccion ip consumidor
   */
  public void setDireccionIpConsumidor(String direccionIpConsumidor)
  {
    this.direccionIpConsumidor = direccionIpConsumidor;
  }

  /**
   * Gets the direccion ip cliente.
   *
   * @return the direccion ip cliente
   */
  public String getDireccionIpCliente()
  {
    return this.direccionIpCliente;
  }

  /**
   * Sets the direccion ip cliente.
   *
   * @param direccionIpCliente the new direccion ip cliente
   */
  public void setDireccionIpCliente(String direccionIpCliente)
  {
    this.direccionIpCliente = direccionIpCliente;
  }

  /**
   * Gets the fecha envio mensaje.
   *
   * @return the fecha envio mensaje
   */
  public String getFechaEnvioMensaje()
  {
    return this.fechaEnvioMensaje;
  }

  /**
   * Sets the fecha envio mensaje.
   *
   * @param fechaEnvioMensaje the new fecha envio mensaje
   */
  public void setFechaEnvioMensaje(String fechaEnvioMensaje)
  {
    this.fechaEnvioMensaje = fechaEnvioMensaje;
  }

  /**
   * Gets the hora envio mensaje.
   *
   * @return the hora envio mensaje
   */
  public String getHoraEnvioMensaje()
  {
    return this.horaEnvioMensaje;
  }

  /**
   * Sets the hora envio mensaje.
   *
   * @param horaEnvioMensaje the new hora envio mensaje
   */
  public void setHoraEnvioMensaje(String horaEnvioMensaje)
  {
    this.horaEnvioMensaje = horaEnvioMensaje;
  }

  /**
   * Gets the atributo pagineo.
   *
   * @return the atributo pagineo
   */
  public String getAtributoPagineo()
  {
    return this.atributoPagineo;
  }

  /**
   * Sets the atributo pagineo.
   *
   * @param atributoPagineo the new atributo pagineo
   */
  public void setAtributoPagineo(String atributoPagineo)
  {
    this.atributoPagineo = atributoPagineo;
  }

  /**
   * Gets the clave busqueda.
   *
   * @return the clave busqueda
   */
  public String getClaveBusqueda()
  {
    return this.claveBusqueda;
  }

  /**
   * Sets the clave busqueda.
   *
   * @param claveBusqueda the new clave busqueda
   */
  public void setClaveBusqueda(String claveBusqueda)
  {
    this.claveBusqueda = claveBusqueda;
  }

  /**
   * Gets the cantidad registros.
   *
   * @return the cantidad registros
   */
  public int getCantidadRegistros()
  {
    return this.cantidadRegistros;
  }

  /**
   * Sets the cantidad registros.
   *
   * @param cantidadRegistros the new cantidad registros
   */
  public void setCantidadRegistros(int cantidadRegistros)
  {
    this.cantidadRegistros = cantidadRegistros;
  }
}