/*
 * XML Type:  XMLBOrdenCompra
 * Namespace: http://www.synergyj.com/cursos/webservices/ordenes
 * Java type: com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra
 *
 * Automatically generated - do not modify.
 */
package com.synergyj.cursos.webservices.ordenes;


/**
 * An XML XMLBOrdenCompra(@http://www.synergyj.com/cursos/webservices/ordenes).
 *
 * This is a complex type.
 */
public interface XMLBOrdenCompra extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(XMLBOrdenCompra.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s431E4E1B92EFFB11F7B10191206D4C72").resolveHandle("xmlbordencompradb3ftype");
    
    /**
     * Gets the "fechaOrden" element
     */
    java.util.Calendar getFechaOrden();
    
    /**
     * Gets (as xml) the "fechaOrden" element
     */
    org.apache.xmlbeans.XmlDateTime xgetFechaOrden();
    
    /**
     * Sets the "fechaOrden" element
     */
    void setFechaOrden(java.util.Calendar fechaOrden);
    
    /**
     * Sets (as xml) the "fechaOrden" element
     */
    void xsetFechaOrden(org.apache.xmlbeans.XmlDateTime fechaOrden);
    
    /**
     * Gets the "sucursal" element
     */
    java.lang.String getSucursal();
    
    /**
     * Gets (as xml) the "sucursal" element
     */
    org.apache.xmlbeans.XmlString xgetSucursal();
    
    /**
     * True if has "sucursal" element
     */
    boolean isSetSucursal();
    
    /**
     * Sets the "sucursal" element
     */
    void setSucursal(java.lang.String sucursal);
    
    /**
     * Sets (as xml) the "sucursal" element
     */
    void xsetSucursal(org.apache.xmlbeans.XmlString sucursal);
    
    /**
     * Unsets the "sucursal" element
     */
    void unsetSucursal();
    
    /**
     * Gets the "numeroOrden" element
     */
    java.lang.String getNumeroOrden();
    
    /**
     * Gets (as xml) the "numeroOrden" element
     */
    com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra.NumeroOrden xgetNumeroOrden();
    
    /**
     * Sets the "numeroOrden" element
     */
    void setNumeroOrden(java.lang.String numeroOrden);
    
    /**
     * Sets (as xml) the "numeroOrden" element
     */
    void xsetNumeroOrden(com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra.NumeroOrden numeroOrden);
    
    /**
     * Gets the "cliente" element
     */
    com.synergyj.cursos.webservices.ordenes.XMLBCliente getCliente();
    
    /**
     * Sets the "cliente" element
     */
    void setCliente(com.synergyj.cursos.webservices.ordenes.XMLBCliente cliente);
    
    /**
     * Appends and returns a new empty "cliente" element
     */
    com.synergyj.cursos.webservices.ordenes.XMLBCliente addNewCliente();
    
    /**
     * Gets array of all "producto" elements
     */
    com.synergyj.cursos.webservices.prodorden.XMLBProducto[] getProductoArray();
    
    /**
     * Gets ith "producto" element
     */
    com.synergyj.cursos.webservices.prodorden.XMLBProducto getProductoArray(int i);
    
    /**
     * Returns number of "producto" element
     */
    int sizeOfProductoArray();
    
    /**
     * Sets array of all "producto" element
     */
    void setProductoArray(com.synergyj.cursos.webservices.prodorden.XMLBProducto[] productoArray);
    
    /**
     * Sets ith "producto" element
     */
    void setProductoArray(int i, com.synergyj.cursos.webservices.prodorden.XMLBProducto producto);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "producto" element
     */
    com.synergyj.cursos.webservices.prodorden.XMLBProducto insertNewProducto(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "producto" element
     */
    com.synergyj.cursos.webservices.prodorden.XMLBProducto addNewProducto();
    
    /**
     * Removes the ith "producto" element
     */
    void removeProducto(int i);
    
    /**
     * An XML numeroOrden(@).
     *
     * This is an atomic type that is a restriction of com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra$NumeroOrden.
     */
    public interface NumeroOrden extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(NumeroOrden.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s431E4E1B92EFFB11F7B10191206D4C72").resolveHandle("numeroorden5075elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra.NumeroOrden newValue(java.lang.Object obj) {
              return (com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra.NumeroOrden) type.newValue( obj ); }
            
            public static com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra.NumeroOrden newInstance() {
              return (com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra.NumeroOrden) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra.NumeroOrden newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra.NumeroOrden) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra newInstance() {
          return (com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
