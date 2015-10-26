package org.jllinares.api.panama.fasteners.service;

import java.util.Date;
import java.util.List;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import org.jdjf.commons.config.Logeable;
import org.jllinares.api.panama.fasteners.commons.AppConstans;
import org.jllinares.api.panama.fasteners.commons.ServiceConstans;
import org.jllinares.api.panama.fasteners.dao.ManagerServiceDAO;
import org.jllinares.api.panama.fasteners.service.beans.BodyEntradaAsociarChoferTransportesBean;
import org.jllinares.api.panama.fasteners.service.beans.BodyEntradaConsultaClienteBean;
import org.jllinares.api.panama.fasteners.service.beans.BodyEntradaConsultarChoferBean;
import org.jllinares.api.panama.fasteners.service.beans.BodyEntradaConsultarDetalleDocumentoBean;
import org.jllinares.api.panama.fasteners.service.beans.BodyEntradaConsultarLocalizacionDocumentoBean;
import org.jllinares.api.panama.fasteners.service.beans.BodyEntradaCrearChoferBean;
import org.jllinares.api.panama.fasteners.service.beans.BodyEntradaCrearTransporteBean;
import org.jllinares.api.panama.fasteners.service.beans.BodyEntradaRegistrarHistoricoLocalizacionDocumentoBean;
import org.jllinares.api.panama.fasteners.service.beans.BodyEntradaRegistrarResponsableBean;
import org.jllinares.api.panama.fasteners.service.beans.BodySalidaConsultarChoferBean;
import org.jllinares.api.panama.fasteners.service.beans.BodySalidaConsultarChoferesBean;
import org.jllinares.api.panama.fasteners.service.beans.BodySalidaConsultarClientesBean;
import org.jllinares.api.panama.fasteners.service.beans.BodySalidaConsultarDetalleClienteBean;
import org.jllinares.api.panama.fasteners.service.beans.BodySalidaConsultarDetalleDocumentoBean;
import org.jllinares.api.panama.fasteners.service.beans.BodySalidaConsultarLocalizacionDocumentoBean;
import org.jllinares.api.panama.fasteners.service.beans.BodySalidaConsultarLocalizacionesBean;
import org.jllinares.api.panama.fasteners.service.beans.BodySalidaConsultarResponsablesBean;
import org.jllinares.api.panama.fasteners.service.beans.BodySalidaConsultarTransportesBean;
import org.jllinares.api.panama.fasteners.service.beans.BodySalidaConsultarVendedoresBean;
import org.jllinares.api.panama.fasteners.service.beans.ChoferBean;
import org.jllinares.api.panama.fasteners.service.beans.ChoferTransporteBean;
import org.jllinares.api.panama.fasteners.service.beans.ClienteBean;
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
import org.jllinares.api.panama.fasteners.service.beans.DetalleDocumentoBean;
import org.jllinares.api.panama.fasteners.service.beans.DocumentoBean;
import org.jllinares.api.panama.fasteners.service.beans.HeaderEntradaBean;
import org.jllinares.api.panama.fasteners.service.beans.HeaderSalidaBean;
import org.jllinares.api.panama.fasteners.service.beans.HistoricoDocumentoLocalizacionBean;
import org.jllinares.api.panama.fasteners.service.beans.LocalizacionBean;
import org.jllinares.api.panama.fasteners.service.beans.ResponsableBean;
import org.jllinares.api.panama.fasteners.service.beans.TrackingBean;
import org.jllinares.api.panama.fasteners.service.beans.TransporteBean;
import org.jllinares.api.panama.fasteners.service.beans.TransporteDetalleBean;
import org.jllinares.api.panama.fasteners.service.beans.VendedorBean;
import org.jllinares.api.panama.fasteners.utils.LoadConfigurationUtils;
import org.jllinares.api.panama.fasteners.utils.ServicesUtils;

// TODO: Auto-generated Javadoc
/**
 * The Class ManagerAPIServiceImpl.
 */
@WebService(targetNamespace="FASTENERS_SERVICES_API", serviceName="FASTENERS_SERVICES_APIService", portName="FASTENERS_SERVICES_APIPort")
@SOAPBinding(style=SOAPBinding.Style.DOCUMENT, use=SOAPBinding.Use.LITERAL)
@SuppressWarnings("unchecked")
public class ManagerAPIServiceImpl implements ManagerAPIService, Logeable {

