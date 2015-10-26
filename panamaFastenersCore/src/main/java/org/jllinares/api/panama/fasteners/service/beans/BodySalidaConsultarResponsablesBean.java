package org.jllinares.api.panama.fasteners.service.beans;

import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlType;
import org.jllinares.api.panama.fasteners.commons.beans.BaseBean;

// TODO: Auto-generated Javadoc
/**
 * The Class BodySalidaConsultarResponsablesBean.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="BODY_SALIDA_CONSULTAR_LISTA_RESPONSABLES", namespace="FASTENERS_SERVICES_API", propOrder={"responsables"})
public class BodySalidaConsultarResponsablesBean extends BaseBean
  implements Serializable
{
  
  /** The Constant BODY_SALIDA_NAME. */
  public static final String BODY_SALIDA_NAME = "BODY_SALIDA_CONSULTAR_LISTA_RESPONSABLES";
  
  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = -2409972775769350247L;

  /** The responsables. */
  @XmlElementWrapper(name="RESPONSABLEs", required=true)
  @XmlElement(name="RESPONSABLE", required=false)
  private List<ResponsableBean> responsables;

  /**
   * Gets the responsables.
   *
   * @return the responsables
   */
  public List<ResponsableBean> getResponsables()
  {
    return this.responsables;
  }

  /**
   * Sets the responsables.
   *
   * @param responsables the new responsables
   */
  public void setResponsables(List<ResponsableBean> responsables)
  {
    this.responsables = responsables;
  }
}