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
 * The Class BodySalidaConsultarVendedoresBean.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="BODY_SALIDA_CONSULTAR_VENDEDORES", namespace="FASTENERS_SERVICES_API", propOrder={"vendedores"})
public class BodySalidaConsultarVendedoresBean extends BaseBean
  implements Serializable
{
  
  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1394082702233515087L;
  
  /** The Constant BODY_SALIDA_NAME. */
  public static final String BODY_SALIDA_NAME = "BODY_SALIDA_CONSULTAR_VENDEDORES";

  /** The vendedores. */
  @XmlElementWrapper(name="VENDEDORs", required=true)
  @XmlElement(name="VENDEDOR", required=false)
  private List<VendedorBean> vendedores;

  /**
   * Sets the vendedores.
   *
   * @param vendedores the new vendedores
   */
  public void setVendedores(List<VendedorBean> vendedores)
  {
    this.vendedores = vendedores;
  }

  /**
   * Gets the vendedores.
   *
   * @return the vendedores
   */
  public List<VendedorBean> getVendedores()
  {
    return this.vendedores;
  }
}