package org.jllinares.api.panama.fasteners.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import org.jllinares.api.panama.fasteners.service.beans.BodyEntradaAsociarChoferTransportesBean;
import org.jllinares.api.panama.fasteners.service.beans.BodyEntradaConsultaClienteBean;
import org.jllinares.api.panama.fasteners.service.beans.BodyEntradaConsultarChoferBean;
import org.jllinares.api.panama.fasteners.service.beans.BodyEntradaConsultarDetalleDocumentoBean;
import org.jllinares.api.panama.fasteners.service.beans.BodyEntradaConsultarLocalizacionDocumentoBean;
import org.jllinares.api.panama.fasteners.service.beans.BodyEntradaCrearChoferBean;
import org.jllinares.api.panama.fasteners.service.beans.BodyEntradaCrearTransporteBean;
import org.jllinares.api.panama.fasteners.service.beans.BodyEntradaRegistrarHistoricoLocalizacionDocumentoBean;
import org.jllinares.api.panama.fasteners.service.beans.BodyEntradaRegistrarResponsableBean;
import org.jllinares.api.panama.fasteners.service.beans.ConsultarChoferResponse;
import org.jllinares.api.panama.fasteners.service.beans.ConsultarChoferesResponse;
import org.jllinares.api.panama.fasteners.service.beans.ConsultarClienteResponseBean;
import org.jllinares.api.panama.fasteners.service.beans.ConsultarClientesResponseBean;
import org.jllinares.api.panama.fasteners.service.beans.ConsultarDetalleDocumentoResponse;
import org.jllinares.api.panama.fasteners.service.beans.ConsultarListaResponsablesResponse;
import org.jllinares.api.panama.fasteners.service.beans.ConsultarLocalizacionDocumentoResponse;
import org.jllinares.api.panama.fasteners.service.beans.ConsultarLocalizacionesReponse;
import org.jllinares.api.panama.fasteners.service.beans.ConsultarTransportesResponse;
import org.jllinares.api.panama.fasteners.service.beans.ConsultarVendedoresResponse;
import org.jllinares.api.panama.fasteners.service.beans.HeaderEntradaBean;
import org.jllinares.api.panama.fasteners.service.beans.HeaderSalidaBean;

/**
 * The Interface ManagerAPIService.
 */
@WebService(targetNamespace="FASTENERS_SERVICES_API", serviceName="FASTENERS_SERVICES_APIService", portName="FASTENERS_SERVICES_APIPort")
@SOAPBinding(style=SOAPBinding.Style.DOCUMENT, use=SOAPBinding.Use.LITERAL)
public interface ManagerAPIService {

	/** The Constant TARGET_NAMESPACE. */
	public static final String TARGET_NAMESPACE = "FASTENERS_SERVICES_API";

	/** The Constant TARGET_SERVICE_NAME. */
	public static final String TARGET_SERVICE_NAME = "FASTENERS_SERVICES_APIService";

	/** The Constant TARGET_PORT_NAME. */
	public static final String TARGET_PORT_NAME = "FASTENERS_SERVICES_APIPort";

	/** The Constant CONSULTAR_LISTA_LOCALIZACIONES. */
	public static final String CONSULTAR_LISTA_LOCALIZACIONES = "CONSULTAR_LOCALIZACIONES";

	/** The Constant CONSULTAR_LISTA_LOCALIZACIONES_RESPONSE. */
	public static final String CONSULTAR_LISTA_LOCALIZACIONES_RESPONSE = "CONSULTAR_LOCALIZACIONESResponse";

	/** The Constant CONSULTAR_LOCALIZACION_DOCUMENTO. */
	public static final String CONSULTAR_LOCALIZACION_DOCUMENTO = "CONSULTAR_LOCALIZACION_DOCUMENTO";

	/** The Constant CONSULTAR_LOCALIZACION_DOCUMENTO_RESPONSE. */
	public static final String CONSULTAR_LOCALIZACION_DOCUMENTO_RESPONSE = "CONSULTAR_LOCALIZACION_DOCUMENTOResponse";

	/** The Constant REGISTRAR_LOCALIZACION_DOCUMENTO. */
	public static final String REGISTRAR_LOCALIZACION_DOCUMENTO = "REGISTRAR_LOCALIZACION_DOCUMENTO";

