package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "prorationResultAmount", "invoiceNo", "suppPlanLineItems", "totalChargesBeforeTax", "totalTaxCharges", "totalChargesAfterTax", "totalCredit", "totalTaxCredit", "totalCreditBeforeTax", "total", "prorationCreditResultAmount", "prorationCreditAmount", "prorationTaxAmount", "clientServiceId", "clientPlanId", "thirdPartyErrors"})
@XmlRootElement(name = "cancel_supp_planResponseElement")
public class CancelSuppPlanResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "proration_result_amount")
    protected Double prorationResultAmount;
    @XmlElement(name = "invoice_no")
    protected Long invoiceNo;
    @XmlElement(name = "supp_plan_line_items")
    protected List<SuppPlanLineItemsReturnElement> suppPlanLineItems;
    @XmlElement(name = "total_charges_before_tax")
    protected Double totalChargesBeforeTax;
    @XmlElement(name = "total_tax_charges")
    protected Double totalTaxCharges;
    @XmlElement(name = "total_charges_after_tax")
    protected Double totalChargesAfterTax;
    @XmlElement(name = "total_credit")
    protected Double totalCredit;
    @XmlElement(name = "total_tax_credit")
    protected Double totalTaxCredit;
    @XmlElement(name = "total_credit_before_tax")
    protected Double totalCreditBeforeTax;
    @XmlElement(name = "total")
    protected Double total;
    @XmlElement(name = "proration_credit_result_amount")
    protected Double prorationCreditResultAmount;
    @XmlElement(name = "proration_credit_amount")
    protected Double prorationCreditAmount;
    @XmlElement(name = "proration_tax_amount")
    protected Double prorationTaxAmount;
    @XmlElement(name = "client_service_id")
    protected String clientServiceId;
    @XmlElement(name = "client_plan_id")
    protected String clientPlanId;
    @XmlElement(name = "third_party_errors")
    protected List<ThirdPartyErrorsReturnElement> thirdPartyErrors;
    
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

    public Double getProrationResultAmount() {
        return prorationResultAmount;
    }

    public void setProrationResultAmount(Double value) {
        this.prorationResultAmount = value;
    }

    public Long getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(Long value) {
        this.invoiceNo = value;
    }

    public List<SuppPlanLineItemsReturnElement> getSuppPlanLineItems() {
        if (this.suppPlanLineItems == null) {
            this.suppPlanLineItems = new ArrayList<SuppPlanLineItemsReturnElement>();
        }
        return this.suppPlanLineItems;
    }public Double getTotalChargesBeforeTax() {
        return totalChargesBeforeTax;
    }

    public void setTotalChargesBeforeTax(Double value) {
        this.totalChargesBeforeTax = value;
    }

    public Double getTotalTaxCharges() {
        return totalTaxCharges;
    }

    public void setTotalTaxCharges(Double value) {
        this.totalTaxCharges = value;
    }

    public Double getTotalChargesAfterTax() {
        return totalChargesAfterTax;
    }

    public void setTotalChargesAfterTax(Double value) {
        this.totalChargesAfterTax = value;
    }

    public Double getTotalCredit() {
        return totalCredit;
    }

    public void setTotalCredit(Double value) {
        this.totalCredit = value;
    }

    public Double getTotalTaxCredit() {
        return totalTaxCredit;
    }

    public void setTotalTaxCredit(Double value) {
        this.totalTaxCredit = value;
    }

    public Double getTotalCreditBeforeTax() {
        return totalCreditBeforeTax;
    }

    public void setTotalCreditBeforeTax(Double value) {
        this.totalCreditBeforeTax = value;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double value) {
        this.total = value;
    }

    public Double getProrationCreditResultAmount() {
        return prorationCreditResultAmount;
    }

    public void setProrationCreditResultAmount(Double value) {
        this.prorationCreditResultAmount = value;
    }

    public Double getProrationCreditAmount() {
        return prorationCreditAmount;
    }

    public void setProrationCreditAmount(Double value) {
        this.prorationCreditAmount = value;
    }

    public Double getProrationTaxAmount() {
        return prorationTaxAmount;
    }

    public void setProrationTaxAmount(Double value) {
        this.prorationTaxAmount = value;
    }

    public String getClientServiceId() {
        return clientServiceId;
    }

    public void setClientServiceId(String value) {
        this.clientServiceId = value;
    }

    public String getClientPlanId() {
        return clientPlanId;
    }

    public void setClientPlanId(String value) {
        this.clientPlanId = value;
    }

    public List<ThirdPartyErrorsReturnElement> getThirdPartyErrors() {
        if (this.thirdPartyErrors == null) {
            this.thirdPartyErrors = new ArrayList<ThirdPartyErrorsReturnElement>();
        }
        return this.thirdPartyErrors;
    }
}
