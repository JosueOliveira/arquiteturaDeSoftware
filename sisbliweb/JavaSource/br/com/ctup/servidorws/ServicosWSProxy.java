package br.com.ctup.servidorws;

public class ServicosWSProxy implements br.com.ctup.servidorws.ServicosWS {
  private String _endpoint = null;
  private br.com.ctup.servidorws.ServicosWS servicosWS = null;
  
  public ServicosWSProxy() {
    _initServicosWSProxy();
  }
  
  public ServicosWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initServicosWSProxy();
  }
  
  private void _initServicosWSProxy() {
    try {
      servicosWS = (new br.com.ctup.servidorws.ServicosWSServiceLocator()).getServicosWSPort();
      if (servicosWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)servicosWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)servicosWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (servicosWS != null)
      ((javax.xml.rpc.Stub)servicosWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public br.com.ctup.servidorws.ServicosWS getServicosWS() {
    if (servicosWS == null)
      _initServicosWSProxy();
    return servicosWS;
  }
  
  public boolean save(br.com.ctup.servidorws.EmprestimoServidor arg0) throws java.rmi.RemoteException{
    if (servicosWS == null)
      _initServicosWSProxy();
    return servicosWS.save(arg0);
  }
  
  public boolean verificaExistenciaLivro(br.com.ctup.servidorws.EmprestimoServidor arg0) throws java.rmi.RemoteException{
    if (servicosWS == null)
      _initServicosWSProxy();
    return servicosWS.verificaExistenciaLivro(arg0);
  }
  
  public boolean verificaExistenciaMutuario(br.com.ctup.servidorws.EmprestimoServidor arg0) throws java.rmi.RemoteException{
    if (servicosWS == null)
      _initServicosWSProxy();
    return servicosWS.verificaExistenciaMutuario(arg0);
  }
  
  
}