	/** The Constant REGISTRAR_LOCALIZACION_DOCUMENTO_RESPONSE. */
	public static final String REGISTRAR_LOCALIZACION_DOCUMENTO_RESPONSE = "REGISTRAR_LOCALIZACION_DOCUMENTOResponse";

	/** The Constant CONSULTAR_LISTA_RESPONSABLES. */
	public static final String CONSULTAR_LISTA_RESPONSABLES = "CONSULTAR_LISTA_RESPONSABLES";

	/** The Constant CONSULTAR_LISTA_RESPONSABLES_RESPONSE. */
	public static final String CONSULTAR_LISTA_RESPONSABLES_RESPONSE = "CONSULTAR_LISTA_RESPONSABLESResponse";

	/** The Constant REGISTRAR_RESPONSABLE. */
	public static final String REGISTRAR_RESPONSABLE = "REGISTRAR_RESPONSABLE";

	/** The Constant REGISTRAR_RESPONSABLE_RESPONSE. */
	public static final String REGISTRAR_RESPONSABLE_RESPONSE = "REGISTRAR_RESPONSABLEResponse";

	/** The Constant CONSULTAR_DETALLE_DOCUMENTO. */
	public static final String CONSULTAR_DETALLE_DOCUMENTO = "CONSULTAR_DETALLE_DOCUMENTO";

	/** The Constant CONSULTAR_DETALLE_DOCUMENTO_RESPONSE. */
	public static final String CONSULTAR_DETALLE_DOCUMENTO_RESPONSE = "CONSULTAR_DETALLE_DOCUMENTOResponse";

	/** The Constant CONSULTAR_DETALLE_CHOFER. */
	public static final String CONSULTAR_DETALLE_CHOFER = "CONSULTAR_DETALLE_CHOFER";

	/** The Constant CONSULTAR_DETALLE_CHOFER_RESPONSE. */
	public static final String CONSULTAR_DETALLE_CHOFER_RESPONSE = "CONSULTAR_DETALLE_CHOFERResponse";

	/** The Constant CONSULTAR_LISTA_CHOFERES. */
	public static final String CONSULTAR_LISTA_CHOFERES = "CONSULTAR_CHOFERES";

	/** The Constant CONSULTAR_LISTA_CHOFERES_RESPONSE. */
	public static final String CONSULTAR_LISTA_CHOFERES_RESPONSE = "CONSULTAR_CHOFERESResponse";

	/** The Constant CREAR_ACTUALIZAR_CHOFER. */
	public static final String CREAR_CHOFER = "CREAR_CHOFER";

	/** The Constant CREAR_ACTUALIZAR_CHOFER_RESPONSE. */
	public static final String CREAR_CHOFER_RESPONSE = "CREAR_CHOFERResponse";

	/** The Constant CONSULTAR_VENDEDORES. */
	public static final String CONSULTAR_VENDEDORES = "CONSULTAR_VENDEDORES";

	/** The Constant CONSULTAR_VENDEDORES_RESPONSE. */
	public static final String CONSULTAR_VENDEDORES_RESPONSE = "CONSULTAR_VENDEDORESResponse";
	
	/** The Constant CONSULTAR_CLIENTES. */
	public static final String CONSULTAR_CLIENTES = "CONSULTAR_CLIENTES";
	
	/** The Constant CONSULTAR_CLIENTES_RESPONSE. */
	public static final String CONSULTAR_CLIENTES_RESPONSE = "CONSULTAR_CLIENTESResponse";
	
	/** The Constant CONSULTAR_DETALLE_CLIENTES. */
	public static final String CONSULTAR_DETALLE_CLIENTES = "CONSULTAR_DETALLE_CLIENTES";
	
	/** The Constant CONSULTAR_DETALLE_CLIENTES_RESPONSE. */
	public static final String CONSULTAR_DETALLE_CLIENTES_RESPONSE = "CONSULTAR_DETALLE_CLIENTESResponse";
	
	/** The Constant CREAR_TRANSPORTE. */
	public static final String CREAR_TRANSPORTE = "CREAR_TRANSPORTE";

	/** The Constant CREAR_TRANSPORTE_RESPONSE. */
	public static final String CREAR_TRANSPORTE_RESPONSE = "CREAR_TRANSPORTEResponse";
	
	/** The Constant CONSULTAR_TRANSPORTES. */
	public static final String CONSULTAR_TRANSPORTES = "CONSULTAR_TRANSPORTES";
	
