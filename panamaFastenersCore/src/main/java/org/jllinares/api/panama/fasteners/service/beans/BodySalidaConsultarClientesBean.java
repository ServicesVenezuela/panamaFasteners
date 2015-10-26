package org.jllinares.api.panama.fasteners.service.beans;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

import org.jllinares.api.panama.fasteners.commons.beans.BaseBean;

// TODO: Auto-generated Javadoc
/**
 * The Class BodySalidaConsultarClientesBean.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="BODY_SALIDA_CONSULTAR_CLIENTES", namespace="FASTENERS_SERVICES_API", propOrder={"clientes"})

public class BodySalidaConsultarClientesBean extends BaseBean implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -1555047831473156814L;
	/** The choferes. */
	public static final String BODY_SALIDA_NAME = "BODY_SALIDA_CONSULTAR_CLIENTES";

	/** The clientes. */
	@XmlElementWrapper(name="CLIENTEs", required=true)
	@XmlElement(name="CLIENTE", required=false)
	private List<ClienteBean> clientes;

	/**
	 * Gets the clientes.
	 *
	 * @return the clientes
	 */
	public List<ClienteBean> getClientes() {
		return clientes;
	}

	/**
	 * Sets the clientes.
	 *
	 * @param clientes the new clientes
	 */
	public void setClientes(List<ClienteBean> clientes) {
		this.clientes = clientes;
	}
}