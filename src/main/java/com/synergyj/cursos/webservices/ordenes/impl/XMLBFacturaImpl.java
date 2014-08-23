/*
 * XML Type:  XMLBFactura
 * Namespace: http://www.synergyj.com/cursos/webservices/ordenes
 * Java type: com.synergyj.cursos.webservices.ordenes.XMLBFactura
 *
 * Automatically generated - do not modify.
 */
package com.synergyj.cursos.webservices.ordenes.impl;
/**
 * An XML XMLBFactura(@http://www.synergyj.com/cursos/webservices/ordenes).
 *
 * This is a complex type.
 */
public class XMLBFacturaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.synergyj.cursos.webservices.ordenes.XMLBFactura
{
    private static final long serialVersionUID = 1L;
    
    public XMLBFacturaImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ORDEN$0 = 
        new javax.xml.namespace.QName("", "orden");
    private static final javax.xml.namespace.QName DETALLEFACTURA$2 = 
        new javax.xml.namespace.QName("", "detalleFactura");
    private static final javax.xml.namespace.QName TOTAL$4 = 
        new javax.xml.namespace.QName("", "total");
    private static final javax.xml.namespace.QName IVA$6 = 
        new javax.xml.namespace.QName("", "iva");
    
    
    /**
     * Gets the "orden" element
     */
    public com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra getOrden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra target = null;
            target = (com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra)get_store().find_element_user(ORDEN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "orden" element
     */
    public void setOrden(com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra orden)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra target = null;
            target = (com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra)get_store().find_element_user(ORDEN$0, 0);
            if (target == null)
            {
                target = (com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra)get_store().add_element_user(ORDEN$0);
            }
            target.set(orden);
        }
    }
    
    /**
     * Appends and returns a new empty "orden" element
     */
    public com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra addNewOrden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra target = null;
            target = (com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra)get_store().add_element_user(ORDEN$0);
            return target;
        }
    }
    
    /**
     * Gets the "detalleFactura" element
     */
    public com.synergyj.cursos.webservices.ordenes.XMLBListaProdFactura getDetalleFactura()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.synergyj.cursos.webservices.ordenes.XMLBListaProdFactura target = null;
            target = (com.synergyj.cursos.webservices.ordenes.XMLBListaProdFactura)get_store().find_element_user(DETALLEFACTURA$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "detalleFactura" element
     */
    public void setDetalleFactura(com.synergyj.cursos.webservices.ordenes.XMLBListaProdFactura detalleFactura)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.synergyj.cursos.webservices.ordenes.XMLBListaProdFactura target = null;
            target = (com.synergyj.cursos.webservices.ordenes.XMLBListaProdFactura)get_store().find_element_user(DETALLEFACTURA$2, 0);
            if (target == null)
            {
                target = (com.synergyj.cursos.webservices.ordenes.XMLBListaProdFactura)get_store().add_element_user(DETALLEFACTURA$2);
            }
            target.set(detalleFactura);
        }
    }
    
    /**
     * Appends and returns a new empty "detalleFactura" element
     */
    public com.synergyj.cursos.webservices.ordenes.XMLBListaProdFactura addNewDetalleFactura()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.synergyj.cursos.webservices.ordenes.XMLBListaProdFactura target = null;
            target = (com.synergyj.cursos.webservices.ordenes.XMLBListaProdFactura)get_store().add_element_user(DETALLEFACTURA$2);
            return target;
        }
    }
    
    /**
     * Gets the "total" element
     */
    public java.math.BigDecimal getTotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTAL$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getBigDecimalValue();
        }
    }
    
    /**
     * Gets (as xml) the "total" element
     */
    public com.synergyj.cursos.webservices.ordenes.XMLBFactura.Total xgetTotal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.synergyj.cursos.webservices.ordenes.XMLBFactura.Total target = null;
            target = (com.synergyj.cursos.webservices.ordenes.XMLBFactura.Total)get_store().find_element_user(TOTAL$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "total" element
     */
    public void setTotal(java.math.BigDecimal total)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(TOTAL$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(TOTAL$4);
            }
            target.setBigDecimalValue(total);
        }
    }
    
    /**
     * Sets (as xml) the "total" element
     */
    public void xsetTotal(com.synergyj.cursos.webservices.ordenes.XMLBFactura.Total total)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.synergyj.cursos.webservices.ordenes.XMLBFactura.Total target = null;
            target = (com.synergyj.cursos.webservices.ordenes.XMLBFactura.Total)get_store().find_element_user(TOTAL$4, 0);
            if (target == null)
            {
                target = (com.synergyj.cursos.webservices.ordenes.XMLBFactura.Total)get_store().add_element_user(TOTAL$4);
            }
            target.set(total);
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
     * An XML total(@).
     *
     * This is an atomic type that is a restriction of com.synergyj.cursos.webservices.ordenes.XMLBFactura$Total.
     */
    public static class TotalImpl extends org.apache.xmlbeans.impl.values.JavaDecimalHolderEx implements com.synergyj.cursos.webservices.ordenes.XMLBFactura.Total
    {
        private static final long serialVersionUID = 1L;
        
        public TotalImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected TotalImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
