
package be.e1.bssv.J564200.com.beone.fedex.becloseshipments;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="WebAuthenticationDetail">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="UserCredential">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ClientDetail">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="MeterNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="IntegratorId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Localization">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="LanguageCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="LocaleCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
 *                   &lt;element name="Localization">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="LanguageCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="LocaleCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
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
 *                   &lt;element name="Major" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Intermediate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Minor" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TimeShipmentClosed" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
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
        "webAuthenticationDetail", "clientDetail", "transactionDetail", "version", "timeShipmentClosed"
    })
@XmlRootElement(name = "CloseShipmentRequest")
public class CloseShipmentRequest
{

    @XmlElement(name = "WebAuthenticationDetail", required = true)
    protected CloseShipmentRequest.WebAuthenticationDetail webAuthenticationDetail;
    @XmlElement(name = "ClientDetail", required = true)
    protected CloseShipmentRequest.ClientDetail clientDetail;
    @XmlElement(name = "TransactionDetail", required = true)
    protected CloseShipmentRequest.TransactionDetail transactionDetail;
    @XmlElement(name = "Version", required = true)
    protected CloseShipmentRequest.Version version;
    @XmlElement(name = "TimeShipmentClosed", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar timeShipmentClosed;

    /**
     * Gets the value of the webAuthenticationDetail property.
     *
     * @return
     *     possible object is
     *     {@link CloseShipmentRequest.WebAuthenticationDetail }
     *
     */
    public CloseShipmentRequest.WebAuthenticationDetail getWebAuthenticationDetail()
    {
        return webAuthenticationDetail;
    }

    /**
     * Sets the value of the webAuthenticationDetail property.
     *
     * @param value
     *     allowed object is
     *     {@link CloseShipmentRequest.WebAuthenticationDetail }
     *
     */
    public void setWebAuthenticationDetail(CloseShipmentRequest.WebAuthenticationDetail value)
    {
        this.webAuthenticationDetail = value;
    }

    /**
     * Gets the value of the clientDetail property.
     *
     * @return
     *     possible object is
     *     {@link CloseShipmentRequest.ClientDetail }
     *
     */
    public CloseShipmentRequest.ClientDetail getClientDetail()
    {
        return clientDetail;
    }

    /**
     * Sets the value of the clientDetail property.
     *
     * @param value
     *     allowed object is
     *     {@link CloseShipmentRequest.ClientDetail }
     *
     */
    public void setClientDetail(CloseShipmentRequest.ClientDetail value)
    {
        this.clientDetail = value;
    }

    /**
     * Gets the value of the transactionDetail property.
     *
     * @return
     *     possible object is
     *     {@link CloseShipmentRequest.TransactionDetail }
     *
     */
    public CloseShipmentRequest.TransactionDetail getTransactionDetail()
    {
        return transactionDetail;
    }

    /**
     * Sets the value of the transactionDetail property.
     *
     * @param value
     *     allowed object is
     *     {@link CloseShipmentRequest.TransactionDetail }
     *
     */
    public void setTransactionDetail(CloseShipmentRequest.TransactionDetail value)
    {
        this.transactionDetail = value;
    }

    /**
     * Gets the value of the version property.
     *
     * @return
     *     possible object is
     *     {@link CloseShipmentRequest.Version }
     *
     */
    public CloseShipmentRequest.Version getVersion()
    {
        return version;
    }

    /**
     * Sets the value of the version property.
     *
     * @param value
     *     allowed object is
     *     {@link CloseShipmentRequest.Version }
     *
     */
    public void setVersion(CloseShipmentRequest.Version value)
    {
        this.version = value;
    }

    /**
     * Gets the value of the timeShipmentClosed property.
     *
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public XMLGregorianCalendar getTimeShipmentClosed()
    {
        return timeShipmentClosed;
    }

    /**
     * Sets the value of the timeShipmentClosed property.
     *
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *
     */
    public void setTimeShipmentClosed(XMLGregorianCalendar value)
    {
        this.timeShipmentClosed = value;
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
     *         &lt;element name="AccountNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="MeterNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="IntegratorId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Localization">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="LanguageCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="LocaleCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "accountNumber", "meterNumber", "integratorId", "localization"
        })
    public static class ClientDetail
    {

        @XmlElement(name = "AccountNumber", required = true)
        protected String accountNumber;
        @XmlElement(name = "MeterNumber", required = true)
        protected String meterNumber;
        @XmlElement(name = "IntegratorId", required = true)
        protected String integratorId;
        @XmlElement(name = "Localization", required = true)
        protected CloseShipmentRequest.ClientDetail.Localization localization;

        /**
         * Gets the value of the accountNumber property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getAccountNumber()
        {
            return accountNumber;
        }

        /**
         * Sets the value of the accountNumber property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setAccountNumber(String value)
        {
            this.accountNumber = value;
        }

        /**
         * Gets the value of the meterNumber property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getMeterNumber()
        {
            return meterNumber;
        }

        /**
         * Sets the value of the meterNumber property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setMeterNumber(String value)
        {
            this.meterNumber = value;
        }

        /**
         * Gets the value of the integratorId property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getIntegratorId()
        {
            return integratorId;
        }

        /**
         * Sets the value of the integratorId property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setIntegratorId(String value)
        {
            this.integratorId = value;
        }

        /**
         * Gets the value of the localization property.
         *
         * @return
         *     possible object is
         *     {@link CloseShipmentRequest.ClientDetail.Localization }
         *
         */
        public CloseShipmentRequest.ClientDetail.Localization getLocalization()
        {
            return localization;
        }

