package org.jllinares.api.panama.fasteners.service.beans;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.jllinares.api.panama.fasteners.commons.beans.BaseBean;
import org.jllinares.api.panama.fasteners.service.ManagerAPIService;

/**
 * The Class BodyEntradaCrearTransporteBean.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name=BodyEntradaCrearTransporteBean.BODY_ENTRADA_NAME, namespace=ManagerAPIService.TARGET_NAMESPACE, propOrder={"modelo", "placa", "color"})
public class BodyEntradaCrearTransporteBean extends BaseBean implements Serializable {

	/** The Constant BODY_ENTRADA_NAME. */
	public static final String BODY_ENTRADA_NAME = "BODY_ENTRADA_CREAR_TRANSPORTE";

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 2031391750979915699L;
	
	/** The modelo camion. */
	@XmlElement(name="MODELO_CAMION", required=true)
	private String modelo;

	/** The placa camion. */
	@XmlElement(name="PLACA_CAMION", required=true)
	private String placa;

	/** The color camion. */
	@XmlElement(name="COLOR_CAMION", required=true)
	private String color;

	/**
	 * Gets the modelo.
	 *
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * Sets the modelo.
	 *
	 * @param modelo the new modelo
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * Gets the placa.
	 *
	 * @return the placa
	 */
	public String getPlaca() {
		return placa;
	}

	/**
	 * Sets the placa.
	 *
	 * @param placa the new placa
	 */
	public void setPlaca(String placa) {
		this.placa = placa;
	}

	/**
	 * Gets the color.
	 *
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * Sets the color.
	 *
	 * @param color the new color
	 */
	public void setColor(String color) {
		this.color = color;
	}
}