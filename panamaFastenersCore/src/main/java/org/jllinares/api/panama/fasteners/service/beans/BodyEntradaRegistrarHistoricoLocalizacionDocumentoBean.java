package org.jllinares.api.panama.fasteners.service.beans;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jllinares.api.panama.fasteners.commons.beans.BaseBean;

// TODO: Auto-generated Javadoc
/**
 * The Class BodyEntradaRegistrarHistoricoLocalizacionDocumentoBean.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="BODY_ENTRADA_REGISTRAR_LOCALIZACION_DOCUMENTO", namespace="FASTENERS_SERVICES_API", propOrder={"codigoLocalizacion", "numeroDocumento", "tipoDocumento", "codigoCliente"})
public class BodyEntradaRegistrarHistoricoLocalizacionDocumentoBean extends BaseBean
  implements Serializable
{
  
  /** The Constant BODY_ENTRADA_NAME. */
  public static final String BODY_ENTRADA_NAME = "BODY_ENTRADA_REGISTRAR_LOCALIZACION_DOCUMENTO";
  
  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1998266227011245240L;

  /** The codigo localizacion. */
  @XmlElement(name="CODIGO_LOCALIZACION", required=true)
  private int codigoLocalizacion;

  /** The numero documento. */
  @XmlElement(name="NUMERO_DOCUMENTO", required=true)
  private int numeroDocumento;

  /** The tipo documento. */
  @XmlElement(name="TIPO_DOCUMENTO", required=true)
  private String tipoDocumento;

  /** The codigo cliente. */
  @XmlElement(name="CODIGO_CLIENTE", required=true)
  private String codigoCliente;

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