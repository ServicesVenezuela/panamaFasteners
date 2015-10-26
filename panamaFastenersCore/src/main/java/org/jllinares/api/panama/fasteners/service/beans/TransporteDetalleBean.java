package org.jllinares.api.panama.fasteners.service.beans;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.jllinares.api.panama.fasteners.commons.beans.BaseBean;

/**
 * The Class TransporteDetalleBean.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="TRANSPORTE_DETALLE")
public class TransporteDetalleBean extends BaseBean implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -7828686089179077433L;

	/** The id. */
	@XmlElement(name="IDENTIFICADOR", required=true)
	private int identificador;

	/** The modelo camion. */
	@XmlElement(name="MODELO", required=true)
	private String modelo;

	/** The placa camion. */
	@XmlElement(name="PLACA", required=true)
	private String placa;

	/** The color camion. */
	@XmlElement(name="COLOR", required=true)
	private String color;

	/**
	 * Gets the identificador.
	 *
	 * @return the identificador
	 */
	public int getIdentificador() {
		return identificador;
	}

	/**
	 * Sets the identificador.
	 *
	 * @param identificador the new identificador
	 */
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

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