        /**
         * Sets the value of the localization property.
         *
         * @param value
         *     allowed object is
         *     {@link CloseShipmentRequest.ClientDetail.Localization }
         *
         */
        public void setLocalization(CloseShipmentRequest.ClientDetail.Localization value)
        {
            this.localization = value;
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
         *         &lt;element name="LanguageCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="LocaleCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "languageCode", "localeCode"
            })
        public static class Localization
        {

            @XmlElement(name = "LanguageCode", required = true)
            protected String languageCode;
            @XmlElement(name = "LocaleCode", required = true)
            protected String localeCode;

            /**
             * Gets the value of the languageCode property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getLanguageCode()
            {
                return languageCode;
            }

            /**
             * Sets the value of the languageCode property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setLanguageCode(String value)
            {
                this.languageCode = value;
            }

            /**
             * Gets the value of the localeCode property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getLocaleCode()
            {
                return localeCode;
            }

            /**
             * Sets the value of the localeCode property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setLocaleCode(String value)
            {
                this.localeCode = value;
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
     *         &lt;element name="CustomerTransactionId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Localization">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="LanguageCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="LocaleCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "customerTransactionId", "localization"
        })
    public static class TransactionDetail
    {

        @XmlElement(name = "CustomerTransactionId", required = true)
        protected String customerTransactionId;
        @XmlElement(name = "Localization", required = true)
        protected CloseShipmentRequest.TransactionDetail.Localization localization;

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
         * Gets the value of the localization property.
         *
         * @return
         *     possible object is
         *     {@link CloseShipmentRequest.TransactionDetail.Localization }
         *
         */
        public CloseShipmentRequest.TransactionDetail.Localization getLocalization()
        {
            return localization;
        }

        /**
         * Sets the value of the localization property.
         *
         * @param value
         *     allowed object is
         *     {@link CloseShipmentRequest.TransactionDetail.Localization }
         *
         */
        public void setLocalization(CloseShipmentRequest.TransactionDetail.Localization value)
        {
            this.localization = value;
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
         *         &lt;element name="LanguageCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="LocaleCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "languageCode", "localeCode"
            })
        public static class Localization
        {

            @XmlElement(name = "LanguageCode", required = true)
            protected String languageCode;
            @XmlElement(name = "LocaleCode", required = true)
            protected String localeCode;

            /**
             * Gets the value of the languageCode property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getLanguageCode()
            {
                return languageCode;
            }

            /**
             * Sets the value of the languageCode property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setLanguageCode(String value)
            {
                this.languageCode = value;
            }

            /**
             * Gets the value of the localeCode property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getLocaleCode()
            {
                return localeCode;
            }

            /**
             * Sets the value of the localeCode property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setLocaleCode(String value)
            {
                this.localeCode = value;
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
     *         &lt;element name="ServiceId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Major" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Intermediate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Minor" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "serviceId", "major", "intermediate", "minor"
        })
    public static class Version
    {

        @XmlElement(name = "ServiceId", required = true)
        protected String serviceId;
        @XmlElement(name = "Major", required = true)
        protected String major;
        @XmlElement(name = "Intermediate", required = true)
        protected String intermediate;
        @XmlElement(name = "Minor", required = true)
        protected String minor;

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
         *     {@link String }
         *
         */
        public String getMajor()
        {
            return major;
        }

        /**
         * Sets the value of the major property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setMajor(String value)
        {
            this.major = value;
        }

        /**
         * Gets the value of the intermediate property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getIntermediate()
        {
            return intermediate;
        }

        /**
         * Sets the value of the intermediate property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setIntermediate(String value)
        {
            this.intermediate = value;
        }

        /**
         * Gets the value of the minor property.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getMinor()
        {
            return minor;
        }

        /**
         * Sets the value of the minor property.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setMinor(String value)
        {
            this.minor = value;
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
     *         &lt;element name="UserCredential">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "userCredential"
        })
    public static class WebAuthenticationDetail
    {

        @XmlElement(name = "UserCredential", required = true)
        protected CloseShipmentRequest.WebAuthenticationDetail.UserCredential userCredential;

        /**
         * Gets the value of the userCredential property.
         *
         * @return
         *     possible object is
         *     {@link CloseShipmentRequest.WebAuthenticationDetail.UserCredential }
         *
         */
        public CloseShipmentRequest.WebAuthenticationDetail.UserCredential getUserCredential()
        {
            return userCredential;
        }

        /**
         * Sets the value of the userCredential property.
         *
         * @param value
         *     allowed object is
         *     {@link CloseShipmentRequest.WebAuthenticationDetail.UserCredential }
         *
         */
        public void setUserCredential(CloseShipmentRequest.WebAuthenticationDetail.UserCredential value)
        {
            this.userCredential = value;
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
         *         &lt;element name="Key" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Password" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
                "key", "password"
            })
        public static class UserCredential
        {

            @XmlElement(name = "Key", required = true)
            protected String key;
            @XmlElement(name = "Password", required = true)
            protected String password;

            /**
             * Gets the value of the key property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getKey()
            {
                return key;
            }

            /**
             * Sets the value of the key property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setKey(String value)
            {
                this.key = value;
            }

            /**
             * Gets the value of the password property.
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getPassword()
            {
                return password;
            }

            /**
             * Sets the value of the password property.
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setPassword(String value)
            {
                this.password = value;
            }

        }

    }

}
