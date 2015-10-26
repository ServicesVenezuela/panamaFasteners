package org.jllinares.api.panama.fasteners.service.beans;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.jllinares.api.panama.fasteners.commons.beans.BaseBean;

// TODO: Auto-generated Javadoc
/**
 * The Class BodySalidaConsultarDetalleClienteBean.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="BODY_SALIDA_CONSULTAR_DETALLE_CLIENTE", namespace="FASTENERS_SERVICES_API", propOrder={"cliente"})
public class BodySalidaConsultarDetalleClienteBean extends BaseBean implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -6988356173996816773L;
	
	/** The cliente. */
	@XmlElement(name="CLIENTE", required=true)
	private ClienteBean cliente;
	
	/**
	 * Gets the cliente.
	 *
	 * @return the cliente
	 */
	public ClienteBean getCliente() {
		return cliente;
	}
	
	/**
	 * Sets the cliente.
	 *
	 * @param cliente the new cliente
	 */
	public void setCliente(ClienteBean cliente) {
		this.cliente = cliente;
	}
}