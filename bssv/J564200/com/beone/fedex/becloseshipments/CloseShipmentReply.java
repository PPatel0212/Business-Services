
package be.e1.bssv.J564200.com.beone.fedex.becloseshipments;

import java.math.BigInteger;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="HighestSeverity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Notifications">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Severity" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="LocalizedMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TransactionDetail">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CustomerTransactionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="wsa" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ns" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Version">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ServiceId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Major" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="Intermediate" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="Minor" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="wsa" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ns" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Status">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="GroundCloseReply">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CodReport" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="HazMatCertificate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Manifest">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Filename" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="File" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="MultiweightReport" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "", propOrder =
    {
        "highestSeverity", "notifications", "transactionDetail", "version", "status", "groundCloseReply"
    })
@XmlRootElement(name = "CloseShipmentReply")
public class CloseShipmentReply
{

    @XmlElement(name = "HighestSeverity", required = true)
    protected String highestSeverity;
    @XmlElement(name = "Notifications", required = true)
    protected CloseShipmentReply.Notifications notifications;
    @XmlElement(name = "TransactionDetail", required = true)
    protected CloseShipmentReply.TransactionDetail transactionDetail;
    @XmlElement(name = "Version", required = true)
    protected CloseShipmentReply.Version version;
    @XmlElement(name = "Status", required = true)
    protected CloseShipmentReply.Status status;
    @XmlElement(name = "GroundCloseReply", required = true)
    protected CloseShipmentReply.GroundCloseReply groundCloseReply;

    /**
     * Gets the value of the highestSeverity property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getHighestSeverity()
    {
        return highestSeverity;
    }

    /**
     * Sets the value of the highestSeverity property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setHighestSeverity(String value)
    {
        this.highestSeverity = value;
    }

    /**
     * Gets the value of the notifications property.
     *
     * @return
     *     possible object is
     *     {@link CloseShipmentReply.Notifications }
     *
     */
    public CloseShipmentReply.Notifications getNotifications()
    {
        return notifications;
    }

    /**
     * Sets the value of the notifications property.
     *
     * @param value
     *     allowed object is
     *     {@link CloseShipmentReply.Notifications }
     *
     */
    public void setNotifications(CloseShipmentReply.Notifications value)
    {
        this.notifications = value;
    }

    /**
     * Gets the value of the transactionDetail property.
     *
     * @return
     *     possible object is
     *     {@link CloseShipmentReply.TransactionDetail }
     *
     */
    public CloseShipmentReply.TransactionDetail getTransactionDetail()
    {
        return transactionDetail;
    }

    /**
     * Sets the value of the transactionDetail property.
     *
     * @param value
     *     allowed object is
     *     {@link CloseShipmentReply.TransactionDetail }
     *
     */
    public void setTransactionDetail(CloseShipmentReply.TransactionDetail value)
    {
        this.transactionDetail = value;
    }

    /**
     * Gets the value of the version property.
     *
     * @return
     *     possible object is
     *     {@link CloseShipmentReply.Version }
     *
     */
    public CloseShipmentReply.Version getVersion()
    {
        return version;
    }

    /**
     * Sets the value of the version property.
     *
     * @param value
     *     allowed object is
     *     {@link CloseShipmentReply.Version }
     *
     */
    public void setVersion(CloseShipmentReply.Version value)
    {
        this.version = value;
    }

    /**
     * Gets the value of the status property.
     *
     * @return
     *     possible object is
     *     {@link CloseShipmentReply.Status }
     *
     */
    public CloseShipmentReply.Status getStatus()
    {
        return status;
    }

    /**
     * Sets the value of the status property.
     *
     * @param value
     *     allowed object is
     *     {@link CloseShipmentReply.Status }
     *
     */
    public void setStatus(CloseShipmentReply.Status value)
    {
        this.status = value;
    }

    /**
     * Gets the value of the groundCloseReply property.
     *
     * @return
     *     possible object is
     *     {@link CloseShipmentReply.GroundCloseReply }
     *
     */
    public CloseShipmentReply.GroundCloseReply getGroundCloseReply()
    {
        return groundCloseReply;
    }

