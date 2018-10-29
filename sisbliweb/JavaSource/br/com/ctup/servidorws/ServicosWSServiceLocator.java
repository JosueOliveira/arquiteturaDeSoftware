/**
 * ServicosWSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.ctup.servidorws;

public class ServicosWSServiceLocator extends org.apache.axis.client.Service implements br.com.ctup.servidorws.ServicosWSService {

    public ServicosWSServiceLocator() {
    }


    public ServicosWSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ServicosWSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ServicosWSPort
    private java.lang.String ServicosWSPort_address = "http://127.0.0.1:8081/servidorws/ServicosWS";

    public java.lang.String getServicosWSPortAddress() {
        return ServicosWSPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ServicosWSPortWSDDServiceName = "ServicosWSPort";

    public java.lang.String getServicosWSPortWSDDServiceName() {
        return ServicosWSPortWSDDServiceName;
    }

    public void setServicosWSPortWSDDServiceName(java.lang.String name) {
        ServicosWSPortWSDDServiceName = name;
    }

    public br.com.ctup.servidorws.ServicosWS getServicosWSPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ServicosWSPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getServicosWSPort(endpoint);
    }

    public br.com.ctup.servidorws.ServicosWS getServicosWSPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            br.com.ctup.servidorws.ServicosWSBindingStub _stub = new br.com.ctup.servidorws.ServicosWSBindingStub(portAddress, this);
            _stub.setPortName(getServicosWSPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setServicosWSPortEndpointAddress(java.lang.String address) {
        ServicosWSPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (br.com.ctup.servidorws.ServicosWS.class.isAssignableFrom(serviceEndpointInterface)) {
                br.com.ctup.servidorws.ServicosWSBindingStub _stub = new br.com.ctup.servidorws.ServicosWSBindingStub(new java.net.URL(ServicosWSPort_address), this);
                _stub.setPortName(getServicosWSPortWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("ServicosWSPort".equals(inputPortName)) {
            return getServicosWSPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://servidorws.ctup.com.br/", "ServicosWSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://servidorws.ctup.com.br/", "ServicosWSPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ServicosWSPort".equals(portName)) {
            setServicosWSPortEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
