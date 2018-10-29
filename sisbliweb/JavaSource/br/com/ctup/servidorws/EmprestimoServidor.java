/**
 * EmprestimoServidor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.ctup.servidorws;

public class EmprestimoServidor  implements java.io.Serializable {
    private java.util.Calendar dataDevolucao;

    private java.util.Calendar dataEmprestimo;

    private java.util.Calendar dataPrevistaDevolucao;

    private int id;

    private br.com.ctup.servidorws.LivroServidor livroServidor;

    private br.com.ctup.servidorws.MultaServidor multaServidor;

    private br.com.ctup.servidorws.MutuarioServidor mutuarioServidor;

    public EmprestimoServidor() {
    }

    public EmprestimoServidor(
           java.util.Calendar dataDevolucao,
           java.util.Calendar dataEmprestimo,
           java.util.Calendar dataPrevistaDevolucao,
           int id,
           br.com.ctup.servidorws.LivroServidor livroServidor,
           br.com.ctup.servidorws.MultaServidor multaServidor,
           br.com.ctup.servidorws.MutuarioServidor mutuarioServidor) {
           this.dataDevolucao = dataDevolucao;
           this.dataEmprestimo = dataEmprestimo;
           this.dataPrevistaDevolucao = dataPrevistaDevolucao;
           this.id = id;
           this.livroServidor = livroServidor;
           this.multaServidor = multaServidor;
           this.mutuarioServidor = mutuarioServidor;
    }


    /**
     * Gets the dataDevolucao value for this EmprestimoServidor.
     * 
     * @return dataDevolucao
     */
    public java.util.Calendar getDataDevolucao() {
        return dataDevolucao;
    }


    /**
     * Sets the dataDevolucao value for this EmprestimoServidor.
     * 
     * @param dataDevolucao
     */
    public void setDataDevolucao(java.util.Calendar dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }


    /**
     * Gets the dataEmprestimo value for this EmprestimoServidor.
     * 
     * @return dataEmprestimo
     */
    public java.util.Calendar getDataEmprestimo() {
        return dataEmprestimo;
    }


    /**
     * Sets the dataEmprestimo value for this EmprestimoServidor.
     * 
     * @param dataEmprestimo
     */
    public void setDataEmprestimo(java.util.Calendar dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }


    /**
     * Gets the dataPrevistaDevolucao value for this EmprestimoServidor.
     * 
     * @return dataPrevistaDevolucao
     */
    public java.util.Calendar getDataPrevistaDevolucao() {
        return dataPrevistaDevolucao;
    }


    /**
     * Sets the dataPrevistaDevolucao value for this EmprestimoServidor.
     * 
     * @param dataPrevistaDevolucao
     */
    public void setDataPrevistaDevolucao(java.util.Calendar dataPrevistaDevolucao) {
        this.dataPrevistaDevolucao = dataPrevistaDevolucao;
    }


    /**
     * Gets the id value for this EmprestimoServidor.
     * 
     * @return id
     */
    public int getId() {
        return id;
    }


    /**
     * Sets the id value for this EmprestimoServidor.
     * 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }


    /**
     * Gets the livroServidor value for this EmprestimoServidor.
     * 
     * @return livroServidor
     */
    public br.com.ctup.servidorws.LivroServidor getLivroServidor() {
        return livroServidor;
    }


    /**
     * Sets the livroServidor value for this EmprestimoServidor.
     * 
     * @param livroServidor
     */
    public void setLivroServidor(br.com.ctup.servidorws.LivroServidor livroServidor) {
        this.livroServidor = livroServidor;
    }


    /**
     * Gets the multaServidor value for this EmprestimoServidor.
     * 
     * @return multaServidor
     */
    public br.com.ctup.servidorws.MultaServidor getMultaServidor() {
        return multaServidor;
    }


    /**
     * Sets the multaServidor value for this EmprestimoServidor.
     * 
     * @param multaServidor
     */
    public void setMultaServidor(br.com.ctup.servidorws.MultaServidor multaServidor) {
        this.multaServidor = multaServidor;
    }


    /**
     * Gets the mutuarioServidor value for this EmprestimoServidor.
     * 
     * @return mutuarioServidor
     */
    public br.com.ctup.servidorws.MutuarioServidor getMutuarioServidor() {
        return mutuarioServidor;
    }


    /**
     * Sets the mutuarioServidor value for this EmprestimoServidor.
     * 
     * @param mutuarioServidor
     */
    public void setMutuarioServidor(br.com.ctup.servidorws.MutuarioServidor mutuarioServidor) {
        this.mutuarioServidor = mutuarioServidor;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EmprestimoServidor)) return false;
        EmprestimoServidor other = (EmprestimoServidor) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.dataDevolucao==null && other.getDataDevolucao()==null) || 
             (this.dataDevolucao!=null &&
              this.dataDevolucao.equals(other.getDataDevolucao()))) &&
            ((this.dataEmprestimo==null && other.getDataEmprestimo()==null) || 
             (this.dataEmprestimo!=null &&
              this.dataEmprestimo.equals(other.getDataEmprestimo()))) &&
            ((this.dataPrevistaDevolucao==null && other.getDataPrevistaDevolucao()==null) || 
             (this.dataPrevistaDevolucao!=null &&
              this.dataPrevistaDevolucao.equals(other.getDataPrevistaDevolucao()))) &&
            this.id == other.getId() &&
            ((this.livroServidor==null && other.getLivroServidor()==null) || 
             (this.livroServidor!=null &&
              this.livroServidor.equals(other.getLivroServidor()))) &&
            ((this.multaServidor==null && other.getMultaServidor()==null) || 
             (this.multaServidor!=null &&
              this.multaServidor.equals(other.getMultaServidor()))) &&
            ((this.mutuarioServidor==null && other.getMutuarioServidor()==null) || 
             (this.mutuarioServidor!=null &&
              this.mutuarioServidor.equals(other.getMutuarioServidor())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getDataDevolucao() != null) {
            _hashCode += getDataDevolucao().hashCode();
        }
        if (getDataEmprestimo() != null) {
            _hashCode += getDataEmprestimo().hashCode();
        }
        if (getDataPrevistaDevolucao() != null) {
            _hashCode += getDataPrevistaDevolucao().hashCode();
        }
        _hashCode += getId();
        if (getLivroServidor() != null) {
            _hashCode += getLivroServidor().hashCode();
        }
        if (getMultaServidor() != null) {
            _hashCode += getMultaServidor().hashCode();
        }
        if (getMutuarioServidor() != null) {
            _hashCode += getMutuarioServidor().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EmprestimoServidor.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://servidorws.ctup.com.br/", "emprestimoServidor"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataDevolucao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataDevolucao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataEmprestimo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataEmprestimo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataPrevistaDevolucao");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dataPrevistaDevolucao"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("livroServidor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "livroServidor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servidorws.ctup.com.br/", "livroServidor"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("multaServidor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "multaServidor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servidorws.ctup.com.br/", "multaServidor"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mutuarioServidor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "mutuarioServidor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://servidorws.ctup.com.br/", "mutuarioServidor"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
