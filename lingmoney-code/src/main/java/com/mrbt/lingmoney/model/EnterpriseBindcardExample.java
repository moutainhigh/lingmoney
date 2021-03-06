package com.mrbt.lingmoney.model;

import java.util.ArrayList;
import java.util.List;

public class EnterpriseBindcardExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table enterprise_bindcard
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table enterprise_bindcard
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table enterprise_bindcard
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table enterprise_bindcard
     *
     * @mbggenerated
     */
    protected int limitStart = -1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table enterprise_bindcard
     *
     * @mbggenerated
     */
    protected int limitEnd = -1;

    /**
     *  构造查询条件,enterprise_bindcard
     */
    public EnterpriseBindcardExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *  设置排序字段,enterprise_bindcard
     *
     * @param orderByClause 排序字段
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *  获取排序字段,enterprise_bindcard
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *  设置过滤重复数据,enterprise_bindcard
     *
     * @param distinct 是否过滤重复数据
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *  是否过滤重复数据,enterprise_bindcard
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *  获取当前的查询条件实例,enterprise_bindcard
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * ,enterprise_bindcard
     *
     * @param criteria 过滤条件实例
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * ,enterprise_bindcard
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *  创建一个查询条件,enterprise_bindcard
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *  内部构建查询条件对象,enterprise_bindcard
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *  清除查询条件,enterprise_bindcard
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * ,enterprise_bindcard
     *
     * @param limitStart
     */
    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    /**
     * ,enterprise_bindcard
     */
    public int getLimitStart() {
        return limitStart;
    }

    /**
     * ,enterprise_bindcard
     *
     * @param limitEnd
     */
    public void setLimitEnd(int limitEnd) {
        this.limitEnd=limitEnd;
    }

    /**
     * ,enterprise_bindcard
     */
    public int getLimitEnd() {
        return limitEnd;
    }

    /**
     * 类注释
     * GeneratedCriteria
     * 数据库表：enterprise_bindcard
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andEAccBanknoIsNull() {
            addCriterion("e_acc_bankno is null");
            return (Criteria) this;
        }

        public Criteria andEAccBanknoIsNotNull() {
            addCriterion("e_acc_bankno is not null");
            return (Criteria) this;
        }

        public Criteria andEAccBanknoEqualTo(String value) {
            addCriterion("e_acc_bankno =", value, "eAccBankno");
            return (Criteria) this;
        }

        public Criteria andEAccBanknoNotEqualTo(String value) {
            addCriterion("e_acc_bankno <>", value, "eAccBankno");
            return (Criteria) this;
        }

        public Criteria andEAccBanknoGreaterThan(String value) {
            addCriterion("e_acc_bankno >", value, "eAccBankno");
            return (Criteria) this;
        }

        public Criteria andEAccBanknoGreaterThanOrEqualTo(String value) {
            addCriterion("e_acc_bankno >=", value, "eAccBankno");
            return (Criteria) this;
        }

        public Criteria andEAccBanknoLessThan(String value) {
            addCriterion("e_acc_bankno <", value, "eAccBankno");
            return (Criteria) this;
        }

        public Criteria andEAccBanknoLessThanOrEqualTo(String value) {
            addCriterion("e_acc_bankno <=", value, "eAccBankno");
            return (Criteria) this;
        }

        public Criteria andEAccBanknoLike(String value) {
            addCriterion("e_acc_bankno like", value, "eAccBankno");
            return (Criteria) this;
        }

        public Criteria andEAccBanknoNotLike(String value) {
            addCriterion("e_acc_bankno not like", value, "eAccBankno");
            return (Criteria) this;
        }

        public Criteria andEAccBanknoIn(List<String> values) {
            addCriterion("e_acc_bankno in", values, "eAccBankno");
            return (Criteria) this;
        }

        public Criteria andEAccBanknoNotIn(List<String> values) {
            addCriterion("e_acc_bankno not in", values, "eAccBankno");
            return (Criteria) this;
        }

        public Criteria andEAccBanknoBetween(String value1, String value2) {
            addCriterion("e_acc_bankno between", value1, value2, "eAccBankno");
            return (Criteria) this;
        }

        public Criteria andEAccBanknoNotBetween(String value1, String value2) {
            addCriterion("e_acc_bankno not between", value1, value2, "eAccBankno");
            return (Criteria) this;
        }

        public Criteria andCardNoIsNull() {
            addCriterion("card_no is null");
            return (Criteria) this;
        }

        public Criteria andCardNoIsNotNull() {
            addCriterion("card_no is not null");
            return (Criteria) this;
        }

        public Criteria andCardNoEqualTo(String value) {
            addCriterion("card_no =", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotEqualTo(String value) {
            addCriterion("card_no <>", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoGreaterThan(String value) {
            addCriterion("card_no >", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("card_no >=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLessThan(String value) {
            addCriterion("card_no <", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLessThanOrEqualTo(String value) {
            addCriterion("card_no <=", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoLike(String value) {
            addCriterion("card_no like", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotLike(String value) {
            addCriterion("card_no not like", value, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoIn(List<String> values) {
            addCriterion("card_no in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotIn(List<String> values) {
            addCriterion("card_no not in", values, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoBetween(String value1, String value2) {
            addCriterion("card_no between", value1, value2, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardNoNotBetween(String value1, String value2) {
            addCriterion("card_no not between", value1, value2, "cardNo");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNull() {
            addCriterion("card_type is null");
            return (Criteria) this;
        }

        public Criteria andCardTypeIsNotNull() {
            addCriterion("card_type is not null");
            return (Criteria) this;
        }

        public Criteria andCardTypeEqualTo(String value) {
            addCriterion("card_type =", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotEqualTo(String value) {
            addCriterion("card_type <>", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThan(String value) {
            addCriterion("card_type >", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeGreaterThanOrEqualTo(String value) {
            addCriterion("card_type >=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThan(String value) {
            addCriterion("card_type <", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLessThanOrEqualTo(String value) {
            addCriterion("card_type <=", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeLike(String value) {
            addCriterion("card_type like", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotLike(String value) {
            addCriterion("card_type not like", value, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeIn(List<String> values) {
            addCriterion("card_type in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotIn(List<String> values) {
            addCriterion("card_type not in", values, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeBetween(String value1, String value2) {
            addCriterion("card_type between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andCardTypeNotBetween(String value1, String value2) {
            addCriterion("card_type not between", value1, value2, "cardType");
            return (Criteria) this;
        }

        public Criteria andBindDateIsNull() {
            addCriterion("bind_date is null");
            return (Criteria) this;
        }

        public Criteria andBindDateIsNotNull() {
            addCriterion("bind_date is not null");
            return (Criteria) this;
        }

        public Criteria andBindDateEqualTo(String value) {
            addCriterion("bind_date =", value, "bindDate");
            return (Criteria) this;
        }

        public Criteria andBindDateNotEqualTo(String value) {
            addCriterion("bind_date <>", value, "bindDate");
            return (Criteria) this;
        }

        public Criteria andBindDateGreaterThan(String value) {
            addCriterion("bind_date >", value, "bindDate");
            return (Criteria) this;
        }

        public Criteria andBindDateGreaterThanOrEqualTo(String value) {
            addCriterion("bind_date >=", value, "bindDate");
            return (Criteria) this;
        }

        public Criteria andBindDateLessThan(String value) {
            addCriterion("bind_date <", value, "bindDate");
            return (Criteria) this;
        }

        public Criteria andBindDateLessThanOrEqualTo(String value) {
            addCriterion("bind_date <=", value, "bindDate");
            return (Criteria) this;
        }

        public Criteria andBindDateLike(String value) {
            addCriterion("bind_date like", value, "bindDate");
            return (Criteria) this;
        }

        public Criteria andBindDateNotLike(String value) {
            addCriterion("bind_date not like", value, "bindDate");
            return (Criteria) this;
        }

        public Criteria andBindDateIn(List<String> values) {
            addCriterion("bind_date in", values, "bindDate");
            return (Criteria) this;
        }

        public Criteria andBindDateNotIn(List<String> values) {
            addCriterion("bind_date not in", values, "bindDate");
            return (Criteria) this;
        }

        public Criteria andBindDateBetween(String value1, String value2) {
            addCriterion("bind_date between", value1, value2, "bindDate");
            return (Criteria) this;
        }

        public Criteria andBindDateNotBetween(String value1, String value2) {
            addCriterion("bind_date not between", value1, value2, "bindDate");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(Integer value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(Integer value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(Integer value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(Integer value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(Integer value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<Integer> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<Integer> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(Integer value1, Integer value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(Integer value1, Integer value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andOtherBankFlagIsNull() {
            addCriterion("other_bank_flag is null");
            return (Criteria) this;
        }

        public Criteria andOtherBankFlagIsNotNull() {
            addCriterion("other_bank_flag is not null");
            return (Criteria) this;
        }

        public Criteria andOtherBankFlagEqualTo(Integer value) {
            addCriterion("other_bank_flag =", value, "otherBankFlag");
            return (Criteria) this;
        }

        public Criteria andOtherBankFlagNotEqualTo(Integer value) {
            addCriterion("other_bank_flag <>", value, "otherBankFlag");
            return (Criteria) this;
        }

        public Criteria andOtherBankFlagGreaterThan(Integer value) {
            addCriterion("other_bank_flag >", value, "otherBankFlag");
            return (Criteria) this;
        }

        public Criteria andOtherBankFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("other_bank_flag >=", value, "otherBankFlag");
            return (Criteria) this;
        }

        public Criteria andOtherBankFlagLessThan(Integer value) {
            addCriterion("other_bank_flag <", value, "otherBankFlag");
            return (Criteria) this;
        }

        public Criteria andOtherBankFlagLessThanOrEqualTo(Integer value) {
            addCriterion("other_bank_flag <=", value, "otherBankFlag");
            return (Criteria) this;
        }

        public Criteria andOtherBankFlagIn(List<Integer> values) {
            addCriterion("other_bank_flag in", values, "otherBankFlag");
            return (Criteria) this;
        }

        public Criteria andOtherBankFlagNotIn(List<Integer> values) {
            addCriterion("other_bank_flag not in", values, "otherBankFlag");
            return (Criteria) this;
        }

        public Criteria andOtherBankFlagBetween(Integer value1, Integer value2) {
            addCriterion("other_bank_flag between", value1, value2, "otherBankFlag");
            return (Criteria) this;
        }

        public Criteria andOtherBankFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("other_bank_flag not between", value1, value2, "otherBankFlag");
            return (Criteria) this;
        }

        public Criteria andBankNumberIsNull() {
            addCriterion("bank_number is null");
            return (Criteria) this;
        }

        public Criteria andBankNumberIsNotNull() {
            addCriterion("bank_number is not null");
            return (Criteria) this;
        }

        public Criteria andBankNumberEqualTo(String value) {
            addCriterion("bank_number =", value, "bankNumber");
            return (Criteria) this;
        }

        public Criteria andBankNumberNotEqualTo(String value) {
            addCriterion("bank_number <>", value, "bankNumber");
            return (Criteria) this;
        }

        public Criteria andBankNumberGreaterThan(String value) {
            addCriterion("bank_number >", value, "bankNumber");
            return (Criteria) this;
        }

        public Criteria andBankNumberGreaterThanOrEqualTo(String value) {
            addCriterion("bank_number >=", value, "bankNumber");
            return (Criteria) this;
        }

        public Criteria andBankNumberLessThan(String value) {
            addCriterion("bank_number <", value, "bankNumber");
            return (Criteria) this;
        }

        public Criteria andBankNumberLessThanOrEqualTo(String value) {
            addCriterion("bank_number <=", value, "bankNumber");
            return (Criteria) this;
        }

        public Criteria andBankNumberLike(String value) {
            addCriterion("bank_number like", value, "bankNumber");
            return (Criteria) this;
        }

        public Criteria andBankNumberNotLike(String value) {
            addCriterion("bank_number not like", value, "bankNumber");
            return (Criteria) this;
        }

        public Criteria andBankNumberIn(List<String> values) {
            addCriterion("bank_number in", values, "bankNumber");
            return (Criteria) this;
        }

        public Criteria andBankNumberNotIn(List<String> values) {
            addCriterion("bank_number not in", values, "bankNumber");
            return (Criteria) this;
        }

        public Criteria andBankNumberBetween(String value1, String value2) {
            addCriterion("bank_number between", value1, value2, "bankNumber");
            return (Criteria) this;
        }

        public Criteria andBankNumberNotBetween(String value1, String value2) {
            addCriterion("bank_number not between", value1, value2, "bankNumber");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNull() {
            addCriterion("bank_name is null");
            return (Criteria) this;
        }

        public Criteria andBankNameIsNotNull() {
            addCriterion("bank_name is not null");
            return (Criteria) this;
        }

        public Criteria andBankNameEqualTo(String value) {
            addCriterion("bank_name =", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotEqualTo(String value) {
            addCriterion("bank_name <>", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThan(String value) {
            addCriterion("bank_name >", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameGreaterThanOrEqualTo(String value) {
            addCriterion("bank_name >=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThan(String value) {
            addCriterion("bank_name <", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLessThanOrEqualTo(String value) {
            addCriterion("bank_name <=", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameLike(String value) {
            addCriterion("bank_name like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotLike(String value) {
            addCriterion("bank_name not like", value, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameIn(List<String> values) {
            addCriterion("bank_name in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotIn(List<String> values) {
            addCriterion("bank_name not in", values, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameBetween(String value1, String value2) {
            addCriterion("bank_name between", value1, value2, "bankName");
            return (Criteria) this;
        }

        public Criteria andBankNameNotBetween(String value1, String value2) {
            addCriterion("bank_name not between", value1, value2, "bankName");
            return (Criteria) this;
        }
    }

    /**
     * 类注释
     * Criteria
     * 数据库表：enterprise_bindcard
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
     * 数据库表：enterprise_bindcard
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