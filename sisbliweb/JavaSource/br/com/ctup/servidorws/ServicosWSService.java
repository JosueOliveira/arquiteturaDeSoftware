/**
 * ServicosWSService.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.ctup.servidorws;

public interface ServicosWSService extends javax.xml.rpc.Service {
    public java.lang.String getServicosWSPortAddress();

    public br.com.ctup.servidorws.ServicosWS getServicosWSPort() throws javax.xml.rpc.ServiceException;

    public br.com.ctup.servidorws.ServicosWS getServicosWSPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
