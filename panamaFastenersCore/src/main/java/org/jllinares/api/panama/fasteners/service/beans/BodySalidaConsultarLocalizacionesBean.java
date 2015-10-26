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
 * The Class BodySalidaConsultarLocalizacionesBean.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="BODY_SALIDA_CONSULTAR_LOCALIZACIONES", namespace="FASTENERS_SERVICES_API", propOrder={"localizaciones"})
public class BodySalidaConsultarLocalizacionesBean extends BaseBean
  implements Serializable
{
  
  /** The Constant BODY_SALIDA_NAME. */
  public static final String BODY_SALIDA_NAME = "BODY_SALIDA_CONSULTAR_LOCALIZACIONES";
  
  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = -4081015425299903397L;

  /** The localizaciones. */
  @XmlElementWrapper(name="LOCALIZACIONs", required=true)
  @XmlElement(name="LOCALIZACION", required=false)
  private List<LocalizacionBean> localizaciones;

  /**
   * Gets the localizaciones.
   *
   * @return the localizaciones
   */
  public List<LocalizacionBean> getLocalizaciones()
  {
    return this.localizaciones;
  }

  /**
   * Sets the localizaciones.
   *
   * @param localizaciones the new localizaciones
   */
  public void setLocalizaciones(List<LocalizacionBean> localizaciones)
  {
    this.localizaciones = localizaciones;
  }
}