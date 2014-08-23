/*
 * XML Type:  XMLBListaProdFactura
 * Namespace: http://www.synergyj.com/cursos/webservices/ordenes
 * Java type: com.synergyj.cursos.webservices.ordenes.XMLBListaProdFactura
 *
 * Automatically generated - do not modify.
 */
package com.synergyj.cursos.webservices.ordenes;


/**
 * An XML XMLBListaProdFactura(@http://www.synergyj.com/cursos/webservices/ordenes).
 *
 * This is a complex type.
 */
public interface XMLBListaProdFactura extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(XMLBListaProdFactura.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s431E4E1B92EFFB11F7B10191206D4C72").resolveHandle("xmlblistaprodfacturac061type");
    
    /**
     * Gets array of all "producto" elements
     */
    com.synergyj.cursos.webservices.prodfactura.XMLBProducto[] getProductoArray();
    
    /**
     * Gets ith "producto" element
     */
    com.synergyj.cursos.webservices.prodfactura.XMLBProducto getProductoArray(int i);
    
    /**
     * Returns number of "producto" element
     */
    int sizeOfProductoArray();
    
    /**
     * Sets array of all "producto" element
     */
    void setProductoArray(com.synergyj.cursos.webservices.prodfactura.XMLBProducto[] productoArray);
    
    /**
     * Sets ith "producto" element
     */
    void setProductoArray(int i, com.synergyj.cursos.webservices.prodfactura.XMLBProducto producto);
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "producto" element
     */
    com.synergyj.cursos.webservices.prodfactura.XMLBProducto insertNewProducto(int i);
    
    /**
     * Appends and returns a new empty value (as xml) as the last "producto" element
     */
    com.synergyj.cursos.webservices.prodfactura.XMLBProducto addNewProducto();
    
    /**
     * Removes the ith "producto" element
     */
    void removeProducto(int i);
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.synergyj.cursos.webservices.ordenes.XMLBListaProdFactura newInstance() {
          return (com.synergyj.cursos.webservices.ordenes.XMLBListaProdFactura) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.synergyj.cursos.webservices.ordenes.XMLBListaProdFactura newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.synergyj.cursos.webservices.ordenes.XMLBListaProdFactura) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.synergyj.cursos.webservices.ordenes.XMLBListaProdFactura parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBListaProdFactura) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.synergyj.cursos.webservices.ordenes.XMLBListaProdFactura parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBListaProdFactura) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.synergyj.cursos.webservices.ordenes.XMLBListaProdFactura parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBListaProdFactura) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.synergyj.cursos.webservices.ordenes.XMLBListaProdFactura parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBListaProdFactura) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.synergyj.cursos.webservices.ordenes.XMLBListaProdFactura parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBListaProdFactura) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.synergyj.cursos.webservices.ordenes.XMLBListaProdFactura parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBListaProdFactura) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.synergyj.cursos.webservices.ordenes.XMLBListaProdFactura parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBListaProdFactura) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.synergyj.cursos.webservices.ordenes.XMLBListaProdFactura parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBListaProdFactura) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.synergyj.cursos.webservices.ordenes.XMLBListaProdFactura parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBListaProdFactura) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.synergyj.cursos.webservices.ordenes.XMLBListaProdFactura parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBListaProdFactura) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.synergyj.cursos.webservices.ordenes.XMLBListaProdFactura parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBListaProdFactura) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.synergyj.cursos.webservices.ordenes.XMLBListaProdFactura parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBListaProdFactura) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.synergyj.cursos.webservices.ordenes.XMLBListaProdFactura parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBListaProdFactura) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.synergyj.cursos.webservices.ordenes.XMLBListaProdFactura parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBListaProdFactura) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.synergyj.cursos.webservices.ordenes.XMLBListaProdFactura parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBListaProdFactura) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.synergyj.cursos.webservices.ordenes.XMLBListaProdFactura parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBListaProdFactura) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
