package org.jllinares.api.panama.fasteners.service.beans;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;

import org.jllinares.api.panama.fasteners.commons.beans.BaseBean;
import org.jllinares.api.panama.fasteners.service.ManagerAPIService;

/**
 * The Class BodySalidaConsultarTransportesBean.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name=BodySalidaConsultarTransportesBean.BODY_SALIDA_NAME, namespace=ManagerAPIService.TARGET_NAMESPACE, propOrder={"transportes"})
public class BodySalidaConsultarTransportesBean extends BaseBean implements Serializable {

	/** The Constant BODY_SALIDA_NAME. */
	public static final String BODY_SALIDA_NAME = "BODY_SALIDA_CONSULTAR_TRANSPORTES";

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -4081015425299903397L;

	/** The localizaciones. */
	@XmlElementWrapper(name="TRANSPORTEs", required=true)
	@XmlElement(name="TRANSPORTE_DETALLE", required=true)
	private List<TransporteDetalleBean> transportes;

	/**
	 * Gets the transportes.
	 *
	 * @return the transportes
	 */
	public List<TransporteDetalleBean> getTransportes() {
		return transportes;
	}

	/**
	 * Sets the transportes.
	 *
	 * @param transportes the new transportes
	 */
	public void setTransportes(List<TransporteDetalleBean> transportes) {
		this.transportes = transportes;
	}

}