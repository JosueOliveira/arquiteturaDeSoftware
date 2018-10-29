/**
 * LivroServidor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package br.com.ctup.servidorws;

public class LivroServidor  implements java.io.Serializable {
    private java.lang.String autor;

    private java.lang.String categoria;

    private int idLivro;

    private int isbn;

    private java.lang.String nome;

    private int status;

    public LivroServidor() {
    }

    public LivroServidor(
           java.lang.String autor,
           java.lang.String categoria,
           int idLivro,
           int isbn,
           java.lang.String nome,
           int status) {
           this.autor = autor;
           this.categoria = categoria;
           this.idLivro = idLivro;
           this.isbn = isbn;
           this.nome = nome;
           this.status = status;
    }


    /**
     * Gets the autor value for this LivroServidor.
     * 
     * @return autor
     */
    public java.lang.String getAutor() {
        return autor;
    }


    /**
     * Sets the autor value for this LivroServidor.
     * 
     * @param autor
     */
    public void setAutor(java.lang.String autor) {
        this.autor = autor;
    }


    /**
     * Gets the categoria value for this LivroServidor.
     * 
     * @return categoria
     */
    public java.lang.String getCategoria() {
        return categoria;
    }


    /**
     * Sets the categoria value for this LivroServidor.
     * 
     * @param categoria
     */
    public void setCategoria(java.lang.String categoria) {
        this.categoria = categoria;
    }


    /**
     * Gets the idLivro value for this LivroServidor.
     * 
     * @return idLivro
     */
    public int getIdLivro() {
        return idLivro;
    }


    /**
     * Sets the idLivro value for this LivroServidor.
     * 
     * @param idLivro
     */
    public void setIdLivro(int idLivro) {
        this.idLivro = idLivro;
    }


    /**
     * Gets the isbn value for this LivroServidor.
     * 
     * @return isbn
     */
    public int getIsbn() {
        return isbn;
    }


    /**
     * Sets the isbn value for this LivroServidor.
     * 
     * @param isbn
     */
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }


    /**
     * Gets the nome value for this LivroServidor.
     * 
     * @return nome
     */
    public java.lang.String getNome() {
        return nome;
    }


    /**
     * Sets the nome value for this LivroServidor.
     * 
     * @param nome
     */
    public void setNome(java.lang.String nome) {
        this.nome = nome;
    }


    /**
     * Gets the status value for this LivroServidor.
     * 
     * @return status
     */
    public int getStatus() {
        return status;
    }


    /**
     * Sets the status value for this LivroServidor.
     * 
     * @param status
     */
    public void setStatus(int status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LivroServidor)) return false;
        LivroServidor other = (LivroServidor) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.autor==null && other.getAutor()==null) || 
             (this.autor!=null &&
              this.autor.equals(other.getAutor()))) &&
            ((this.categoria==null && other.getCategoria()==null) || 
             (this.categoria!=null &&
              this.categoria.equals(other.getCategoria()))) &&
            this.idLivro == other.getIdLivro() &&
            this.isbn == other.getIsbn() &&
            ((this.nome==null && other.getNome()==null) || 
             (this.nome!=null &&
              this.nome.equals(other.getNome()))) &&
            this.status == other.getStatus();
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
        if (getAutor() != null) {
            _hashCode += getAutor().hashCode();
        }
        if (getCategoria() != null) {
            _hashCode += getCategoria().hashCode();
        }
        _hashCode += getIdLivro();
        _hashCode += getIsbn();
        if (getNome() != null) {
            _hashCode += getNome().hashCode();
        }
        _hashCode += getStatus();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LivroServidor.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://servidorws.ctup.com.br/", "livroServidor"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("autor");
        elemField.setXmlName(new javax.xml.namespace.QName("", "autor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoria");
        elemField.setXmlName(new javax.xml.namespace.QName("", "categoria"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idLivro");
        elemField.setXmlName(new javax.xml.namespace.QName("", "idLivro"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isbn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isbn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nome");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nome"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("", "status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
