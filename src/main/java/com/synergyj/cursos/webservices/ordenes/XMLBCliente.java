/*
 * XML Type:  XMLBCliente
 * Namespace: http://www.synergyj.com/cursos/webservices/ordenes
 * Java type: com.synergyj.cursos.webservices.ordenes.XMLBCliente
 *
 * Automatically generated - do not modify.
 */
package com.synergyj.cursos.webservices.ordenes;


/**
 * An XML XMLBCliente(@http://www.synergyj.com/cursos/webservices/ordenes).
 *
 * This is a complex type.
 */
public interface XMLBCliente extends org.apache.xmlbeans.XmlObject
{
    public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
        org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(XMLBCliente.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s431E4E1B92EFFB11F7B10191206D4C72").resolveHandle("xmlbclientea36dtype");
    
    /**
     * Gets the "nombre" element
     */
    java.lang.String getNombre();
    
    /**
     * Gets (as xml) the "nombre" element
     */
    org.apache.xmlbeans.XmlString xgetNombre();
    
    /**
     * Sets the "nombre" element
     */
    void setNombre(java.lang.String nombre);
    
    /**
     * Sets (as xml) the "nombre" element
     */
    void xsetNombre(org.apache.xmlbeans.XmlString nombre);
    
    /**
     * Gets the "apellidoPaterno" element
     */
    java.lang.String getApellidoPaterno();
    
    /**
     * Gets (as xml) the "apellidoPaterno" element
     */
    org.apache.xmlbeans.XmlString xgetApellidoPaterno();
    
    /**
     * Sets the "apellidoPaterno" element
     */
    void setApellidoPaterno(java.lang.String apellidoPaterno);
    
    /**
     * Sets (as xml) the "apellidoPaterno" element
     */
    void xsetApellidoPaterno(org.apache.xmlbeans.XmlString apellidoPaterno);
    
    /**
     * Gets the "apellidoMaterno" element
     */
    java.lang.String getApellidoMaterno();
    
    /**
     * Gets (as xml) the "apellidoMaterno" element
     */
    org.apache.xmlbeans.XmlString xgetApellidoMaterno();
    
    /**
     * True if has "apellidoMaterno" element
     */
    boolean isSetApellidoMaterno();
    
    /**
     * Sets the "apellidoMaterno" element
     */
    void setApellidoMaterno(java.lang.String apellidoMaterno);
    
    /**
     * Sets (as xml) the "apellidoMaterno" element
     */
    void xsetApellidoMaterno(org.apache.xmlbeans.XmlString apellidoMaterno);
    
    /**
     * Unsets the "apellidoMaterno" element
     */
    void unsetApellidoMaterno();
    
    /**
     * Gets the "sexo" element
     */
    com.synergyj.cursos.webservices.ordenes.XMLBCliente.Sexo.Enum getSexo();
    
    /**
     * Gets (as xml) the "sexo" element
     */
    com.synergyj.cursos.webservices.ordenes.XMLBCliente.Sexo xgetSexo();
    
    /**
     * Sets the "sexo" element
     */
    void setSexo(com.synergyj.cursos.webservices.ordenes.XMLBCliente.Sexo.Enum sexo);
    
    /**
     * Sets (as xml) the "sexo" element
     */
    void xsetSexo(com.synergyj.cursos.webservices.ordenes.XMLBCliente.Sexo sexo);
    
    /**
     * An XML sexo(@).
     *
     * This is an atomic type that is a restriction of com.synergyj.cursos.webservices.ordenes.XMLBCliente$Sexo.
     */
    public interface Sexo extends org.apache.xmlbeans.XmlString
    {
        public static final org.apache.xmlbeans.SchemaType type = (org.apache.xmlbeans.SchemaType)
            org.apache.xmlbeans.XmlBeans.typeSystemForClassLoader(Sexo.class.getClassLoader(), "schemaorg_apache_xmlbeans.system.s431E4E1B92EFFB11F7B10191206D4C72").resolveHandle("sexo5eb8elemtype");
        
        org.apache.xmlbeans.StringEnumAbstractBase enumValue();
        void set(org.apache.xmlbeans.StringEnumAbstractBase e);
        
        static final Enum M = Enum.forString("M");
        static final Enum H = Enum.forString("H");
        
        static final int INT_M = Enum.INT_M;
        static final int INT_H = Enum.INT_H;
        
        /**
         * Enumeration value class for com.synergyj.cursos.webservices.ordenes.XMLBCliente$Sexo.
         * These enum values can be used as follows:
         * <pre>
         * enum.toString(); // returns the string value of the enum
         * enum.intValue(); // returns an int value, useful for switches
         * // e.g., case Enum.INT_M
         * Enum.forString(s); // returns the enum value for a string
         * Enum.forInt(i); // returns the enum value for an int
         * </pre>
         * Enumeration objects are immutable singleton objects that
         * can be compared using == object equality. They have no
         * public constructor. See the constants defined within this
         * class for all the valid values.
         */
        static final class Enum extends org.apache.xmlbeans.StringEnumAbstractBase
        {
            /**
             * Returns the enum value for a string, or null if none.
             */
            public static Enum forString(java.lang.String s)
                { return (Enum)table.forString(s); }
            /**
             * Returns the enum value corresponding to an int, or null if none.
             */
            public static Enum forInt(int i)
                { return (Enum)table.forInt(i); }
            
            private Enum(java.lang.String s, int i)
                { super(s, i); }
            
            static final int INT_M = 1;
            static final int INT_H = 2;
            
            public static final org.apache.xmlbeans.StringEnumAbstractBase.Table table =
                new org.apache.xmlbeans.StringEnumAbstractBase.Table
            (
                new Enum[]
                {
                    new Enum("M", INT_M),
                    new Enum("H", INT_H),
                }
            );
            private static final long serialVersionUID = 1L;
            private java.lang.Object readResolve() { return forInt(intValue()); } 
        }
        
        /**
         * A factory class with static methods for creating instances
         * of this type.
         */
        
        public static final class Factory
        {
            public static com.synergyj.cursos.webservices.ordenes.XMLBCliente.Sexo newValue(java.lang.Object obj) {
              return (com.synergyj.cursos.webservices.ordenes.XMLBCliente.Sexo) type.newValue( obj ); }
            
            public static com.synergyj.cursos.webservices.ordenes.XMLBCliente.Sexo newInstance() {
              return (com.synergyj.cursos.webservices.ordenes.XMLBCliente.Sexo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
            
            public static com.synergyj.cursos.webservices.ordenes.XMLBCliente.Sexo newInstance(org.apache.xmlbeans.XmlOptions options) {
              return (com.synergyj.cursos.webservices.ordenes.XMLBCliente.Sexo) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
            
            private Factory() { } // No instance of this class allowed
        }
    }
    
    /**
     * A factory class with static methods for creating instances
     * of this type.
     */
    
    public static final class Factory
    {
        public static com.synergyj.cursos.webservices.ordenes.XMLBCliente newInstance() {
          return (com.synergyj.cursos.webservices.ordenes.XMLBCliente) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, null ); }
        
        public static com.synergyj.cursos.webservices.ordenes.XMLBCliente newInstance(org.apache.xmlbeans.XmlOptions options) {
          return (com.synergyj.cursos.webservices.ordenes.XMLBCliente) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newInstance( type, options ); }
        
        /** @param xmlAsString the string value to parse */
        public static com.synergyj.cursos.webservices.ordenes.XMLBCliente parse(java.lang.String xmlAsString) throws org.apache.xmlbeans.XmlException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBCliente) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, null ); }
        
        public static com.synergyj.cursos.webservices.ordenes.XMLBCliente parse(java.lang.String xmlAsString, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBCliente) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xmlAsString, type, options ); }
        
        /** @param file the file from which to load an xml document */
        public static com.synergyj.cursos.webservices.ordenes.XMLBCliente parse(java.io.File file) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBCliente) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, null ); }
        
        public static com.synergyj.cursos.webservices.ordenes.XMLBCliente parse(java.io.File file, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBCliente) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( file, type, options ); }
        
        public static com.synergyj.cursos.webservices.ordenes.XMLBCliente parse(java.net.URL u) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBCliente) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, null ); }
        
        public static com.synergyj.cursos.webservices.ordenes.XMLBCliente parse(java.net.URL u, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBCliente) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( u, type, options ); }
        
        public static com.synergyj.cursos.webservices.ordenes.XMLBCliente parse(java.io.InputStream is) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBCliente) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, null ); }
        
        public static com.synergyj.cursos.webservices.ordenes.XMLBCliente parse(java.io.InputStream is, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBCliente) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( is, type, options ); }
        
        public static com.synergyj.cursos.webservices.ordenes.XMLBCliente parse(java.io.Reader r) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBCliente) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, null ); }
        
        public static com.synergyj.cursos.webservices.ordenes.XMLBCliente parse(java.io.Reader r, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, java.io.IOException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBCliente) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( r, type, options ); }
        
        public static com.synergyj.cursos.webservices.ordenes.XMLBCliente parse(javax.xml.stream.XMLStreamReader sr) throws org.apache.xmlbeans.XmlException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBCliente) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, null ); }
        
        public static com.synergyj.cursos.webservices.ordenes.XMLBCliente parse(javax.xml.stream.XMLStreamReader sr, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBCliente) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( sr, type, options ); }
        
        public static com.synergyj.cursos.webservices.ordenes.XMLBCliente parse(org.w3c.dom.Node node) throws org.apache.xmlbeans.XmlException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBCliente) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, null ); }
        
        public static com.synergyj.cursos.webservices.ordenes.XMLBCliente parse(org.w3c.dom.Node node, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBCliente) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( node, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.synergyj.cursos.webservices.ordenes.XMLBCliente parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBCliente) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static com.synergyj.cursos.webservices.ordenes.XMLBCliente parse(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return (com.synergyj.cursos.webservices.ordenes.XMLBCliente) org.apache.xmlbeans.XmlBeans.getContextTypeLoader().parse( xis, type, options ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, null ); }
        
        /** @deprecated {@link org.apache.xmlbeans.xml.stream.XMLInputStream} */
        public static org.apache.xmlbeans.xml.stream.XMLInputStream newValidatingXMLInputStream(org.apache.xmlbeans.xml.stream.XMLInputStream xis, org.apache.xmlbeans.XmlOptions options) throws org.apache.xmlbeans.XmlException, org.apache.xmlbeans.xml.stream.XMLStreamException {
          return org.apache.xmlbeans.XmlBeans.getContextTypeLoader().newValidatingXMLInputStream( xis, type, options ); }
        
        private Factory() { } // No instance of this class allowed
    }
}
