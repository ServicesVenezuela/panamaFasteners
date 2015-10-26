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
 * The Class BodyEntradaCrearActualizarChoferBean.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="BODY_ENTRADA_CREAR_CHOFER", namespace="FASTENERS_SERVICES_API", propOrder={"name", "apellido", "cedula", "transportes"})
public class BodyEntradaCrearChoferBean extends BaseBean
implements Serializable
{

	/** The Constant BODY_ENTRADA_NAME. */
	public static final String BODY_ENTRADA_NAME = "BODY_ENTRADA_CREAR_CHOFER";

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 2031391750979915699L;

	/** The name. */
	@XmlElement(name="NOMBRE", required=true)
	private String name;

	/** The apellido. */
	@XmlElement(name="APELLIDO", required=true)
	private String apellido;

	/** The cedula. */
	@XmlElement(name="CEDULA", required=true)
	private String cedula;

	/** The responsables. */
	@XmlElementWrapper(name="TRANSPORTEs", required=false)
	@XmlElement(name="TRANSPORTE", required=false)
	private List<TransporteBean> transportes;

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName()
	{
		return this.name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * Gets the apellido.
	 *
	 * @return the apellido
	 */
	public String getApellido()
	{
		return this.apellido;
	}

	/**
	 * Sets the apellido.
	 *
	 * @param apellido the new apellido
	 */
	public void setApellido(String apellido)
	{
		this.apellido = apellido;
	}

	/**
	 * Gets the cedula.
	 *
	 * @return the cedula
	 */
	public String getCedula()
	{
		return this.cedula;
	}

	/**
	 * Sets the cedula.
	 *
	 * @param cedula the new cedula
	 */
	public void setCedula(String cedula)
	{
		this.cedula = cedula;
	}

	public void setTransportes(List<TransporteBean> transportes) {
		this.transportes = transportes;
	}

	public List<TransporteBean> getTransportes() {
		return transportes;
	}
}