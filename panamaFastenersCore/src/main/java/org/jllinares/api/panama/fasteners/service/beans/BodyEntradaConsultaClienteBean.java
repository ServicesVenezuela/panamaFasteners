package org.jllinares.api.panama.fasteners.service.beans;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.jllinares.api.panama.fasteners.commons.beans.BaseBean;

// TODO: Auto-generated Javadoc
/**
 * The Class BodyEntradaConsultaClienteBean.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="BODY_ENTRADA_CONSULTAR_DETALLE_CLIENTE", namespace="FASTENERS_SERVICES_API", propOrder={"codigoCliente"})
public class BodyEntradaConsultaClienteBean extends BaseBean implements Serializable{
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 4787386725283962630L;
	
	/** The codigo cliente. */
	@XmlElement(name="CODIGO_CLIENTE", required=true)
	private String codigoCliente;

	/**
	 * Gets the codigo cliente.
	 *
	 * @return the codigo cliente
	 */
	public String getCodigoCliente() {
		return codigoCliente;
	}

	/**
	 * Sets the codigo cliente.
	 *
	 * @param codigoCliente the new codigo cliente
	 */
	public void setCodigoCliente(String codigoCliente) {
		this.codigoCliente = codigoCliente;
	}
}