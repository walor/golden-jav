/*
 * An XML document type.
 * Localname: getProjectByName
 * Namespace: integration.anthill3.urbancode.com
 * Java type: com.urbancode.anthill3.integration.GetProjectByNameDocument
 *
 * Automatically generated - do not modify.
 */
package com.urbancode.anthill3.integration.impl;
/**
 * A document containing one getProjectByName(@integration.anthill3.urbancode.com) element.
 *
 * This is a complex type.
 */
public class GetProjectByNameDocumentImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.GetProjectByNameDocument
{
    
    public GetProjectByNameDocumentImpl(org.apache.xmlbeans.SchemaType sType)
    {
        super(sType);
    }
    
    private static final javax.xml.namespace.QName GETPROJECTBYNAME$0 = 
        new javax.xml.namespace.QName("integration.anthill3.urbancode.com", "getProjectByName");
    
    
    /**
     * Gets the "getProjectByName" element
     */
    public com.urbancode.anthill3.integration.GetProjectByNameDocument.GetProjectByName getGetProjectByName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetProjectByNameDocument.GetProjectByName target = null;
            target = (com.urbancode.anthill3.integration.GetProjectByNameDocument.GetProjectByName)get_store().find_element_user(GETPROJECTBYNAME$0, 0);
            if (target == null)
            {
                return null;
            }
            return target;
        }
    }
    
    /**
     * Sets the "getProjectByName" element
     */
    public void setGetProjectByName(com.urbancode.anthill3.integration.GetProjectByNameDocument.GetProjectByName getProjectByName)
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetProjectByNameDocument.GetProjectByName target = null;
            target = (com.urbancode.anthill3.integration.GetProjectByNameDocument.GetProjectByName)get_store().find_element_user(GETPROJECTBYNAME$0, 0);
            if (target == null)
            {
                target = (com.urbancode.anthill3.integration.GetProjectByNameDocument.GetProjectByName)get_store().add_element_user(GETPROJECTBYNAME$0);
            }
            target.set(getProjectByName);
        }
    }
    
    /**
     * Appends and returns a new empty "getProjectByName" element
     */
    public com.urbancode.anthill3.integration.GetProjectByNameDocument.GetProjectByName addNewGetProjectByName()
    {
        synchronized (monitor())
        {
            check_orphaned();
            com.urbancode.anthill3.integration.GetProjectByNameDocument.GetProjectByName target = null;
            target = (com.urbancode.anthill3.integration.GetProjectByNameDocument.GetProjectByName)get_store().add_element_user(GETPROJECTBYNAME$0);
            return target;
        }
    }
    /**
     * An XML getProjectByName(@integration.anthill3.urbancode.com).
     *
     * This is a complex type.
     */
    public static class GetProjectByNameImpl extends org.apache.xmlbeans.impl.values.XmlComplexContentImpl implements com.urbancode.anthill3.integration.GetProjectByNameDocument.GetProjectByName
    {
        
        public GetProjectByNameImpl(org.apache.xmlbeans.SchemaType sType)
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
        public java.lang.String getIn2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IN2$4, 0);
                if (target == null)
                {
                    return null;
                }
                return target.getStringValue();
            }
        }
        
        /**
         * Gets (as xml) the "in2" element
         */
        public org.apache.xmlbeans.XmlString xgetIn2()
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IN2$4, 0);
                return target;
            }
        }
        
        /**
         * Sets the "in2" element
         */
        public void setIn2(java.lang.String in2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.SimpleValue target = null;
                target = (org.apache.xmlbeans.SimpleValue)get_store().find_element_user(IN2$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.SimpleValue)get_store().add_element_user(IN2$4);
                }
                target.setStringValue(in2);
            }
        }
        
        /**
         * Sets (as xml) the "in2" element
         */
        public void xsetIn2(org.apache.xmlbeans.XmlString in2)
        {
            synchronized (monitor())
            {
                check_orphaned();
                org.apache.xmlbeans.XmlString target = null;
                target = (org.apache.xmlbeans.XmlString)get_store().find_element_user(IN2$4, 0);
                if (target == null)
                {
                    target = (org.apache.xmlbeans.XmlString)get_store().add_element_user(IN2$4);
                }
                target.set(in2);
            }
        }
    }
}
