/*
 * XML Type:  WorkflowActivityFacade
 * Namespace: integration.anthill3.urbancode.com
 * Java type: com.urbancode.anthill3.integration.WorkflowActivityFacade
 *
 * Automatically generated - do not modify.
 */
package com.urbancode.anthill3.integration.impl;
/**
 * An XML WorkflowActivityFacade(@integration.anthill3.urbancode.com).
 *
 * This is a complex type.
 */
public class WorkflowActivityFacadeImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.WorkflowActivityFacade
{
    
    public WorkflowActivityFacadeImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName BUILDLIFEID$0 = 
        new javax.xml.namespace.QName("", "buildLifeId");
    private static final javax.xml.namespace.QName CASEID$2 = 
        new javax.xml.namespace.QName("", "caseId");
    private static final javax.xml.namespace.QName DATE$4 = 
        new javax.xml.namespace.QName("", "date");
    private static final javax.xml.namespace.QName LATESTSTAMP$6 = 
        new javax.xml.namespace.QName("", "latestStamp");
    private static final javax.xml.namespace.QName LATESTSTATUS$8 = 
        new javax.xml.namespace.QName("", "latestStatus");
    private static final javax.xml.namespace.QName PROJECTID$10 = 
        new javax.xml.namespace.QName("", "projectId");
    private static final javax.xml.namespace.QName PROJECTNAME$12 = 
        new javax.xml.namespace.QName("", "projectName");
    private static final javax.xml.namespace.QName WORKFLOWID$14 = 
        new javax.xml.namespace.QName("", "workflowId");
    private static final javax.xml.namespace.QName WORKFLOWNAME$16 = 
        new javax.xml.namespace.QName("", "workflowName");
    
    
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
     * Gets the "caseId" element
     */
    public org.xmlsoap.schemas.soap.encoding.String getCaseId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(CASEID$2, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "caseId" element
     */
    public boolean isNilCaseId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(CASEID$2, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "caseId" element
     */
    public void setCaseId(org.xmlsoap.schemas.soap.encoding.String caseId)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(CASEID$2, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(CASEID$2);
            }
            target.set(caseId);
        }
    }
    
    /**
     * Appends and returns a new empty "caseId" element
     */
    public org.xmlsoap.schemas.soap.encoding.String addNewCaseId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(CASEID$2);
            return target;
        }
    }
    
    /**
     * Nils the "caseId" element
     */
    public void setNilCaseId()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(CASEID$2, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(CASEID$2);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "date" element
     */
    public org.xmlsoap.schemas.soap.encoding.String getDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(DATE$4, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "date" element
     */
    public boolean isNilDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(DATE$4, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "date" element
     */
    public void setDate(org.xmlsoap.schemas.soap.encoding.String date)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(DATE$4, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(DATE$4);
            }
            target.set(date);
        }
    }
    
    /**
     * Appends and returns a new empty "date" element
     */
    public org.xmlsoap.schemas.soap.encoding.String addNewDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(DATE$4);
            return target;
        }
    }
    
    /**
     * Nils the "date" element
     */
    public void setNilDate()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(DATE$4, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(DATE$4);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "latestStamp" element
     */
    public org.xmlsoap.schemas.soap.encoding.String getLatestStamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(LATESTSTAMP$6, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "latestStamp" element
     */
    public boolean isNilLatestStamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(LATESTSTAMP$6, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "latestStamp" element
     */
    public void setLatestStamp(org.xmlsoap.schemas.soap.encoding.String latestStamp)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(LATESTSTAMP$6, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(LATESTSTAMP$6);
            }
            target.set(latestStamp);
        }
    }
    
    /**
     * Appends and returns a new empty "latestStamp" element
     */
    public org.xmlsoap.schemas.soap.encoding.String addNewLatestStamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(LATESTSTAMP$6);
            return target;
        }
    }
    
    /**
     * Nils the "latestStamp" element
     */
    public void setNilLatestStamp()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(LATESTSTAMP$6, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(LATESTSTAMP$6);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "latestStatus" element
     */
    public org.xmlsoap.schemas.soap.encoding.String getLatestStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(LATESTSTATUS$8, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "latestStatus" element
     */
    public boolean isNilLatestStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(LATESTSTATUS$8, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "latestStatus" element
     */
    public void setLatestStatus(org.xmlsoap.schemas.soap.encoding.String latestStatus)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(LATESTSTATUS$8, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(LATESTSTATUS$8);
            }
            target.set(latestStatus);
        }
    }
    
    /**
     * Appends and returns a new empty "latestStatus" element
     */
    public org.xmlsoap.schemas.soap.encoding.String addNewLatestStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(LATESTSTATUS$8);
            return target;
        }
    }
    
    /**
     * Nils the "latestStatus" element
     */
    public void setNilLatestStatus()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(LATESTSTATUS$8, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(LATESTSTATUS$8);
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
    
    /**
     * Gets the "projectName" element
     */
    public org.xmlsoap.schemas.soap.encoding.String getProjectName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(PROJECTNAME$12, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "projectName" element
     */
    public boolean isNilProjectName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(PROJECTNAME$12, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "projectName" element
     */
    public void setProjectName(org.xmlsoap.schemas.soap.encoding.String projectName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(PROJECTNAME$12, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(PROJECTNAME$12);
            }
            target.set(projectName);
        }
    }
    
    /**
     * Appends and returns a new empty "projectName" element
     */
    public org.xmlsoap.schemas.soap.encoding.String addNewProjectName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(PROJECTNAME$12);
            return target;
        }
    }
    
    /**
     * Nils the "projectName" element
     */
    public void setNilProjectName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(PROJECTNAME$12, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(PROJECTNAME$12);
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
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(WORKFLOWID$14, 0);
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
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(WORKFLOWID$14, 0);
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
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(WORKFLOWID$14, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(WORKFLOWID$14);
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
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(WORKFLOWID$14);
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
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(WORKFLOWID$14, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(WORKFLOWID$14);
            }
            target.setNil();
        }
    }
    
    /**
     * Gets the "workflowName" element
     */
    public org.xmlsoap.schemas.soap.encoding.String getWorkflowName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(WORKFLOWNAME$16, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Tests for nil "workflowName" element
     */
    public boolean isNilWorkflowName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(WORKFLOWNAME$16, 0);
            if (target == null) return false;
            return target.isNil();
        }
    }
    
    /**
     * Sets the "workflowName" element
     */
    public void setWorkflowName(org.xmlsoap.schemas.soap.encoding.String workflowName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(WORKFLOWNAME$16, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(WORKFLOWNAME$16);
            }
            target.set(workflowName);
        }
    }
    
    /**
     * Appends and returns a new empty "workflowName" element
     */
    public org.xmlsoap.schemas.soap.encoding.String addNewWorkflowName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(WORKFLOWNAME$16);
            return target;
        }
    }
    
    /**
     * Nils the "workflowName" element
     */
    public void setNilWorkflowName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            org.xmlsoap.schemas.soap.encoding.String target = null;
            target = (org.xmlsoap.schemas.soap.encoding.String)get_store().find_element_user(WORKFLOWNAME$16, 0);
            if (target == null)
            {
                target = (org.xmlsoap.schemas.soap.encoding.String)get_store().add_element_user(WORKFLOWNAME$16);
            }
            target.setNil();
        }
    }
}
