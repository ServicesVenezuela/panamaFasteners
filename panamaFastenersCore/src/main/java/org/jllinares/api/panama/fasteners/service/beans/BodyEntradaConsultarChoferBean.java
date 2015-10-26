package org.jllinares.api.panama.fasteners.service.beans;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jllinares.api.panama.fasteners.commons.beans.BaseBean;

// TODO: Auto-generated Javadoc
/**
 * The Class BodyEntradaConsultarChoferBean.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="BODY_ENTRADA_CONSULTAR_DETALLE_CHOFER", namespace="FASTENERS_SERVICES_API", propOrder={"id"})
public class BodyEntradaConsultarChoferBean extends BaseBean
  implements Serializable
{
  
  /** The Constant BODY_ENTRADA_NAME. */
  public static final String BODY_ENTRADA_NAME = "BODY_ENTRADA_CONSULTAR_DETALLE_CHOFER";
  
  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 8032267198982634207L;

  /** The id. */
  @XmlElement(name="IDENTIFICADOR_CHOFER", required=true)
  private int id;

  /**
   * Gets the id.
   *
   * @return the id
   */
  public int getId()
  {
    return this.id;
  }

  /**
   * Sets the id.
   *
   * @param id the new id
   */
  public void setId(int id)
  {
    this.id = id;
  }
}