	/* (non-Javadoc)
	 * @see org.jllinares.api.panama.fasteners.service.ManagerAPIService#consultarLocalizaciones(org.jllinares.api.panama.fasteners.service.beans.HeaderEntradaBean)
	 */
	public ConsultarLocalizacionesReponse consultarLocalizaciones(HeaderEntradaBean headerEntrada)
	{
		ConsultarLocalizacionesReponse response = new ConsultarLocalizacionesReponse();
		LOGGER_INFO.info("Peticion al metodo CONSULTAR_LOCALIZACIONES recibida");
		HeaderSalidaBean headerSalida = new HeaderSalidaBean();
		BodySalidaConsultarLocalizacionesBean bodySalida = new BodySalidaConsultarLocalizacionesBean();
		List<LocalizacionBean> localizaciones = null;
		ManagerServiceDAO dao = LoadConfigurationUtils.getRegisterDB();
		ServicesUtils utils = new ServicesUtils();

		if (dao.isConnected()) {
			localizaciones = (List<LocalizacionBean>) dao.obtenerInstancias(new StringBuilder().append(AppConstans.NAMESPACE_UTIL.getValue()).append("ObtenerLocalizaciones").toString());

			if ((localizaciones == null) || (localizaciones.size() <= 0)) {
				LOGGER_INFO.info("Lista consultada no retorna valores");
				headerSalida = utils.setHeaderSalidaWithError(headerSalida, ServiceConstans.TYPE_MSJ_INFO.getValue(), ServiceConstans.CODE_LIST_EMPTY.getValue(), ServiceConstans.MSJ_LIST_EMPTY.getValue());
			}
		}
		else
		{
			setHeaderSalidaSinConexion(headerSalida, utils);
		}

		bodySalida.setLocalizaciones(localizaciones);
		response.setBodySalida(bodySalida);
		response.setHeaderSalida(headerSalida);

		return response;
	}


	/* (non-Javadoc)
	 * @see org.jllinares.api.panama.fasteners.service.ManagerAPIService#consultarLocalizacionDocumento(org.jllinares.api.panama.fasteners.service.beans.HeaderEntradaBean, org.jllinares.api.panama.fasteners.service.beans.BodyEntradaConsultarLocalizacionDocumentoBean)
	 */
	public ConsultarLocalizacionDocumentoResponse consultarLocalizacionDocumento(HeaderEntradaBean headerEntrada, BodyEntradaConsultarLocalizacionDocumentoBean bodyEntrada)
	{
		ConsultarLocalizacionDocumentoResponse response = new ConsultarLocalizacionDocumentoResponse();
		LOGGER_INFO.info("Peticion al metodo CONSULTAR_LOCALIZACION_DOCUMENTO recibida");
		HeaderSalidaBean headerSalida = new HeaderSalidaBean();
		BodySalidaConsultarLocalizacionDocumentoBean bodySalida = new BodySalidaConsultarLocalizacionDocumentoBean();
		ManagerServiceDAO dao = LoadConfigurationUtils.getRegisterDB();
		ServicesUtils utils = new ServicesUtils();

		if (dao.isConnected()) {
			DocumentoBean documento = new DocumentoBean();
			documento.setNumeroDocumento(bodyEntrada.getNumeroDocumento());
			bodySalida.setHistorico((List<HistoricoDocumentoLocalizacionBean>) dao.obtenerInstanciasWithFilter(new StringBuilder().append(AppConstans.NAMESPACE_UTIL.getValue()).append("ObtenerHistoricoLocalizacion").toString(), documento));
		}
		else
		{
			setHeaderSalidaSinConexion(headerSalida, utils);
		}

		response.setBodySalida(bodySalida);
		response.setHeaderSalida(headerSalida);

		return response;
	}

	/* (non-Javadoc)
	 * @see org.jllinares.api.panama.fasteners.service.ManagerAPIService#registrarLocalizacionDocumento(org.jllinares.api.panama.fasteners.service.beans.HeaderEntradaBean, org.jllinares.api.panama.fasteners.service.beans.BodyEntradaRegistrarHistoricoLocalizacionDocumentoBean)
	 */
	public HeaderSalidaBean registrarLocalizacionDocumento(HeaderEntradaBean headerEntrada, BodyEntradaRegistrarHistoricoLocalizacionDocumentoBean bodyEntrada)
	{
		LOGGER_INFO.info("Peticion al metodo REGISTRAR_LOCALIZACION_DOCUMENTO recibida");
		HeaderSalidaBean headerSalida = new HeaderSalidaBean();
		ManagerServiceDAO dao = LoadConfigurationUtils.getRegisterDB();
		ServicesUtils utils = new ServicesUtils();

		if (dao.isConnected()) {
			TrackingBean track = new TrackingBean();
			track.setCodigoCliente(bodyEntrada.getCodigoCliente());
			track.setCodigoLocalizacion(bodyEntrada.getCodigoLocalizacion());
			track.setFechaRegistro(new Date());
			track.setNumeroDocumento(bodyEntrada.getNumeroDocumento());
			track.setTipoDocumento(bodyEntrada.getTipoDocumento());

			if (dao.insertarInstancia(new StringBuilder().append(AppConstans.NAMESPACE_UTIL.getValue()).append("RegistrarTracking").toString(), track) <= 0) {
				headerSalida = utils.setHeaderSalidaWithError(headerSalida, ServiceConstans.TYPE_MSJ_INFO.getValue(), ServiceConstans.CODE_NOT_REGISTER.getValue(), ServiceConstans.MSJ_NOT_REGISTER.getValue());
			}
		}
		else
		{
			setHeaderSalidaSinConexion(headerSalida, utils);
		}

		return headerSalida;
	}

