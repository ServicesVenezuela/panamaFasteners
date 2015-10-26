package org.jllinares.api.panama.fasteners.utils;

import org.jllinares.api.panama.fasteners.service.beans.HeaderSalidaBean;

// TODO: Auto-generated Javadoc
/**
 * The Class ServicesUtils.
 */
public final class ServicesUtils
{
  
  /**
   * Sets the header salida with error.
   *
   * @param headerSalida the header salida
   * @param typeMsg the type msg
   * @param codeError the code error
   * @param msjError the msj error
   * @return the header salida bean
   */
  public HeaderSalidaBean setHeaderSalidaWithError(HeaderSalidaBean headerSalida, String typeMsg, String codeError, String msjError)
  {
    HeaderSalidaBean header = headerSalida;
    headerSalida.setTipoMensaje(typeMsg);
    headerSalida.setCodigoMensajeProgramador(codeError);
    headerSalida.setCodigoMensajeUsuario(codeError);
    headerSalida.setMensajeProgramadorSistema(msjError);
    headerSalida.setMensajeUsuario(msjError);
    return header;
  }
}