	/** The Constant CONSULTAR_TRANSPORTES_RESPONSE. */
	public static final String CONSULTAR_TRANSPORTES_RESPONSE = "CONSULTAR_TRANSPORTESResponse";
	
	public static final String ASOCIAR_CHOFER_TRANSPORTES = "ASOCIAR_CHOFER_TRANSPORTES";

	public static final String ASOCIAR_CHOFER_TRANSPORTES_RESPONSE = "ASOCIAR_CHOFER_TRANSPORTESResponse";

	/**
	 * Consultar localizaciones.
	 *
	 * @param headerEntrada the param header entrada bean
	 * @return the consultar localizaciones reponse
	 */
	@WebResult(name="CONSULTAR_LOCALIZACIONESResponse", targetNamespace="FASTENERS_SERVICES_API")
	@WebMethod(operationName="CONSULTAR_LOCALIZACIONES", action="CONSULTAR_LOCALIZACIONES")
	@RequestWrapper(localName="CONSULTAR_LOCALIZACIONES", targetNamespace="FASTENERS_SERVICES_API", className="")
	@ResponseWrapper(localName="CONSULTAR_LOCALIZACIONESResponse", targetNamespace="FASTENERS_SERVICES_API", className="")
	public ConsultarLocalizacionesReponse consultarLocalizaciones(@WebParam(name="HEADER_ENTRADA", targetNamespace="FASTENERS_SERVICES_API") HeaderEntradaBean headerEntrada);

	/**
	 * Consultar localizacion documento.
	 *
	 * @param headerEntrada the param header entrada bean
	 * @param bodyEntrada the param body entrada consultar localizacion documento bean
	 * @return the consultar localizacion documento response
	 */
	@WebResult(name="CONSULTAR_LOCALIZACION_DOCUMENTOResponse", targetNamespace="FASTENERS_SERVICES_API")
	@WebMethod(operationName="CONSULTAR_LOCALIZACION_DOCUMENTO", action="CONSULTAR_LOCALIZACION_DOCUMENTO")
	@RequestWrapper(localName="CONSULTAR_LOCALIZACION_DOCUMENTO", targetNamespace="FASTENERS_SERVICES_API", className="")
	@ResponseWrapper(localName="CONSULTAR_LOCALIZACION_DOCUMENTOResponse", targetNamespace="FASTENERS_SERVICES_API", className="")
	public ConsultarLocalizacionDocumentoResponse consultarLocalizacionDocumento(@WebParam(name="HEADER_ENTRADA", targetNamespace="FASTENERS_SERVICES_API") HeaderEntradaBean headerEntrada, @WebParam(name="BODY_ENTRADA_CONSULTAR_LOCALIZACION_DOCUMENTO", targetNamespace="FASTENERS_SERVICES_API") BodyEntradaConsultarLocalizacionDocumentoBean bodyEntrada);

	/**
	 * Registrar localizacion documento.
	 *
	 * @param headerEntrada the param header entrada bean
	 * @param bodyEntrada the param body entrada registrar historico localizacion documento bean
	 * @return the header salida bean
	 */
	@WebResult(name="REGISTRAR_LOCALIZACION_DOCUMENTOResponse", targetNamespace="FASTENERS_SERVICES_API")
	@WebMethod(operationName="REGISTRAR_LOCALIZACION_DOCUMENTO", action="REGISTRAR_LOCALIZACION_DOCUMENTO")
	@RequestWrapper(localName="REGISTRAR_LOCALIZACION_DOCUMENTO", targetNamespace="FASTENERS_SERVICES_API", className="")
	@ResponseWrapper(localName="REGISTRAR_LOCALIZACION_DOCUMENTOResponse", targetNamespace="FASTENERS_SERVICES_API", className="")
	public HeaderSalidaBean registrarLocalizacionDocumento(@WebParam(name="HEADER_ENTRADA", targetNamespace="FASTENERS_SERVICES_API") HeaderEntradaBean headerEntrada, @WebParam(name="BODY_ENTRADA_REGISTRAR_LOCALIZACION_DOCUMENTO", targetNamespace="FASTENERS_SERVICES_API") BodyEntradaRegistrarHistoricoLocalizacionDocumentoBean bodyEntrada);

