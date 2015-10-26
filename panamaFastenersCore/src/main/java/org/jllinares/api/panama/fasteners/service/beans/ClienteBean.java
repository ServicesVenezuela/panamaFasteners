package org.jllinares.api.panama.fasteners.service.beans;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.jllinares.api.panama.fasteners.commons.beans.BaseBean;

// TODO: Auto-generated Javadoc
/**
 * The Class ClienteBean.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="CLIENTE")
public class ClienteBean extends BaseBean implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -6021756470189040210L;
	 
 	/** The codigo cliente. */
 	@XmlElement(name="CODIGO_CLIENTE", required=true)
	private String codigoCliente;
	 
 	/** The tipo cliente. */
 	@XmlElement(name="TIPO_CLIENTE", required=true)
	private String tipoCliente;
	 
 	/** The descripcion. */
 	@XmlElement(name="DESCRIPCION", required=true)
	private String descripcion;
	 
 	/** The direccion. */
 	@XmlElement(name="DIRECCION", required=true)
	private String direccion;
	 
 	/** The telefono. */
 	@XmlElement(name="TELEFONO", required=true)
	private String telefono;
	 
 	/** The fax. */
 	@XmlElement(name="FAX", required=true)
	private String fax;
	 
 	/** The fecha registro. */
 	@XmlElement(name="FECHA_REGISTRO", required=true)
	private Date fechaRegistro;
	 
 	/** The rif. */
 	@XmlElement(name="RIF", required=true)
	private String rif;
	 
 	/** The email. */
 	@XmlElement(name="CORREO_ELECTRONICO", required=true)
	private String email;
	 
 	/** The descuento global. */
 	@XmlElement(name="DESCUENTO_GLOBAL", required=true)
	private float descuentoGlobal;
	
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
	
	/**
	 * Gets the tipo cliente.
	 *
	 * @return the tipo cliente
	 */
	public String getTipoCliente() {
		return tipoCliente;
	}
	
	/**
	 * Sets the tipo cliente.
	 *
	 * @param tipoCliente the new tipo cliente
	 */
	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
	
	/**
	 * Gets the descripcion.
	 *
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	
	/**
	 * Sets the descripcion.
	 *
	 * @param descripcion the new descripcion
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	/**
	 * Gets the direccion.
	 *
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	
	/**
	 * Sets the direccion.
	 *
	 * @param direccion the new direccion
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	/**
	 * Gets the telefono.
	 *
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}
	
	/**
	 * Sets the telefono.
	 *
	 * @param telefono the new telefono
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	/**
	 * Gets the fax.
	 *
	 * @return the fax
	 */
	public String getFax() {
		return fax;
	}
	
	/**
	 * Sets the fax.
	 *
	 * @param fax the new fax
	 */
	public void setFax(String fax) {
		this.fax = fax;
	}
	
	/**
	 * Gets the fecha registro.
	 *
	 * @return the fecha registro
	 */
	public Date getFechaRegistro() {
		return fechaRegistro;
	}
	
	/**
	 * Sets the fecha registro.
	 *
	 * @param fechaRegistro the new fecha registro
	 */
	public void setFechaRegistro(Date fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}
	
	/**
	 * Gets the rif.
	 *
	 * @return the rif
	 */
	public String getRif() {
		return rif;
	}
	
	/**
	 * Sets the rif.
	 *
	 * @param rif the new rif
	 */
	public void setRif(String rif) {
		this.rif = rif;
	}
	
	/**
	 * Gets the email.
	 *
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * Sets the email.
	 *
	 * @param email the new email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * Gets the descuento global.
	 *
	 * @return the descuento global
	 */
	public float getDescuentoGlobal() {
		return descuentoGlobal;
	}
	
	/**
	 * Sets the descuento global.
	 *
	 * @param descuentoGlobal the new descuento global
	 */
	public void setDescuentoGlobal(float descuentoGlobal) {
		this.descuentoGlobal = descuentoGlobal;
	}
}