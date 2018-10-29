/**
 * ServicosWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.ctup.servidorws;

public interface ServicosWS extends java.rmi.Remote {
    public boolean save(br.com.ctup.servidorws.EmprestimoServidor arg0) throws java.rmi.RemoteException;
    public boolean verificaExistenciaLivro(br.com.ctup.servidorws.EmprestimoServidor arg0) throws java.rmi.RemoteException;
    public boolean verificaExistenciaMutuario(br.com.ctup.servidorws.EmprestimoServidor arg0) throws java.rmi.RemoteException;
}
