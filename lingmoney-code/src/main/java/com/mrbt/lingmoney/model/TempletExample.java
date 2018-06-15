package com.mrbt.lingmoney.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TempletExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table templet
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table templet
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table templet
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table templet
     *
     * @mbggenerated
     */
    protected int limitStart = -1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table templet
     *
     * @mbggenerated
     */
    protected int limitEnd = -1;

    /**
     *  构造查询条件,templet
     */
    public TempletExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *  设置排序字段,templet
     *
     * @param orderByClause 排序字段
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *  获取排序字段,templet
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *  设置过滤重复数据,templet
     *
     * @param distinct 是否过滤重复数据
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *  是否过滤重复数据,templet
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *  获取当前的查询条件实例,templet
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * ,templet
     *
     * @param criteria 过滤条件实例
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * ,templet
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *  创建一个查询条件,templet
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *  内部构建查询条件对象,templet
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *  清除查询条件,templet
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * ,templet
     *
     * @param limitStart
     */
    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    /**
     * ,templet
     */
    public int getLimitStart() {
        return limitStart;
    }

    /**
     * ,templet
     *
     * @param limitEnd
     */
    public void setLimitEnd(int limitEnd) {
        this.limitEnd=limitEnd;
    }

    /**
     * ,templet
     */
    public int getLimitEnd() {
        return limitEnd;
    }

    /**
     * 类注释
     * GeneratedCriteria
     * 数据库表：templet
     */
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTempNameIsNull() {
            addCriterion("temp_name is null");
            return (Criteria) this;
        }

        public Criteria andTempNameIsNotNull() {
            addCriterion("temp_name is not null");
            return (Criteria) this;
        }

        public Criteria andTempNameEqualTo(String value) {
            addCriterion("temp_name =", value, "tempName");
            return (Criteria) this;
        }

        public Criteria andTempNameNotEqualTo(String value) {
            addCriterion("temp_name <>", value, "tempName");
            return (Criteria) this;
        }

        public Criteria andTempNameGreaterThan(String value) {
            addCriterion("temp_name >", value, "tempName");
            return (Criteria) this;
        }

        public Criteria andTempNameGreaterThanOrEqualTo(String value) {
            addCriterion("temp_name >=", value, "tempName");
            return (Criteria) this;
        }

        public Criteria andTempNameLessThan(String value) {
            addCriterion("temp_name <", value, "tempName");
            return (Criteria) this;
        }

        public Criteria andTempNameLessThanOrEqualTo(String value) {
            addCriterion("temp_name <=", value, "tempName");
            return (Criteria) this;
        }

        public Criteria andTempNameLike(String value) {
            addCriterion("temp_name like", value, "tempName");
            return (Criteria) this;
        }

        public Criteria andTempNameNotLike(String value) {
            addCriterion("temp_name not like", value, "tempName");
            return (Criteria) this;
        }

        public Criteria andTempNameIn(List<String> values) {
            addCriterion("temp_name in", values, "tempName");
            return (Criteria) this;
        }

        public Criteria andTempNameNotIn(List<String> values) {
            addCriterion("temp_name not in", values, "tempName");
            return (Criteria) this;
        }

        public Criteria andTempNameBetween(String value1, String value2) {
            addCriterion("temp_name between", value1, value2, "tempName");
            return (Criteria) this;
        }

        public Criteria andTempNameNotBetween(String value1, String value2) {
            addCriterion("temp_name not between", value1, value2, "tempName");
            return (Criteria) this;
        }

        public Criteria andFileTypeIsNull() {
            addCriterion("file_type is null");
            return (Criteria) this;
        }

        public Criteria andFileTypeIsNotNull() {
            addCriterion("file_type is not null");
            return (Criteria) this;
        }

        public Criteria andFileTypeEqualTo(String value) {
            addCriterion("file_type =", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotEqualTo(String value) {
            addCriterion("file_type <>", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeGreaterThan(String value) {
            addCriterion("file_type >", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeGreaterThanOrEqualTo(String value) {
            addCriterion("file_type >=", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLessThan(String value) {
            addCriterion("file_type <", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLessThanOrEqualTo(String value) {
            addCriterion("file_type <=", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeLike(String value) {
            addCriterion("file_type like", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotLike(String value) {
            addCriterion("file_type not like", value, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeIn(List<String> values) {
            addCriterion("file_type in", values, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotIn(List<String> values) {
            addCriterion("file_type not in", values, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeBetween(String value1, String value2) {
            addCriterion("file_type between", value1, value2, "fileType");
            return (Criteria) this;
        }

        public Criteria andFileTypeNotBetween(String value1, String value2) {
            addCriterion("file_type not between", value1, value2, "fileType");
            return (Criteria) this;
        }

        public Criteria andModiDateIsNull() {
            addCriterion("modi_date is null");
            return (Criteria) this;
        }

        public Criteria andModiDateIsNotNull() {
            addCriterion("modi_date is not null");
            return (Criteria) this;
        }

        public Criteria andModiDateEqualTo(Date value) {
            addCriterion("modi_date =", value, "modiDate");
            return (Criteria) this;
        }

        public Criteria andModiDateNotEqualTo(Date value) {
            addCriterion("modi_date <>", value, "modiDate");
            return (Criteria) this;
        }

        public Criteria andModiDateGreaterThan(Date value) {
            addCriterion("modi_date >", value, "modiDate");
            return (Criteria) this;
        }

        public Criteria andModiDateGreaterThanOrEqualTo(Date value) {
            addCriterion("modi_date >=", value, "modiDate");
            return (Criteria) this;
        }

        public Criteria andModiDateLessThan(Date value) {
            addCriterion("modi_date <", value, "modiDate");
            return (Criteria) this;
        }

        public Criteria andModiDateLessThanOrEqualTo(Date value) {
            addCriterion("modi_date <=", value, "modiDate");
            return (Criteria) this;
        }

        public Criteria andModiDateIn(List<Date> values) {
            addCriterion("modi_date in", values, "modiDate");
            return (Criteria) this;
        }

        public Criteria andModiDateNotIn(List<Date> values) {
            addCriterion("modi_date not in", values, "modiDate");
            return (Criteria) this;
        }

        public Criteria andModiDateBetween(Date value1, Date value2) {
            addCriterion("modi_date between", value1, value2, "modiDate");
            return (Criteria) this;
        }

        public Criteria andModiDateNotBetween(Date value1, Date value2) {
            addCriterion("modi_date not between", value1, value2, "modiDate");
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

        public Criteria andTempSampleIsNull() {
            addCriterion("temp_sample is null");
            return (Criteria) this;
        }

        public Criteria andTempSampleIsNotNull() {
            addCriterion("temp_sample is not null");
            return (Criteria) this;
        }

        public Criteria andTempSampleEqualTo(String value) {
            addCriterion("temp_sample =", value, "tempSample");
            return (Criteria) this;
        }

        public Criteria andTempSampleNotEqualTo(String value) {
            addCriterion("temp_sample <>", value, "tempSample");
            return (Criteria) this;
        }

        public Criteria andTempSampleGreaterThan(String value) {
            addCriterion("temp_sample >", value, "tempSample");
            return (Criteria) this;
        }

        public Criteria andTempSampleGreaterThanOrEqualTo(String value) {
            addCriterion("temp_sample >=", value, "tempSample");
            return (Criteria) this;
        }

        public Criteria andTempSampleLessThan(String value) {
            addCriterion("temp_sample <", value, "tempSample");
            return (Criteria) this;
        }

        public Criteria andTempSampleLessThanOrEqualTo(String value) {
            addCriterion("temp_sample <=", value, "tempSample");
            return (Criteria) this;
        }

        public Criteria andTempSampleLike(String value) {
            addCriterion("temp_sample like", value, "tempSample");
            return (Criteria) this;
        }

        public Criteria andTempSampleNotLike(String value) {
            addCriterion("temp_sample not like", value, "tempSample");
            return (Criteria) this;
        }

        public Criteria andTempSampleIn(List<String> values) {
            addCriterion("temp_sample in", values, "tempSample");
            return (Criteria) this;
        }

        public Criteria andTempSampleNotIn(List<String> values) {
            addCriterion("temp_sample not in", values, "tempSample");
            return (Criteria) this;
        }

        public Criteria andTempSampleBetween(String value1, String value2) {
            addCriterion("temp_sample between", value1, value2, "tempSample");
            return (Criteria) this;
        }

        public Criteria andTempSampleNotBetween(String value1, String value2) {
            addCriterion("temp_sample not between", value1, value2, "tempSample");
            return (Criteria) this;
        }
    }

    /**
     * 类注释
     * Criteria
     * 数据库表：templet
     *
     * @mbggenerated
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 类注释
     * Criterion
     * 数据库表：templet
     */
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