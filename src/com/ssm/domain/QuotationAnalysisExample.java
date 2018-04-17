package com.ssm.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class QuotationAnalysisExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public QuotationAnalysisExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andPartNumberIsNull() {
            addCriterion("part_number is null");
            return (Criteria) this;
        }

        public Criteria andPartNumberIsNotNull() {
            addCriterion("part_number is not null");
            return (Criteria) this;
        }

        public Criteria andPartNumberEqualTo(Long value) {
            addCriterion("part_number =", value, "partNumber");
            return (Criteria) this;
        }

        public Criteria andPartNumberNotEqualTo(Long value) {
            addCriterion("part_number <>", value, "partNumber");
            return (Criteria) this;
        }

        public Criteria andPartNumberGreaterThan(Long value) {
            addCriterion("part_number >", value, "partNumber");
            return (Criteria) this;
        }

        public Criteria andPartNumberGreaterThanOrEqualTo(Long value) {
            addCriterion("part_number >=", value, "partNumber");
            return (Criteria) this;
        }

        public Criteria andPartNumberLessThan(Long value) {
            addCriterion("part_number <", value, "partNumber");
            return (Criteria) this;
        }

        public Criteria andPartNumberLessThanOrEqualTo(Long value) {
            addCriterion("part_number <=", value, "partNumber");
            return (Criteria) this;
        }

        public Criteria andPartNumberIn(List<Long> values) {
            addCriterion("part_number in", values, "partNumber");
            return (Criteria) this;
        }

        public Criteria andPartNumberNotIn(List<Long> values) {
            addCriterion("part_number not in", values, "partNumber");
            return (Criteria) this;
        }

        public Criteria andPartNumberBetween(Long value1, Long value2) {
            addCriterion("part_number between", value1, value2, "partNumber");
            return (Criteria) this;
        }

        public Criteria andPartNumberNotBetween(Long value1, Long value2) {
            addCriterion("part_number not between", value1, value2, "partNumber");
            return (Criteria) this;
        }

        public Criteria andPartDateIsNull() {
            addCriterion("part_date is null");
            return (Criteria) this;
        }

        public Criteria andPartDateIsNotNull() {
            addCriterion("part_date is not null");
            return (Criteria) this;
        }

        public Criteria andPartDateEqualTo(Date value) {
            addCriterionForJDBCDate("part_date =", value, "partDate");
            return (Criteria) this;
        }

        public Criteria andPartDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("part_date <>", value, "partDate");
            return (Criteria) this;
        }

        public Criteria andPartDateGreaterThan(Date value) {
            addCriterionForJDBCDate("part_date >", value, "partDate");
            return (Criteria) this;
        }

        public Criteria andPartDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("part_date >=", value, "partDate");
            return (Criteria) this;
        }

        public Criteria andPartDateLessThan(Date value) {
            addCriterionForJDBCDate("part_date <", value, "partDate");
            return (Criteria) this;
        }

        public Criteria andPartDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("part_date <=", value, "partDate");
            return (Criteria) this;
        }

        public Criteria andPartDateIn(List<Date> values) {
            addCriterionForJDBCDate("part_date in", values, "partDate");
            return (Criteria) this;
        }

        public Criteria andPartDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("part_date not in", values, "partDate");
            return (Criteria) this;
        }

        public Criteria andPartDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("part_date between", value1, value2, "partDate");
            return (Criteria) this;
        }

        public Criteria andPartDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("part_date not between", value1, value2, "partDate");
            return (Criteria) this;
        }

        public Criteria andDrawingNoIssueIsNull() {
            addCriterion("drawing_no_issue is null");
            return (Criteria) this;
        }

        public Criteria andDrawingNoIssueIsNotNull() {
            addCriterion("drawing_no_issue is not null");
            return (Criteria) this;
        }

        public Criteria andDrawingNoIssueEqualTo(String value) {
            addCriterion("drawing_no_issue =", value, "drawingNoIssue");
            return (Criteria) this;
        }

        public Criteria andDrawingNoIssueNotEqualTo(String value) {
            addCriterion("drawing_no_issue <>", value, "drawingNoIssue");
            return (Criteria) this;
        }

        public Criteria andDrawingNoIssueGreaterThan(String value) {
            addCriterion("drawing_no_issue >", value, "drawingNoIssue");
            return (Criteria) this;
        }

        public Criteria andDrawingNoIssueGreaterThanOrEqualTo(String value) {
            addCriterion("drawing_no_issue >=", value, "drawingNoIssue");
            return (Criteria) this;
        }

        public Criteria andDrawingNoIssueLessThan(String value) {
            addCriterion("drawing_no_issue <", value, "drawingNoIssue");
            return (Criteria) this;
        }

        public Criteria andDrawingNoIssueLessThanOrEqualTo(String value) {
            addCriterion("drawing_no_issue <=", value, "drawingNoIssue");
            return (Criteria) this;
        }

        public Criteria andDrawingNoIssueLike(String value) {
            addCriterion("drawing_no_issue like", value, "drawingNoIssue");
            return (Criteria) this;
        }

        public Criteria andDrawingNoIssueNotLike(String value) {
            addCriterion("drawing_no_issue not like", value, "drawingNoIssue");
            return (Criteria) this;
        }

        public Criteria andDrawingNoIssueIn(List<String> values) {
            addCriterion("drawing_no_issue in", values, "drawingNoIssue");
            return (Criteria) this;
        }

        public Criteria andDrawingNoIssueNotIn(List<String> values) {
            addCriterion("drawing_no_issue not in", values, "drawingNoIssue");
            return (Criteria) this;
        }

        public Criteria andDrawingNoIssueBetween(String value1, String value2) {
            addCriterion("drawing_no_issue between", value1, value2, "drawingNoIssue");
            return (Criteria) this;
        }

        public Criteria andDrawingNoIssueNotBetween(String value1, String value2) {
            addCriterion("drawing_no_issue not between", value1, value2, "drawingNoIssue");
            return (Criteria) this;
        }

        public Criteria andPartNameIsNull() {
            addCriterion("part_name is null");
            return (Criteria) this;
        }

        public Criteria andPartNameIsNotNull() {
            addCriterion("part_name is not null");
            return (Criteria) this;
        }

        public Criteria andPartNameEqualTo(String value) {
            addCriterion("part_name =", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameNotEqualTo(String value) {
            addCriterion("part_name <>", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameGreaterThan(String value) {
            addCriterion("part_name >", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameGreaterThanOrEqualTo(String value) {
            addCriterion("part_name >=", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameLessThan(String value) {
            addCriterion("part_name <", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameLessThanOrEqualTo(String value) {
            addCriterion("part_name <=", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameLike(String value) {
            addCriterion("part_name like", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameNotLike(String value) {
            addCriterion("part_name not like", value, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameIn(List<String> values) {
            addCriterion("part_name in", values, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameNotIn(List<String> values) {
            addCriterion("part_name not in", values, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameBetween(String value1, String value2) {
            addCriterion("part_name between", value1, value2, "partName");
            return (Criteria) this;
        }

        public Criteria andPartNameNotBetween(String value1, String value2) {
            addCriterion("part_name not between", value1, value2, "partName");
            return (Criteria) this;
        }

        public Criteria andYearlyVolumeIsNull() {
            addCriterion("yearly_volume is null");
            return (Criteria) this;
        }

        public Criteria andYearlyVolumeIsNotNull() {
            addCriterion("yearly_volume is not null");
            return (Criteria) this;
        }

        public Criteria andYearlyVolumeEqualTo(Long value) {
            addCriterion("yearly_volume =", value, "yearlyVolume");
            return (Criteria) this;
        }

        public Criteria andYearlyVolumeNotEqualTo(Long value) {
            addCriterion("yearly_volume <>", value, "yearlyVolume");
            return (Criteria) this;
        }

        public Criteria andYearlyVolumeGreaterThan(Long value) {
            addCriterion("yearly_volume >", value, "yearlyVolume");
            return (Criteria) this;
        }

        public Criteria andYearlyVolumeGreaterThanOrEqualTo(Long value) {
            addCriterion("yearly_volume >=", value, "yearlyVolume");
            return (Criteria) this;
        }

        public Criteria andYearlyVolumeLessThan(Long value) {
            addCriterion("yearly_volume <", value, "yearlyVolume");
            return (Criteria) this;
        }

        public Criteria andYearlyVolumeLessThanOrEqualTo(Long value) {
            addCriterion("yearly_volume <=", value, "yearlyVolume");
            return (Criteria) this;
        }

        public Criteria andYearlyVolumeIn(List<Long> values) {
            addCriterion("yearly_volume in", values, "yearlyVolume");
            return (Criteria) this;
        }

        public Criteria andYearlyVolumeNotIn(List<Long> values) {
            addCriterion("yearly_volume not in", values, "yearlyVolume");
            return (Criteria) this;
        }

        public Criteria andYearlyVolumeBetween(Long value1, Long value2) {
            addCriterion("yearly_volume between", value1, value2, "yearlyVolume");
            return (Criteria) this;
        }

        public Criteria andYearlyVolumeNotBetween(Long value1, Long value2) {
            addCriterion("yearly_volume not between", value1, value2, "yearlyVolume");
            return (Criteria) this;
        }

        public Criteria andPaymentTermsIsNull() {
            addCriterion("payment_terms is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTermsIsNotNull() {
            addCriterion("payment_terms is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTermsEqualTo(String value) {
            addCriterion("payment_terms =", value, "paymentTerms");
            return (Criteria) this;
        }

        public Criteria andPaymentTermsNotEqualTo(String value) {
            addCriterion("payment_terms <>", value, "paymentTerms");
            return (Criteria) this;
        }

        public Criteria andPaymentTermsGreaterThan(String value) {
            addCriterion("payment_terms >", value, "paymentTerms");
            return (Criteria) this;
        }

        public Criteria andPaymentTermsGreaterThanOrEqualTo(String value) {
            addCriterion("payment_terms >=", value, "paymentTerms");
            return (Criteria) this;
        }

        public Criteria andPaymentTermsLessThan(String value) {
            addCriterion("payment_terms <", value, "paymentTerms");
            return (Criteria) this;
        }

        public Criteria andPaymentTermsLessThanOrEqualTo(String value) {
            addCriterion("payment_terms <=", value, "paymentTerms");
            return (Criteria) this;
        }

        public Criteria andPaymentTermsLike(String value) {
            addCriterion("payment_terms like", value, "paymentTerms");
            return (Criteria) this;
        }

        public Criteria andPaymentTermsNotLike(String value) {
            addCriterion("payment_terms not like", value, "paymentTerms");
            return (Criteria) this;
        }

        public Criteria andPaymentTermsIn(List<String> values) {
            addCriterion("payment_terms in", values, "paymentTerms");
            return (Criteria) this;
        }

        public Criteria andPaymentTermsNotIn(List<String> values) {
            addCriterion("payment_terms not in", values, "paymentTerms");
            return (Criteria) this;
        }

        public Criteria andPaymentTermsBetween(String value1, String value2) {
            addCriterion("payment_terms between", value1, value2, "paymentTerms");
            return (Criteria) this;
        }

        public Criteria andPaymentTermsNotBetween(String value1, String value2) {
            addCriterion("payment_terms not between", value1, value2, "paymentTerms");
            return (Criteria) this;
        }

        public Criteria andDeliveryConditionsIsNull() {
            addCriterion("delivery_conditions is null");
            return (Criteria) this;
        }

        public Criteria andDeliveryConditionsIsNotNull() {
            addCriterion("delivery_conditions is not null");
            return (Criteria) this;
        }

        public Criteria andDeliveryConditionsEqualTo(String value) {
            addCriterion("delivery_conditions =", value, "deliveryConditions");
            return (Criteria) this;
        }

        public Criteria andDeliveryConditionsNotEqualTo(String value) {
            addCriterion("delivery_conditions <>", value, "deliveryConditions");
            return (Criteria) this;
        }

        public Criteria andDeliveryConditionsGreaterThan(String value) {
            addCriterion("delivery_conditions >", value, "deliveryConditions");
            return (Criteria) this;
        }

        public Criteria andDeliveryConditionsGreaterThanOrEqualTo(String value) {
            addCriterion("delivery_conditions >=", value, "deliveryConditions");
            return (Criteria) this;
        }

        public Criteria andDeliveryConditionsLessThan(String value) {
            addCriterion("delivery_conditions <", value, "deliveryConditions");
            return (Criteria) this;
        }

        public Criteria andDeliveryConditionsLessThanOrEqualTo(String value) {
            addCriterion("delivery_conditions <=", value, "deliveryConditions");
            return (Criteria) this;
        }

        public Criteria andDeliveryConditionsLike(String value) {
            addCriterion("delivery_conditions like", value, "deliveryConditions");
            return (Criteria) this;
        }

        public Criteria andDeliveryConditionsNotLike(String value) {
            addCriterion("delivery_conditions not like", value, "deliveryConditions");
            return (Criteria) this;
        }

        public Criteria andDeliveryConditionsIn(List<String> values) {
            addCriterion("delivery_conditions in", values, "deliveryConditions");
            return (Criteria) this;
        }

        public Criteria andDeliveryConditionsNotIn(List<String> values) {
            addCriterion("delivery_conditions not in", values, "deliveryConditions");
            return (Criteria) this;
        }

        public Criteria andDeliveryConditionsBetween(String value1, String value2) {
            addCriterion("delivery_conditions between", value1, value2, "deliveryConditions");
            return (Criteria) this;
        }

        public Criteria andDeliveryConditionsNotBetween(String value1, String value2) {
            addCriterion("delivery_conditions not between", value1, value2, "deliveryConditions");
            return (Criteria) this;
        }

        public Criteria andPointOfDeliveryIsNull() {
            addCriterion("point_of_delivery is null");
            return (Criteria) this;
        }

        public Criteria andPointOfDeliveryIsNotNull() {
            addCriterion("point_of_delivery is not null");
            return (Criteria) this;
        }

        public Criteria andPointOfDeliveryEqualTo(String value) {
            addCriterion("point_of_delivery =", value, "pointOfDelivery");
            return (Criteria) this;
        }

        public Criteria andPointOfDeliveryNotEqualTo(String value) {
            addCriterion("point_of_delivery <>", value, "pointOfDelivery");
            return (Criteria) this;
        }

        public Criteria andPointOfDeliveryGreaterThan(String value) {
            addCriterion("point_of_delivery >", value, "pointOfDelivery");
            return (Criteria) this;
        }

        public Criteria andPointOfDeliveryGreaterThanOrEqualTo(String value) {
            addCriterion("point_of_delivery >=", value, "pointOfDelivery");
            return (Criteria) this;
        }

        public Criteria andPointOfDeliveryLessThan(String value) {
            addCriterion("point_of_delivery <", value, "pointOfDelivery");
            return (Criteria) this;
        }

        public Criteria andPointOfDeliveryLessThanOrEqualTo(String value) {
            addCriterion("point_of_delivery <=", value, "pointOfDelivery");
            return (Criteria) this;
        }

        public Criteria andPointOfDeliveryLike(String value) {
            addCriterion("point_of_delivery like", value, "pointOfDelivery");
            return (Criteria) this;
        }

        public Criteria andPointOfDeliveryNotLike(String value) {
            addCriterion("point_of_delivery not like", value, "pointOfDelivery");
            return (Criteria) this;
        }

        public Criteria andPointOfDeliveryIn(List<String> values) {
            addCriterion("point_of_delivery in", values, "pointOfDelivery");
            return (Criteria) this;
        }

        public Criteria andPointOfDeliveryNotIn(List<String> values) {
            addCriterion("point_of_delivery not in", values, "pointOfDelivery");
            return (Criteria) this;
        }

        public Criteria andPointOfDeliveryBetween(String value1, String value2) {
            addCriterion("point_of_delivery between", value1, value2, "pointOfDelivery");
            return (Criteria) this;
        }

        public Criteria andPointOfDeliveryNotBetween(String value1, String value2) {
            addCriterion("point_of_delivery not between", value1, value2, "pointOfDelivery");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIsNull() {
            addCriterion("supplier_name is null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIsNotNull() {
            addCriterion("supplier_name is not null");
            return (Criteria) this;
        }

        public Criteria andSupplierNameEqualTo(String value) {
            addCriterion("supplier_name =", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotEqualTo(String value) {
            addCriterion("supplier_name <>", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThan(String value) {
            addCriterion("supplier_name >", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameGreaterThanOrEqualTo(String value) {
            addCriterion("supplier_name >=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThan(String value) {
            addCriterion("supplier_name <", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLessThanOrEqualTo(String value) {
            addCriterion("supplier_name <=", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameLike(String value) {
            addCriterion("supplier_name like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotLike(String value) {
            addCriterion("supplier_name not like", value, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameIn(List<String> values) {
            addCriterion("supplier_name in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotIn(List<String> values) {
            addCriterion("supplier_name not in", values, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameBetween(String value1, String value2) {
            addCriterion("supplier_name between", value1, value2, "supplierName");
            return (Criteria) this;
        }

        public Criteria andSupplierNameNotBetween(String value1, String value2) {
            addCriterion("supplier_name not between", value1, value2, "supplierName");
            return (Criteria) this;
        }

        public Criteria andParmaCodeIsNull() {
            addCriterion("parma_code is null");
            return (Criteria) this;
        }

        public Criteria andParmaCodeIsNotNull() {
            addCriterion("parma_code is not null");
            return (Criteria) this;
        }

        public Criteria andParmaCodeEqualTo(Integer value) {
            addCriterion("parma_code =", value, "parmaCode");
            return (Criteria) this;
        }

        public Criteria andParmaCodeNotEqualTo(Integer value) {
            addCriterion("parma_code <>", value, "parmaCode");
            return (Criteria) this;
        }

        public Criteria andParmaCodeGreaterThan(Integer value) {
            addCriterion("parma_code >", value, "parmaCode");
            return (Criteria) this;
        }

        public Criteria andParmaCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("parma_code >=", value, "parmaCode");
            return (Criteria) this;
        }

        public Criteria andParmaCodeLessThan(Integer value) {
            addCriterion("parma_code <", value, "parmaCode");
            return (Criteria) this;
        }

        public Criteria andParmaCodeLessThanOrEqualTo(Integer value) {
            addCriterion("parma_code <=", value, "parmaCode");
            return (Criteria) this;
        }

        public Criteria andParmaCodeIn(List<Integer> values) {
            addCriterion("parma_code in", values, "parmaCode");
            return (Criteria) this;
        }

        public Criteria andParmaCodeNotIn(List<Integer> values) {
            addCriterion("parma_code not in", values, "parmaCode");
            return (Criteria) this;
        }

        public Criteria andParmaCodeBetween(Integer value1, Integer value2) {
            addCriterion("parma_code between", value1, value2, "parmaCode");
            return (Criteria) this;
        }

        public Criteria andParmaCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("parma_code not between", value1, value2, "parmaCode");
            return (Criteria) this;
        }

        public Criteria andSourceCountryIsNull() {
            addCriterion("source_country is null");
            return (Criteria) this;
        }

        public Criteria andSourceCountryIsNotNull() {
            addCriterion("source_country is not null");
            return (Criteria) this;
        }

        public Criteria andSourceCountryEqualTo(String value) {
            addCriterion("source_country =", value, "sourceCountry");
            return (Criteria) this;
        }

        public Criteria andSourceCountryNotEqualTo(String value) {
            addCriterion("source_country <>", value, "sourceCountry");
            return (Criteria) this;
        }

        public Criteria andSourceCountryGreaterThan(String value) {
            addCriterion("source_country >", value, "sourceCountry");
            return (Criteria) this;
        }

        public Criteria andSourceCountryGreaterThanOrEqualTo(String value) {
            addCriterion("source_country >=", value, "sourceCountry");
            return (Criteria) this;
        }

        public Criteria andSourceCountryLessThan(String value) {
            addCriterion("source_country <", value, "sourceCountry");
            return (Criteria) this;
        }

        public Criteria andSourceCountryLessThanOrEqualTo(String value) {
            addCriterion("source_country <=", value, "sourceCountry");
            return (Criteria) this;
        }

        public Criteria andSourceCountryLike(String value) {
            addCriterion("source_country like", value, "sourceCountry");
            return (Criteria) this;
        }

        public Criteria andSourceCountryNotLike(String value) {
            addCriterion("source_country not like", value, "sourceCountry");
            return (Criteria) this;
        }

        public Criteria andSourceCountryIn(List<String> values) {
            addCriterion("source_country in", values, "sourceCountry");
            return (Criteria) this;
        }

        public Criteria andSourceCountryNotIn(List<String> values) {
            addCriterion("source_country not in", values, "sourceCountry");
            return (Criteria) this;
        }

        public Criteria andSourceCountryBetween(String value1, String value2) {
            addCriterion("source_country between", value1, value2, "sourceCountry");
            return (Criteria) this;
        }

        public Criteria andSourceCountryNotBetween(String value1, String value2) {
            addCriterion("source_country not between", value1, value2, "sourceCountry");
            return (Criteria) this;
        }

        public Criteria andLocalCurrencyIsNull() {
            addCriterion("local_currency is null");
            return (Criteria) this;
        }

        public Criteria andLocalCurrencyIsNotNull() {
            addCriterion("local_currency is not null");
            return (Criteria) this;
        }

        public Criteria andLocalCurrencyEqualTo(String value) {
            addCriterion("local_currency =", value, "localCurrency");
            return (Criteria) this;
        }

        public Criteria andLocalCurrencyNotEqualTo(String value) {
            addCriterion("local_currency <>", value, "localCurrency");
            return (Criteria) this;
        }

        public Criteria andLocalCurrencyGreaterThan(String value) {
            addCriterion("local_currency >", value, "localCurrency");
            return (Criteria) this;
        }

        public Criteria andLocalCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("local_currency >=", value, "localCurrency");
            return (Criteria) this;
        }

        public Criteria andLocalCurrencyLessThan(String value) {
            addCriterion("local_currency <", value, "localCurrency");
            return (Criteria) this;
        }

        public Criteria andLocalCurrencyLessThanOrEqualTo(String value) {
            addCriterion("local_currency <=", value, "localCurrency");
            return (Criteria) this;
        }

        public Criteria andLocalCurrencyLike(String value) {
            addCriterion("local_currency like", value, "localCurrency");
            return (Criteria) this;
        }

        public Criteria andLocalCurrencyNotLike(String value) {
            addCriterion("local_currency not like", value, "localCurrency");
            return (Criteria) this;
        }

        public Criteria andLocalCurrencyIn(List<String> values) {
            addCriterion("local_currency in", values, "localCurrency");
            return (Criteria) this;
        }

        public Criteria andLocalCurrencyNotIn(List<String> values) {
            addCriterion("local_currency not in", values, "localCurrency");
            return (Criteria) this;
        }

        public Criteria andLocalCurrencyBetween(String value1, String value2) {
            addCriterion("local_currency between", value1, value2, "localCurrency");
            return (Criteria) this;
        }

        public Criteria andLocalCurrencyNotBetween(String value1, String value2) {
            addCriterion("local_currency not between", value1, value2, "localCurrency");
            return (Criteria) this;
        }

        public Criteria andBuyerIsNull() {
            addCriterion("buyer is null");
            return (Criteria) this;
        }

        public Criteria andBuyerIsNotNull() {
            addCriterion("buyer is not null");
            return (Criteria) this;
        }

        public Criteria andBuyerEqualTo(String value) {
            addCriterion("buyer =", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerNotEqualTo(String value) {
            addCriterion("buyer <>", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerGreaterThan(String value) {
            addCriterion("buyer >", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerGreaterThanOrEqualTo(String value) {
            addCriterion("buyer >=", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerLessThan(String value) {
            addCriterion("buyer <", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerLessThanOrEqualTo(String value) {
            addCriterion("buyer <=", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerLike(String value) {
            addCriterion("buyer like", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerNotLike(String value) {
            addCriterion("buyer not like", value, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerIn(List<String> values) {
            addCriterion("buyer in", values, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerNotIn(List<String> values) {
            addCriterion("buyer not in", values, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerBetween(String value1, String value2) {
            addCriterion("buyer between", value1, value2, "buyer");
            return (Criteria) this;
        }

        public Criteria andBuyerNotBetween(String value1, String value2) {
            addCriterion("buyer not between", value1, value2, "buyer");
            return (Criteria) this;
        }

        public Criteria andCostEngineerIsNull() {
            addCriterion("cost_engineer is null");
            return (Criteria) this;
        }

        public Criteria andCostEngineerIsNotNull() {
            addCriterion("cost_engineer is not null");
            return (Criteria) this;
        }

        public Criteria andCostEngineerEqualTo(Double value) {
            addCriterion("cost_engineer =", value, "costEngineer");
            return (Criteria) this;
        }

        public Criteria andCostEngineerNotEqualTo(Double value) {
            addCriterion("cost_engineer <>", value, "costEngineer");
            return (Criteria) this;
        }

        public Criteria andCostEngineerGreaterThan(Double value) {
            addCriterion("cost_engineer >", value, "costEngineer");
            return (Criteria) this;
        }

        public Criteria andCostEngineerGreaterThanOrEqualTo(Double value) {
            addCriterion("cost_engineer >=", value, "costEngineer");
            return (Criteria) this;
        }

        public Criteria andCostEngineerLessThan(Double value) {
            addCriterion("cost_engineer <", value, "costEngineer");
            return (Criteria) this;
        }

        public Criteria andCostEngineerLessThanOrEqualTo(Double value) {
            addCriterion("cost_engineer <=", value, "costEngineer");
            return (Criteria) this;
        }

        public Criteria andCostEngineerIn(List<Double> values) {
            addCriterion("cost_engineer in", values, "costEngineer");
            return (Criteria) this;
        }

        public Criteria andCostEngineerNotIn(List<Double> values) {
            addCriterion("cost_engineer not in", values, "costEngineer");
            return (Criteria) this;
        }

        public Criteria andCostEngineerBetween(Double value1, Double value2) {
            addCriterion("cost_engineer between", value1, value2, "costEngineer");
            return (Criteria) this;
        }

        public Criteria andCostEngineerNotBetween(Double value1, Double value2) {
            addCriterion("cost_engineer not between", value1, value2, "costEngineer");
            return (Criteria) this;
        }

        public Criteria andMiscInformationIsNull() {
            addCriterion("misc_information is null");
            return (Criteria) this;
        }

        public Criteria andMiscInformationIsNotNull() {
            addCriterion("misc_information is not null");
            return (Criteria) this;
        }

        public Criteria andMiscInformationEqualTo(String value) {
            addCriterion("misc_information =", value, "miscInformation");
            return (Criteria) this;
        }

        public Criteria andMiscInformationNotEqualTo(String value) {
            addCriterion("misc_information <>", value, "miscInformation");
            return (Criteria) this;
        }

        public Criteria andMiscInformationGreaterThan(String value) {
            addCriterion("misc_information >", value, "miscInformation");
            return (Criteria) this;
        }

        public Criteria andMiscInformationGreaterThanOrEqualTo(String value) {
            addCriterion("misc_information >=", value, "miscInformation");
            return (Criteria) this;
        }

        public Criteria andMiscInformationLessThan(String value) {
            addCriterion("misc_information <", value, "miscInformation");
            return (Criteria) this;
        }

        public Criteria andMiscInformationLessThanOrEqualTo(String value) {
            addCriterion("misc_information <=", value, "miscInformation");
            return (Criteria) this;
        }

        public Criteria andMiscInformationLike(String value) {
            addCriterion("misc_information like", value, "miscInformation");
            return (Criteria) this;
        }

        public Criteria andMiscInformationNotLike(String value) {
            addCriterion("misc_information not like", value, "miscInformation");
            return (Criteria) this;
        }

        public Criteria andMiscInformationIn(List<String> values) {
            addCriterion("misc_information in", values, "miscInformation");
            return (Criteria) this;
        }

        public Criteria andMiscInformationNotIn(List<String> values) {
            addCriterion("misc_information not in", values, "miscInformation");
            return (Criteria) this;
        }

        public Criteria andMiscInformationBetween(String value1, String value2) {
            addCriterion("misc_information between", value1, value2, "miscInformation");
            return (Criteria) this;
        }

        public Criteria andMiscInformationNotBetween(String value1, String value2) {
            addCriterion("misc_information not between", value1, value2, "miscInformation");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}