	/**
	 * Consultar lista responsables.
	 *
	 * @param headerEntrada the param header entrada bean
	 * @return the consultar lista responsables response
	 */
	@WebResult(name="CONSULTAR_LISTA_RESPONSABLESResponse", targetNamespace="FASTENERS_SERVICES_API")
	@WebMethod(operationName="CONSULTAR_LISTA_RESPONSABLES", action="CONSULTAR_LISTA_RESPONSABLES")
	@RequestWrapper(localName="CONSULTAR_LISTA_RESPONSABLES", targetNamespace="FASTENERS_SERVICES_API", className="")
	@ResponseWrapper(localName="CONSULTAR_LISTA_RESPONSABLESResponse", targetNamespace="FASTENERS_SERVICES_API", className="")
	public ConsultarListaResponsablesResponse consultarListaResponsables(@WebParam(name="HEADER_ENTRADA", targetNamespace="FASTENERS_SERVICES_API") HeaderEntradaBean headerEntrada);

	/**
	 * Registrar responsable.
	 *
	 * @param headerEntrada the param header entrada bean
	 * @param bodyEntrada the param body entrada registrar responsable bean
	 * @return the header salida bean
	 */
	@WebResult(name="REGISTRAR_RESPONSABLEResponse", targetNamespace="FASTENERS_SERVICES_API")
	@WebMethod(operationName="REGISTRAR_RESPONSABLE", action="REGISTRAR_RESPONSABLE")
	@RequestWrapper(localName="REGISTRAR_RESPONSABLE", targetNamespace="FASTENERS_SERVICES_API", className="")
	@ResponseWrapper(localName="REGISTRAR_RESPONSABLEResponse", targetNamespace="FASTENERS_SERVICES_API", className="")
	public HeaderSalidaBean registrarResponsable(@WebParam(name="HEADER_ENTRADA", targetNamespace="FASTENERS_SERVICES_API") HeaderEntradaBean headerEntrada, @WebParam(name="BODY_ENTRADA_REGISTRAR_RESPONSABLE", targetNamespace="FASTENERS_SERVICES_API") BodyEntradaRegistrarResponsableBean bodyEntrada);

	/**
	 * Consultar detalle documento.
	 *
	 * @param headerEntrada the param header entrada bean
	 * @param bodyEntrada the param body entrada consultar detalle documento bean
	 * @return the consultar detalle documento response
	 */
	@WebResult(name="CONSULTAR_DETALLE_DOCUMENTOResponse", targetNamespace="FASTENERS_SERVICES_API")
	@WebMethod(operationName="CONSULTAR_DETALLE_DOCUMENTO", action="CONSULTAR_DETALLE_DOCUMENTO")
	@RequestWrapper(localName="CONSULTAR_DETALLE_DOCUMENTO", targetNamespace="FASTENERS_SERVICES_API", className="")
	@ResponseWrapper(localName="CONSULTAR_DETALLE_DOCUMENTOResponse", targetNamespace="FASTENERS_SERVICES_API", className="")
	public ConsultarDetalleDocumentoResponse consultarDetalleDocumento(@WebParam(name="HEADER_ENTRADA", targetNamespace="FASTENERS_SERVICES_API") HeaderEntradaBean headerEntrada, @WebParam(name="BODY_ENTRADA_CONSULTAR_DETALLE_DOCUMENTO", targetNamespace="FASTENERS_SERVICES_API") BodyEntradaConsultarDetalleDocumentoBean bodyEntrada);

	/**
	 * Consultar detalle chofer.
	 *
	 * @param headerEntrada the param header entrada bean
	 * @param bodyEntrada the param body entrada consultar chofer bean
	 * @return the consultar chofer response
	 */
	@WebResult(name="CONSULTAR_DETALLE_CHOFERResponse", targetNamespace="FASTENERS_SERVICES_API")
	@WebMethod(operationName="CONSULTAR_DETALLE_CHOFER", action="CONSULTAR_DETALLE_CHOFER")
	@RequestWrapper(localName="CONSULTAR_DETALLE_CHOFER", targetNamespace="FASTENERS_SERVICES_API", className="")
	@ResponseWrapper(localName="CONSULTAR_DETALLE_CHOFERResponse", targetNamespace="FASTENERS_SERVICES_API", className="")
	public ConsultarChoferResponse consultarDetalleChofer(@WebParam(name="HEADER_ENTRADA", targetNamespace="FASTENERS_SERVICES_API") HeaderEntradaBean headerEntrada, @WebParam(name="BODY_ENTRADA_CONSULTAR_DETALLE_CHOFER", targetNamespace="FASTENERS_SERVICES_API") BodyEntradaConsultarChoferBean bodyEntrada);