	/* (non-Javadoc)
	 * @see org.jllinares.api.panama.fasteners.service.ManagerAPIService#registrarResponsable(org.jllinares.api.panama.fasteners.service.beans.HeaderEntradaBean, org.jllinares.api.panama.fasteners.service.beans.BodyEntradaRegistrarResponsableBean)
	 */
	public HeaderSalidaBean registrarResponsable(HeaderEntradaBean headerEntrada, BodyEntradaRegistrarResponsableBean bodyEntrada)
	{
		LOGGER_INFO.info("Peticion al metodo REGISTRAR_RESPONSABLE recibida");
		HeaderSalidaBean headerSalida = new HeaderSalidaBean();
		ManagerServiceDAO dao = LoadConfigurationUtils.getRegisterDB();
		ServicesUtils utils = new ServicesUtils();

		if (dao.isConnected()) {
			ResponsableBean responsable = new ResponsableBean();
			responsable.setNombre(bodyEntrada.getNombre());

			if (dao.insertarInstancia(new StringBuilder().append(AppConstans.NAMESPACE_UTIL.getValue()).append("RegistrarResponsable").toString(), responsable) <= 0) {
				headerSalida = utils.setHeaderSalidaWithError(headerSalida, ServiceConstans.TYPE_MSJ_INFO.getValue(), ServiceConstans.CODE_NOT_REGISTER.getValue(), ServiceConstans.MSJ_NOT_REGISTER.getValue());
			}
		}
		else
		{
			setHeaderSalidaSinConexion(headerSalida, utils);
		}

		return headerSalida;
	}

	/* (non-Javadoc)
	 * @see org.jllinares.api.panama.fasteners.service.ManagerAPIService#consultarListaResponsables(org.jllinares.api.panama.fasteners.service.beans.HeaderEntradaBean)
	 */
	public ConsultarListaResponsablesResponse consultarListaResponsables(HeaderEntradaBean headerEntrada)
	{
		ConsultarListaResponsablesResponse response = new ConsultarListaResponsablesResponse();
		LOGGER_INFO.info("Peticion al metodo CONSULTAR_LISTA_RESPONSABLES recibida");
		HeaderSalidaBean headerSalida = new HeaderSalidaBean();
		BodySalidaConsultarResponsablesBean bodySalida = new BodySalidaConsultarResponsablesBean();
		List<ResponsableBean> responsables = null;
		ManagerServiceDAO dao = LoadConfigurationUtils.getRegisterDB();
		ServicesUtils utils = new ServicesUtils();

		if (dao.isConnected()) {
			responsables = (List<ResponsableBean>) dao.obtenerInstancias(new StringBuilder().append(AppConstans.NAMESPACE_UTIL.getValue()).append("ObtenerListaResponbables").toString());

			if ((responsables == null) || (responsables.size() <= 0)) {
				LOGGER_INFO.info("Lista consultada no retorna valores");
				headerSalida = utils.setHeaderSalidaWithError(headerSalida, ServiceConstans.TYPE_MSJ_INFO.getValue(), ServiceConstans.CODE_LIST_EMPTY.getValue(), ServiceConstans.MSJ_LIST_EMPTY.getValue());
			}
		}
		else
		{
			setHeaderSalidaSinConexion(headerSalida, utils);
		}

		bodySalida.setResponsables(responsables);
		response.setBodySalida(bodySalida);
		response.setHeaderSalida(headerSalida);
		return response;
	}

