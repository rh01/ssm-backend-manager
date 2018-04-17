package com.ssm.domain;

import java.util.Date;

public class QuotationAnalysis {
    private Long partNumber;

    private Date partDate;

    private String drawingNoIssue;

    private String partName;

    private Long yearlyVolume;

    private String paymentTerms;

    private String deliveryConditions;

    private String pointOfDelivery;

    private String supplierName;

    private Integer parmaCode;

    private String sourceCountry;

    private String localCurrency;

    private String buyer;

    private Double costEngineer;

    private String miscInformation;

    public Long getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(Long partNumber) {
        this.partNumber = partNumber;
    }

    public Date getPartDate() {
        return partDate;
    }

    public void setPartDate(Date partDate) {
        this.partDate = partDate;
    }

    public String getDrawingNoIssue() {
        return drawingNoIssue;
    }

    public void setDrawingNoIssue(String drawingNoIssue) {
        this.drawingNoIssue = drawingNoIssue == null ? null : drawingNoIssue.trim();
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName == null ? null : partName.trim();
    }

    public Long getYearlyVolume() {
        return yearlyVolume;
    }

    public void setYearlyVolume(Long yearlyVolume) {
        this.yearlyVolume = yearlyVolume;
    }

    public String getPaymentTerms() {
        return paymentTerms;
    }

    public void setPaymentTerms(String paymentTerms) {
        this.paymentTerms = paymentTerms == null ? null : paymentTerms.trim();
    }

    public String getDeliveryConditions() {
        return deliveryConditions;
    }

    public void setDeliveryConditions(String deliveryConditions) {
        this.deliveryConditions = deliveryConditions == null ? null : deliveryConditions.trim();
    }

    public String getPointOfDelivery() {
        return pointOfDelivery;
    }

    public void setPointOfDelivery(String pointOfDelivery) {
        this.pointOfDelivery = pointOfDelivery == null ? null : pointOfDelivery.trim();
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName == null ? null : supplierName.trim();
    }

    public Integer getParmaCode() {
        return parmaCode;
    }

    public void setParmaCode(Integer parmaCode) {
        this.parmaCode = parmaCode;
    }

    public String getSourceCountry() {
        return sourceCountry;
    }

    public void setSourceCountry(String sourceCountry) {
        this.sourceCountry = sourceCountry == null ? null : sourceCountry.trim();
    }

    public String getLocalCurrency() {
        return localCurrency;
    }

    public void setLocalCurrency(String localCurrency) {
        this.localCurrency = localCurrency == null ? null : localCurrency.trim();
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer == null ? null : buyer.trim();
    }

    public Double getCostEngineer() {
        return costEngineer;
    }

    public void setCostEngineer(Double costEngineer) {
        this.costEngineer = costEngineer;
    }

    public String getMiscInformation() {
        return miscInformation;
    }

    public void setMiscInformation(String miscInformation) {
        this.miscInformation = miscInformation == null ? null : miscInformation.trim();
    }
}