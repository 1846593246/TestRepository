package com.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PersonnelinroomBeanExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PersonnelinroomBeanExample() {
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

        public Criteria andInroomidIsNull() {
            addCriterion("inroomid is null");
            return (Criteria) this;
        }

        public Criteria andInroomidIsNotNull() {
            addCriterion("inroomid is not null");
            return (Criteria) this;
        }

        public Criteria andInroomidEqualTo(String value) {
            addCriterion("inroomid =", value, "inroomid");
            return (Criteria) this;
        }

        public Criteria andInroomidNotEqualTo(String value) {
            addCriterion("inroomid <>", value, "inroomid");
            return (Criteria) this;
        }

        public Criteria andInroomidGreaterThan(String value) {
            addCriterion("inroomid >", value, "inroomid");
            return (Criteria) this;
        }

        public Criteria andInroomidGreaterThanOrEqualTo(String value) {
            addCriterion("inroomid >=", value, "inroomid");
            return (Criteria) this;
        }

        public Criteria andInroomidLessThan(String value) {
            addCriterion("inroomid <", value, "inroomid");
            return (Criteria) this;
        }

        public Criteria andInroomidLessThanOrEqualTo(String value) {
            addCriterion("inroomid <=", value, "inroomid");
            return (Criteria) this;
        }

        public Criteria andInroomidLike(String value) {
            addCriterion("inroomid like", value, "inroomid");
            return (Criteria) this;
        }

        public Criteria andInroomidNotLike(String value) {
            addCriterion("inroomid not like", value, "inroomid");
            return (Criteria) this;
        }

        public Criteria andInroomidIn(List<String> values) {
            addCriterion("inroomid in", values, "inroomid");
            return (Criteria) this;
        }

        public Criteria andInroomidNotIn(List<String> values) {
            addCriterion("inroomid not in", values, "inroomid");
            return (Criteria) this;
        }

        public Criteria andInroomidBetween(String value1, String value2) {
            addCriterion("inroomid between", value1, value2, "inroomid");
            return (Criteria) this;
        }

        public Criteria andInroomidNotBetween(String value1, String value2) {
            addCriterion("inroomid not between", value1, value2, "inroomid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidIsNull() {
            addCriterion("personnelid is null");
            return (Criteria) this;
        }

        public Criteria andPersonnelidIsNotNull() {
            addCriterion("personnelid is not null");
            return (Criteria) this;
        }

        public Criteria andPersonnelidEqualTo(String value) {
            addCriterion("personnelid =", value, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidNotEqualTo(String value) {
            addCriterion("personnelid <>", value, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidGreaterThan(String value) {
            addCriterion("personnelid >", value, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidGreaterThanOrEqualTo(String value) {
            addCriterion("personnelid >=", value, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidLessThan(String value) {
            addCriterion("personnelid <", value, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidLessThanOrEqualTo(String value) {
            addCriterion("personnelid <=", value, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidLike(String value) {
            addCriterion("personnelid like", value, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidNotLike(String value) {
            addCriterion("personnelid not like", value, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidIn(List<String> values) {
            addCriterion("personnelid in", values, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidNotIn(List<String> values) {
            addCriterion("personnelid not in", values, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidBetween(String value1, String value2) {
            addCriterion("personnelid between", value1, value2, "personnelid");
            return (Criteria) this;
        }

        public Criteria andPersonnelidNotBetween(String value1, String value2) {
            addCriterion("personnelid not between", value1, value2, "personnelid");
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

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andInroomdateIsNull() {
            addCriterion("inroomdate is null");
            return (Criteria) this;
        }

        public Criteria andInroomdateIsNotNull() {
            addCriterion("inroomdate is not null");
            return (Criteria) this;
        }

        public Criteria andInroomdateEqualTo(Date value) {
            addCriterion("inroomdate =", value, "inroomdate");
            return (Criteria) this;
        }

        public Criteria andInroomdateNotEqualTo(Date value) {
            addCriterion("inroomdate <>", value, "inroomdate");
            return (Criteria) this;
        }

        public Criteria andInroomdateGreaterThan(Date value) {
            addCriterion("inroomdate >", value, "inroomdate");
            return (Criteria) this;
        }

        public Criteria andInroomdateGreaterThanOrEqualTo(Date value) {
            addCriterion("inroomdate >=", value, "inroomdate");
            return (Criteria) this;
        }

        public Criteria andInroomdateLessThan(Date value) {
            addCriterion("inroomdate <", value, "inroomdate");
            return (Criteria) this;
        }

        public Criteria andInroomdateLessThanOrEqualTo(Date value) {
            addCriterion("inroomdate <=", value, "inroomdate");
            return (Criteria) this;
        }

        public Criteria andInroomdateIn(List<Date> values) {
            addCriterion("inroomdate in", values, "inroomdate");
            return (Criteria) this;
        }

        public Criteria andInroomdateNotIn(List<Date> values) {
            addCriterion("inroomdate not in", values, "inroomdate");
            return (Criteria) this;
        }

        public Criteria andInroomdateBetween(Date value1, Date value2) {
            addCriterion("inroomdate between", value1, value2, "inroomdate");
            return (Criteria) this;
        }

        public Criteria andInroomdateNotBetween(Date value1, Date value2) {
            addCriterion("inroomdate not between", value1, value2, "inroomdate");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNull() {
            addCriterion("endDate is null");
            return (Criteria) this;
        }

        public Criteria andEnddateIsNotNull() {
            addCriterion("endDate is not null");
            return (Criteria) this;
        }

        public Criteria andEnddateEqualTo(Date value) {
            addCriterionForJDBCDate("endDate =", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotEqualTo(Date value) {
            addCriterionForJDBCDate("endDate <>", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThan(Date value) {
            addCriterionForJDBCDate("endDate >", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("endDate >=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThan(Date value) {
            addCriterionForJDBCDate("endDate <", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("endDate <=", value, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateIn(List<Date> values) {
            addCriterionForJDBCDate("endDate in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotIn(List<Date> values) {
            addCriterionForJDBCDate("endDate not in", values, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("endDate between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andEnddateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("endDate not between", value1, value2, "enddate");
            return (Criteria) this;
        }

        public Criteria andBednumIsNull() {
            addCriterion("bedNum is null");
            return (Criteria) this;
        }

        public Criteria andBednumIsNotNull() {
            addCriterion("bedNum is not null");
            return (Criteria) this;
        }

        public Criteria andBednumEqualTo(Integer value) {
            addCriterion("bedNum =", value, "bednum");
            return (Criteria) this;
        }

        public Criteria andBednumNotEqualTo(Integer value) {
            addCriterion("bedNum <>", value, "bednum");
            return (Criteria) this;
        }

        public Criteria andBednumGreaterThan(Integer value) {
            addCriterion("bedNum >", value, "bednum");
            return (Criteria) this;
        }

        public Criteria andBednumGreaterThanOrEqualTo(Integer value) {
            addCriterion("bedNum >=", value, "bednum");
            return (Criteria) this;
        }

        public Criteria andBednumLessThan(Integer value) {
            addCriterion("bedNum <", value, "bednum");
            return (Criteria) this;
        }

        public Criteria andBednumLessThanOrEqualTo(Integer value) {
            addCriterion("bedNum <=", value, "bednum");
            return (Criteria) this;
        }

        public Criteria andBednumIn(List<Integer> values) {
            addCriterion("bedNum in", values, "bednum");
            return (Criteria) this;
        }

        public Criteria andBednumNotIn(List<Integer> values) {
            addCriterion("bedNum not in", values, "bednum");
            return (Criteria) this;
        }

        public Criteria andBednumBetween(Integer value1, Integer value2) {
            addCriterion("bedNum between", value1, value2, "bednum");
            return (Criteria) this;
        }

        public Criteria andBednumNotBetween(Integer value1, Integer value2) {
            addCriterion("bedNum not between", value1, value2, "bednum");
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