	/* (non-Javadoc)
	 * @see org.jllinares.api.panama.fasteners.service.ManagerAPIService#consultarDetalleDocumento(org.jllinares.api.panama.fasteners.service.beans.HeaderEntradaBean, org.jllinares.api.panama.fasteners.service.beans.BodyEntradaConsultarDetalleDocumentoBean)
	 */
	public ConsultarDetalleDocumentoResponse consultarDetalleDocumento(HeaderEntradaBean headerEntrada, BodyEntradaConsultarDetalleDocumentoBean bodyEntrada)
	{
		ConsultarDetalleDocumentoResponse response = new ConsultarDetalleDocumentoResponse();
		LOGGER_INFO.info("Peticion al metodo CONSULTAR_DETALLE_DOCUMENTO recibida");
		HeaderSalidaBean headerSalida = new HeaderSalidaBean();
		BodySalidaConsultarDetalleDocumentoBean bodySalida = new BodySalidaConsultarDetalleDocumentoBean();
		ManagerServiceDAO dao = LoadConfigurationUtils.getRegisterDB();
		ServicesUtils utils = new ServicesUtils();
		List<DetalleDocumentoBean> list = null;
		DocumentoBean document = new DocumentoBean();

		if (dao.isConnected()) {
			document.setNumeroDocumento(bodyEntrada.getNumeroDocumento());

			list = (List<DetalleDocumentoBean>) dao.obtenerInstanciasWithFilter(new StringBuilder().append(AppConstans.NAMESPACE_UTIL.getValue()).append("ConsultarDetalleDocumento").toString(), document);

			if ((list == null) || (list.size() <= 0)) {
				LOGGER_INFO.info("No se ha encontrado el documento seleccionado");
				headerSalida = utils.setHeaderSalidaWithError(headerSalida, ServiceConstans.TYPE_MSJ_INFO.getValue(), ServiceConstans.CODE_LIST_EMPTY.getValue(), ServiceConstans.MSJ_LIST_EMPTY.getValue());
			}
			else
			{
				DetalleDocumentoBean detalle = new DetalleDocumentoBean();
				detalle.setTipoDocumento(list.get(0).getTipoDocumento());
				detalle.setCodigoCliente(list.get(0).getCodigoCliente());
				detalle.setAnulado(list.get(0).isAnulado());
				detalle.setFechaEmision(list.get(0).getFechaEmision());
				detalle.setMovimiento(list.get(0).getMovimiento());
				detalle.setAutomatico(list.get(0).isAutomatico());
				detalle.setNumeroControl(list.get(0).getNumeroControl());
				detalle.setContribuyente(list.get(0).isContribuyente());
				detalle.setFechaVencimiento(list.get(0).getFechaVencimiento());
				detalle.setObservaciones(list.get(0).getObservaciones());
				detalle.setDocumentoOrigen(list.get(0).getDocumentoOrigen());
				detalle.setNumeroOrigen(list.get(0).getNumeroOrigen());
				detalle.setCodigoBanco(list.get(0).getCodigoBanco());
				detalle.setNumeroCheque(list.get(0).getNumeroCheque());
				detalle.setCodigoVencimiento(list.get(0).getCodigoVencimiento());
				detalle.setTipo(list.get(0).getTipo());
				detalle.setTasa(list.get(0).getTasa());
				detalle.setMoneda(list.get(0).getMoneda());
				detalle.setMontoImpuesto(list.get(0).getMontoImpuesto());
				detalle.setMontoGeneral(list.get(0).getMontoGeneral());
				detalle.setMontoA1(list.get(0).getMontoA1());
				detalle.setMontoA2(list.get(0).getMontoA2());
				detalle.setMontoBruto(list.get(0).getMontoBruto());
				detalle.setDescuentos(list.get(0).getDescuentos());
				detalle.setMontoDescuentos(list.get(0).getMontoDescuentos());
				detalle.setRecargos(list.get(0).getRecargos());
				detalle.setMontoRecargos(list.get(0).getMontoRecargos());
				detalle.setMontoOtros(list.get(0).getMontoOtros());
				detalle.setMontoNeto(list.get(0).getMontoNeto());
				detalle.setSaldo(list.get(0).getSaldo());
				detalle.setFechaCompromiso(list.get(0).getFechaCompromiso());
				detalle.setNumeroCompromiso(list.get(0).getNumeroCompromiso());
				detalle.setComision1(list.get(0).getComision1());
				detalle.setComision2(list.get(0).getComision2());
				detalle.setComision3(list.get(0).getComision3());
				detalle.setComision4(list.get(0).getComision4());
				detalle.setAdicional(list.get(0).getAdicional());

				bodySalida.setDetalleDocumento(detalle);
			}
		}
		else
		{
			setHeaderSalidaSinConexion(headerSalida, utils);
		}

		response.setBodySalida(bodySalida);
		response.setHeaderSalida(headerSalida);
		return response;
	}

