package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "paymentApplicationDetails"})
@XmlRootElement(name = "get_payment_application_dtlsResponseElement")
public class GetPaymentApplicationDtlsResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "payment_application_details")
    protected List<PaymentApplicationDetailsReturnElement> paymentApplicationDetails;
    
    public Long getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Long value) {
        this.errorCode = value;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String value) {
        this.errorMsg = value;
    }

    public List<PaymentApplicationDetailsReturnElement> getPaymentApplicationDetails() {
        if (this.paymentApplicationDetails == null) {
            this.paymentApplicationDetails = new ArrayList<PaymentApplicationDetailsReturnElement>();
        }
        return this.paymentApplicationDetails;
    }
}
