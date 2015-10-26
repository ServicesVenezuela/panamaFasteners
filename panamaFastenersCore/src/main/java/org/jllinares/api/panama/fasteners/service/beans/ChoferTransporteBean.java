package org.jllinares.api.panama.fasteners.service.beans;

import java.io.Serializable;

import org.jllinares.api.panama.fasteners.commons.beans.BaseBean;

/**
 * The Class ChoferTransporteBean.
 */
public class ChoferTransporteBean extends BaseBean implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -2718049581320330241L;
	
	/** The id. */
	private int id;
	
	/** The id chofer. */
	private int idChofer;
	
	/** The id transporte. */
	private int idTransporte;
	
	public ChoferTransporteBean() {
	}
	
	public ChoferTransporteBean(int idChofer, int idTransporte) {
		this.idChofer = idChofer;
		this.idTransporte = idTransporte;
	}
	
	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * Gets the id chofer.
	 *
	 * @return the id chofer
	 */
	public int getIdChofer() {
		return idChofer;
	}
	
	/**
	 * Sets the id chofer.
	 *
	 * @param idChofer the new id chofer
	 */
	public void setIdChofer(int idChofer) {
		this.idChofer = idChofer;
	}
	
	/**
	 * Gets the id transporte.
	 *
	 * @return the id transporte
	 */
	public int getIdTransporte() {
		return idTransporte;
	}
	
	/**
	 * Sets the id transporte.
	 *
	 * @param idTransporte the new id transporte
	 */
	public void setIdTransporte(int idTransporte) {
		this.idTransporte = idTransporte;
	}
}