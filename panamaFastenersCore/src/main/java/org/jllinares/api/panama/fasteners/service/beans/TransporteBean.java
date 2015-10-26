package org.jllinares.api.panama.fasteners.service.beans;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.bind.annotation.XmlType;

import org.jllinares.api.panama.fasteners.commons.beans.BaseBean;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="TRANSPORTE")
public class TransporteBean extends BaseBean implements Serializable {
	private static final long serialVersionUID = 3673316028462625676L;

	/** The Constant NAME. */
	public static final String NAME = "TRANSPORTE";

	/** The id. */
	@XmlTransient
	private int id;

	/** The modelo camion. */
	@XmlElement(name="MODELO_CAMION", required=true)
	private String modeloCamion;

	/** The placa camion. */
	@XmlElement(name="PLACA_CAMION", required=true)
	private String placaCamion;

	/** The color camion. */
	@XmlElement(name="COLOR_CAMION", required=true)
	private String colorCamion;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	/**
	 * Gets the modelo camion.
	 *
	 * @return the modelo camion
	 */
	public String getModeloCamion()
	{
		return this.modeloCamion;
	}

	/**
	 * Sets the modelo camion.
	 *
	 * @param modeloCamion the new modelo camion
	 */
	public void setModeloCamion(String modeloCamion)
	{
		this.modeloCamion = modeloCamion;
	}

	/**
	 * Gets the placa camion.
	 *
	 * @return the placa camion
	 */
	public String getPlacaCamion()
	{
		return this.placaCamion;
	}

	/**
	 * Sets the placa camion.
	 *
	 * @param placaCamion the new placa camion
	 */
	public void setPlacaCamion(String placaCamion)
	{
		this.placaCamion = placaCamion;
	}

	/**
	 * Gets the color camion.
	 *
	 * @return the color camion
	 */
	public String getColorCamion()
	{
		return this.colorCamion;
	}

	/**
	 * Sets the color camion.
	 *
	 * @param colorCamion the new color camion
	 */
	public void setColorCamion(String colorCamion)
	{
		this.colorCamion = colorCamion;
	}
}
