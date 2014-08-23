/*
 * An XML document type.
 * Localname: XMLBFactura
 * Namespace: http://www.synergyj.com/cursos/webservices/container
 * Java type: com.synergyj.cursos.webservices.container.XMLBFacturaDocument
 *
 * Automatically generated - do not modify.
 */
package com.synergyj.cursos.webservices.container.impl;
/**
 * A document containing one XMLBFactura(@http://www.synergyj.com/cursos/webservices/container) element.
 *
 * This is a complex type.
 */
public class XMLBFacturaDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.synergyj.cursos.webservices.container.XMLBFacturaDocument
{
    private static final long serialVersionUID = 1L;
    
    public XMLBFacturaDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName XMLBFACTURA$0 = 
        new javax.xml.namespace.QName("http://www.synergyj.com/cursos/webservices/container", "XMLBFactura");
    
    
    /**
     * Gets the "XMLBFactura" element
     */
    public com.synergyj.cursos.webservices.ordenes.XMLBFactura getXMLBFactura()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.synergyj.cursos.webservices.ordenes.XMLBFactura target = null;
            target = (com.synergyj.cursos.webservices.ordenes.XMLBFactura)get_store().find_element_user(XMLBFACTURA$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "XMLBFactura" element
     */
    public void setXMLBFactura(com.synergyj.cursos.webservices.ordenes.XMLBFactura xmlbFactura)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.synergyj.cursos.webservices.ordenes.XMLBFactura target = null;
            target = (com.synergyj.cursos.webservices.ordenes.XMLBFactura)get_store().find_element_user(XMLBFACTURA$0, 0);
            if (target == null)
            {
                target = (com.synergyj.cursos.webservices.ordenes.XMLBFactura)get_store().add_element_user(XMLBFACTURA$0);
            }
            target.set(xmlbFactura);
        }
    }
    
    /**
     * Appends and returns a new empty "XMLBFactura" element
     */
    public com.synergyj.cursos.webservices.ordenes.XMLBFactura addNewXMLBFactura()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.synergyj.cursos.webservices.ordenes.XMLBFactura target = null;
            target = (com.synergyj.cursos.webservices.ordenes.XMLBFactura)get_store().add_element_user(XMLBFACTURA$0);
            return target;
        }
    }
}
