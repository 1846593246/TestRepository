package com.bean;

import java.util.ArrayList;
import java.util.List;

public class FaceMachineBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public FaceMachineBeanExample() {
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

        public Criteria andMachineidIsNull() {
            addCriterion("machineid is null");
            return (Criteria) this;
        }

        public Criteria andMachineidIsNotNull() {
            addCriterion("machineid is not null");
            return (Criteria) this;
        }

        public Criteria andMachineidEqualTo(String value) {
            addCriterion("machineid =", value, "machineid");
            return (Criteria) this;
        }

        public Criteria andMachineidNotEqualTo(String value) {
            addCriterion("machineid <>", value, "machineid");
            return (Criteria) this;
        }

        public Criteria andMachineidGreaterThan(String value) {
            addCriterion("machineid >", value, "machineid");
            return (Criteria) this;
        }

        public Criteria andMachineidGreaterThanOrEqualTo(String value) {
            addCriterion("machineid >=", value, "machineid");
            return (Criteria) this;
        }

        public Criteria andMachineidLessThan(String value) {
            addCriterion("machineid <", value, "machineid");
            return (Criteria) this;
        }

        public Criteria andMachineidLessThanOrEqualTo(String value) {
            addCriterion("machineid <=", value, "machineid");
            return (Criteria) this;
        }

        public Criteria andMachineidLike(String value) {
            addCriterion("machineid like", value, "machineid");
            return (Criteria) this;
        }

        public Criteria andMachineidNotLike(String value) {
            addCriterion("machineid not like", value, "machineid");
            return (Criteria) this;
        }

        public Criteria andMachineidIn(List<String> values) {
            addCriterion("machineid in", values, "machineid");
            return (Criteria) this;
        }

        public Criteria andMachineidNotIn(List<String> values) {
            addCriterion("machineid not in", values, "machineid");
            return (Criteria) this;
        }

        public Criteria andMachineidBetween(String value1, String value2) {
            addCriterion("machineid between", value1, value2, "machineid");
            return (Criteria) this;
        }

        public Criteria andMachineidNotBetween(String value1, String value2) {
            addCriterion("machineid not between", value1, value2, "machineid");
            return (Criteria) this;
        }

        public Criteria andAddresscodeIsNull() {
            addCriterion("addressCode is null");
            return (Criteria) this;
        }

        public Criteria andAddresscodeIsNotNull() {
            addCriterion("addressCode is not null");
            return (Criteria) this;
        }

        public Criteria andAddresscodeEqualTo(String value) {
            addCriterion("addressCode =", value, "addresscode");
            return (Criteria) this;
        }

        public Criteria andAddresscodeNotEqualTo(String value) {
            addCriterion("addressCode <>", value, "addresscode");
            return (Criteria) this;
        }

        public Criteria andAddresscodeGreaterThan(String value) {
            addCriterion("addressCode >", value, "addresscode");
            return (Criteria) this;
        }

        public Criteria andAddresscodeGreaterThanOrEqualTo(String value) {
            addCriterion("addressCode >=", value, "addresscode");
            return (Criteria) this;
        }

        public Criteria andAddresscodeLessThan(String value) {
            addCriterion("addressCode <", value, "addresscode");
            return (Criteria) this;
        }

        public Criteria andAddresscodeLessThanOrEqualTo(String value) {
            addCriterion("addressCode <=", value, "addresscode");
            return (Criteria) this;
        }

        public Criteria andAddresscodeLike(String value) {
            addCriterion("addressCode like", value, "addresscode");
            return (Criteria) this;
        }

        public Criteria andAddresscodeNotLike(String value) {
            addCriterion("addressCode not like", value, "addresscode");
            return (Criteria) this;
        }

        public Criteria andAddresscodeIn(List<String> values) {
            addCriterion("addressCode in", values, "addresscode");
            return (Criteria) this;
        }

        public Criteria andAddresscodeNotIn(List<String> values) {
            addCriterion("addressCode not in", values, "addresscode");
            return (Criteria) this;
        }

        public Criteria andAddresscodeBetween(String value1, String value2) {
            addCriterion("addressCode between", value1, value2, "addresscode");
            return (Criteria) this;
        }