	/* (non-Javadoc)
	 * @see org.jllinares.api.panama.fasteners.service.ManagerAPIService#consultarDetalleChofer(org.jllinares.api.panama.fasteners.service.beans.HeaderEntradaBean, org.jllinares.api.panama.fasteners.service.beans.BodyEntradaConsultarChoferBean)
	 */
	public ConsultarChoferResponse consultarDetalleChofer(HeaderEntradaBean headerEntrada, BodyEntradaConsultarChoferBean bodyEntrada)
	{
		ConsultarChoferResponse response = new ConsultarChoferResponse();
		LOGGER_INFO.info("Peticion al metodo CONSULTAR_DETALLE_CHOFER recibida");

		HeaderSalidaBean headerSalida = new HeaderSalidaBean();
		BodySalidaConsultarChoferBean bodySalida = new BodySalidaConsultarChoferBean();
		List<ChoferBean> list = null;
		ManagerServiceDAO dao = LoadConfigurationUtils.getRegisterDB();
		ServicesUtils utils = new ServicesUtils();
		ChoferBean chofer = new ChoferBean();

		if (dao.isConnected()) {
			chofer.setId(bodyEntrada.getId());

			list = (List<ChoferBean>) dao.obtenerInstanciasWithFilter(new StringBuilder().append(AppConstans.NAMESPACE_UTIL.getValue()).append("ConsultarDetalleChofer").toString(), chofer);

			if ((list == null) || (list.size() <= 0)) {
				LOGGER_INFO.info("No se ha encontrado el chofer seleccionado");
				headerSalida = utils.setHeaderSalidaWithError(headerSalida, ServiceConstans.TYPE_MSJ_INFO.getValue(), ServiceConstans.CODE_LIST_EMPTY.getValue(), ServiceConstans.MSJ_LIST_EMPTY.getValue());
			}
			else
			{
				chofer.setName(list.get(0).getName());
				chofer.setApellido(list.get(0).getApellido());
				chofer.setCedula(list.get(0).getCedula());
				bodySalida.setChofer(chofer);
			}

		}
		else
		{
			setHeaderSalidaSinConexion(headerSalida, utils);
		}

		response.setBodySalida(bodySalida);
		response.setHeaderSalida(headerSalida);
		return response;
	}

	/* (non-Javadoc)
	 * @see org.jllinares.api.panama.fasteners.service.ManagerAPIService#consultarChoferes(org.jllinares.api.panama.fasteners.service.beans.HeaderEntradaBean)
	 */
	public ConsultarChoferesResponse consultarChoferes(HeaderEntradaBean headerEntrada)
	{
		ConsultarChoferesResponse response = new ConsultarChoferesResponse();
		LOGGER_INFO.info("Peticion al metodo CONSULTAR_CHOFERES recibida");
		HeaderSalidaBean headerSalida = new HeaderSalidaBean();
		BodySalidaConsultarChoferesBean bodySalida = new BodySalidaConsultarChoferesBean();
		List<ChoferBean> list = null;
		ManagerServiceDAO dao = LoadConfigurationUtils.getRegisterDB();
		ServicesUtils utils = new ServicesUtils();

		if (dao.isConnected()) {
			list = (List<ChoferBean>) dao.obtenerInstancias(new StringBuilder().append(AppConstans.NAMESPACE_UTIL.getValue()).append("ConsultarChoferes").toString());

			if ((list == null) || (list.size() <= 0)) {
				LOGGER_INFO.info("No se ha encontrado la lista de choferes");
				headerSalida = utils.setHeaderSalidaWithError(headerSalida, ServiceConstans.TYPE_MSJ_INFO.getValue(), ServiceConstans.CODE_LIST_EMPTY.getValue(), ServiceConstans.MSJ_LIST_EMPTY.getValue());
			}
			else
			{
				bodySalida.setChoferes(list);
			}
		}
		else
		{
			setHeaderSalidaSinConexion(headerSalida, utils);
		}

		response.setBodySalida(bodySalida);
		response.setHeaderSalida(headerSalida);
		return response;
	}

	/* (non-Javadoc)
	 * @see org.jllinares.api.panama.fasteners.service.ManagerAPIService#crearChofer(org.jllinares.api.panama.fasteners.service.beans.HeaderEntradaBean, org.jllinares.api.panama.fasteners.service.beans.BodyEntradaCrearActualizarChoferBean)
	 */
	public HeaderSalidaBean crearChofer(HeaderEntradaBean headerEntrada, BodyEntradaCrearChoferBean bodyEntrada)
	{
		LOGGER_INFO.info("Peticion al metodo CREAR_ACTUALIZAR_CHOFER recibida");
		HeaderSalidaBean headerSalida = new HeaderSalidaBean();
		ManagerServiceDAO dao = LoadConfigurationUtils.getRegisterDB();
		ServicesUtils utils = new ServicesUtils();
		ChoferBean chofer = new ChoferBean();
		
		if (dao.isConnected()) {
			chofer.setName(bodyEntrada.getName());
			chofer.setApellido(bodyEntrada.getApellido());
			chofer.setCedula(bodyEntrada.getCedula());
			
			if(dao.insertarInstancia(new StringBuilder().append(AppConstans.NAMESPACE_UTIL.getValue()).append("CrearChofer").toString(), chofer)>0) {
				LOGGER_INFO.info("Se ha insertado al chofer con id " + chofer.getId());
			
				if(bodyEntrada.getTransportes() != null) {
					for(TransporteBean transporte : bodyEntrada.getTransportes()) {
						if(dao.insertarInstancia(new StringBuilder().append(AppConstans.NAMESPACE_UTIL.getValue()).append("CrearTransporte").toString(), transporte)>0) {
							LOGGER_INFO.info("Se ha insertado al transporte con id " + transporte.getId());
						
							if(dao.insertarInstancia(new StringBuilder().append(AppConstans.NAMESPACE_UTIL.getValue()).append("CrearChoferTransporte").toString(), new ChoferTransporteBean(chofer.getId(), transporte.getId()))>0) {
								LOGGER_INFO.info("Se ha insertado al chofer_transporte correctamente");				
							}
						}
					}
				}
			}
			
			else {
				LOGGER_ERROR.error("Se ha producido un error al momento de insertar al chofer ");
			}

		}
		
		else {
			setHeaderSalidaSinConexion(headerSalida, utils);
		}

		return headerSalida;
	}

