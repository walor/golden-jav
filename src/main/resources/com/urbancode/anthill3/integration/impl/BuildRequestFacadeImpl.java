/*
 * XML Type:  BuildRequestFacade
 * Namespace: integration.anthill3.urbancode.com
 * Java type: com.urbancode.anthill3.integration.BuildRequestFacade
 *
 * Automatically generated - do not modify.
 */
package com.urbancode.anthill3.integration.impl;
/**
 * An XML BuildRequestFacade(@integration.anthill3.urbancode.com).
 *
 * This is a complex type.
 */
public class BuildRequestFacadeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.BuildRequestFacade
{
    
    public BuildRequestFacadeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUILDLIFEID$0 = 
        new javax.xml.namespace.QName("", "buildLifeId");
    private static final javax.xml.namespace.QName ID$2 = 
        new javax.xml.namespace.QName("", "id");
    private static final javax.xml.namespace.QName PROJECTID$4 = 
        new javax.xml.namespace.QName("", "projectId");
    private static final javax.xml.namespace.QName STATUS$6 = 
        new javax.xml.namespace.QName("", "status");
    private static final javax.xml.namespace.QName WORKFLOWID$8 = 
        new javax.xml.namespace.QName("", "workflowId");
    
    
    /**
     * Gets the "buildLifeId" element
     */
    public org.xmlsoap.schemas.soap.encoding.String getBuildLifeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(BUILDLIFEID$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "buildLifeId" element
     */
    public boolean isNilBuildLifeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(BUILDLIFEID$0, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "buildLifeId" element
     */
    public void setBuildLifeId(org.xmlsoap.schemas.soap.encoding.String buildLifeId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(BUILDLIFEID$0, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(BUILDLIFEID$0);
            }
            target.set(buildLifeId);
        }
    }
    
    /**
     * Appends and returns a new empty "buildLifeId" element
     */
    public org.xmlsoap.schemas.soap.encoding.String addNewBuildLifeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(BUILDLIFEID$0);
            return target;
        }
    }
    
    /**
     * Nils the "buildLifeId" element
     */
    public void setNilBuildLifeId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(BUILDLIFEID$0, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(BUILDLIFEID$0);
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
     * Gets the "projectId" element
     */
    public org.xmlsoap.schemas.soap.encoding.String getProjectId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(PROJECTID$4, 0);
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
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(PROJECTID$4, 0);
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
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(PROJECTID$4, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(PROJECTID$4);
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
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(PROJECTID$4);
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
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(PROJECTID$4, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(PROJECTID$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "status" element
     */
    public org.xmlsoap.schemas.soap.encoding.String getStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(STATUS$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "status" element
     */
    public boolean isNilStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(STATUS$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "status" element
     */
    public void setStatus(org.xmlsoap.schemas.soap.encoding.String status)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(STATUS$6, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(STATUS$6);
            }
            target.set(status);
        }
    }
    
    /**
     * Appends and returns a new empty "status" element
     */
    public org.xmlsoap.schemas.soap.encoding.String addNewStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(STATUS$6);
            return target;
        }
    }
    
    /**
     * Nils the "status" element
     */
    public void setNilStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(STATUS$6, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(STATUS$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "workflowId" element
     */
    public org.xmlsoap.schemas.soap.encoding.String getWorkflowId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(WORKFLOWID$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "workflowId" element
     */
    public boolean isNilWorkflowId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(WORKFLOWID$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "workflowId" element
     */
    public void setWorkflowId(org.xmlsoap.schemas.soap.encoding.String workflowId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(WORKFLOWID$8, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(WORKFLOWID$8);
            }
            target.set(workflowId);
        }
    }
    
    /**
     * Appends and returns a new empty "workflowId" element
     */
    public org.xmlsoap.schemas.soap.encoding.String addNewWorkflowId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(WORKFLOWID$8);
            return target;
        }
    }
    
    /**
     * Nils the "workflowId" element
     */
    public void setNilWorkflowId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(WORKFLOWID$8, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(WORKFLOWID$8);
            }
            target.setNil();
        }
    }
}
