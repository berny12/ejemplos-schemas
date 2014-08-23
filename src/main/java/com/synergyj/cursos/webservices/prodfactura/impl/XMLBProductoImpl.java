/*
 * XML Type:  XMLBProducto
 * Namespace: http://www.synergyj.com/cursos/webservices/prodfactura
 * Java type: com.synergyj.cursos.webservices.prodfactura.XMLBProducto
 *
 * Automatically generated - do not modify.
 */
package com.synergyj.cursos.webservices.prodfactura.impl;
/**
 * An XML XMLBProducto(@http://www.synergyj.com/cursos/webservices/prodfactura).
 *
 * This is a complex type.
 */
public class XMLBProductoImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.synergyj.cursos.webservices.prodfactura.XMLBProducto
{
    private static final long serialVersionUID = 1L;
    
    public XMLBProductoImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName CLAVEPRODUCTO$0 = 
        new javax.xml.namespace.QName("", "claveProducto");
    private static final javax.xml.namespace.QName CANTIDAD$2 = 
        new javax.xml.namespace.QName("", "cantidad");
    private static final javax.xml.namespace.QName PRECIOUNITARIO$4 = 
        new javax.xml.namespace.QName("", "precioUnitario");
    private static final javax.xml.namespace.QName IVA$6 = 
        new javax.xml.namespace.QName("", "iva");
    
    
    /**
     * Gets the "claveProducto" element
     */
    public java.lang.String getClaveProducto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLAVEPRODUCTO$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "claveProducto" element
     */
    public org.apache.xmlbeans.XmlString xgetClaveProducto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLAVEPRODUCTO$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "claveProducto" element
     */
    public void setClaveProducto(java.lang.String claveProducto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CLAVEPRODUCTO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CLAVEPRODUCTO$0);
            }
            target.setStringValue(claveProducto);
        }
    }
    
    /**
     * Sets (as xml) the "claveProducto" element
     */
    public void xsetClaveProducto(org.apache.xmlbeans.XmlString claveProducto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(CLAVEPRODUCTO$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(CLAVEPRODUCTO$0);
            }
            target.set(claveProducto);
        }
    }
    
    /**
     * Gets the "cantidad" element
     */
    public int getCantidad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CANTIDAD$2, 0);
            if (target == null)
            {
                return 0;
            }
            return target.getIntValue();
        }
    }
    
    /**
     * Gets (as xml) the "cantidad" element
     */
    public com.synergyj.cursos.webservices.prodfactura.XMLBProducto.Cantidad xgetCantidad()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.synergyj.cursos.webservices.prodfactura.XMLBProducto.Cantidad target = null;
            target = (com.synergyj.cursos.webservices.prodfactura.XMLBProducto.Cantidad)get_store().find_element_user(CANTIDAD$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "cantidad" element
     */
    public void setCantidad(int cantidad)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(CANTIDAD$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(CANTIDAD$2);
            }
            target.setIntValue(cantidad);
        }
    }
    
    /**
     * Sets (as xml) the "cantidad" element
     */
    public void xsetCantidad(com.synergyj.cursos.webservices.prodfactura.XMLBProducto.Cantidad cantidad)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.synergyj.cursos.webservices.prodfactura.XMLBProducto.Cantidad target = null;
            target = (com.synergyj.cursos.webservices.prodfactura.XMLBProducto.Cantidad)get_store().find_element_user(CANTIDAD$2, 0);
            if (target == null)
            {
                target = (com.synergyj.cursos.webservices.prodfactura.XMLBProducto.Cantidad)get_store().add_element_user(CANTIDAD$2);
            }
            target.set(cantidad);
        }
    }
    
    /**
     * Gets the "precioUnitario" element
     */
    public double getPrecioUnitario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRECIOUNITARIO$4, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "precioUnitario" element
     */
    public org.apache.xmlbeans.XmlDouble xgetPrecioUnitario()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(PRECIOUNITARIO$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "precioUnitario" element
     */
    public void setPrecioUnitario(double precioUnitario)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PRECIOUNITARIO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PRECIOUNITARIO$4);
            }
            target.setDoubleValue(precioUnitario);
        }
    }
    
    /**
     * Sets (as xml) the "precioUnitario" element
     */
    public void xsetPrecioUnitario(org.apache.xmlbeans.XmlDouble precioUnitario)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(PRECIOUNITARIO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(PRECIOUNITARIO$4);
            }
            target.set(precioUnitario);
        }
    }
    
    /**
     * Gets the "iva" element
     */
    public double getIva()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IVA$6, 0);
            if (target == null)
            {
                return 0.0;
            }
            return target.getDoubleValue();
        }
    }
    
    /**
     * Gets (as xml) the "iva" element
     */
    public org.apache.xmlbeans.XmlDouble xgetIva()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(IVA$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "iva" element
     */
    public void setIva(double iva)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IVA$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IVA$6);
            }
            target.setDoubleValue(iva);
        }
    }
    
    /**
     * Sets (as xml) the "iva" element
     */
    public void xsetIva(org.apache.xmlbeans.XmlDouble iva)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDouble target = null;
            target = (org.apache.xmlbeans.XmlDouble)get_store().find_element_user(IVA$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDouble)get_store().add_element_user(IVA$6);
            }
            target.set(iva);
        }
    }
    /**
     * An XML cantidad(@).
     *
     * This is an atomic type that is a restriction of com.synergyj.cursos.webservices.prodfactura.XMLBProducto$Cantidad.
     */
    public static class CantidadImpl extends org.apache.xmlbeans.impl.values.JavaIntHolderEx implements com.synergyj.cursos.webservices.prodfactura.XMLBProducto.Cantidad
    {
        private static final long serialVersionUID = 1L;
        
        public CantidadImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected CantidadImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