	/* (non-Javadoc)
	 * @see org.jllinares.api.panama.fasteners.service.ManagerAPIService#consultarVendedores(org.jllinares.api.panama.fasteners.service.beans.HeaderEntradaBean)
	 */
	public ConsultarVendedoresResponse consultarVendedores(HeaderEntradaBean headerEntrada)
	{
		ConsultarVendedoresResponse response = new ConsultarVendedoresResponse();
		LOGGER_INFO.info("Peticion al metodo CONSULTAR_VENDEDORES recibida");
		HeaderSalidaBean headerSalida = new HeaderSalidaBean();
		BodySalidaConsultarVendedoresBean bodySalida = new BodySalidaConsultarVendedoresBean();
		List<VendedorBean> list = null;
		ManagerServiceDAO dao = LoadConfigurationUtils.getRegisterDB();
		ServicesUtils utils = new ServicesUtils();

		if (dao.isConnected()) {
			list = (List<VendedorBean>) dao.obtenerInstancias(new StringBuilder().append(AppConstans.NAMESPACE_UTIL.getValue()).append("ConsultarVendedores").toString());

			if ((list == null) || (list.size() <= 0)) {
				LOGGER_INFO.info("No se ha encontrado la lista de vendedores");
				headerSalida = utils.setHeaderSalidaWithError(headerSalida, ServiceConstans.TYPE_MSJ_INFO.getValue(), ServiceConstans.CODE_LIST_EMPTY.getValue(), ServiceConstans.MSJ_LIST_EMPTY.getValue());
			}
			else
			{
				bodySalida.setVendedores(list);
			}
		}
		else
		{
			setHeaderSalidaSinConexion(headerSalida, utils);
		}

		response.setBodySalida(bodySalida);
		response.setHeaderSalida(headerSalida);

		return response;
	}

	/* (non-Javadoc)
	 * @see org.jllinares.api.panama.fasteners.service.ManagerAPIService#consultarClientes(org.jllinares.api.panama.fasteners.service.beans.HeaderEntradaBean)
	 */
	@Override
	public ConsultarClientesResponseBean consultarClientes(HeaderEntradaBean headerEntrada) {
		LOGGER_INFO.info("Peticion al metodo " + CONSULTAR_CLIENTES + " recibida");
		ConsultarClientesResponseBean response = new ConsultarClientesResponseBean();
		HeaderSalidaBean headerSalida = new HeaderSalidaBean();
		BodySalidaConsultarClientesBean bodySalida = new BodySalidaConsultarClientesBean();
		List<ClienteBean> list = null;
		ManagerServiceDAO dao = LoadConfigurationUtils.getRegisterDB();
		ServicesUtils utils = new ServicesUtils();

		if (dao.isConnected()) {
			list = (List<ClienteBean>) dao.obtenerInstancias(new StringBuilder().append(AppConstans.NAMESPACE_UTIL.getValue()).append("ConsultarClientes").toString());

			if ((list == null) || (list.size() <= 0)) {
				LOGGER_INFO.info("No se ha encontrado la lista de clientes");
				headerSalida = utils.setHeaderSalidaWithError(headerSalida, ServiceConstans.TYPE_MSJ_INFO.getValue(), ServiceConstans.CODE_LIST_EMPTY.getValue(), ServiceConstans.MSJ_LIST_EMPTY.getValue());
			}

			else {
				bodySalida.setClientes(list);
			}
		}

		else {
			setHeaderSalidaSinConexion(headerSalida, utils);
		}

		response.setBodySalida(bodySalida);
		response.setHeaderSalida(headerSalida);
		return response;
	}

