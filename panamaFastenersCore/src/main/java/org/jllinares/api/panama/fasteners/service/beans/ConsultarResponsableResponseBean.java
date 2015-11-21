package org.jllinares.api.panama.fasteners.service.beans;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.jllinares.api.panama.fasteners.commons.beans.BaseBean;
import org.jllinares.api.panama.fasteners.service.ManagerAPIService;

/**
 * The Class ConsultarResponsableResponseBean.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name=ManagerAPIService.CONSULTAR_RESPONSABLE_RESPONSE, namespace=ManagerAPIService.TARGET_NAMESPACE, propOrder={"headerSalida", "bodySalida"})
public class ConsultarResponsableResponseBean extends BaseBean implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 3699091531687010459L;
	
	/** The header salida. */
	  @XmlElement(name=HeaderSalidaBean.HEADER_SALIDA, required=true)
	  private HeaderSalidaBean headerSalida;

	  /** The body salida. */
	  @XmlElement(name=BodySalidaConsultarResponsableBean.BODY_SALIDA_NAME, required=false)
	  private BodySalidaConsultarResponsableBean bodySalida;

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
	public BodySalidaConsultarResponsableBean getBodySalida() {
		return bodySalida;
	}

	/**
	 * Sets the body salida.
	 *
	 * @param bodySalida the new body salida
	 */
	public void setBodySalida(BodySalidaConsultarResponsableBean bodySalida) {
		this.bodySalida = bodySalida;
	}
}
