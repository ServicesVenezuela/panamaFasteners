package org.jllinares.api.panama.fasteners.service.beans;

import java.io.Serializable;
import java.util.Date;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import org.jllinares.api.panama.fasteners.commons.beans.BaseBean;

// TODO: Auto-generated Javadoc
/**
 * The Class DetalleDocumentoBean.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="DETALLE_DOCUMENTO")
public class DetalleDocumentoBean extends BaseBean
  implements Serializable
{
  
  /** The Constant NAME. */
  public static final String NAME = "DETALLE_DOCUMENTO";
  
  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = -7218540907367648533L;

  /** The tipo documento. */
  @XmlElement(name="TIPO_DOCUMENTO", required=true)
  private String tipoDocumento;

  /** The anulado. */
  @XmlElement(name="ANULADO", required=true)
  private boolean anulado;

  /** The movimiento. */
  @XmlElement(name="MOVIMIENTO", required=true)
  private int movimiento;

  /** The automatico. */
  @XmlElement(name="AUTOMATICO", required=true)
  private boolean automatico;

  /** The numero control. */
  @XmlElement(name="NUMERO_CONTROL", required=true)
  private int numeroControl;

  /** The codigo cliente. */
  @XmlElement(name="CODIGO_CLIENTE", required=true)
  private String codigoCliente;

  /** The contribuyente. */
  @XmlElement(name="CONTRIBUYENTE", required=true)
  private boolean contribuyente;

  /** The fecha emision. */
  @XmlElement(name="FECHA_EMISION", required=true)
  private Date fechaEmision;

  /** The fecha vencimiento. */
  @XmlElement(name="FECHA_VENCIMIENTO", required=true)
  private Date fechaVencimiento;

  /** The observaciones. */
  @XmlElement(name="OBSERVACIONES", required=true)
  private String observaciones;

  /** The documento origen. */
  @XmlElement(name="DOCUMENTO_ORIGEN", required=true)
  private String documentoOrigen;

  /** The numero origen. */
  @XmlElement(name="NUMERO_ORIGEN", required=true)
  private int numeroOrigen;

  /** The codigo banco. */
  @XmlElement(name="CODIGO_BANCO", required=true)
  private String codigoBanco;

  /** The numero cheque. */
  @XmlElement(name="NUMERO_CHEQUE", required=true)
  private String numeroCheque;

  /** The codigo vencimiento. */
  @XmlElement(name="CODIGO_VENCIMIENTO", required=true)
  private String codigoVencimiento;

  /** The tipo. */
  @XmlElement(name="TIPO", required=true)
  private String tipo;

  /** The tasa. */
  @XmlElement(name="TASA", required=true)
  private float tasa;

  /** The moneda. */
  @XmlElement(name="MONEDA", required=true)
  private String moneda;

  /** The monto impuesto. */
  @XmlElement(name="MONTO_IMPUESTO", required=true)
  private float montoImpuesto;

  /** The monto general. */
  @XmlElement(name="MONTO_GENERAL", required=true)
  private float montoGeneral;

  /** The monto a1. */
  @XmlElement(name="MONTO_A1", required=true)
  private float montoA1;

  /** The monto a2. */
  @XmlElement(name="MONTO_A2", required=true)
  private float montoA2;

  /** The monto bruto. */
  @XmlElement(name="MONTO_BRUTO", required=true)
  private float montoBruto;

  /** The descuentos. */
  @XmlElement(name="DESCUENTOS", required=true)
  private String descuentos;

  /** The monto descuentos. */
  @XmlElement(name="MONTO_DESCUENTOS", required=true)
  private float montoDescuentos;

  /** The recargos. */
  @XmlElement(name="RECARGOS", required=true)
  private String recargos;

  /** The monto recargos. */
  @XmlElement(name="MONTO_RECARGOS", required=true)
  private float montoRecargos;

  /** The monto otros. */
  @XmlElement(name="MONTO_OTROS", required=true)
  private float montoOtros;

  /** The monto neto. */
  @XmlElement(name="MONTO_NETO", required=true)
  private float montoNeto;

  /** The saldo. */
  @XmlElement(name="SALDO", required=true)
  private float saldo;

  /** The fecha compromiso. */
  @XmlElement(name="FECHA_COMPROMISO", required=true)
  private Date fechaCompromiso;

  /** The numero compromiso. */
  @XmlElement(name="NUMERO_COMPROMISO", required=true)
  private int numeroCompromiso;

  /** The comision1. */
  @XmlElement(name="COMISION_1", required=true)
  private float comision1;

  /** The comision2. */
  @XmlElement(name="COMISION_2", required=true)
  private float comision2;

  /** The comision3. */
  @XmlElement(name="COMISION_3", required=true)
  private float comision3;

  /** The comision4. */
  @XmlElement(name="COMISION_4", required=true)
  private float comision4;

  /** The adicional. */
  @XmlElement(name="ADICIONAL", required=true)
  private float adicional;

  /**
   * Gets the tipo documento.
   *
   * @return the tipo documento
   */
  public String getTipoDocumento()
  {
    return this.tipoDocumento;
  }

  /**
   * Sets the tipo documento.
   *
   * @param tipoDocumento the new tipo documento
   */
  public void setTipoDocumento(String tipoDocumento)
  {
    this.tipoDocumento = tipoDocumento;
  }

  /**
   * Checks if is anulado.
   *
   * @return true, if is anulado
   */
  public boolean isAnulado()
  {
    return this.anulado;
  }

  /**
   * Sets the anulado.
   *
   * @param anulado the new anulado
   */
  public void setAnulado(boolean anulado)
  {
    this.anulado = anulado;
  }

  /**
   * Gets the movimiento.
   *
   * @return the movimiento
   */
  public int getMovimiento()
  {
    return this.movimiento;
  }

  /**
   * Sets the movimiento.
   *
   * @param movimiento the new movimiento
   */
  public void setMovimiento(int movimiento)
  {
    this.movimiento = movimiento;
  }

  /**
   * Checks if is automatico.
   *
   * @return true, if is automatico
   */
  public boolean isAutomatico()
  {
    return this.automatico;
  }

  /**
   * Sets the automatico.
   *
   * @param automatico the new automatico
   */
  public void setAutomatico(boolean automatico)
  {
    this.automatico = automatico;
  }

  /**
   * Gets the numero control.
   *
   * @return the numero control
   */
  public int getNumeroControl()
  {
    return this.numeroControl;
  }

  /**
   * Sets the numero control.
   *
   * @param numeroControl the new numero control
   */
  public void setNumeroControl(int numeroControl)
  {
    this.numeroControl = numeroControl;
  }

  /**
   * Gets the codigo cliente.
   *
   * @return the codigo cliente
   */
  public String getCodigoCliente()
  {
    return this.codigoCliente;
  }

  /**
   * Sets the codigo cliente.
   *
   * @param codigoCliente the new codigo cliente
   */
  public void setCodigoCliente(String codigoCliente)
  {
    this.codigoCliente = codigoCliente;
  }

  /**
   * Checks if is contribuyente.
   *
   * @return true, if is contribuyente
   */
  public boolean isContribuyente()
  {
    return this.contribuyente;
  }

  /**
   * Sets the contribuyente.
   *
   * @param contribuyente the new contribuyente
   */
  public void setContribuyente(boolean contribuyente)
  {
    this.contribuyente = contribuyente;
  }

  /**
   * Gets the fecha emision.
   *
   * @return the fecha emision
   */
  public Date getFechaEmision()
  {
    return this.fechaEmision;
  }

  /**
   * Sets the fecha emision.
   *
   * @param fechaEmision the new fecha emision
   */
  public void setFechaEmision(Date fechaEmision)
  {
    this.fechaEmision = fechaEmision;
  }

  /**
   * Gets the fecha vencimiento.
   *
   * @return the fecha vencimiento
   */
  public Date getFechaVencimiento()
  {
    return this.fechaVencimiento;
  }

  /**
   * Sets the fecha vencimiento.
   *
   * @param fechaVencimiento the new fecha vencimiento
   */
  public void setFechaVencimiento(Date fechaVencimiento)
  {
    this.fechaVencimiento = fechaVencimiento;
  }

  /**
   * Gets the observaciones.
   *
   * @return the observaciones
   */
  public String getObservaciones()
  {
    return this.observaciones;
  }

  /**
   * Sets the observaciones.
   *
   * @param observaciones the new observaciones
   */
  public void setObservaciones(String observaciones)
  {
    this.observaciones = observaciones;
  }

  /**
   * Gets the documento origen.
   *
   * @return the documento origen
   */
  public String getDocumentoOrigen()
  {
    return this.documentoOrigen;
  }

  /**
   * Sets the documento origen.
   *
   * @param documentoOrigen the new documento origen
   */
  public void setDocumentoOrigen(String documentoOrigen)
  {
    this.documentoOrigen = documentoOrigen;
  }

  /**
   * Gets the numero origen.
   *
   * @return the numero origen
   */
  public int getNumeroOrigen()
  {
    return this.numeroOrigen;
  }

  /**
   * Sets the numero origen.
   *
   * @param numeroOrigen the new numero origen
   */
  public void setNumeroOrigen(int numeroOrigen)
  {
    this.numeroOrigen = numeroOrigen;
  }

  /**
   * Gets the codigo banco.
   *
   * @return the codigo banco
   */
  public String getCodigoBanco()
  {
    return this.codigoBanco;
  }

  /**
   * Sets the codigo banco.
   *
   * @param codigoBanco the new codigo banco
   */
  public void setCodigoBanco(String codigoBanco)
  {
    this.codigoBanco = codigoBanco;
  }

  /**
   * Gets the numero cheque.
   *
   * @return the numero cheque
   */
  public String getNumeroCheque()
  {
    return this.numeroCheque;
  }

  /**
   * Sets the numero cheque.
   *
   * @param numeroCheque the new numero cheque
   */
  public void setNumeroCheque(String numeroCheque)
  {
    this.numeroCheque = numeroCheque;
  }

  /**
   * Gets the codigo vencimiento.
   *
   * @return the codigo vencimiento
   */
  public String getCodigoVencimiento()
  {
    return this.codigoVencimiento;
  }

  /**
   * Sets the codigo vencimiento.
   *
   * @param codigoVencimiento the new codigo vencimiento
   */
  public void setCodigoVencimiento(String codigoVencimiento)
  {
    this.codigoVencimiento = codigoVencimiento;
  }

  /**
   * Gets the tipo.
   *
   * @return the tipo
   */
  public String getTipo()
  {
    return this.tipo;
  }

  /**
   * Sets the tipo.
   *
   * @param tipo the new tipo
   */
  public void setTipo(String tipo)
  {
    this.tipo = tipo;
  }

  /**
   * Gets the tasa.
   *
   * @return the tasa
   */
  public float getTasa()
  {
    return this.tasa;
  }

  /**
   * Sets the tasa.
   *
   * @param tasa the new tasa
   */
  public void setTasa(float tasa)
  {
    this.tasa = tasa;
  }

  /**
   * Gets the moneda.
   *
   * @return the moneda
   */
  public String getMoneda()
  {
    return this.moneda;
  }

  /**
   * Sets the moneda.
   *
   * @param moneda the new moneda
   */
  public void setMoneda(String moneda)
  {
    this.moneda = moneda;
  }

  /**
   * Gets the monto impuesto.
   *
   * @return the monto impuesto
   */
  public float getMontoImpuesto()
  {
    return this.montoImpuesto;
  }

  /**
   * Sets the monto impuesto.
   *
   * @param montoImpuesto the new monto impuesto
   */
  public void setMontoImpuesto(float montoImpuesto)
  {
    this.montoImpuesto = montoImpuesto;
  }

  /**
   * Gets the monto general.
   *
   * @return the monto general
   */
  public float getMontoGeneral()
  {
    return this.montoGeneral;
  }

  /**
   * Sets the monto general.
   *
   * @param montoGeneral the new monto general
   */
  public void setMontoGeneral(float montoGeneral)
  {
    this.montoGeneral = montoGeneral;
  }

  /**
   * Gets the monto a1.
   *
   * @return the monto a1
   */
  public float getMontoA1()
  {
    return this.montoA1;
  }

  /**
   * Sets the monto a1.
   *
   * @param montoA1 the new monto a1
   */
  public void setMontoA1(float montoA1)
  {
    this.montoA1 = montoA1;
  }

  /**
   * Gets the monto a2.
   *
   * @return the monto a2
   */
  public float getMontoA2()
  {
    return this.montoA2;
  }

  /**
   * Sets the monto a2.
   *
   * @param montoA2 the new monto a2
   */
  public void setMontoA2(float montoA2)
  {
    this.montoA2 = montoA2;
  }

  /**
   * Gets the monto bruto.
   *
   * @return the monto bruto
   */
  public float getMontoBruto()
  {
    return this.montoBruto;
  }

  /**
   * Sets the monto bruto.
   *
   * @param montoBruto the new monto bruto
   */
  public void setMontoBruto(float montoBruto)
  {
    this.montoBruto = montoBruto;
  }

  /**
   * Gets the descuentos.
   *
   * @return the descuentos
   */
  public String getDescuentos()
  {
    return this.descuentos;
  }

  /**
   * Sets the descuentos.
   *
   * @param descuentos the new descuentos
   */
  public void setDescuentos(String descuentos)
  {
    this.descuentos = descuentos;
  }

  /**
   * Gets the monto descuentos.
   *
   * @return the monto descuentos
   */
  public float getMontoDescuentos()
  {
    return this.montoDescuentos;
  }

  /**
   * Sets the monto descuentos.
   *
   * @param montoDescuentos the new monto descuentos
   */
  public void setMontoDescuentos(float montoDescuentos)
  {
    this.montoDescuentos = montoDescuentos;
  }

  /**
   * Gets the recargos.
   *
   * @return the recargos
   */
  public String getRecargos()
  {
    return this.recargos;
  }

  /**
   * Sets the recargos.
   *
   * @param recargos the new recargos
   */
  public void setRecargos(String recargos)
  {
    this.recargos = recargos;
  }

  /**
   * Gets the monto recargos.
   *
   * @return the monto recargos
   */
  public float getMontoRecargos()
  {
    return this.montoRecargos;
  }

  /**
   * Sets the monto recargos.
   *
   * @param montoRecargos the new monto recargos
   */
  public void setMontoRecargos(float montoRecargos)
  {
    this.montoRecargos = montoRecargos;
  }

  /**
   * Gets the monto otros.
   *
   * @return the monto otros
   */
  public float getMontoOtros()
  {
    return this.montoOtros;
  }

  /**
   * Sets the monto otros.
   *
   * @param montoOtros the new monto otros
   */
  public void setMontoOtros(float montoOtros)
  {
    this.montoOtros = montoOtros;
  }

  /**
   * Gets the monto neto.
   *
   * @return the monto neto
   */
  public float getMontoNeto()
  {
    return this.montoNeto;
  }

  /**
   * Sets the monto neto.
   *
   * @param montoNeto the new monto neto
   */
  public void setMontoNeto(float montoNeto)
  {
    this.montoNeto = montoNeto;
  }

  /**
   * Gets the saldo.
   *
   * @return the saldo
   */
  public float getSaldo()
  {
    return this.saldo;
  }

  /**
   * Sets the saldo.
   *
   * @param saldo the new saldo
   */
  public void setSaldo(float saldo)
  {
    this.saldo = saldo;
  }

  /**
   * Gets the fecha compromiso.
   *
   * @return the fecha compromiso
   */
  public Date getFechaCompromiso()
  {
    return this.fechaCompromiso;
  }

  /**
   * Sets the fecha compromiso.
   *
   * @param fechaCompromiso the new fecha compromiso
   */
  public void setFechaCompromiso(Date fechaCompromiso)
  {
    this.fechaCompromiso = fechaCompromiso;
  }

  /**
   * Gets the numero compromiso.
   *
   * @return the numero compromiso
   */
  public int getNumeroCompromiso()
  {
    return this.numeroCompromiso;
  }

  /**
   * Sets the numero compromiso.
   *
   * @param numeroCompromiso the new numero compromiso
   */
  public void setNumeroCompromiso(int numeroCompromiso)
  {
    this.numeroCompromiso = numeroCompromiso;
  }

  /**
   * Gets the comision1.
   *
   * @return the comision1
   */
  public float getComision1()
  {
    return this.comision1;
  }

  /**
   * Sets the comision1.
   *
   * @param comision1 the new comision1
   */
  public void setComision1(float comision1)
  {
    this.comision1 = comision1;
  }

  /**
   * Gets the comision2.
   *
   * @return the comision2
   */
  public float getComision2()
  {
    return this.comision2;
  }

  /**
   * Sets the comision2.
   *
   * @param comision2 the new comision2
   */
  public void setComision2(float comision2)
  {
    this.comision2 = comision2;
  }

  /**
   * Gets the comision3.
   *
   * @return the comision3
   */
  public float getComision3()
  {
    return this.comision3;
  }

  /**
   * Sets the comision3.
   *
   * @param comision3 the new comision3
   */
  public void setComision3(float comision3)
  {
    this.comision3 = comision3;
  }

  /**
   * Gets the comision4.
   *
   * @return the comision4
   */
  public float getComision4()
  {
    return this.comision4;
  }

  /**
   * Sets the comision4.
   *
   * @param comision4 the new comision4
   */
  public void setComision4(float comision4)
  {
    this.comision4 = comision4;
  }

  /**
   * Gets the adicional.
   *
   * @return the adicional
   */
  public float getAdicional()
  {
    return this.adicional;
  }

  /**
   * Sets the adicional.
   *
   * @param adicional the new adicional
   */
  public void setAdicional(float adicional)
  {
    this.adicional = adicional;
  }
}