	/**
	 * Consultar choferes.
	 *
	 * @param headerEntrada the param header entrada bean
	 * @return the consultar choferes response
	 */
	@WebResult(name="CONSULTAR_CHOFERESResponse", targetNamespace="FASTENERS_SERVICES_API")
	@WebMethod(operationName="CONSULTAR_CHOFERES", action="CONSULTAR_CHOFERES")
	@RequestWrapper(localName="CONSULTAR_CHOFERES", targetNamespace="FASTENERS_SERVICES_API", className="")
	@ResponseWrapper(localName="CONSULTAR_CHOFERESResponse", targetNamespace="FASTENERS_SERVICES_API", className="")
	public ConsultarChoferesResponse consultarChoferes(@WebParam(name="HEADER_ENTRADA", targetNamespace="FASTENERS_SERVICES_API") HeaderEntradaBean headerEntrada);

	/**
	 * Crear actualizar chofer.
	 *
	 * @param headerEntrada the param header entrada bean
	 * @param bodyEntrada the param body entrada crear actualizar chofer bean
	 * @return the header salida bean
	 */
	@WebResult(name="CREAR_CHOFERResponse", targetNamespace="FASTENERS_SERVICES_API")
	@WebMethod(operationName="CREAR_CHOFER", action="CREAR_CHOFER")
	@RequestWrapper(localName="CREAR_CHOFER", targetNamespace="FASTENERS_SERVICES_API", className="")
	@ResponseWrapper(localName="CREAR_CHOFERResponse", targetNamespace="FASTENERS_SERVICES_API", className="")
	public HeaderSalidaBean crearChofer(@WebParam(name="HEADER_ENTRADA", targetNamespace="FASTENERS_SERVICES_API") HeaderEntradaBean headerEntrada, @WebParam(name="BODY_ENTRADA_CREAR_CHOFER", targetNamespace="FASTENERS_SERVICES_API") BodyEntradaCrearChoferBean bodyEntrada);

	/**
	 * Consultar vendedores.
	 *
	 * @param headerEntrada the param header entrada bean
	 * @return the consultar vendedores response
	 */
	@WebResult(name="CONSULTAR_VENDEDORESResponse", targetNamespace="FASTENERS_SERVICES_API")
	@WebMethod(operationName="CONSULTAR_VENDEDORES", action="CONSULTAR_VENDEDORES")
	@RequestWrapper(localName="CONSULTAR_VENDEDORES", targetNamespace="FASTENERS_SERVICES_API", className="")
	@ResponseWrapper(localName="CONSULTAR_VENDEDORESResponse", targetNamespace="FASTENERS_SERVICES_API", className="")
	public ConsultarVendedoresResponse consultarVendedores(@WebParam(name="HEADER_ENTRADA", targetNamespace="FASTENERS_SERVICES_API") HeaderEntradaBean headerEntrada);


	/**
	 * Consultar clientes.
	 *
	 * @param headerEntrada the header entrada
	 * @return the consultar clientes response bean
	 */
	@WebResult(name=CONSULTAR_CLIENTES_RESPONSE, targetNamespace="FASTENERS_SERVICES_API")
	@WebMethod(operationName=CONSULTAR_CLIENTES, action=CONSULTAR_CLIENTES)
	@RequestWrapper(localName=CONSULTAR_CLIENTES, targetNamespace="FASTENERS_SERVICES_API", className="")
	@ResponseWrapper(localName=CONSULTAR_CLIENTES_RESPONSE, targetNamespace="FASTENERS_SERVICES_API", className="")
	public ConsultarClientesResponseBean consultarClientes(@WebParam(name="HEADER_ENTRADA", targetNamespace="FASTENERS_SERVICES_API") HeaderEntradaBean headerEntrada);

