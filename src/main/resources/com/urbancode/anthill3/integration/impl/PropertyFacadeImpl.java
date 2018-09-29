/*
 * XML Type:  PropertyFacade
 * Namespace: integration.anthill3.urbancode.com
 * Java type: com.urbancode.anthill3.integration.PropertyFacade
 *
 * Automatically generated - do not modify.
 */
package com.urbancode.anthill3.integration.impl;
/**
 * An XML PropertyFacade(@integration.anthill3.urbancode.com).
 *
 * This is a complex type.
 */
public class PropertyFacadeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.PropertyFacade
{
    
    public PropertyFacadeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName NAME$0 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName VALUE$2 = 
        new javax.xml.namespace.QName("", "value");
    
    
    /**
     * Gets the "name" element
     */
    public org.xmlsoap.schemas.soap.encoding.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "name" element
     */
    public boolean isNilName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(NAME$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "name" element
     */
    public void setName(org.xmlsoap.schemas.soap.encoding.String name)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(NAME$0);
            }
            target.set(name);
        }
    }
    
    /**
     * Appends and returns a new empty "name" element
     */
    public org.xmlsoap.schemas.soap.encoding.String addNewName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(NAME$0);
            return target;
        }
    }
    
    /**
     * Nils the "name" element
     */
    public void setNilName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(NAME$0, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(NAME$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "value" element
     */
    public org.xmlsoap.schemas.soap.encoding.String getValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(VALUE$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "value" element
     */
    public boolean isNilValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(VALUE$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "value" element
     */
    public void setValue(org.xmlsoap.schemas.soap.encoding.String value)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(VALUE$2, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(VALUE$2);
            }
            target.set(value);
        }
    }
    
    /**
     * Appends and returns a new empty "value" element
     */
    public org.xmlsoap.schemas.soap.encoding.String addNewValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(VALUE$2);
            return target;
        }
    }
    
    /**
     * Nils the "value" element
     */
    public void setNilValue()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(VALUE$2, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(VALUE$2);
            }
            target.setNil();
        }
    }
}
