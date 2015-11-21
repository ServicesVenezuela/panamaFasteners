package org.jllinares.api.panama.fasteners.service.beans;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.jllinares.api.panama.fasteners.commons.beans.BaseBean;
import org.jllinares.api.panama.fasteners.service.ManagerAPIService;

/**
 * The Class BodySalidaConsultarResponsableBean.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name=BodySalidaConsultarResponsableBean.BODY_SALIDA_NAME, namespace=ManagerAPIService.TARGET_NAMESPACE, propOrder={"responsable"})
public class BodySalidaConsultarResponsableBean extends BaseBean implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1592756294154913103L;
	 
 	/** The Constant BODY_SALIDA_NAME. */
 	public static final String BODY_SALIDA_NAME = "BODY_SALIDA_CONSULTAR_RESONSABLE";
	
	/** The responsable. */
	@XmlElement(name=ResponsableBean.NAME, required=false)
	private ResponsableBean responsable;

	/**
	 * Gets the responsable.
	 *
	 * @return the responsable
	 */
	public ResponsableBean getResponsable() {
		return responsable;
	}

	/**
	 * Sets the responsable.
	 *
	 * @param responsable the new responsable
	 */
	public void setResponsable(ResponsableBean responsable) {
		this.responsable = responsable;
	}
}