	/**
	 * Consultar detalle cliente.
	 *
	 * @param headerEntrada the header entrada
	 * @param bodyEntrada the body entrada
	 * @return the consultar cliente response bean
	 */
	@WebResult(name=CONSULTAR_DETALLE_CLIENTES_RESPONSE, targetNamespace=TARGET_NAMESPACE)
	@WebMethod(operationName=CONSULTAR_DETALLE_CLIENTES, action=CONSULTAR_DETALLE_CLIENTES)
	@RequestWrapper(localName=CONSULTAR_DETALLE_CLIENTES, targetNamespace=TARGET_NAMESPACE, className="")
	@ResponseWrapper(localName=CONSULTAR_DETALLE_CLIENTES_RESPONSE, targetNamespace=TARGET_NAMESPACE, className="")
	public ConsultarClienteResponseBean consultarDetalleCliente(@WebParam(name="HEADER_ENTRADA", targetNamespace="FASTENERS_SERVICES_API") HeaderEntradaBean headerEntrada, @WebParam(name="BODY_ENTRADA_CONSULTAR_DETALLE_CLIENTE", targetNamespace="FASTENERS_SERVICES_API") BodyEntradaConsultaClienteBean bodyEntrada);
	
	/**
	 * Crear transporte.
	 *
	 * @param headerEntrada the header entrada
	 * @param bodyEntrada the body entrada
	 * @return the header salida bean
	 */
	@WebResult(name=CREAR_TRANSPORTE_RESPONSE, targetNamespace=TARGET_NAMESPACE)
	@WebMethod(operationName=CREAR_TRANSPORTE, action=CREAR_TRANSPORTE)
	@RequestWrapper(localName=CREAR_TRANSPORTE, targetNamespace=TARGET_NAMESPACE, className="")
	@ResponseWrapper(localName=CREAR_TRANSPORTE_RESPONSE, targetNamespace=TARGET_NAMESPACE, className="")
	public HeaderSalidaBean crearTransporte(@WebParam(name=HeaderEntradaBean.HEADER_ENTRADA, targetNamespace=TARGET_NAMESPACE) HeaderEntradaBean headerEntrada, @WebParam(name=BodyEntradaCrearTransporteBean.BODY_ENTRADA_NAME, targetNamespace=TARGET_NAMESPACE) BodyEntradaCrearTransporteBean bodyEntrada);
	
	/**
	 * Consultar transportes.
	 *
	 * @param headerEntrada the header entrada
	 * @return the consultar transportes response
	 */
	@WebResult(name=CONSULTAR_TRANSPORTES_RESPONSE, targetNamespace=TARGET_NAMESPACE)
	@WebMethod(operationName=CONSULTAR_TRANSPORTES, action=CONSULTAR_TRANSPORTES)
	@RequestWrapper(localName=CONSULTAR_TRANSPORTES, targetNamespace=TARGET_NAMESPACE, className="")
	@ResponseWrapper(localName=CONSULTAR_TRANSPORTES_RESPONSE, targetNamespace=TARGET_NAMESPACE, className="")
	public ConsultarTransportesResponse consultarTransportes(@WebParam(name=HeaderEntradaBean.HEADER_ENTRADA, targetNamespace=TARGET_NAMESPACE) HeaderEntradaBean headerEntrada);
	
	/**
	 * Asociar chofer transportes.
	 *
	 * @param headerEntrada the header entrada
	 * @param bodyEntrada the body entrada
	 * @return the header salida bean
	 */
	@WebResult(name=ASOCIAR_CHOFER_TRANSPORTES_RESPONSE, targetNamespace=TARGET_NAMESPACE)
	@WebMethod(operationName=ASOCIAR_CHOFER_TRANSPORTES, action=ASOCIAR_CHOFER_TRANSPORTES)
	@RequestWrapper(localName=ASOCIAR_CHOFER_TRANSPORTES, targetNamespace=TARGET_NAMESPACE, className="")
	@ResponseWrapper(localName=ASOCIAR_CHOFER_TRANSPORTES_RESPONSE, targetNamespace=TARGET_NAMESPACE, className="")
	public HeaderSalidaBean asociarChoferTransportes(@WebParam(name=HeaderEntradaBean.HEADER_ENTRADA, targetNamespace=TARGET_NAMESPACE) HeaderEntradaBean headerEntrada, @WebParam(name=BodyEntradaAsociarChoferTransportesBean.BODY_ENTRADA_NAME, targetNamespace=TARGET_NAMESPACE) BodyEntradaAsociarChoferTransportesBean bodyEntrada);
	
}