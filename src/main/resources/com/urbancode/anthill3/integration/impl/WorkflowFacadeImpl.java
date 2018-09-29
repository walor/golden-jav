/*
 * XML Type:  WorkflowFacade
 * Namespace: integration.anthill3.urbancode.com
 * Java type: com.urbancode.anthill3.integration.WorkflowFacade
 *
 * Automatically generated - do not modify.
 */
package com.urbancode.anthill3.integration.impl;
/**
 * An XML WorkflowFacade(@integration.anthill3.urbancode.com).
 *
 * This is a complex type.
 */
public class WorkflowFacadeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.WorkflowFacade
{
    
    public WorkflowFacadeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName ID$0 = 
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName NAME$2 = 
        new javax.xml.namespace.QName("", "name");
    private static final javax.xml.namespace.QName ORIGINATING$4 = 
        new javax.xml.namespace.QName("", "originating");
    private static final javax.xml.namespace.QName PREFLIGHTCOPY$6 = 
        new javax.xml.namespace.QName("", "preflightCopy");
    private static final javax.xml.namespace.QName PREFLIGHTORIGINAL$8 = 
        new javax.xml.namespace.QName("", "preflightOriginal");
    private static final javax.xml.namespace.QName PROJECTID$10 = 
        new javax.xml.namespace.QName("", "projectId");
    
    
    /**
     * Gets the "id" element
     */
    public org.xmlsoap.schemas.soap.encoding.String getId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(ID$0, 0);
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
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(ID$0, 0);
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
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(ID$0);
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
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(ID$0);
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
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(ID$0, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(ID$0);
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
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(NAME$2, 0);
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
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(NAME$2, 0);
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
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(NAME$2);
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
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(NAME$2);
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
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(NAME$2, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(NAME$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "originating" element
     */
    public boolean getOriginating()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORIGINATING$4, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "originating" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetOriginating()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ORIGINATING$4, 0);
            return target;
        }
    }
    
    /**
     * Sets the "originating" element
     */
    public void setOriginating(boolean originating)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(ORIGINATING$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(ORIGINATING$4);
            }
            target.setBooleanValue(originating);
        }
    }
    
    /**
     * Sets (as xml) the "originating" element
     */
    public void xsetOriginating(org.apache.xmlbeans.XmlBoolean originating)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(ORIGINATING$4, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(ORIGINATING$4);
            }
            target.set(originating);
        }
    }
    
    /**
     * Gets the "preflightCopy" element
     */
    public boolean getPreflightCopy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREFLIGHTCOPY$6, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "preflightCopy" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetPreflightCopy()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PREFLIGHTCOPY$6, 0);
            return target;
        }
    }
    
    /**
     * Sets the "preflightCopy" element
     */
    public void setPreflightCopy(boolean preflightCopy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREFLIGHTCOPY$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PREFLIGHTCOPY$6);
            }
            target.setBooleanValue(preflightCopy);
        }
    }
    
    /**
     * Sets (as xml) the "preflightCopy" element
     */
    public void xsetPreflightCopy(org.apache.xmlbeans.XmlBoolean preflightCopy)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PREFLIGHTCOPY$6, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PREFLIGHTCOPY$6);
            }
            target.set(preflightCopy);
        }
    }
    
    /**
     * Gets the "preflightOriginal" element
     */
    public boolean getPreflightOriginal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREFLIGHTORIGINAL$8, 0);
            if (target == null)
            {
                return false;
            }
            return target.getBooleanValue();
        }
    }
    
    /**
     * Gets (as xml) the "preflightOriginal" element
     */
    public org.apache.xmlbeans.XmlBoolean xgetPreflightOriginal()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PREFLIGHTORIGINAL$8, 0);
            return target;
        }
    }
    
    /**
     * Sets the "preflightOriginal" element
     */
    public void setPreflightOriginal(boolean preflightOriginal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.SimpleValue target = null;
            target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(PREFLIGHTORIGINAL$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(PREFLIGHTORIGINAL$8);
            }
            target.setBooleanValue(preflightOriginal);
        }
    }
    
    /**
     * Sets (as xml) the "preflightOriginal" element
     */
    public void xsetPreflightOriginal(org.apache.xmlbeans.XmlBoolean preflightOriginal)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.apache.xmlbeans.XmlBoolean target = null;
            target = (org.apache.xmlbeans.XmlBoolean)get_store().find_element_user(PREFLIGHTORIGINAL$8, 0);
            if (target == null)
            {
                target = (org.apache.xmlbeans.XmlBoolean)get_store().add_element_user(PREFLIGHTORIGINAL$8);
            }
            target.set(preflightOriginal);
        }
    }
    
    /**
     * Gets the "projectId" element
     */
    public org.xmlsoap.schemas.soap.encoding.String getProjectId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(PROJECTID$10, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "projectId" element
     */
    public boolean isNilProjectId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(PROJECTID$10, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "projectId" element
     */
    public void setProjectId(org.xmlsoap.schemas.soap.encoding.String projectId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(PROJECTID$10, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(PROJECTID$10);
            }
            target.set(projectId);
        }
    }
    
    /**
     * Appends and returns a new empty "projectId" element
     */
    public org.xmlsoap.schemas.soap.encoding.String addNewProjectId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(PROJECTID$10);
            return target;
        }
    }
    
    /**
     * Nils the "projectId" element
     */
    public void setNilProjectId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(PROJECTID$10, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(PROJECTID$10);
            }
            target.setNil();
        }
    }
}
