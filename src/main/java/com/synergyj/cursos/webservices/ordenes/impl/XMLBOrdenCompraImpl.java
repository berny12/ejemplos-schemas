/*
 * XML Type:  XMLBOrdenCompra
 * Namespace: http://www.synergyj.com/cursos/webservices/ordenes
 * Java type: com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra
 *
 * Automatically generated - do not modify.
 */
package com.synergyj.cursos.webservices.ordenes.impl;
/**
 * An XML XMLBOrdenCompra(@http://www.synergyj.com/cursos/webservices/ordenes).
 *
 * This is a complex type.
 */
public class XMLBOrdenCompraImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra
{
    private static final long serialVersionUID = 1L;
    
    public XMLBOrdenCompraImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName FECHAORDEN$0 = 
        new javax.xml.namespace.QName("", "fechaOrden");
    private static final javax.xml.namespace.QName SUCURSAL$2 = 
        new javax.xml.namespace.QName("", "sucursal");
    private static final javax.xml.namespace.QName NUMEROORDEN$4 = 
        new javax.xml.namespace.QName("", "numeroOrden");
    private static final javax.xml.namespace.QName CLIENTE$6 = 
        new javax.xml.namespace.QName("", "cliente");
    private static final javax.xml.namespace.QName PRODUCTO$8 = 
        new javax.xml.namespace.QName("", "producto");
    
    
    /**
     * Gets the "fechaOrden" element
     */
    public java.util.Calendar getFechaOrden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FECHAORDEN$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getCalendarValue();
        }
    }
    
    /**
     * Gets (as xml) the "fechaOrden" element
     */
    public org.apache.xmlbeans.XmlDateTime xgetFechaOrden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(FECHAORDEN$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "fechaOrden" element
     */
    public void setFechaOrden(java.util.Calendar fechaOrden)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(FECHAORDEN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(FECHAORDEN$0);
            }
            target.setCalendarValue(fechaOrden);
        }
    }
    
    /**
     * Sets (as xml) the "fechaOrden" element
     */
    public void xsetFechaOrden(org.apache.xmlbeans.XmlDateTime fechaOrden)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlDateTime target = null;
            target = (org.apache.xmlbeans.XmlDateTime)get_store().find_element_user(FECHAORDEN$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlDateTime)get_store().add_element_user(FECHAORDEN$0);
            }
            target.set(fechaOrden);
        }
    }
    
    /**
     * Gets the "sucursal" element
     */
    public java.lang.String getSucursal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUCURSAL$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "sucursal" element
     */
    public org.apache.xmlbeans.XmlString xgetSucursal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUCURSAL$2, 0);
            return target;
        }
    }
    
    /**
     * True if has "sucursal" element
     */
    public boolean isSetSucursal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(SUCURSAL$2) != 0;
        }
    }
    
    /**
     * Sets the "sucursal" element
     */
    public void setSucursal(java.lang.String sucursal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SUCURSAL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SUCURSAL$2);
            }
            target.setStringValue(sucursal);
        }
    }
    
    /**
     * Sets (as xml) the "sucursal" element
     */
    public void xsetSucursal(org.apache.xmlbeans.XmlString sucursal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(SUCURSAL$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(SUCURSAL$2);
            }
            target.set(sucursal);
        }
    }
    
    /**
     * Unsets the "sucursal" element
     */
    public void unsetSucursal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(SUCURSAL$2, 0);
        }
    }
    
    /**
     * Gets the "numeroOrden" element
     */
    public java.lang.String getNumeroOrden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMEROORDEN$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "numeroOrden" element
     */
    public com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra.NumeroOrden xgetNumeroOrden()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra.NumeroOrden target = null;
            target = (com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra.NumeroOrden)get_store().find_element_user(NUMEROORDEN$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "numeroOrden" element
     */
    public void setNumeroOrden(java.lang.String numeroOrden)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NUMEROORDEN$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NUMEROORDEN$4);
            }
            target.setStringValue(numeroOrden);
        }
    }
    
    /**
     * Sets (as xml) the "numeroOrden" element
     */
    public void xsetNumeroOrden(com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra.NumeroOrden numeroOrden)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra.NumeroOrden target = null;
            target = (com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra.NumeroOrden)get_store().find_element_user(NUMEROORDEN$4, 0);
            if (target == null)
            {
                target = (com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra.NumeroOrden)get_store().add_element_user(NUMEROORDEN$4);
            }
            target.set(numeroOrden);
        }
    }
    
    /**
     * Gets the "cliente" element
     */
    public com.synergyj.cursos.webservices.ordenes.XMLBCliente getCliente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.synergyj.cursos.webservices.ordenes.XMLBCliente target = null;
            target = (com.synergyj.cursos.webservices.ordenes.XMLBCliente)get_store().find_element_user(CLIENTE$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "cliente" element
     */
    public void setCliente(com.synergyj.cursos.webservices.ordenes.XMLBCliente cliente)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.synergyj.cursos.webservices.ordenes.XMLBCliente target = null;
            target = (com.synergyj.cursos.webservices.ordenes.XMLBCliente)get_store().find_element_user(CLIENTE$6, 0);
            if (target == null)
            {
                target = (com.synergyj.cursos.webservices.ordenes.XMLBCliente)get_store().add_element_user(CLIENTE$6);
            }
            target.set(cliente);
        }
    }
    
    /**
     * Appends and returns a new empty "cliente" element
     */
    public com.synergyj.cursos.webservices.ordenes.XMLBCliente addNewCliente()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.synergyj.cursos.webservices.ordenes.XMLBCliente target = null;
            target = (com.synergyj.cursos.webservices.ordenes.XMLBCliente)get_store().add_element_user(CLIENTE$6);
            return target;
        }
    }
    
    /**
     * Gets array of all "producto" elements
     */
    public com.synergyj.cursos.webservices.prodorden.XMLBProducto[] getProductoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PRODUCTO$8, targetList);
            com.synergyj.cursos.webservices.prodorden.XMLBProducto[] result = new com.synergyj.cursos.webservices.prodorden.XMLBProducto[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "producto" element
     */
    public com.synergyj.cursos.webservices.prodorden.XMLBProducto getProductoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.synergyj.cursos.webservices.prodorden.XMLBProducto target = null;
            target = (com.synergyj.cursos.webservices.prodorden.XMLBProducto)get_store().find_element_user(PRODUCTO$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            return target;
        }
    }
    
    /**
     * Returns number of "producto" element
     */
    public int sizeOfProductoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(PRODUCTO$8);
        }
    }
    
    /**
     * Sets array of all "producto" element
     */
    public void setProductoArray(com.synergyj.cursos.webservices.prodorden.XMLBProducto[] productoArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(productoArray, PRODUCTO$8);
        }
    }
    
    /**
     * Sets ith "producto" element
     */
    public void setProductoArray(int i, com.synergyj.cursos.webservices.prodorden.XMLBProducto producto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.synergyj.cursos.webservices.prodorden.XMLBProducto target = null;
            target = (com.synergyj.cursos.webservices.prodorden.XMLBProducto)get_store().find_element_user(PRODUCTO$8, i);
            if (target == null)
            {
                throw new IndexOutOfBoundsException();
            }
            target.set(producto);
        }
    }
    
    /**
     * Inserts and returns a new empty value (as xml) as the ith "producto" element
     */
    public com.synergyj.cursos.webservices.prodorden.XMLBProducto insertNewProducto(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.synergyj.cursos.webservices.prodorden.XMLBProducto target = null;
            target = (com.synergyj.cursos.webservices.prodorden.XMLBProducto)get_store().insert_element_user(PRODUCTO$8, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "producto" element
     */
    public com.synergyj.cursos.webservices.prodorden.XMLBProducto addNewProducto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.synergyj.cursos.webservices.prodorden.XMLBProducto target = null;
            target = (com.synergyj.cursos.webservices.prodorden.XMLBProducto)get_store().add_element_user(PRODUCTO$8);
            return target;
        }
    }
    
    /**
     * Removes the ith "producto" element
     */
    public void removeProducto(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(PRODUCTO$8, i);
        }
    }
    /**
     * An XML numeroOrden(@).
     *
     * This is an atomic type that is a restriction of com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra$NumeroOrden.
     */
    public static class NumeroOrdenImpl extends org.apache.xmlbeans.impl.values.JavaStringHolderEx implements com.synergyj.cursos.webservices.ordenes.XMLBOrdenCompra.NumeroOrden
    {
        private static final long serialVersionUID = 1L;
        
        public NumeroOrdenImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected NumeroOrdenImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
