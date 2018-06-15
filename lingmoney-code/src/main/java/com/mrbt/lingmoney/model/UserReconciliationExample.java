package com.mrbt.lingmoney.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class UserReconciliationExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_reconciliation
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_reconciliation
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_reconciliation
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_reconciliation
     *
     * @mbg.generated
     */
    protected int limitStart = -1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table user_reconciliation
     *
     * @mbg.generated
     */
    protected int limitEnd = -1;

    /**
     *  构造查询条件,user_reconciliation
     */
    public UserReconciliationExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *  设置排序字段,user_reconciliation
     *
     * @param orderByClause 排序字段
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *  获取排序字段,user_reconciliation
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *  设置过滤重复数据,user_reconciliation
     *
     * @param distinct 是否过滤重复数据
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *  是否过滤重复数据,user_reconciliation
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *  获取当前的查询条件实例,user_reconciliation
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * ,user_reconciliation
     *
     * @param criteria 过滤条件实例
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * ,user_reconciliation
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *  创建一个查询条件,user_reconciliation
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *  内部构建查询条件对象,user_reconciliation
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *  清除查询条件,user_reconciliation
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * ,user_reconciliation
     *
     * @param limitStart
     */
    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    /**
     * ,user_reconciliation
     */
    public int getLimitStart() {
        return limitStart;
    }

    /**
     * ,user_reconciliation
     *
     * @param limitEnd
     */
    public void setLimitEnd(int limitEnd) {
        this.limitEnd=limitEnd;
    }

    /**
     * ,user_reconciliation
     */
    public int getLimitEnd() {
        return limitEnd;
    }

    /**
     * 类注释
     * GeneratedCriteria
     * 数据库表：user_reconciliation
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

        public Criteria andPFrozenMoneyIsNull() {
            addCriterion("p_frozen_money is null");
            return (Criteria) this;
        }

        public Criteria andPFrozenMoneyIsNotNull() {
            addCriterion("p_frozen_money is not null");
            return (Criteria) this;
        }

        public Criteria andPFrozenMoneyEqualTo(BigDecimal value) {
            addCriterion("p_frozen_money =", value, "pFrozenMoney");
            return (Criteria) this;
        }

        public Criteria andPFrozenMoneyNotEqualTo(BigDecimal value) {
            addCriterion("p_frozen_money <>", value, "pFrozenMoney");
            return (Criteria) this;
        }

        public Criteria andPFrozenMoneyGreaterThan(BigDecimal value) {
            addCriterion("p_frozen_money >", value, "pFrozenMoney");
            return (Criteria) this;
        }

        public Criteria andPFrozenMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("p_frozen_money >=", value, "pFrozenMoney");
            return (Criteria) this;
        }

        public Criteria andPFrozenMoneyLessThan(BigDecimal value) {
            addCriterion("p_frozen_money <", value, "pFrozenMoney");
            return (Criteria) this;
        }

        public Criteria andPFrozenMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("p_frozen_money <=", value, "pFrozenMoney");
            return (Criteria) this;
        }

        public Criteria andPFrozenMoneyIn(List<BigDecimal> values) {
            addCriterion("p_frozen_money in", values, "pFrozenMoney");
            return (Criteria) this;
        }

        public Criteria andPFrozenMoneyNotIn(List<BigDecimal> values) {
            addCriterion("p_frozen_money not in", values, "pFrozenMoney");
            return (Criteria) this;
        }

        public Criteria andPFrozenMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("p_frozen_money between", value1, value2, "pFrozenMoney");
            return (Criteria) this;
        }

        public Criteria andPFrozenMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("p_frozen_money not between", value1, value2, "pFrozenMoney");
            return (Criteria) this;
        }

        public Criteria andYFrozenMoneyIsNull() {
            addCriterion("y_frozen_money is null");
            return (Criteria) this;
        }

        public Criteria andYFrozenMoneyIsNotNull() {
            addCriterion("y_frozen_money is not null");
            return (Criteria) this;
        }

        public Criteria andYFrozenMoneyEqualTo(BigDecimal value) {
            addCriterion("y_frozen_money =", value, "yFrozenMoney");
            return (Criteria) this;
        }

        public Criteria andYFrozenMoneyNotEqualTo(BigDecimal value) {
            addCriterion("y_frozen_money <>", value, "yFrozenMoney");
            return (Criteria) this;
        }

        public Criteria andYFrozenMoneyGreaterThan(BigDecimal value) {
            addCriterion("y_frozen_money >", value, "yFrozenMoney");
            return (Criteria) this;
        }

        public Criteria andYFrozenMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("y_frozen_money >=", value, "yFrozenMoney");
            return (Criteria) this;
        }

        public Criteria andYFrozenMoneyLessThan(BigDecimal value) {
            addCriterion("y_frozen_money <", value, "yFrozenMoney");
            return (Criteria) this;
        }

        public Criteria andYFrozenMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("y_frozen_money <=", value, "yFrozenMoney");
            return (Criteria) this;
        }

        public Criteria andYFrozenMoneyIn(List<BigDecimal> values) {
            addCriterion("y_frozen_money in", values, "yFrozenMoney");
            return (Criteria) this;
        }

        public Criteria andYFrozenMoneyNotIn(List<BigDecimal> values) {
            addCriterion("y_frozen_money not in", values, "yFrozenMoney");
            return (Criteria) this;
        }

        public Criteria andYFrozenMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("y_frozen_money between", value1, value2, "yFrozenMoney");
            return (Criteria) this;
        }

        public Criteria andYFrozenMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("y_frozen_money not between", value1, value2, "yFrozenMoney");
            return (Criteria) this;
        }

        public Criteria andPBalanceIsNull() {
            addCriterion("p_balance is null");
            return (Criteria) this;
        }

        public Criteria andPBalanceIsNotNull() {
            addCriterion("p_balance is not null");
            return (Criteria) this;
        }

        public Criteria andPBalanceEqualTo(BigDecimal value) {
            addCriterion("p_balance =", value, "pBalance");
            return (Criteria) this;
        }

        public Criteria andPBalanceNotEqualTo(BigDecimal value) {
            addCriterion("p_balance <>", value, "pBalance");
            return (Criteria) this;
        }

        public Criteria andPBalanceGreaterThan(BigDecimal value) {
            addCriterion("p_balance >", value, "pBalance");
            return (Criteria) this;
        }

        public Criteria andPBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("p_balance >=", value, "pBalance");
            return (Criteria) this;
        }

        public Criteria andPBalanceLessThan(BigDecimal value) {
            addCriterion("p_balance <", value, "pBalance");
            return (Criteria) this;
        }

        public Criteria andPBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("p_balance <=", value, "pBalance");
            return (Criteria) this;
        }

        public Criteria andPBalanceIn(List<BigDecimal> values) {
            addCriterion("p_balance in", values, "pBalance");
            return (Criteria) this;
        }

        public Criteria andPBalanceNotIn(List<BigDecimal> values) {
            addCriterion("p_balance not in", values, "pBalance");
            return (Criteria) this;
        }

        public Criteria andPBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("p_balance between", value1, value2, "pBalance");
            return (Criteria) this;
        }

        public Criteria andPBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("p_balance not between", value1, value2, "pBalance");
            return (Criteria) this;
        }

        public Criteria andYBalanceIsNull() {
            addCriterion("y_balance is null");
            return (Criteria) this;
        }

        public Criteria andYBalanceIsNotNull() {
            addCriterion("y_balance is not null");
            return (Criteria) this;
        }

        public Criteria andYBalanceEqualTo(BigDecimal value) {
            addCriterion("y_balance =", value, "yBalance");
            return (Criteria) this;
        }

        public Criteria andYBalanceNotEqualTo(BigDecimal value) {
            addCriterion("y_balance <>", value, "yBalance");
            return (Criteria) this;
        }

        public Criteria andYBalanceGreaterThan(BigDecimal value) {
            addCriterion("y_balance >", value, "yBalance");
            return (Criteria) this;
        }

        public Criteria andYBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("y_balance >=", value, "yBalance");
            return (Criteria) this;
        }

        public Criteria andYBalanceLessThan(BigDecimal value) {
            addCriterion("y_balance <", value, "yBalance");
            return (Criteria) this;
        }

        public Criteria andYBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("y_balance <=", value, "yBalance");
            return (Criteria) this;
        }

        public Criteria andYBalanceIn(List<BigDecimal> values) {
            addCriterion("y_balance in", values, "yBalance");
            return (Criteria) this;
        }

        public Criteria andYBalanceNotIn(List<BigDecimal> values) {
            addCriterion("y_balance not in", values, "yBalance");
            return (Criteria) this;
        }

        public Criteria andYBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("y_balance between", value1, value2, "yBalance");
            return (Criteria) this;
        }

        public Criteria andYBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("y_balance not between", value1, value2, "yBalance");
            return (Criteria) this;
        }

        public Criteria andReconDateIsNull() {
            addCriterion("recon_date is null");
            return (Criteria) this;
        }

        public Criteria andReconDateIsNotNull() {
            addCriterion("recon_date is not null");
            return (Criteria) this;
        }

        public Criteria andReconDateEqualTo(Date value) {
            addCriterionForJDBCDate("recon_date =", value, "reconDate");
            return (Criteria) this;
        }

        public Criteria andReconDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("recon_date <>", value, "reconDate");
            return (Criteria) this;
        }

        public Criteria andReconDateGreaterThan(Date value) {
            addCriterionForJDBCDate("recon_date >", value, "reconDate");
            return (Criteria) this;
        }

        public Criteria andReconDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("recon_date >=", value, "reconDate");
            return (Criteria) this;
        }

        public Criteria andReconDateLessThan(Date value) {
            addCriterionForJDBCDate("recon_date <", value, "reconDate");
            return (Criteria) this;
        }

        public Criteria andReconDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("recon_date <=", value, "reconDate");
            return (Criteria) this;
        }

        public Criteria andReconDateIn(List<Date> values) {
            addCriterionForJDBCDate("recon_date in", values, "reconDate");
            return (Criteria) this;
        }

        public Criteria andReconDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("recon_date not in", values, "reconDate");
            return (Criteria) this;
        }

        public Criteria andReconDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("recon_date between", value1, value2, "reconDate");
            return (Criteria) this;
        }

        public Criteria andReconDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("recon_date not between", value1, value2, "reconDate");
            return (Criteria) this;
        }
    }

    /**
     * 类注释
     * Criteria
     * 数据库表：user_reconciliation
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
     * 数据库表：user_reconciliation
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