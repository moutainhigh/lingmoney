package com.mrbt.lingmoney.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WalletAutoPayExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wallet_auto_pay
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wallet_auto_pay
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wallet_auto_pay
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wallet_auto_pay
     *
     * @mbg.generated
     */
    protected int limitStart = -1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wallet_auto_pay
     *
     * @mbg.generated
     */
    protected int limitEnd = -1;

    /**
     *  构造查询条件,wallet_auto_pay
     */
    public WalletAutoPayExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *  设置排序字段,wallet_auto_pay
     *
     * @param orderByClause 排序字段
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *  获取排序字段,wallet_auto_pay
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *  设置过滤重复数据,wallet_auto_pay
     *
     * @param distinct 是否过滤重复数据
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *  是否过滤重复数据,wallet_auto_pay
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *  获取当前的查询条件实例,wallet_auto_pay
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * ,wallet_auto_pay
     *
     * @param criteria 过滤条件实例
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * ,wallet_auto_pay
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *  创建一个查询条件,wallet_auto_pay
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *  内部构建查询条件对象,wallet_auto_pay
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *  清除查询条件,wallet_auto_pay
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * ,wallet_auto_pay
     *
     * @param limitStart
     */
    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    /**
     * ,wallet_auto_pay
     */
    public int getLimitStart() {
        return limitStart;
    }

    /**
     * ,wallet_auto_pay
     *
     * @param limitEnd
     */
    public void setLimitEnd(int limitEnd) {
        this.limitEnd=limitEnd;
    }

    /**
     * ,wallet_auto_pay
     */
    public int getLimitEnd() {
        return limitEnd;
    }

    /**
     * 类注释
     * GeneratedCriteria
     * 数据库表：wallet_auto_pay
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

        public Criteria andUIdIsNull() {
            addCriterion("u_id is null");
            return (Criteria) this;
        }

        public Criteria andUIdIsNotNull() {
            addCriterion("u_id is not null");
            return (Criteria) this;
        }

        public Criteria andUIdEqualTo(String value) {
            addCriterion("u_id =", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotEqualTo(String value) {
            addCriterion("u_id <>", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThan(String value) {
            addCriterion("u_id >", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdGreaterThanOrEqualTo(String value) {
            addCriterion("u_id >=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThan(String value) {
            addCriterion("u_id <", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLessThanOrEqualTo(String value) {
            addCriterion("u_id <=", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdLike(String value) {
            addCriterion("u_id like", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotLike(String value) {
            addCriterion("u_id not like", value, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdIn(List<String> values) {
            addCriterion("u_id in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotIn(List<String> values) {
            addCriterion("u_id not in", values, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdBetween(String value1, String value2) {
            addCriterion("u_id between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andUIdNotBetween(String value1, String value2) {
            addCriterion("u_id not between", value1, value2, "uId");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andUpIdIsNull() {
            addCriterion("up_id is null");
            return (Criteria) this;
        }

        public Criteria andUpIdIsNotNull() {
            addCriterion("up_id is not null");
            return (Criteria) this;
        }

        public Criteria andUpIdEqualTo(Integer value) {
            addCriterion("up_id =", value, "upId");
            return (Criteria) this;
        }

        public Criteria andUpIdNotEqualTo(Integer value) {
            addCriterion("up_id <>", value, "upId");
            return (Criteria) this;
        }

        public Criteria andUpIdGreaterThan(Integer value) {
            addCriterion("up_id >", value, "upId");
            return (Criteria) this;
        }

        public Criteria andUpIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("up_id >=", value, "upId");
            return (Criteria) this;
        }

        public Criteria andUpIdLessThan(Integer value) {
            addCriterion("up_id <", value, "upId");
            return (Criteria) this;
        }

        public Criteria andUpIdLessThanOrEqualTo(Integer value) {
            addCriterion("up_id <=", value, "upId");
            return (Criteria) this;
        }

        public Criteria andUpIdIn(List<Integer> values) {
            addCriterion("up_id in", values, "upId");
            return (Criteria) this;
        }

        public Criteria andUpIdNotIn(List<Integer> values) {
            addCriterion("up_id not in", values, "upId");
            return (Criteria) this;
        }

        public Criteria andUpIdBetween(Integer value1, Integer value2) {
            addCriterion("up_id between", value1, value2, "upId");
            return (Criteria) this;
        }

        public Criteria andUpIdNotBetween(Integer value1, Integer value2) {
            addCriterion("up_id not between", value1, value2, "upId");
            return (Criteria) this;
        }

        public Criteria andWalletAutoPayIsNull() {
            addCriterion("wallet_auto_pay is null");
            return (Criteria) this;
        }

        public Criteria andWalletAutoPayIsNotNull() {
            addCriterion("wallet_auto_pay is not null");
            return (Criteria) this;
        }

        public Criteria andWalletAutoPayEqualTo(Integer value) {
            addCriterion("wallet_auto_pay =", value, "walletAutoPay");
            return (Criteria) this;
        }

        public Criteria andWalletAutoPayNotEqualTo(Integer value) {
            addCriterion("wallet_auto_pay <>", value, "walletAutoPay");
            return (Criteria) this;
        }

        public Criteria andWalletAutoPayGreaterThan(Integer value) {
            addCriterion("wallet_auto_pay >", value, "walletAutoPay");
            return (Criteria) this;
        }

        public Criteria andWalletAutoPayGreaterThanOrEqualTo(Integer value) {
            addCriterion("wallet_auto_pay >=", value, "walletAutoPay");
            return (Criteria) this;
        }

        public Criteria andWalletAutoPayLessThan(Integer value) {
            addCriterion("wallet_auto_pay <", value, "walletAutoPay");
            return (Criteria) this;
        }

        public Criteria andWalletAutoPayLessThanOrEqualTo(Integer value) {
            addCriterion("wallet_auto_pay <=", value, "walletAutoPay");
            return (Criteria) this;
        }

        public Criteria andWalletAutoPayIn(List<Integer> values) {
            addCriterion("wallet_auto_pay in", values, "walletAutoPay");
            return (Criteria) this;
        }

        public Criteria andWalletAutoPayNotIn(List<Integer> values) {
            addCriterion("wallet_auto_pay not in", values, "walletAutoPay");
            return (Criteria) this;
        }

        public Criteria andWalletAutoPayBetween(Integer value1, Integer value2) {
            addCriterion("wallet_auto_pay between", value1, value2, "walletAutoPay");
            return (Criteria) this;
        }

        public Criteria andWalletAutoPayNotBetween(Integer value1, Integer value2) {
            addCriterion("wallet_auto_pay not between", value1, value2, "walletAutoPay");
            return (Criteria) this;
        }

        public Criteria andOperateNameIsNull() {
            addCriterion("operate_name is null");
            return (Criteria) this;
        }

        public Criteria andOperateNameIsNotNull() {
            addCriterion("operate_name is not null");
            return (Criteria) this;
        }

        public Criteria andOperateNameEqualTo(String value) {
            addCriterion("operate_name =", value, "operateName");
            return (Criteria) this;
        }

        public Criteria andOperateNameNotEqualTo(String value) {
            addCriterion("operate_name <>", value, "operateName");
            return (Criteria) this;
        }

        public Criteria andOperateNameGreaterThan(String value) {
            addCriterion("operate_name >", value, "operateName");
            return (Criteria) this;
        }

        public Criteria andOperateNameGreaterThanOrEqualTo(String value) {
            addCriterion("operate_name >=", value, "operateName");
            return (Criteria) this;
        }

        public Criteria andOperateNameLessThan(String value) {
            addCriterion("operate_name <", value, "operateName");
            return (Criteria) this;
        }

        public Criteria andOperateNameLessThanOrEqualTo(String value) {
            addCriterion("operate_name <=", value, "operateName");
            return (Criteria) this;
        }

        public Criteria andOperateNameLike(String value) {
            addCriterion("operate_name like", value, "operateName");
            return (Criteria) this;
        }

        public Criteria andOperateNameNotLike(String value) {
            addCriterion("operate_name not like", value, "operateName");
            return (Criteria) this;
        }

        public Criteria andOperateNameIn(List<String> values) {
            addCriterion("operate_name in", values, "operateName");
            return (Criteria) this;
        }

        public Criteria andOperateNameNotIn(List<String> values) {
            addCriterion("operate_name not in", values, "operateName");
            return (Criteria) this;
        }

        public Criteria andOperateNameBetween(String value1, String value2) {
            addCriterion("operate_name between", value1, value2, "operateName");
            return (Criteria) this;
        }

        public Criteria andOperateNameNotBetween(String value1, String value2) {
            addCriterion("operate_name not between", value1, value2, "operateName");
            return (Criteria) this;
        }

        public Criteria andOperateTimeIsNull() {
            addCriterion("operate_time is null");
            return (Criteria) this;
        }

        public Criteria andOperateTimeIsNotNull() {
            addCriterion("operate_time is not null");
            return (Criteria) this;
        }

        public Criteria andOperateTimeEqualTo(Date value) {
            addCriterion("operate_time =", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeNotEqualTo(Date value) {
            addCriterion("operate_time <>", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeGreaterThan(Date value) {
            addCriterion("operate_time >", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("operate_time >=", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeLessThan(Date value) {
            addCriterion("operate_time <", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeLessThanOrEqualTo(Date value) {
            addCriterion("operate_time <=", value, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeIn(List<Date> values) {
            addCriterion("operate_time in", values, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeNotIn(List<Date> values) {
            addCriterion("operate_time not in", values, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeBetween(Date value1, Date value2) {
            addCriterion("operate_time between", value1, value2, "operateTime");
            return (Criteria) this;
        }

        public Criteria andOperateTimeNotBetween(Date value1, Date value2) {
            addCriterion("operate_time not between", value1, value2, "operateTime");
            return (Criteria) this;
        }
    }

    /**
     * 类注释
     * Criteria
     * 数据库表：wallet_auto_pay
     *
     * @mbg.generated
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 类注释
     * Criterion
     * 数据库表：wallet_auto_pay
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