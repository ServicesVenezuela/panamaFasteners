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
 * The Class BodySalidaConsultarChoferesBean.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="BODY_SALIDA_CONSULTAR_CHOFERES", namespace="FASTENERS_SERVICES_API", propOrder={"choferes"})
public class BodySalidaConsultarChoferesBean extends BaseBean
  implements Serializable
{
  
  /** The Constant BODY_SALIDA_NAME. */
  public static final String BODY_SALIDA_NAME = "BODY_SALIDA_CONSULTAR_CHOFERES";
  
  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 450260738008328926L;

  /** The choferes. */
  @XmlElementWrapper(name="CHOFERs", required=true)
  @XmlElement(name="CHOFER", required=false)
  private List<ChoferBean> choferes;

  /**
   * Gets the choferes.
   *
   * @return the choferes
   */
  public List<ChoferBean> getChoferes()
  {
    return this.choferes;
  }

  /**
   * Sets the choferes.
   *
   * @param choferes the new choferes
   */
  public void setChoferes(List<ChoferBean> choferes)
  {
    this.choferes = choferes;
  }
}