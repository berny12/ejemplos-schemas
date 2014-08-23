/*
 * XML Type:  XMLBListaProdFactura
 * Namespace: http://www.synergyj.com/cursos/webservices/ordenes
 * Java type: com.synergyj.cursos.webservices.ordenes.XMLBListaProdFactura
 *
 * Automatically generated - do not modify.
 */
package com.synergyj.cursos.webservices.ordenes.impl;
/**
 * An XML XMLBListaProdFactura(@http://www.synergyj.com/cursos/webservices/ordenes).
 *
 * This is a complex type.
 */
public class XMLBListaProdFacturaImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.synergyj.cursos.webservices.ordenes.XMLBListaProdFactura
{
    private static final long serialVersionUID = 1L;
    
    public XMLBListaProdFacturaImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName PRODUCTO$0 = 
        new javax.xml.namespace.QName("", "producto");
    
    
    /**
     * Gets array of all "producto" elements
     */
    public com.synergyj.cursos.webservices.prodfactura.XMLBProducto[] getProductoArray()
    {
        synchronized (monitor())
        {
            check_orphaned();
            java.util.List targetList = new java.util.ArrayList();
            get_store().find_all_element_users(PRODUCTO$0, targetList);
            com.synergyj.cursos.webservices.prodfactura.XMLBProducto[] result = new com.synergyj.cursos.webservices.prodfactura.XMLBProducto[targetList.size()];
            targetList.toArray(result);
            return result;
        }
    }
    
    /**
     * Gets ith "producto" element
     */
    public com.synergyj.cursos.webservices.prodfactura.XMLBProducto getProductoArray(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.synergyj.cursos.webservices.prodfactura.XMLBProducto target = null;
            target = (com.synergyj.cursos.webservices.prodfactura.XMLBProducto)get_store().find_element_user(PRODUCTO$0, i);
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
            return get_store().count_elements(PRODUCTO$0);
        }
    }
    
    /**
     * Sets array of all "producto" element
     */
    public void setProductoArray(com.synergyj.cursos.webservices.prodfactura.XMLBProducto[] productoArray)
    {
        synchronized (monitor())
        {
            check_orphaned();
            arraySetterHelper(productoArray, PRODUCTO$0);
        }
    }
    
    /**
     * Sets ith "producto" element
     */
    public void setProductoArray(int i, com.synergyj.cursos.webservices.prodfactura.XMLBProducto producto)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.synergyj.cursos.webservices.prodfactura.XMLBProducto target = null;
            target = (com.synergyj.cursos.webservices.prodfactura.XMLBProducto)get_store().find_element_user(PRODUCTO$0, i);
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
    public com.synergyj.cursos.webservices.prodfactura.XMLBProducto insertNewProducto(int i)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.synergyj.cursos.webservices.prodfactura.XMLBProducto target = null;
            target = (com.synergyj.cursos.webservices.prodfactura.XMLBProducto)get_store().insert_element_user(PRODUCTO$0, i);
            return target;
        }
    }
    
    /**
     * Appends and returns a new empty value (as xml) as the last "producto" element
     */
    public com.synergyj.cursos.webservices.prodfactura.XMLBProducto addNewProducto()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.synergyj.cursos.webservices.prodfactura.XMLBProducto target = null;
            target = (com.synergyj.cursos.webservices.prodfactura.XMLBProducto)get_store().add_element_user(PRODUCTO$0);
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
            get_store().remove_element(PRODUCTO$0, i);
        }
    }
}
