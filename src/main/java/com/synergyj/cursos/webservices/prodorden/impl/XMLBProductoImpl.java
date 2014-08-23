/*
 * XML Type:  XMLBProducto
 * Namespace: http://www.synergyj.com/cursos/webservices/prodorden
 * Java type: com.synergyj.cursos.webservices.prodorden.XMLBProducto
 *
 * Automatically generated - do not modify.
 */
package com.synergyj.cursos.webservices.prodorden.impl;
/**
 * An XML XMLBProducto(@http://www.synergyj.com/cursos/webservices/prodorden).
 *
 * This is a complex type.
 */
public class XMLBProductoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.synergyj.cursos.webservices.prodorden.XMLBProducto
{
    private static final long serialVersionUID = 1L;
    
    public XMLBProductoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NUMEROPRODUCTO$0 = 
        new javax.xml.namespace.QName("", "numeroProducto");
    private static final javax.xml.namespace.QName NOMBREPRODUCTO$2 = 
        new javax.xml.namespace.QName("", "nombreProducto");
    private static final javax.xml.namespace.QName DESCRIPCION$4 = 
        new javax.xml.namespace.QName("", "descripcion");
    
    
    /**
     * Gets the "numeroProducto" element
     */
    public int getNumeroProducto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMEROPRODUCTO$0, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "numeroProducto" element
     */
    public org.apache.xmlbeans.XmlInt xgetNumeroProducto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMEROPRODUCTO$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "numeroProducto" element
     */
    public void setNumeroProducto(int numeroProducto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMEROPRODUCTO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMEROPRODUCTO$0);
            }
            target.setIntValue(numeroProducto);
        }
    }
    
    /**
     * Sets (as xml) the "numeroProducto" element
     */
    public void xsetNumeroProducto(org.apache.xmlbeans.XmlInt numeroProducto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlInt target = null;
            target = (org.apache.xmlbeans.XmlInt)get_store().find_element_user(NUMEROPRODUCTO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlInt)get_store().add_element_user(NUMEROPRODUCTO$0);
            }
            target.set(numeroProducto);
        }
    }
    
    /**
     * Gets the "nombreProducto" element
     */
    public java.lang.String getNombreProducto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMBREPRODUCTO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nombreProducto" element
     */
    public org.apache.xmlbeans.XmlString xgetNombreProducto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBREPRODUCTO$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "nombreProducto" element
     */
    public void setNombreProducto(java.lang.String nombreProducto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMBREPRODUCTO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOMBREPRODUCTO$2);
            }
            target.setStringValue(nombreProducto);
        }
    }
    
    /**
     * Sets (as xml) the "nombreProducto" element
     */
    public void xsetNombreProducto(org.apache.xmlbeans.XmlString nombreProducto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBREPRODUCTO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOMBREPRODUCTO$2);
            }
            target.set(nombreProducto);
        }
    }
    
    /**
     * Gets the "descripcion" element
     */
    public java.lang.String getDescripcion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPCION$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "descripcion" element
     */
    public org.apache.xmlbeans.XmlString xgetDescripcion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPCION$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "descripcion" element
     */
    public boolean isSetDescripcion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(DESCRIPCION$4) != 0;
        }
    }
    
    /**
     * Sets the "descripcion" element
     */
    public void setDescripcion(java.lang.String descripcion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(DESCRIPCION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(DESCRIPCION$4);
            }
            target.setStringValue(descripcion);
        }
    }
    
    /**
     * Sets (as xml) the "descripcion" element
     */
    public void xsetDescripcion(org.apache.xmlbeans.XmlString descripcion)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(DESCRIPCION$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(DESCRIPCION$4);
            }
            target.set(descripcion);
        }
    }
    
    /**
     * Unsets the "descripcion" element
     */
    public void unsetDescripcion()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(DESCRIPCION$4, 0);
        }
    }
}