        public Criteria andAddresscodeNotBetween(String value1, String value2) {
            addCriterion("addressCode not between", value1, value2, "addresscode");
            return (Criteria) this;
        }

        public Criteria andMachinenameIsNull() {
            addCriterion("machineName is null");
            return (Criteria) this;
        }

        public Criteria andMachinenameIsNotNull() {
            addCriterion("machineName is not null");
            return (Criteria) this;
        }

        public Criteria andMachinenameEqualTo(String value) {
            addCriterion("machineName =", value, "machinename");
            return (Criteria) this;
        }

        public Criteria andMachinenameNotEqualTo(String value) {
            addCriterion("machineName <>", value, "machinename");
            return (Criteria) this;
        }

        public Criteria andMachinenameGreaterThan(String value) {
            addCriterion("machineName >", value, "machinename");
            return (Criteria) this;
        }

        public Criteria andMachinenameGreaterThanOrEqualTo(String value) {
            addCriterion("machineName >=", value, "machinename");
            return (Criteria) this;
        }

        public Criteria andMachinenameLessThan(String value) {
            addCriterion("machineName <", value, "machinename");
            return (Criteria) this;
        }

        public Criteria andMachinenameLessThanOrEqualTo(String value) {
            addCriterion("machineName <=", value, "machinename");
            return (Criteria) this;
        }

        public Criteria andMachinenameLike(String value) {
            addCriterion("machineName like", value, "machinename");
            return (Criteria) this;
        }

        public Criteria andMachinenameNotLike(String value) {
            addCriterion("machineName not like", value, "machinename");
            return (Criteria) this;
        }

        public Criteria andMachinenameIn(List<String> values) {
            addCriterion("machineName in", values, "machinename");
            return (Criteria) this;
        }

        public Criteria andMachinenameNotIn(List<String> values) {
            addCriterion("machineName not in", values, "machinename");
            return (Criteria) this;
        }

        public Criteria andMachinenameBetween(String value1, String value2) {
            addCriterion("machineName between", value1, value2, "machinename");
            return (Criteria) this;
        }

        public Criteria andMachinenameNotBetween(String value1, String value2) {
            addCriterion("machineName not between", value1, value2, "machinename");
            return (Criteria) this;
        }

        public Criteria andMachineipIsNull() {
            addCriterion("machineIp is null");
            return (Criteria) this;
        }

        public Criteria andMachineipIsNotNull() {
            addCriterion("machineIp is not null");
            return (Criteria) this;
        }

        public Criteria andMachineipEqualTo(String value) {
            addCriterion("machineIp =", value, "machineip");
            return (Criteria) this;
        }

        public Criteria andMachineipNotEqualTo(String value) {
            addCriterion("machineIp <>", value, "machineip");
            return (Criteria) this;
        }

        public Criteria andMachineipGreaterThan(String value) {
            addCriterion("machineIp >", value, "machineip");
            return (Criteria) this;
        }

        public Criteria andMachineipGreaterThanOrEqualTo(String value) {
            addCriterion("machineIp >=", value, "machineip");
            return (Criteria) this;
        }

        public Criteria andMachineipLessThan(String value) {
            addCriterion("machineIp <", value, "machineip");
            return (Criteria) this;
        }

        public Criteria andMachineipLessThanOrEqualTo(String value) {
            addCriterion("machineIp <=", value, "machineip");
            return (Criteria) this;
        }

        public Criteria andMachineipLike(String value) {
            addCriterion("machineIp like", value, "machineip");
            return (Criteria) this;
        }

        public Criteria andMachineipNotLike(String value) {
            addCriterion("machineIp not like", value, "machineip");
            return (Criteria) this;
        }

        public Criteria andMachineipIn(List<String> values) {
            addCriterion("machineIp in", values, "machineip");
            return (Criteria) this;
        }

        public Criteria andMachineipNotIn(List<String> values) {
            addCriterion("machineIp not in", values, "machineip");
            return (Criteria) this;
        }

        public Criteria andMachineipBetween(String value1, String value2) {
            addCriterion("machineIp between", value1, value2, "machineip");
            return (Criteria) this;
        }

        public Criteria andMachineipNotBetween(String value1, String value2) {
            addCriterion("machineIp not between", value1, value2, "machineip");
            return (Criteria) this;
        }

