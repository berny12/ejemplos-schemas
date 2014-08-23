/*
 * XML Type:  XMLBProducto
 * Namespace: http://www.synergyj.com/cursos/webservices/prodfactura
 * Java type: com.synergyj.cursos.webservices.prodfactura.XMLBProducto
 *
 * Automatically generated - do not modify.
 */
package com.synergyj.cursos.webservices.prodfactura;


/**
 * An XML XMLBProducto(@http://www.synergyj.com/cursos/webservices/prodfactura).
 *
 * This is a complex type.
 */
public interface XMLBProducto extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(XMLBProducto.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s431E4E1B92EFFB11F7B10191206D4C72").resolveHandle("xmlbproductoe7a8type");
    
    /**
     * Gets the "claveProducto" element
     */
    java.lang.String getClaveProducto();
    
    /**
     * Gets (as xml) the "claveProducto" element
     */
    org.apache.xmlbeans.XmlString xgetClaveProducto();
    
    /**
     * Sets the "claveProducto" element
     */
    void setClaveProducto(java.lang.String claveProducto);
    
    /**
     * Sets (as xml) the "claveProducto" element
     */
    void xsetClaveProducto(org.apache.xmlbeans.XmlString claveProducto);
    
    /**
     * Gets the "cantidad" element
     */
    int getCantidad();
    
    /**
     * Gets (as xml) the "cantidad" element
     */
    com.synergyj.cursos.webservices.prodfactura.XMLBProducto.Cantidad xgetCantidad();
    
    /**
     * Sets the "cantidad" element
     */
    void setCantidad(int cantidad);
    
    /**
     * Sets (as xml) the "cantidad" element
     */
    void xsetCantidad(com.synergyj.cursos.webservices.prodfactura.XMLBProducto.Cantidad cantidad);
    
    /**
     * Gets the "precioUnitario" element
     */
    double getPrecioUnitario();
    
    /**
     * Gets (as xml) the "precioUnitario" element
     */
    org.apache.xmlbeans.XmlDouble xgetPrecioUnitario();
    
    /**
     * Sets the "precioUnitario" element
     */
    void setPrecioUnitario(double precioUnitario);
    
    /**
     * Sets (as xml) the "precioUnitario" element
     */
    void xsetPrecioUnitario(org.apache.xmlbeans.XmlDouble precioUnitario);
    
    /**
     * Gets the "iva" element
     */
    double getIva();
    
    /**
     * Gets (as xml) the "iva" element
     */
    org.apache.xmlbeans.XmlDouble xgetIva();
    
    /**
     * Sets the "iva" element
     */
    void setIva(double iva);
    
    /**
     * Sets (as xml) the "iva" element
     */
    void xsetIva(org.apache.xmlbeans.XmlDouble iva);
    
    /**
     * An XML cantidad(@).
     *
     * This is an atomic type that is a restriction of com.synergyj.cursos.webservices.prodfactura.XMLBProducto$Cantidad.
     */
    public interface Cantidad extends org.apache.xmlbeans.XmlInt
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Cantidad.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s431E4E1B92EFFB11F7B10191206D4C72").resolveHandle("cantidadc6d6elemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.synergyj.cursos.webservices.prodfactura.XMLBProducto.Cantidad newValue(java.lang.Object obj) {
              return (com.synergyj.cursos.webservices.prodfactura.XMLBProducto.Cantidad) type.newValue( obj ); }
            
            public static com.synergyj.cursos.webservices.prodfactura.XMLBProducto.Cantidad newInstance() {
              return (com.synergyj.cursos.webservices.prodfactura.XMLBProducto.Cantidad) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.synergyj.cursos.webservices.prodfactura.XMLBProducto.Cantidad newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.synergyj.cursos.webservices.prodfactura.XMLBProducto.Cantidad) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.synergyj.cursos.webservices.prodfactura.XMLBProducto newInstance() {
          return (com.synergyj.cursos.webservices.prodfactura.XMLBProducto) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.synergyj.cursos.webservices.prodfactura.XMLBProducto newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.synergyj.cursos.webservices.prodfactura.XMLBProducto) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.synergyj.cursos.webservices.prodfactura.XMLBProducto parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.synergyj.cursos.webservices.prodfactura.XMLBProducto) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.synergyj.cursos.webservices.prodfactura.XMLBProducto parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.synergyj.cursos.webservices.prodfactura.XMLBProducto) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.synergyj.cursos.webservices.prodfactura.XMLBProducto parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.synergyj.cursos.webservices.prodfactura.XMLBProducto) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.synergyj.cursos.webservices.prodfactura.XMLBProducto parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.synergyj.cursos.webservices.prodfactura.XMLBProducto) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.synergyj.cursos.webservices.prodfactura.XMLBProducto parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.synergyj.cursos.webservices.prodfactura.XMLBProducto) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.synergyj.cursos.webservices.prodfactura.XMLBProducto parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.synergyj.cursos.webservices.prodfactura.XMLBProducto) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.synergyj.cursos.webservices.prodfactura.XMLBProducto parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.synergyj.cursos.webservices.prodfactura.XMLBProducto) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.synergyj.cursos.webservices.prodfactura.XMLBProducto parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.synergyj.cursos.webservices.prodfactura.XMLBProducto) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.synergyj.cursos.webservices.prodfactura.XMLBProducto parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.synergyj.cursos.webservices.prodfactura.XMLBProducto) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.synergyj.cursos.webservices.prodfactura.XMLBProducto parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.synergyj.cursos.webservices.prodfactura.XMLBProducto) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.synergyj.cursos.webservices.prodfactura.XMLBProducto parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.synergyj.cursos.webservices.prodfactura.XMLBProducto) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.synergyj.cursos.webservices.prodfactura.XMLBProducto parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.synergyj.cursos.webservices.prodfactura.XMLBProducto) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.synergyj.cursos.webservices.prodfactura.XMLBProducto parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.synergyj.cursos.webservices.prodfactura.XMLBProducto) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.synergyj.cursos.webservices.prodfactura.XMLBProducto parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.synergyj.cursos.webservices.prodfactura.XMLBProducto) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.synergyj.cursos.webservices.prodfactura.XMLBProducto parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.synergyj.cursos.webservices.prodfactura.XMLBProducto) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.synergyj.cursos.webservices.prodfactura.XMLBProducto parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.synergyj.cursos.webservices.prodfactura.XMLBProducto) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
