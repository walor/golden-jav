/*
 * XML Type:  ArtifactSetFacade
 * Namespace: integration.anthill3.urbancode.com
 * Java type: com.urbancode.anthill3.integration.ArtifactSetFacade
 *
 * Automatically generated - do not modify.
 */
package com.urbancode.anthill3.integration.impl;
/**
 * An XML ArtifactSetFacade(@integration.anthill3.urbancode.com).
 *
 * This is a complex type.
 */
public class ArtifactSetFacadeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.ArtifactSetFacade
{
    
    public ArtifactSetFacadeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BASEDIRECTORY$0 = 
        new javax.xml.namespace.QName("", "baseDirectory");
    private static final javax.xml.namespace.QName ID$2 = 
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName NAME$4 = 
        new javax.xml.namespace.QName("", "name");
    
    
    /**
     * Gets the "baseDirectory" element
     */
    public org.xmlsoap.schemas.soap.encoding.String getBaseDirectory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(BASEDIRECTORY$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "baseDirectory" element
     */
    public boolean isNilBaseDirectory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(BASEDIRECTORY$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "baseDirectory" element
     */
    public void setBaseDirectory(org.xmlsoap.schemas.soap.encoding.String baseDirectory)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(BASEDIRECTORY$0, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(BASEDIRECTORY$0);
            }
            target.set(baseDirectory);
        }
    }
    
    /**
     * Appends and returns a new empty "baseDirectory" element
     */
    public org.xmlsoap.schemas.soap.encoding.String addNewBaseDirectory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(BASEDIRECTORY$0);
            return target;
        }
    }
    
    /**
     * Nils the "baseDirectory" element
     */
    public void setNilBaseDirectory()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(BASEDIRECTORY$0, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(BASEDIRECTORY$0);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "id" element
     */
    public org.xmlsoap.schemas.soap.encoding.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(ID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "id" element
     */
    public boolean isNilId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(ID$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "id" element
     */
    public void setId(org.xmlsoap.schemas.soap.encoding.String id)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(ID$2, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(ID$2);
            }
            target.set(id);
        }
    }
    
    /**
     * Appends and returns a new empty "id" element
     */
    public org.xmlsoap.schemas.soap.encoding.String addNewId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(ID$2);
            return target;
        }
    }
    
    /**
     * Nils the "id" element
     */
    public void setNilId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(ID$2, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(ID$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "name" element
     */
    public org.xmlsoap.schemas.soap.encoding.String getName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(NAME$4, 0);
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
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(NAME$4, 0);
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
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(NAME$4, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(NAME$4);
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
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(NAME$4);
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
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(NAME$4, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(NAME$4);
            }
            target.setNil();
        }
    }
}
