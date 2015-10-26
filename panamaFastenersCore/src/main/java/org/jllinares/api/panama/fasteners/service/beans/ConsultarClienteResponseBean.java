package org.jllinares.api.panama.fasteners.service.beans;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.jllinares.api.panama.fasteners.commons.beans.BaseBean;

// TODO: Auto-generated Javadoc
/**
 * The Class ConsultarClienteResponseBean.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="CONSULTAR_DETALLE_CLIENTEResponse", namespace="FASTENERS_SERVICES_API", propOrder={"headerSalida", "bodySalida"})
public class ConsultarClienteResponseBean extends BaseBean implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -437822729247722326L;
	 
 	/** The header salida. */
 	@XmlElement(name="HEADER_SALIDA", required=true)
	  private HeaderSalidaBean headerSalida;

	  /** The body salida. */
	  @XmlElement(name="BODY_SALIDA_CONSULTAR_DETALLE_CLIENTE", required=false)
	  private BodySalidaConsultarDetalleClienteBean bodySalida;

	/**
	 * Gets the header salida.
	 *
	 * @return the header salida
	 */
	public HeaderSalidaBean getHeaderSalida() {
		return headerSalida;
	}

	/**
	 * Sets the header salida.
	 *
	 * @param headerSalida the new header salida
	 */
	public void setHeaderSalida(HeaderSalidaBean headerSalida) {
		this.headerSalida = headerSalida;
	}

	/**
	 * Gets the body salida.
	 *
	 * @return the body salida
	 */
	public BodySalidaConsultarDetalleClienteBean getBodySalida() {
		return bodySalida;
	}

	/**
	 * Sets the body salida.
	 *
	 * @param bodySalida the new body salida
	 */
	public void setBodySalida(BodySalidaConsultarDetalleClienteBean bodySalida) {
		this.bodySalida = bodySalida;
	}
}