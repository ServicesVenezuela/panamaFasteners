package org.jllinares.api.panama.fasteners.commons;

// TODO: Auto-generated Javadoc
/**
 * The Enum ServiceConstans.
 */
public enum ServiceConstans
{
  
  /** The type msj info. */
  TYPE_MSJ_INFO("I"), 
  
  /** The type msj error. */
  TYPE_MSJ_ERROR("E"), 
  
  /** The type msj warning. */
  TYPE_MSJ_WARNING("W"), 
  
  /** The code ok. */
  CODE_OK("0000"), 
  
  /** The msj ok. */
  MSJ_OK("TRANSACCION REALIZADA"), 
  
  /** The code error generic. */
  CODE_ERROR_GENERIC("9000"), 
  
  /** The msj error generic. */
  MSJ_ERROR_GENERIC("SE HA PRESENTADO UN ERROR INESPERADO EN EL SERVICIO, DE CONTINUAR EL PROBLEMA POR FAVOR REPORTELO A SISTEMAS"), 
  
  /** The code error db not connected. */
  CODE_ERROR_DB_NOT_CONNECTED("0001"), 
  
  /** The msj error db not connected. */
  MSJ_ERROR_DB_NOT_CONNECTED("NO SE HA LOGRADO OBTENER CONEXION CON LA BASE DE DATOS"), 
  
  /** The code list empty. */
  CODE_LIST_EMPTY("0002"), 
  
  /** The msj list empty. */
  MSJ_LIST_EMPTY("NO SE HAN LOGRADO OBTENER VALORES PARA LA CONSULTA DESEADA"), 
  
  /** The code not register. */
  CODE_NOT_REGISTER("0003"), 
  
  /** The msj not register. */
  MSJ_NOT_REGISTER("NO SE HA LOGRADO INSERTAR LOS VALORES DESEADOS"),
  
  /** The msj not register. */
  MSJ_NOT_REGISTER_DETAIL("NO SE HA LOGRADO INSERTAR LOS VALORES DESEADOS, POR FAVOR VERIFIQUE LOS VALORES ENVIADOS"),
  
  /** The code act reg error act. */
  CODE_ACT_REG_ERROR_ACT("0004"), 
  
  /** The msj act reg error act. */
  MSJ_ACT_REG_ERROR_ACT("PARA LA OPERACION DE ACTUALIZACION DE CHOFER DEBE ENVIAR UN ID DE CHOFER EXISTENTE"),
  
  CODE_ACT_REG_CHOFER_TRANS("0005"), 
  
  MSJ_ACT_REG_CHOFER_TRANS("NO SE HAN LOGRADO ASOCIAR TODOS LOS REGISTROS DE TRANSPORTE AL CHOFER, POR FAVOR CONSULTE LOS DATOS PARA SU VERIFICACION - REGISTROS ASOCIADOS ");

  /** The value. */
  private String value;

  /**
   * Instantiates a new service constans.
   *
   * @param value the value
   */
  private ServiceConstans(String value)
  {
    this.value = value;
  }

  /**
   * Gets the value.
   *
   * @return the value
   */
  public String getValue()
  {
    return this.value;
  }
}