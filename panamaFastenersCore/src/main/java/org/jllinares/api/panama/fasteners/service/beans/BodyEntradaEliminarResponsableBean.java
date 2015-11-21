package org.jllinares.api.panama.fasteners.service.beans;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.jllinares.api.panama.fasteners.commons.beans.BaseBean;
import org.jllinares.api.panama.fasteners.service.ManagerAPIService;

/**
 * The Class BodyEntradaConsultaResponsableBean.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name=BodyEntradaEliminarResponsableBean.BODY_ENTRADA_NAME, namespace=ManagerAPIService.TARGET_NAMESPACE, propOrder={"idResponsable"})
public class BodyEntradaEliminarResponsableBean extends BaseBean implements Serializable {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1398073349282790908L;
	
	/** The Constant BODY_ENTRADA_NAME. */
	public static final String BODY_ENTRADA_NAME = "BODY_ENTRADA_ELIMINAR_RESPONSABLE";
	
	/** The id. */
	@XmlElement(name="IDENTIFICADOR_RESPONSABLE", required=true)
	private int idResponsable;

	/**
	 * Gets the id responsable.
	 *
	 * @return the id responsable
	 */
	public int getIdResponsable() {
		return idResponsable;
	}

	/**
	 * Sets the id responsable.
	 *
	 * @param idResponsable the new id responsable
	 */
	public void setIdResponsable(int idResponsable) {
		this.idResponsable = idResponsable;
	}
}
