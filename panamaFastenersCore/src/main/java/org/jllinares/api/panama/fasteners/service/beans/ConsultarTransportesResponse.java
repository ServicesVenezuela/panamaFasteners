package org.jllinares.api.panama.fasteners.service.beans;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.jllinares.api.panama.fasteners.commons.beans.BaseBean;
import org.jllinares.api.panama.fasteners.service.ManagerAPIService;

/**
 * The Class ConsultarTransportesResponse.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name=ManagerAPIService.CONSULTAR_TRANSPORTES_RESPONSE, namespace=ManagerAPIService.TARGET_NAMESPACE, propOrder={"headerSalida", "bodySalida"})
public class ConsultarTransportesResponse extends BaseBean implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 5549318171829706709L;

	/** The header salida. */
	@XmlElement(name=HeaderSalidaBean.HEADER_SALIDA, required=true)
	private HeaderSalidaBean headerSalida;

	/** The body salida. */
	@XmlElement(name=BodySalidaConsultarTransportesBean.BODY_SALIDA_NAME, required=false)
	private BodySalidaConsultarTransportesBean bodySalida;

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
	public BodySalidaConsultarTransportesBean getBodySalida() {
		return bodySalida;
	}

	/**
	 * Sets the body salida.
	 *
	 * @param bodySalida the new body salida
	 */
	public void setBodySalida(BodySalidaConsultarTransportesBean bodySalida) {
		this.bodySalida = bodySalida;
	}
}