	/* (non-Javadoc)
	 * @see org.jllinares.api.panama.fasteners.service.ManagerAPIService#consultarDetalleCliente(org.jllinares.api.panama.fasteners.service.beans.HeaderEntradaBean, org.jllinares.api.panama.fasteners.service.beans.BodyEntradaConsultaClienteBean)
	 */
	@Override
	public ConsultarClienteResponseBean consultarDetalleCliente(HeaderEntradaBean headerEntrada, BodyEntradaConsultaClienteBean bodyEntrada) {
		LOGGER_INFO.info("Peticion al metodo " + CONSULTAR_DETALLE_CLIENTES + " recibida");

		ConsultarClienteResponseBean response = new ConsultarClienteResponseBean();
		HeaderSalidaBean headerSalida = new HeaderSalidaBean();
		BodySalidaConsultarDetalleClienteBean bodySalida = new BodySalidaConsultarDetalleClienteBean();
		ManagerServiceDAO dao = LoadConfigurationUtils.getRegisterDB();
		ServicesUtils utils = new ServicesUtils();
		List<ClienteBean> list = null;
		ClienteBean cliente = new ClienteBean();

		if (dao.isConnected()) {
			cliente.setCodigoCliente(bodyEntrada.getCodigoCliente());
			list = (List<ClienteBean>) dao.obtenerInstanciasWithFilter(new StringBuilder().append(AppConstans.NAMESPACE_UTIL.getValue()).append("ConsultarDetalleCliente").toString(), cliente);

			if ((list == null) || (list.size() <= 0)) {
				LOGGER_INFO.info("No se ha encontrado el cliente seleccionado");
				headerSalida = utils.setHeaderSalidaWithError(headerSalida, ServiceConstans.TYPE_MSJ_INFO.getValue(), ServiceConstans.CODE_LIST_EMPTY.getValue(), ServiceConstans.MSJ_LIST_EMPTY.getValue());
			}

			else {
				cliente.setDescripcion(list.get(0).getDescripcion());
				cliente.setDescuentoGlobal(list.get(0).getDescuentoGlobal());
				cliente.setDireccion(list.get(0).getDireccion());
				cliente.setEmail(list.get(0).getEmail());
				cliente.setFax(list.get(0).getFax());
				cliente.setFechaRegistro(list.get(0).getFechaRegistro());
				cliente.setRif(list.get(0).getRif());
				cliente.setTelefono(list.get(0).getTelefono());
				cliente.setTipoCliente(list.get(0).getTipoCliente());
				bodySalida.setCliente(cliente);
			}
		}

		else {
			setHeaderSalidaSinConexion(headerSalida, utils);
		}

		response.setBodySalida(bodySalida);
		response.setHeaderSalida(headerSalida);
		return response;
	}
	
	/* (non-Javadoc)
	 * @see org.jllinares.api.panama.fasteners.service.ManagerAPIService#crearTransporte(org.jllinares.api.panama.fasteners.service.beans.HeaderEntradaBean, org.jllinares.api.panama.fasteners.service.beans.BodyEntradaCrearTransporteBean)
	 */
	@Override
	public HeaderSalidaBean crearTransporte(HeaderEntradaBean headerEntrada, BodyEntradaCrearTransporteBean bodyEntrada) {
		LOGGER_INFO.info("Peticion al metodo " + CREAR_TRANSPORTE + " recibida");
		HeaderSalidaBean headerSalida = new HeaderSalidaBean();
		ManagerServiceDAO dao = LoadConfigurationUtils.getRegisterDB();
		ServicesUtils utils = new ServicesUtils();
		TransporteBean transporte = new TransporteBean();
		
		if (dao.isConnected()) {
			transporte.setColorCamion(bodyEntrada.getColor());
			transporte.setModeloCamion(bodyEntrada.getModelo());
			transporte.setPlacaCamion(bodyEntrada.getPlaca());
			
			if(dao.insertarInstancia(new StringBuilder().append(AppConstans.NAMESPACE_UTIL.getValue()).append("CrearTransporte").toString(), transporte)>0) {
				LOGGER_INFO.info("Se ha insertado al transporte con id " + transporte.getId());
			}
			
			else {
				LOGGER_ERROR.error("Se ha producido un error al momento de insertar al transporte");
				headerSalida = utils.setHeaderSalidaWithError(headerSalida, ServiceConstans.TYPE_MSJ_INFO.getValue(), ServiceConstans.CODE_NOT_REGISTER.getValue(), ServiceConstans.MSJ_NOT_REGISTER.getValue());
			}
		}
		
		else {
			setHeaderSalidaSinConexion(headerSalida, utils);
		}

		return headerSalida;
	}
	
