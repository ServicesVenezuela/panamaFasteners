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
 * The Class BodyEntradaAsociarChoferTransportesBean.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name=BodyEntradaAsociarChoferTransportesBean.BODY_ENTRADA_NAME, namespace=ManagerAPIService.TARGET_NAMESPACE, propOrder={"idChofer", "idsTransportes"})
public class BodyEntradaAsociarChoferTransportesBean extends BaseBean implements Serializable {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = -6331223376043027006L;

	/** The Constant BODY_ENTRADA_NAME. */
	public static final String BODY_ENTRADA_NAME = "BODY_ENTRADA_ASOCIAR_CHOFER_TRANSPORTES";

	/** The id. */
	@XmlElement(name="IDENTIFICADOR_CHOFER", required=true)
	private int idChofer;

	/** The ids transportes. */
	@XmlElementWrapper(name="TRANSPORTEs", required=false)
	@XmlElement(name="IDENTIFICADOR_TRANSPORTE", required=false)
	private List<Integer> idsTransportes;

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
	 * Gets the ids transportes.
	 *
	 * @return the ids transportes
	 */
	public List<Integer> getIdsTransportes() {
		return idsTransportes;
	}

	/**
	 * Sets the ids transportes.
	 *
	 * @param idsTransportes the new ids transportes
	 */
	public void setIdsTransportes(List<Integer> idsTransportes) {
		this.idsTransportes = idsTransportes;
	}
}