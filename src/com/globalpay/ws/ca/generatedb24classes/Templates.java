//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.09.26 at 02:35:07 PM IST 
//


package com.globalpay.ws.ca.generatedb24classes;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PRDF">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Template">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="retailerid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="fiid" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PTDF">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Template" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="terminalid" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "prdf",
    "ptdf"
})
@XmlRootElement(name = "Templates")
public class Templates {

    @XmlElement(name = "PRDF", required = true)
    protected Templates.PRDF prdf;
    @XmlElement(name = "PTDF", required = true)
    protected Templates.PTDF ptdf;

    /**
     * Gets the value of the prdf property.
     * 
     * @return
     *     possible object is
     *     {@link Templates.PRDF }
     *     
     */
    public Templates.PRDF getPRDF() {
        return prdf;
    }

    /**
     * Sets the value of the prdf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Templates.PRDF }
     *     
     */
    public void setPRDF(Templates.PRDF value) {
        this.prdf = value;
    }

    /**
     * Gets the value of the ptdf property.
     * 
     * @return
     *     possible object is
     *     {@link Templates.PTDF }
     *     
     */
    public Templates.PTDF getPTDF() {
        return ptdf;
    }

    /**
     * Sets the value of the ptdf property.
     * 
     * @param value
     *     allowed object is
     *     {@link Templates.PTDF }
     *     
     */
    public void setPTDF(Templates.PTDF value) {
        this.ptdf = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Template">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="retailerid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="fiid" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "template"
    })
    public static class PRDF {

        @XmlElement(name = "Template", required = true)
        protected Templates.PRDF.Template template;

        /**
         * Gets the value of the template property.
         * 
         * @return
         *     possible object is
         *     {@link Templates.PRDF.Template }
         *     
         */
        public Templates.PRDF.Template getTemplate() {
            return template;
        }

        /**
         * Sets the value of the template property.
         * 
         * @param value
         *     allowed object is
         *     {@link Templates.PRDF.Template }
         *     
         */
        public void setTemplate(Templates.PRDF.Template value) {
            this.template = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="retailerid" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="fiid" type="{http://www.w3.org/2001/XMLSchema}byte" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Template {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "name")
            protected String name;
            @XmlAttribute(name = "retailerid")
            protected String retailerid;
            @XmlAttribute(name = "fiid")
            protected Byte fiid;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the retailerid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRetailerid() {
                return retailerid;
            }

            /**
             * Sets the value of the retailerid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRetailerid(String value) {
                this.retailerid = value;
            }

            /**
             * Gets the value of the fiid property.
             * 
             * @return
             *     possible object is
             *     {@link Byte }
             *     
             */
            public Byte getFiid() {
                return fiid;
            }

            /**
             * Sets the value of the fiid property.
             * 
             * @param value
             *     allowed object is
             *     {@link Byte }
             *     
             */
            public void setFiid(Byte value) {
                this.fiid = value;
            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Template" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="terminalid" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "template"
    })
    public static class PTDF {

        @XmlElement(name = "Template")
        protected List<Templates.PTDF.Template> template;

        /**
         * Gets the value of the template property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the template property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTemplate().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Templates.PTDF.Template }
         * 
         * 
         */
        public List<Templates.PTDF.Template> getTemplate() {
            if (template == null) {
                template = new ArrayList<Templates.PTDF.Template>();
            }
            return this.template;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="name" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="terminalid" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class Template {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "name")
            protected String name;
            @XmlAttribute(name = "terminalid")
            protected String terminalid;

            /**
             * Gets the value of the value property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * Sets the value of the value property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the terminalid property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTerminalid() {
                return terminalid;
            }

            /**
             * Sets the value of the terminalid property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTerminalid(String value) {
                this.terminalid = value;
            }

        }

    }

}