    /**
     * Sets the value of the groundCloseReply property.
     *
     * @param value
     *     allowed object is
     *     {@link CloseShipmentReply.GroundCloseReply }
     *
     */
    public void setGroundCloseReply(CloseShipmentReply.GroundCloseReply value)
    {
        this.groundCloseReply = value;
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
     *         &lt;element name="CodReport" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="HazMatCertificate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Manifest">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Filename" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="File" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="MultiweightReport" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        {
            "codReport", "hazMatCertificate", "manifest", "multiweightReport"
        })
    public static class GroundCloseReply
    {

        @XmlElement(name = "CodReport", required = true)
        protected String codReport;
        @XmlElement(name = "HazMatCertificate", required = true)
        protected String hazMatCertificate;
        @XmlElement(name = "Manifest", required = true)
        protected CloseShipmentReply.GroundCloseReply.Manifest manifest;
        @XmlElement(name = "MultiweightReport", required = true)
        protected String multiweightReport;

        /**
         * Gets the value of the codReport property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCodReport()
        {
            return codReport;
        }

        /**
         * Sets the value of the codReport property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCodReport(String value)
        {
            this.codReport = value;
        }

        /**
         * Gets the value of the hazMatCertificate property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getHazMatCertificate()
        {
            return hazMatCertificate;
        }

        /**
         * Sets the value of the hazMatCertificate property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setHazMatCertificate(String value)
        {
            this.hazMatCertificate = value;
        }

        /**
         * Gets the value of the manifest property.
         *
         * @return
         *     possible object is
         *     {@link CloseShipmentReply.GroundCloseReply.Manifest }
         *
         */
        public CloseShipmentReply.GroundCloseReply.Manifest getManifest()
        {
            return manifest;
        }

        /**
         * Sets the value of the manifest property.
         *
         * @param value
         *     allowed object is
         *     {@link CloseShipmentReply.GroundCloseReply.Manifest }
         *
         */
        public void setManifest(CloseShipmentReply.GroundCloseReply.Manifest value)
        {
            this.manifest = value;
        }

        /**
         * Gets the value of the multiweightReport property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getMultiweightReport()
        {
            return multiweightReport;
        }

        /**
         * Sets the value of the multiweightReport property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setMultiweightReport(String value)
        {
            this.multiweightReport = value;
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
         *         &lt;element name="Filename" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="File" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder =
            {
                "filename", "file"
            })
        public static class Manifest
        {

            @XmlElement(name = "Filename", required = true)
            protected String filename;
            @XmlElement(name = "File", required = true)
            protected String file;

            /**
             * Gets the value of the filename property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getFilename()
            {
                return filename;
            }

            /**
             * Sets the value of the filename property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setFilename(String value)
            {
                this.filename = value;
            }

            /**
             * Gets the value of the file property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getFile()
            {
                return file;
            }

            /**
             * Sets the value of the file property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setFile(String value)
            {
                this.file = value;
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
     *         &lt;element name="Severity" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Source" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="LocalizedMessage" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        {
            "severity", "source", "code", "message", "localizedMessage"
        })
    public static class Notifications
    {

        @XmlElement(name = "Severity", required = true)
        protected String severity;
        @XmlElement(name = "Source", required = true)
        protected String source;
        @XmlElement(name = "Code", required = true)
        protected BigInteger code;
        @XmlElement(name = "Message", required = true)
        protected String message;
        @XmlElement(name = "LocalizedMessage", required = true)
        protected String localizedMessage;

        /**
         * Gets the value of the severity property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getSeverity()
        {
            return severity;
        }

        /**
         * Sets the value of the severity property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setSeverity(String value)
        {
            this.severity = value;
        }

        /**
         * Gets the value of the source property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getSource()
        {
            return source;
        }

        /**
         * Sets the value of the source property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setSource(String value)
        {
            this.source = value;
        }

        /**
         * Gets the value of the code property.
         *
         * @return
         *     possible object is
         *     {@link BigInteger }
         *
         */
        public BigInteger getCode()
        {
            return code;
        }

        /**
         * Sets the value of the code property.
         *
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *
         */
        public void setCode(BigInteger value)
        {
            this.code = value;
        }

        /**
         * Gets the value of the message property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getMessage()
        {
            return message;
        }

        /**
         * Sets the value of the message property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setMessage(String value)
        {
            this.message = value;
        }

        /**
         * Gets the value of the localizedMessage property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getLocalizedMessage()
        {
            return localizedMessage;
        }

        /**
         * Sets the value of the localizedMessage property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setLocalizedMessage(String value)
        {
            this.localizedMessage = value;
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
     *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="Message" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        {
            "code", "message"
        })
    public static class Status
    {

        @XmlElement(name = "Code", required = true)
        protected BigInteger code;
        @XmlElement(name = "Message", required = true)
        protected String message;

        /**
         * Gets the value of the code property.
         *
         * @return
         *     possible object is
         *     {@link BigInteger }
         *
         */
        public BigInteger getCode()
        {
            return code;
        }

        /**
         * Sets the value of the code property.
         *
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *
         */
        public void setCode(BigInteger value)
        {
            this.code = value;
        }

        /**
         * Gets the value of the message property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getMessage()
        {
            return message;
        }

        /**
         * Sets the value of the message property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setMessage(String value)
        {
            this.message = value;
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
     *         &lt;element name="CustomerTransactionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *       &lt;attribute name="wsa" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ns" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        {
            "customerTransactionId"
        })
    public static class TransactionDetail
    {

        @XmlElement(name = "CustomerTransactionId", required = true)
        protected String customerTransactionId;
        @XmlAttribute(name = "wsa")
        protected String wsa;
        @XmlAttribute(name = "ns")
        protected String ns;

        /**
         * Gets the value of the customerTransactionId property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCustomerTransactionId()
        {
            return customerTransactionId;
        }

        /**
         * Sets the value of the customerTransactionId property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCustomerTransactionId(String value)
        {
            this.customerTransactionId = value;
        }

        /**
         * Gets the value of the wsa property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getWsa()
        {
            return wsa;
        }

        /**
         * Sets the value of the wsa property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setWsa(String value)
        {
            this.wsa = value;
        }

        /**
         * Gets the value of the ns property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getNs()
        {
            return ns;
        }

        /**
         * Sets the value of the ns property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setNs(String value)
        {
            this.ns = value;
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
     *         &lt;element name="ServiceId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Major" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="Intermediate" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="Minor" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *       &lt;/sequence>
     *       &lt;attribute name="wsa" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ns" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder =
        {
            "serviceId", "major", "intermediate", "minor"
        })
    public static class Version
    {

        @XmlElement(name = "ServiceId", required = true)
        protected String serviceId;
        @XmlElement(name = "Major", required = true)
        protected BigInteger major;
        @XmlElement(name = "Intermediate", required = true)
        protected BigInteger intermediate;
        @XmlElement(name = "Minor", required = true)
        protected BigInteger minor;
        @XmlAttribute(name = "wsa")
        protected String wsa;
        @XmlAttribute(name = "ns")
        protected String ns;

        /**
         * Gets the value of the serviceId property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getServiceId()
        {
            return serviceId;
        }

        /**
         * Sets the value of the serviceId property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setServiceId(String value)
        {
            this.serviceId = value;
        }

        /**
         * Gets the value of the major property.
         *
         * @return
         *     possible object is
         *     {@link BigInteger }
         *
         */
        public BigInteger getMajor()
        {
            return major;
        }

        /**
         * Sets the value of the major property.
         *
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *
         */
        public void setMajor(BigInteger value)
        {
            this.major = value;
        }

        /**
         * Gets the value of the intermediate property.
         *
         * @return
         *     possible object is
         *     {@link BigInteger }
         *
         */
        public BigInteger getIntermediate()
        {
            return intermediate;
        }

        /**
         * Sets the value of the intermediate property.
         *
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *
         */
        public void setIntermediate(BigInteger value)
        {
            this.intermediate = value;
        }

        /**
         * Gets the value of the minor property.
         *
         * @return
         *     possible object is
         *     {@link BigInteger }
         *
         */
        public BigInteger getMinor()
        {
            return minor;
        }

        /**
         * Sets the value of the minor property.
         *
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *
         */
        public void setMinor(BigInteger value)
        {
            this.minor = value;
        }

        /**
         * Gets the value of the wsa property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getWsa()
        {
            return wsa;
        }

        /**
         * Sets the value of the wsa property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setWsa(String value)
        {
            this.wsa = value;
        }

        /**
         * Gets the value of the ns property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getNs()
        {
            return ns;
        }

        /**
         * Sets the value of the ns property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setNs(String value)
        {
            this.ns = value;
        }

    }

}
