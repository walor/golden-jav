/*
 * An XML document type.
 * Localname: getLatestActivityForWorkflows
 * Namespace: integration.anthill3.urbancode.com
 * Java type: com.urbancode.anthill3.integration.GetLatestActivityForWorkflowsDocument
 *
 * Automatically generated - do not modify.
 */
package com.urbancode.anthill3.integration.impl;
/**
 * A document containing one getLatestActivityForWorkflows(@integration.anthill3.urbancode.com) element.
 *
 * This is a complex type.
 */
public class GetLatestActivityForWorkflowsDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.GetLatestActivityForWorkflowsDocument
{
    
    public GetLatestActivityForWorkflowsDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETLATESTACTIVITYFORWORKFLOWS$0 = 
        new javax.xml.namespace.QName("integration.anthill3.urbancode.com", "getLatestActivityForWorkflows");
    
    
    /**
     * Gets the "getLatestActivityForWorkflows" element
     */
    public com.urbancode.anthill3.integration.GetLatestActivityForWorkflowsDocument.GetLatestActivityForWorkflows getGetLatestActivityForWorkflows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetLatestActivityForWorkflowsDocument.GetLatestActivityForWorkflows target = null;
            target = (com.urbancode.anthill3.integration.GetLatestActivityForWorkflowsDocument.GetLatestActivityForWorkflows)get_store().find_element_user(GETLATESTACTIVITYFORWORKFLOWS$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getLatestActivityForWorkflows" element
     */
    public void setGetLatestActivityForWorkflows(com.urbancode.anthill3.integration.GetLatestActivityForWorkflowsDocument.GetLatestActivityForWorkflows getLatestActivityForWorkflows)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetLatestActivityForWorkflowsDocument.GetLatestActivityForWorkflows target = null;
            target = (com.urbancode.anthill3.integration.GetLatestActivityForWorkflowsDocument.GetLatestActivityForWorkflows)get_store().find_element_user(GETLATESTACTIVITYFORWORKFLOWS$0, 0);
            if (target == null)
            {
                target = (com.urbancode.anthill3.integration.GetLatestActivityForWorkflowsDocument.GetLatestActivityForWorkflows)get_store().add_element_user(GETLATESTACTIVITYFORWORKFLOWS$0);
            }
            target.set(getLatestActivityForWorkflows);
        }
    }
    
    /**
     * Appends and returns a new empty "getLatestActivityForWorkflows" element
     */
    public com.urbancode.anthill3.integration.GetLatestActivityForWorkflowsDocument.GetLatestActivityForWorkflows addNewGetLatestActivityForWorkflows()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetLatestActivityForWorkflowsDocument.GetLatestActivityForWorkflows target = null;
            target = (com.urbancode.anthill3.integration.GetLatestActivityForWorkflowsDocument.GetLatestActivityForWorkflows)get_store().add_element_user(GETLATESTACTIVITYFORWORKFLOWS$0);
            return target;
        }
    }
    /**
     * An XML getLatestActivityForWorkflows(@integration.anthill3.urbancode.com).
     *
     * This is a complex type.
     */
    public static class GetLatestActivityForWorkflowsImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.GetLatestActivityForWorkflowsDocument.GetLatestActivityForWorkflows
    {
        
        public GetLatestActivityForWorkflowsImpl(org.apache.xmlbeans.SchemaType sType)
        {
            super(sType);
        }
        
        private static final javax.xml.namespace.QName IN0$0 = 
            new javax.xml.namespace.QName("", "in0");
        private static final javax.xml.namespace.QName IN1$2 = 
            new javax.xml.namespace.QName("", "in1");
        private static final javax.xml.namespace.QName IN2$4 = 
            new javax.xml.namespace.QName("", "in2");
        
        
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
        
        /**
         * Gets the "in2" element
         */
        public com.urbancode.anthill3.integration.ArrayOfXsdString getIn2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.ArrayOfXsdString target = null;
                target = (com.urbancode.anthill3.integration.ArrayOfXsdString)get_store().find_element_user(IN2$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target;
            }
        }
        
        /**
         * Sets the "in2" element
         */
        public void setIn2(com.urbancode.anthill3.integration.ArrayOfXsdString in2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.ArrayOfXsdString target = null;
                target = (com.urbancode.anthill3.integration.ArrayOfXsdString)get_store().find_element_user(IN2$4, 0);
                if (target == null)
                {
                    target = (com.urbancode.anthill3.integration.ArrayOfXsdString)get_store().add_element_user(IN2$4);
                }
                target.set(in2);
            }
        }
        
        /**
         * Appends and returns a new empty "in2" element
         */
        public com.urbancode.anthill3.integration.ArrayOfXsdString addNewIn2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                com.urbancode.anthill3.integration.ArrayOfXsdString target = null;
                target = (com.urbancode.anthill3.integration.ArrayOfXsdString)get_store().add_element_user(IN2$4);
                return target;
            }
        }
    }
}