	/* (non-Javadoc)
	 * @see org.jllinares.api.panama.fasteners.service.ManagerAPIService#consultarTransportes(org.jllinares.api.panama.fasteners.service.beans.HeaderEntradaBean)
	 */
	@Override
	public ConsultarTransportesResponse consultarTransportes(HeaderEntradaBean headerEntrada) {
		LOGGER_INFO.info("Peticion al metodo " + CONSULTAR_TRANSPORTES + " recibida");
		HeaderSalidaBean headerSalida = new HeaderSalidaBean();
		BodySalidaConsultarTransportesBean bodySalida = new BodySalidaConsultarTransportesBean();
		ConsultarTransportesResponse response = new ConsultarTransportesResponse();
		ManagerServiceDAO dao = LoadConfigurationUtils.getRegisterDB();
		ServicesUtils utils = new ServicesUtils();
		List<TransporteDetalleBean> list = null;
		
		if (dao.isConnected()) {
			list = (List<TransporteDetalleBean>) dao.obtenerInstancias(new StringBuilder().append(AppConstans.NAMESPACE_UTIL.getValue()).append("ConsultarTransportes").toString());

			if (list == null || list.isEmpty()) {
				LOGGER_INFO.info("No se han encontrado Transportes");
				headerSalida = utils.setHeaderSalidaWithError(headerSalida, ServiceConstans.TYPE_MSJ_INFO.getValue(), ServiceConstans.CODE_LIST_EMPTY.getValue(), ServiceConstans.MSJ_LIST_EMPTY.getValue());
			}
			
			else {
				bodySalida.setTransportes(list);
			}
			
		}
	
		else {
			setHeaderSalidaSinConexion(headerSalida, utils);
		}

		response.setBodySalida(bodySalida);
		response.setHeaderSalida(headerSalida);
		return response;
	}
	
	@Override
	public HeaderSalidaBean asociarChoferTransportes(HeaderEntradaBean headerEntrada, BodyEntradaAsociarChoferTransportesBean bodyEntrada) {
		LOGGER_INFO.info("Peticion al metodo " + ASOCIAR_CHOFER_TRANSPORTES + " recibida");
		HeaderSalidaBean headerSalida = new HeaderSalidaBean();
		ManagerServiceDAO dao = LoadConfigurationUtils.getRegisterDB();
		ServicesUtils utils = new ServicesUtils();
		ChoferTransporteBean relacion = new ChoferTransporteBean();
		int inserted = 0;
		
		if (dao.isConnected()) {
			relacion.setIdChofer(bodyEntrada.getIdChofer());
			
			for(Integer id : bodyEntrada.getIdsTransportes()) {
				relacion.setIdTransporte(id.intValue());
				inserted += dao.insertarInstancia(new StringBuilder().append(AppConstans.NAMESPACE_UTIL.getValue()).append("CrearChoferTransporte").toString(), relacion); 
			}
			
			if(inserted == bodyEntrada.getIdsTransportes().size()) {
				LOGGER_INFO.info("Se han insertado correctamente todos los registros de relacion ");
			}
			
			else {
				LOGGER_ERROR.error("Se ha producido un error al momento de insertar a la relacion entre un chofer y sus transportes");
				
				switch(inserted) {
					case 0:
						headerSalida = utils.setHeaderSalidaWithError(headerSalida, ServiceConstans.TYPE_MSJ_INFO.getValue(), ServiceConstans.CODE_NOT_REGISTER.getValue(), ServiceConstans.MSJ_NOT_REGISTER_DETAIL.getValue());
						break;
						
					default:
						headerSalida = utils.setHeaderSalidaWithError(headerSalida, ServiceConstans.TYPE_MSJ_WARNING.getValue(), ServiceConstans.CODE_ACT_REG_CHOFER_TRANS.getValue(), ServiceConstans.MSJ_ACT_REG_CHOFER_TRANS.getValue() + inserted);
						break;
				}
			}
		}
		
		else {
			setHeaderSalidaSinConexion(headerSalida, utils);
		}

		return headerSalida;
	}

	/**
	 * Sets the header salida sin conexion.
	 *
	 * @param headerSalida the header salida
	 * @param utils the utils
	 */
	private void setHeaderSalidaSinConexion(HeaderSalidaBean headerSalida, ServicesUtils utils) {
		LOGGER_INFO.info("No se ha logrado realizar la operacion a la Base de Datos por falta de conexion");
		headerSalida = utils.setHeaderSalidaWithError(headerSalida, ServiceConstans.TYPE_MSJ_ERROR.getValue(), ServiceConstans.CODE_ERROR_DB_NOT_CONNECTED.getValue(), ServiceConstans.MSJ_ERROR_DB_NOT_CONNECTED.getValue());
	}
}