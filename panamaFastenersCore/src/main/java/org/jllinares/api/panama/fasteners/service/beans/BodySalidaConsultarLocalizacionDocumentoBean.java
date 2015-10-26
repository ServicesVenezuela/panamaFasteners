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
 * The Class BodySalidaConsultarLocalizacionDocumentoBean.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="BODY_SALIDA_CONSULTAR_LOCALIZACION_DOCUMENTO", namespace="FASTENERS_SERVICES_API", propOrder={"historico"})
public class BodySalidaConsultarLocalizacionDocumentoBean extends BaseBean
  implements Serializable
{
  
  /** The Constant BODY_SALIDA_NAME. */
  public static final String BODY_SALIDA_NAME = "BODY_SALIDA_CONSULTAR_LOCALIZACION_DOCUMENTO";
  
  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 938046859729413690L;

  /** The historico. */
  @XmlElementWrapper(name="HISTORICO_LOCALIZACIONs", required=true)
  @XmlElement(name="HISTORICO_LOCALIZACION", required=true)
  private List<HistoricoDocumentoLocalizacionBean> historico;

  /**
   * Gets the historico.
   *
   * @return the historico
   */
  public List<HistoricoDocumentoLocalizacionBean> getHistorico()
  {
    return this.historico;
  }

  /**
   * Sets the historico.
   *
   * @param historico the new historico
   */
  public void setHistorico(List<HistoricoDocumentoLocalizacionBean> historico)
  {
    this.historico = historico;
  }
}