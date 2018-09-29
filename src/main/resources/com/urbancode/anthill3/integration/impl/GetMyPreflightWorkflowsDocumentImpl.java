/*
 * An XML document type.
 * Localname: getMyPreflightWorkflows
 * Namespace: integration.anthill3.urbancode.com
 * Java type: com.urbancode.anthill3.integration.GetMyPreflightWorkflowsDocument
 *
 * Automatically generated - do not modify.
 */
package com.urbancode.anthill3.integration.impl;
/**
 * A document containing one getMyPreflightWorkflows(@integration.anthill3.urbancode.com) element.
 *
 * This is a complex type.
 */
public class GetMyPreflightWorkflowsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.GetMyPreflightWorkflowsDocument
{
    
    public GetMyPreflightWorkflowsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETMYPREFLIGHTWORKFLOWS$0 = 
        new javax.xml.namespace.QName("integration.anthill3.urbancode.com", "getMyPreflightWorkflows");
    
    
    /**
     * Gets the "getMyPreflightWorkflows" element
     */
    public com.urbancode.anthill3.integration.GetMyPreflightWorkflowsDocument.GetMyPreflightWorkflows getGetMyPreflightWorkflows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetMyPreflightWorkflowsDocument.GetMyPreflightWorkflows target = null;
            target = (com.urbancode.anthill3.integration.GetMyPreflightWorkflowsDocument.GetMyPreflightWorkflows)get_store().find_element_user(GETMYPREFLIGHTWORKFLOWS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getMyPreflightWorkflows" element
     */
    public void setGetMyPreflightWorkflows(com.urbancode.anthill3.integration.GetMyPreflightWorkflowsDocument.GetMyPreflightWorkflows getMyPreflightWorkflows)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetMyPreflightWorkflowsDocument.GetMyPreflightWorkflows target = null;
            target = (com.urbancode.anthill3.integration.GetMyPreflightWorkflowsDocument.GetMyPreflightWorkflows)get_store().find_element_user(GETMYPREFLIGHTWORKFLOWS$0, 0);
            if (target == null)
            {
                target = (com.urbancode.anthill3.integration.GetMyPreflightWorkflowsDocument.GetMyPreflightWorkflows)get_store().add_element_user(GETMYPREFLIGHTWORKFLOWS$0);
            }
            target.set(getMyPreflightWorkflows);
        }
    }
    
    /**
     * Appends and returns a new empty "getMyPreflightWorkflows" element
     */
    public com.urbancode.anthill3.integration.GetMyPreflightWorkflowsDocument.GetMyPreflightWorkflows addNewGetMyPreflightWorkflows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetMyPreflightWorkflowsDocument.GetMyPreflightWorkflows target = null;
            target = (com.urbancode.anthill3.integration.GetMyPreflightWorkflowsDocument.GetMyPreflightWorkflows)get_store().add_element_user(GETMYPREFLIGHTWORKFLOWS$0);
            return target;
        }
    }
    /**
     * An XML getMyPreflightWorkflows(@integration.anthill3.urbancode.com).
     *
     * This is a complex type.
     */
    public static class GetMyPreflightWorkflowsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.GetMyPreflightWorkflowsDocument.GetMyPreflightWorkflows
    {
        
        public GetMyPreflightWorkflowsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IN0$0 = 
            new javax.xml.namespace.QName("", "in0");
        private static final javax.xml.namespace.QName IN1$2 = 
            new javax.xml.namespace.QName("", "in1");
        
        
        /**
         * Gets the "in0" element
         */
        public java.lang.String getIn0()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IN0$0, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "in0" element
         */
        public org.apache.xmlbeans.XmlString xgetIn0()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IN0$0, 0);
                return target;
            }
        }
        
        /**
         * Sets the "in0" element
         */
        public void setIn0(java.lang.String in0)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IN0$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IN0$0);
                }
                target.setStringValue(in0);
            }
        }
        
        /**
         * Sets (as xml) the "in0" element
         */
        public void xsetIn0(org.apache.xmlbeans.XmlString in0)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IN0$0, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IN0$0);
                }
                target.set(in0);
            }
        }
        
        /**
         * Gets the "in1" element
         */
        public java.lang.String getIn1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IN1$2, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "in1" element
         */
        public org.apache.xmlbeans.XmlString xgetIn1()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IN1$2, 0);
                return target;
            }
        }
        
        /**
         * Sets the "in1" element
         */
        public void setIn1(java.lang.String in1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IN1$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IN1$2);
                }
                target.setStringValue(in1);
            }
        }
        
        /**
         * Sets (as xml) the "in1" element
         */
        public void xsetIn1(org.apache.xmlbeans.XmlString in1)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IN1$2, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IN1$2);
                }
                target.set(in1);
            }
        }
    }
}
