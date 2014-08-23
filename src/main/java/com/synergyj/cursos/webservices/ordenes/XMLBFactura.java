/*
 * XML Type:  XMLBFactura
 * Namespace: http://www.synergyj.com/cursos/webservices/ordenes
 * Java type: com.synergyj.cursos.webservices.ordenes.XMLBFactura
 *
 * Automatically generated - do not modify.
 */
package com.synergyj.cursos.webservices.ordenes;


/**
 * An XML XMLBFactura(@http://www.synergyj.com/cursos/webservices/ordenes).
 *
 * This is a complex type.
 */
public interface XMLBFactura extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(XMLBFactura.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s431E4E1B92EFFB11F7B10191206D4C72").resolveHandle("xmlbfactura3d2ftype");
    
    /**
     * Gets the "orden" element
     */
    com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra getOrden();
    
    /**
     * Sets the "orden" element
     */
    void setOrden(com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra orden);
    
    /**
     * Appends and returns a new empty "orden" element
     */
    com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra addNewOrden();
    
    /**
     * Gets the "detalleFactura" element
     */
    com.synergyj.cursos.webservices.ordenes.XMLBListaProdFactura getDetalleFactura();
    
    /**
     * Sets the "detalleFactura" element
     */
    void setDetalleFactura(com.synergyj.cursos.webservices.ordenes.XMLBListaProdFactura detalleFactura);
    
    /**
     * Appends and returns a new empty "detalleFactura" element
     */
    com.synergyj.cursos.webservices.ordenes.XMLBListaProdFactura addNewDetalleFactura();
    
    /**
     * Gets the "total" element
     */
    java.math.BigDecimal getTotal();
    
    /**
     * Gets (as xml) the "total" element
     */
    com.synergyj.cursos.webservices.ordenes.XMLBFactura.Total xgetTotal();
    
    /**
     * Sets the "total" element
     */
    void setTotal(java.math.BigDecimal total);
    
    /**
     * Sets (as xml) the "total" element
     */
    void xsetTotal(com.synergyj.cursos.webservices.ordenes.XMLBFactura.Total total);
    
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
     * An XML total(@).
     *
     * This is an atomic type that is a restriction of com.synergyj.cursos.webservices.ordenes.XMLBFactura$Total.
     */
    public interface Total extends org.apache.xmlbeans.XmlDecimal
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Total.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s431E4E1B92EFFB11F7B10191206D4C72").resolveHandle("totalcf6felemtype");
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.synergyj.cursos.webservices.ordenes.XMLBFactura.Total newValue(java.lang.Object obj) {
              return (com.synergyj.cursos.webservices.ordenes.XMLBFactura.Total) type.newValue( obj ); }
            
            public static com.synergyj.cursos.webservices.ordenes.XMLBFactura.Total newInstance() {
              return (com.synergyj.cursos.webservices.ordenes.XMLBFactura.Total) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.synergyj.cursos.webservices.ordenes.XMLBFactura.Total newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.synergyj.cursos.webservices.ordenes.XMLBFactura.Total) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.synergyj.cursos.webservices.ordenes.XMLBFactura newInstance() {
          return (com.synergyj.cursos.webservices.ordenes.XMLBFactura) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.synergyj.cursos.webservices.ordenes.XMLBFactura newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.synergyj.cursos.webservices.ordenes.XMLBFactura) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.synergyj.cursos.webservices.ordenes.XMLBFactura parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBFactura) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.synergyj.cursos.webservices.ordenes.XMLBFactura parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBFactura) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.synergyj.cursos.webservices.ordenes.XMLBFactura parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBFactura) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.synergyj.cursos.webservices.ordenes.XMLBFactura parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBFactura) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.synergyj.cursos.webservices.ordenes.XMLBFactura parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBFactura) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.synergyj.cursos.webservices.ordenes.XMLBFactura parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBFactura) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.synergyj.cursos.webservices.ordenes.XMLBFactura parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBFactura) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.synergyj.cursos.webservices.ordenes.XMLBFactura parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBFactura) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.synergyj.cursos.webservices.ordenes.XMLBFactura parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBFactura) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.synergyj.cursos.webservices.ordenes.XMLBFactura parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBFactura) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.synergyj.cursos.webservices.ordenes.XMLBFactura parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBFactura) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.synergyj.cursos.webservices.ordenes.XMLBFactura parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBFactura) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.synergyj.cursos.webservices.ordenes.XMLBFactura parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBFactura) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.synergyj.cursos.webservices.ordenes.XMLBFactura parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBFactura) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.synergyj.cursos.webservices.ordenes.XMLBFactura parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBFactura) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.synergyj.cursos.webservices.ordenes.XMLBFactura parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBFactura) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
