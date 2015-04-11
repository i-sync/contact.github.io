package com.zzti.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.8 2014-05-01T11:42:29.635+08:00
 * Generated source version: 2.7.8
 * 
 */
@WebServiceClient(name = "ContactService", wsdlLocation = "http://localhost/java_zzti_clouddb/Service?wsdl",
														  //"http://contact09.duapp.com/java_zzti_clouddb/Service?wsdl",
targetNamespace = "http://service.zzti.com/")
public class ContactService extends Service {

	public final static URL WSDL_LOCATION;

	public final static QName SERVICE = new QName("http://service.zzti.com/",
			"ContactService");
	public final static QName ServicePort = new QName(
			"http://service.zzti.com/", "ServicePort");
	static {
		URL url = null;
		try {
			url = new URL(
			//"http://contact09.duapp.com/java_zzti_clouddb/Service?wsdl");
					"http://localhost/java_zzti_clouddb/Service?wsdl");
		} catch (MalformedURLException e) {
			java.util.logging.Logger
					.getLogger(ContactService.class.getName())
					.log(java.util.logging.Level.INFO,
							"Can not initialize the default wsdl from {0}",
							 //"http://contact09.duapp.com/java_zzti_clouddb/Service?wsdl");
							"http://localhost/java_zzti_clouddb/Service?wsdl");
		}
		WSDL_LOCATION = url;
	}

	public ContactService(URL wsdlLocation) {
		super(wsdlLocation, SERVICE);
	}

	public ContactService(URL wsdlLocation, QName serviceName) {
		super(wsdlLocation, serviceName);
	}

	public ContactService() {
		super(WSDL_LOCATION, SERVICE);
	}

	// This constructor requires JAX-WS API 2.2. You will need to endorse the
	// 2.2
	// API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS
	// 2.1
	// compliant code instead.
	public ContactService(WebServiceFeature... features) {
		super(WSDL_LOCATION, SERVICE, features);
	}

	// This constructor requires JAX-WS API 2.2. You will need to endorse the
	// 2.2
	// API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS
	// 2.1
	// compliant code instead.
	public ContactService(URL wsdlLocation, WebServiceFeature... features) {
		super(wsdlLocation, SERVICE, features);
	}

	// This constructor requires JAX-WS API 2.2. You will need to endorse the
	// 2.2
	// API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS
	// 2.1
	// compliant code instead.
	public ContactService(URL wsdlLocation, QName serviceName,
			WebServiceFeature... features) {
		super(wsdlLocation, serviceName, features);
	}

	/**
	 * 
	 * @return returns ContactSEI
	 */
	@WebEndpoint(name = "ServicePort")
	public ContactSEI getServicePort() {
		return super.getPort(ServicePort, ContactSEI.class);
	}

	/**
	 * 
	 * @param features
	 *            A list of {@link javax.xml.ws.WebServiceFeature} to configure
	 *            on the proxy. Supported features not in the
	 *            <code>features</code> parameter will have their default
	 *            values.
	 * @return returns ContactSEI
	 */
	@WebEndpoint(name = "ServicePort")
	public ContactSEI getServicePort(WebServiceFeature... features) {
		return super.getPort(ServicePort, ContactSEI.class, features);
	}

}