        public Criteria andPwdIsNull() {
            addCriterion("pwd is null");
            return (Criteria) this;
        }

        public Criteria andPwdIsNotNull() {
            addCriterion("pwd is not null");
            return (Criteria) this;
        }

        public Criteria andPwdEqualTo(String value) {
            addCriterion("pwd =", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotEqualTo(String value) {
            addCriterion("pwd <>", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdGreaterThan(String value) {
            addCriterion("pwd >", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdGreaterThanOrEqualTo(String value) {
            addCriterion("pwd >=", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLessThan(String value) {
            addCriterion("pwd <", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLessThanOrEqualTo(String value) {
            addCriterion("pwd <=", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdLike(String value) {
            addCriterion("pwd like", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotLike(String value) {
            addCriterion("pwd not like", value, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdIn(List<String> values) {
            addCriterion("pwd in", values, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotIn(List<String> values) {
            addCriterion("pwd not in", values, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdBetween(String value1, String value2) {
            addCriterion("pwd between", value1, value2, "pwd");
            return (Criteria) this;
        }

        public Criteria andPwdNotBetween(String value1, String value2) {
            addCriterion("pwd not between", value1, value2, "pwd");
            return (Criteria) this;
        }

        public Criteria andLastonlinedateIsNull() {
            addCriterion("lastOnlineDate is null");
            return (Criteria) this;
        }

        public Criteria andLastonlinedateIsNotNull() {
            addCriterion("lastOnlineDate is not null");
            return (Criteria) this;
        }

        public Criteria andLastonlinedateEqualTo(String value) {
            addCriterion("lastOnlineDate =", value, "lastonlinedate");
            return (Criteria) this;
        }

        public Criteria andLastonlinedateNotEqualTo(String value) {
            addCriterion("lastOnlineDate <>", value, "lastonlinedate");
            return (Criteria) this;
        }

        public Criteria andLastonlinedateGreaterThan(String value) {
            addCriterion("lastOnlineDate >", value, "lastonlinedate");
            return (Criteria) this;
        }

        public Criteria andLastonlinedateGreaterThanOrEqualTo(String value) {
            addCriterion("lastOnlineDate >=", value, "lastonlinedate");
            return (Criteria) this;
        }

        public Criteria andLastonlinedateLessThan(String value) {
            addCriterion("lastOnlineDate <", value, "lastonlinedate");
            return (Criteria) this;
        }

        public Criteria andLastonlinedateLessThanOrEqualTo(String value) {
            addCriterion("lastOnlineDate <=", value, "lastonlinedate");
            return (Criteria) this;
        }

        public Criteria andLastonlinedateLike(String value) {
            addCriterion("lastOnlineDate like", value, "lastonlinedate");
            return (Criteria) this;
        }

        public Criteria andLastonlinedateNotLike(String value) {
            addCriterion("lastOnlineDate not like", value, "lastonlinedate");
            return (Criteria) this;
        }

        public Criteria andLastonlinedateIn(List<String> values) {
            addCriterion("lastOnlineDate in", values, "lastonlinedate");
            return (Criteria) this;
        }

        public Criteria andLastonlinedateNotIn(List<String> values) {
            addCriterion("lastOnlineDate not in", values, "lastonlinedate");
            return (Criteria) this;
        }

        public Criteria andLastonlinedateBetween(String value1, String value2) {
            addCriterion("lastOnlineDate between", value1, value2, "lastonlinedate");
            return (Criteria) this;
        }

        public Criteria andLastonlinedateNotBetween(String value1, String value2) {
            addCriterion("lastOnlineDate not between", value1, value2, "lastonlinedate");
            return (Criteria) this;
        }

        public Criteria andHeartbeaturlIsNull() {
            addCriterion("heartBeatURL is null");
            return (Criteria) this;
        }

        public Criteria andHeartbeaturlIsNotNull() {
            addCriterion("heartBeatURL is not null");
            return (Criteria) this;
        }

        public Criteria andHeartbeaturlEqualTo(String value) {
            addCriterion("heartBeatURL =", value, "heartbeaturl");
            return (Criteria) this;
        }

        public Criteria andHeartbeaturlNotEqualTo(String value) {
            addCriterion("heartBeatURL <>", value, "heartbeaturl");
            return (Criteria) this;
        }

        public Criteria andHeartbeaturlGreaterThan(String value) {
            addCriterion("heartBeatURL >", value, "heartbeaturl");
            return (Criteria) this;
        }

        public Criteria andHeartbeaturlGreaterThanOrEqualTo(String value) {
            addCriterion("heartBeatURL >=", value, "heartbeaturl");
            return (Criteria) this;
        }

        public Criteria andHeartbeaturlLessThan(String value) {
            addCriterion("heartBeatURL <", value, "heartbeaturl");
            return (Criteria) this;
        }

        public Criteria andHeartbeaturlLessThanOrEqualTo(String value) {
            addCriterion("heartBeatURL <=", value, "heartbeaturl");
            return (Criteria) this;
        }

        public Criteria andHeartbeaturlLike(String value) {
            addCriterion("heartBeatURL like", value, "heartbeaturl");
            return (Criteria) this;
        }

        public Criteria andHeartbeaturlNotLike(String value) {
            addCriterion("heartBeatURL not like", value, "heartbeaturl");
            return (Criteria) this;
        }

        public Criteria andHeartbeaturlIn(List<String> values) {
            addCriterion("heartBeatURL in", values, "heartbeaturl");
            return (Criteria) this;
        }

        public Criteria andHeartbeaturlNotIn(List<String> values) {
            addCriterion("heartBeatURL not in", values, "heartbeaturl");
            return (Criteria) this;
        }

        public Criteria andHeartbeaturlBetween(String value1, String value2) {
            addCriterion("heartBeatURL between", value1, value2, "heartbeaturl");
            return (Criteria) this;
        }

        public Criteria andHeartbeaturlNotBetween(String value1, String value2) {
            addCriterion("heartBeatURL not between", value1, value2, "heartbeaturl");
            return (Criteria) this;
        }

        public Criteria andInvoiceurlIsNull() {
            addCriterion("invoiceURL is null");
            return (Criteria) this;
        }

        public Criteria andInvoiceurlIsNotNull() {
            addCriterion("invoiceURL is not null");
            return (Criteria) this;
        }

        public Criteria andInvoiceurlEqualTo(String value) {
            addCriterion("invoiceURL =", value, "invoiceurl");
            return (Criteria) this;
        }

        public Criteria andInvoiceurlNotEqualTo(String value) {
            addCriterion("invoiceURL <>", value, "invoiceurl");
            return (Criteria) this;
        }

        public Criteria andInvoiceurlGreaterThan(String value) {
            addCriterion("invoiceURL >", value, "invoiceurl");
            return (Criteria) this;
        }

        public Criteria andInvoiceurlGreaterThanOrEqualTo(String value) {
            addCriterion("invoiceURL >=", value, "invoiceurl");
            return (Criteria) this;
        }

        public Criteria andInvoiceurlLessThan(String value) {
            addCriterion("invoiceURL <", value, "invoiceurl");
            return (Criteria) this;
        }

        public Criteria andInvoiceurlLessThanOrEqualTo(String value) {
            addCriterion("invoiceURL <=", value, "invoiceurl");
            return (Criteria) this;
        }

        public Criteria andInvoiceurlLike(String value) {
            addCriterion("invoiceURL like", value, "invoiceurl");
            return (Criteria) this;
        }

        public Criteria andInvoiceurlNotLike(String value) {
            addCriterion("invoiceURL not like", value, "invoiceurl");
            return (Criteria) this;
        }

        public Criteria andInvoiceurlIn(List<String> values) {
            addCriterion("invoiceURL in", values, "invoiceurl");
            return (Criteria) this;
        }

        public Criteria andInvoiceurlNotIn(List<String> values) {
            addCriterion("invoiceURL not in", values, "invoiceurl");
            return (Criteria) this;
        }

        public Criteria andInvoiceurlBetween(String value1, String value2) {
            addCriterion("invoiceURL between", value1, value2, "invoiceurl");
            return (Criteria) this;
        }

        public Criteria andInvoiceurlNotBetween(String value1, String value2) {
            addCriterion("invoiceURL not between", value1, value2, "invoiceurl");
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