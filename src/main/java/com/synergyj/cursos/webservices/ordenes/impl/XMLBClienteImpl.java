/*
 * XML Type:  XMLBCliente
 * Namespace: http://www.synergyj.com/cursos/webservices/ordenes
 * Java type: com.synergyj.cursos.webservices.ordenes.XMLBCliente
 *
 * Automatically generated - do not modify.
 */
package com.synergyj.cursos.webservices.ordenes.impl;
/**
 * An XML XMLBCliente(@http://www.synergyj.com/cursos/webservices/ordenes).
 *
 * This is a complex type.
 */
public class XMLBClienteImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.synergyj.cursos.webservices.ordenes.XMLBCliente
{
    private static final long serialVersionUID = 1L;
    
    public XMLBClienteImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NOMBRE$0 = 
        new javax.xml.namespace.QName("", "nombre");
    private static final javax.xml.namespace.QName APELLIDOPATERNO$2 = 
        new javax.xml.namespace.QName("", "apellidoPaterno");
    private static final javax.xml.namespace.QName APELLIDOMATERNO$4 = 
        new javax.xml.namespace.QName("", "apellidoMaterno");
    private static final javax.xml.namespace.QName SEXO$6 = 
        new javax.xml.namespace.QName("", "sexo");
    
    
    /**
     * Gets the "nombre" element
     */
    public java.lang.String getNombre()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMBRE$0, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "nombre" element
     */
    public org.apache.xmlbeans.XmlString xgetNombre()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBRE$0, 0);
            return target;
        }
    }
    
    /**
     * Sets the "nombre" element
     */
    public void setNombre(java.lang.String nombre)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(NOMBRE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(NOMBRE$0);
            }
            target.setStringValue(nombre);
        }
    }
    
    /**
     * Sets (as xml) the "nombre" element
     */
    public void xsetNombre(org.apache.xmlbeans.XmlString nombre)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(NOMBRE$0, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(NOMBRE$0);
            }
            target.set(nombre);
        }
    }
    
    /**
     * Gets the "apellidoPaterno" element
     */
    public java.lang.String getApellidoPaterno()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APELLIDOPATERNO$2, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "apellidoPaterno" element
     */
    public org.apache.xmlbeans.XmlString xgetApellidoPaterno()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APELLIDOPATERNO$2, 0);
            return target;
        }
    }
    
    /**
     * Sets the "apellidoPaterno" element
     */
    public void setApellidoPaterno(java.lang.String apellidoPaterno)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APELLIDOPATERNO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(APELLIDOPATERNO$2);
            }
            target.setStringValue(apellidoPaterno);
        }
    }
    
    /**
     * Sets (as xml) the "apellidoPaterno" element
     */
    public void xsetApellidoPaterno(org.apache.xmlbeans.XmlString apellidoPaterno)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APELLIDOPATERNO$2, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(APELLIDOPATERNO$2);
            }
            target.set(apellidoPaterno);
        }
    }
    
    /**
     * Gets the "apellidoMaterno" element
     */
    public java.lang.String getApellidoMaterno()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APELLIDOMATERNO$4, 0);
            if (target == null)
            {
                return null;
            }
            return target.getStringValue();
        }
    }
    
    /**
     * Gets (as xml) the "apellidoMaterno" element
     */
    public org.apache.xmlbeans.XmlString xgetApellidoMaterno()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APELLIDOMATERNO$4, 0);
            return target;
        }
    }
    
    /**
     * True if has "apellidoMaterno" element
     */
    public boolean isSetApellidoMaterno()
    {
        synchronized (monitor())
        {
            check_orphaned();
            return get_store().count_elements(APELLIDOMATERNO$4) != 0;
        }
    }
    
    /**
     * Sets the "apellidoMaterno" element
     */
    public void setApellidoMaterno(java.lang.String apellidoMaterno)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(APELLIDOMATERNO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(APELLIDOMATERNO$4);
            }
            target.setStringValue(apellidoMaterno);
        }
    }
    
    /**
     * Sets (as xml) the "apellidoMaterno" element
     */
    public void xsetApellidoMaterno(org.apache.xmlbeans.XmlString apellidoMaterno)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlString target = null;
            target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(APELLIDOMATERNO$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(APELLIDOMATERNO$4);
            }
            target.set(apellidoMaterno);
        }
    }
    
    /**
     * Unsets the "apellidoMaterno" element
     */
    public void unsetApellidoMaterno()
    {
        synchronized (monitor())
        {
            check_orphaned();
            get_store().remove_element(APELLIDOMATERNO$4, 0);
        }
    }
    
    /**
     * Gets the "sexo" element
     */
    public com.synergyj.cursos.webservices.ordenes.XMLBCliente.Sexo.Enum getSexo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEXO$6, 0);
            if (target == null)
            {
                return null;
            }
            return (com.synergyj.cursos.webservices.ordenes.XMLBCliente.Sexo.Enum)target.getEnumValue();
        }
    }
    
    /**
     * Gets (as xml) the "sexo" element
     */
    public com.synergyj.cursos.webservices.ordenes.XMLBCliente.Sexo xgetSexo()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.synergyj.cursos.webservices.ordenes.XMLBCliente.Sexo target = null;
            target = (com.synergyj.cursos.webservices.ordenes.XMLBCliente.Sexo)get_store().find_element_user(SEXO$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "sexo" element
     */
    public void setSexo(com.synergyj.cursos.webservices.ordenes.XMLBCliente.Sexo.Enum sexo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(SEXO$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(SEXO$6);
            }
            target.setEnumValue(sexo);
        }
    }
    
    /**
     * Sets (as xml) the "sexo" element
     */
    public void xsetSexo(com.synergyj.cursos.webservices.ordenes.XMLBCliente.Sexo sexo)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.synergyj.cursos.webservices.ordenes.XMLBCliente.Sexo target = null;
            target = (com.synergyj.cursos.webservices.ordenes.XMLBCliente.Sexo)get_store().find_element_user(SEXO$6, 0);
            if (target == null)
            {
                target = (com.synergyj.cursos.webservices.ordenes.XMLBCliente.Sexo)get_store().add_element_user(SEXO$6);
            }
            target.set(sexo);
        }
    }
    /**
     * An XML sexo(@).
     *
     * This is an atomic type that is a restriction of com.synergyj.cursos.webservices.ordenes.XMLBCliente$Sexo.
     */
    public static class SexoImpl extends org.apache.xmlbeans.impl.values.JavaStringEnumerationHolderEx implements com.synergyj.cursos.webservices.ordenes.XMLBCliente.Sexo
    {
        private static final long serialVersionUID = 1L;
        
        public SexoImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType, false);
        }
        
        protected SexoImpl(org.apache.xmlbeans.SchemaType sType, boolean b)
        {
            super(sType, b);
        }
    }
}
