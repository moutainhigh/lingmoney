package com.mrbt.lingmoney.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ProductStatisticsExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table product_statistics
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table product_statistics
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table product_statistics
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table product_statistics
     *
     * @mbg.generated
     */
    protected int limitStart = -1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table product_statistics
     *
     * @mbg.generated
     */
    protected int limitEnd = -1;

    /**
     *  构造查询条件,product_statistics
     */
    public ProductStatisticsExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *  设置排序字段,product_statistics
     *
     * @param orderByClause 排序字段
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *  获取排序字段,product_statistics
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *  设置过滤重复数据,product_statistics
     *
     * @param distinct 是否过滤重复数据
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *  是否过滤重复数据,product_statistics
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *  获取当前的查询条件实例,product_statistics
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * ,product_statistics
     *
     * @param criteria 过滤条件实例
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * ,product_statistics
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *  创建一个查询条件,product_statistics
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *  内部构建查询条件对象,product_statistics
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *  清除查询条件,product_statistics
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * ,product_statistics
     *
     * @param limitStart
     */
    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    /**
     * ,product_statistics
     */
    public int getLimitStart() {
        return limitStart;
    }

    /**
     * ,product_statistics
     *
     * @param limitEnd
     */
    public void setLimitEnd(int limitEnd) {
        this.limitEnd=limitEnd;
    }

    /**
     * ,product_statistics
     */
    public int getLimitEnd() {
        return limitEnd;
    }

    /**
     * 类注释
     * GeneratedCriteria
     * 数据库表：product_statistics
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

        public Criteria andPIdIsNull() {
            addCriterion("p_id is null");
            return (Criteria) this;
        }

        public Criteria andPIdIsNotNull() {
            addCriterion("p_id is not null");
            return (Criteria) this;
        }

        public Criteria andPIdEqualTo(Integer value) {
            addCriterion("p_id =", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotEqualTo(Integer value) {
            addCriterion("p_id <>", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThan(Integer value) {
            addCriterion("p_id >", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_id >=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThan(Integer value) {
            addCriterion("p_id <", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdLessThanOrEqualTo(Integer value) {
            addCriterion("p_id <=", value, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdIn(List<Integer> values) {
            addCriterion("p_id in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotIn(List<Integer> values) {
            addCriterion("p_id not in", values, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdBetween(Integer value1, Integer value2) {
            addCriterion("p_id between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPIdNotBetween(Integer value1, Integer value2) {
            addCriterion("p_id not between", value1, value2, "pId");
            return (Criteria) this;
        }

        public Criteria andPNameIsNull() {
            addCriterion("p_name is null");
            return (Criteria) this;
        }

        public Criteria andPNameIsNotNull() {
            addCriterion("p_name is not null");
            return (Criteria) this;
        }

        public Criteria andPNameEqualTo(String value) {
            addCriterion("p_name =", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotEqualTo(String value) {
            addCriterion("p_name <>", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameGreaterThan(String value) {
            addCriterion("p_name >", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameGreaterThanOrEqualTo(String value) {
            addCriterion("p_name >=", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLessThan(String value) {
            addCriterion("p_name <", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLessThanOrEqualTo(String value) {
            addCriterion("p_name <=", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameLike(String value) {
            addCriterion("p_name like", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotLike(String value) {
            addCriterion("p_name not like", value, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameIn(List<String> values) {
            addCriterion("p_name in", values, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotIn(List<String> values) {
            addCriterion("p_name not in", values, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameBetween(String value1, String value2) {
            addCriterion("p_name between", value1, value2, "pName");
            return (Criteria) this;
        }

        public Criteria andPNameNotBetween(String value1, String value2) {
            addCriterion("p_name not between", value1, value2, "pName");
            return (Criteria) this;
        }

        public Criteria andYesterdayBalanceIsNull() {
            addCriterion("yesterday_balance is null");
            return (Criteria) this;
        }

        public Criteria andYesterdayBalanceIsNotNull() {
            addCriterion("yesterday_balance is not null");
            return (Criteria) this;
        }

        public Criteria andYesterdayBalanceEqualTo(BigDecimal value) {
            addCriterion("yesterday_balance =", value, "yesterdayBalance");
            return (Criteria) this;
        }

        public Criteria andYesterdayBalanceNotEqualTo(BigDecimal value) {
            addCriterion("yesterday_balance <>", value, "yesterdayBalance");
            return (Criteria) this;
        }

        public Criteria andYesterdayBalanceGreaterThan(BigDecimal value) {
            addCriterion("yesterday_balance >", value, "yesterdayBalance");
            return (Criteria) this;
        }

        public Criteria andYesterdayBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("yesterday_balance >=", value, "yesterdayBalance");
            return (Criteria) this;
        }

        public Criteria andYesterdayBalanceLessThan(BigDecimal value) {
            addCriterion("yesterday_balance <", value, "yesterdayBalance");
            return (Criteria) this;
        }

        public Criteria andYesterdayBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("yesterday_balance <=", value, "yesterdayBalance");
            return (Criteria) this;
        }

        public Criteria andYesterdayBalanceIn(List<BigDecimal> values) {
            addCriterion("yesterday_balance in", values, "yesterdayBalance");
            return (Criteria) this;
        }

        public Criteria andYesterdayBalanceNotIn(List<BigDecimal> values) {
            addCriterion("yesterday_balance not in", values, "yesterdayBalance");
            return (Criteria) this;
        }

        public Criteria andYesterdayBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("yesterday_balance between", value1, value2, "yesterdayBalance");
            return (Criteria) this;
        }

        public Criteria andYesterdayBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("yesterday_balance not between", value1, value2, "yesterdayBalance");
            return (Criteria) this;
        }

        public Criteria andRoseMoneyIsNull() {
            addCriterion("rose_money is null");
            return (Criteria) this;
        }

        public Criteria andRoseMoneyIsNotNull() {
            addCriterion("rose_money is not null");
            return (Criteria) this;
        }

        public Criteria andRoseMoneyEqualTo(BigDecimal value) {
            addCriterion("rose_money =", value, "roseMoney");
            return (Criteria) this;
        }

        public Criteria andRoseMoneyNotEqualTo(BigDecimal value) {
            addCriterion("rose_money <>", value, "roseMoney");
            return (Criteria) this;
        }

        public Criteria andRoseMoneyGreaterThan(BigDecimal value) {
            addCriterion("rose_money >", value, "roseMoney");
            return (Criteria) this;
        }

        public Criteria andRoseMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("rose_money >=", value, "roseMoney");
            return (Criteria) this;
        }

        public Criteria andRoseMoneyLessThan(BigDecimal value) {
            addCriterion("rose_money <", value, "roseMoney");
            return (Criteria) this;
        }

        public Criteria andRoseMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("rose_money <=", value, "roseMoney");
            return (Criteria) this;
        }

        public Criteria andRoseMoneyIn(List<BigDecimal> values) {
            addCriterion("rose_money in", values, "roseMoney");
            return (Criteria) this;
        }

        public Criteria andRoseMoneyNotIn(List<BigDecimal> values) {
            addCriterion("rose_money not in", values, "roseMoney");
            return (Criteria) this;
        }

        public Criteria andRoseMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rose_money between", value1, value2, "roseMoney");
            return (Criteria) this;
        }

        public Criteria andRoseMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("rose_money not between", value1, value2, "roseMoney");
            return (Criteria) this;
        }

        public Criteria andDropMoneyIsNull() {
            addCriterion("drop_money is null");
            return (Criteria) this;
        }

        public Criteria andDropMoneyIsNotNull() {
            addCriterion("drop_money is not null");
            return (Criteria) this;
        }

        public Criteria andDropMoneyEqualTo(BigDecimal value) {
            addCriterion("drop_money =", value, "dropMoney");
            return (Criteria) this;
        }

        public Criteria andDropMoneyNotEqualTo(BigDecimal value) {
            addCriterion("drop_money <>", value, "dropMoney");
            return (Criteria) this;
        }

        public Criteria andDropMoneyGreaterThan(BigDecimal value) {
            addCriterion("drop_money >", value, "dropMoney");
            return (Criteria) this;
        }

        public Criteria andDropMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("drop_money >=", value, "dropMoney");
            return (Criteria) this;
        }

        public Criteria andDropMoneyLessThan(BigDecimal value) {
            addCriterion("drop_money <", value, "dropMoney");
            return (Criteria) this;
        }

        public Criteria andDropMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("drop_money <=", value, "dropMoney");
            return (Criteria) this;
        }

        public Criteria andDropMoneyIn(List<BigDecimal> values) {
            addCriterion("drop_money in", values, "dropMoney");
            return (Criteria) this;
        }

        public Criteria andDropMoneyNotIn(List<BigDecimal> values) {
            addCriterion("drop_money not in", values, "dropMoney");
            return (Criteria) this;
        }

        public Criteria andDropMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("drop_money between", value1, value2, "dropMoney");
            return (Criteria) this;
        }

        public Criteria andDropMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("drop_money not between", value1, value2, "dropMoney");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNull() {
            addCriterion("balance is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("balance is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(BigDecimal value) {
            addCriterion("balance =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(BigDecimal value) {
            addCriterion("balance <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(BigDecimal value) {
            addCriterion("balance >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("balance >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(BigDecimal value) {
            addCriterion("balance <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("balance <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<BigDecimal> values) {
            addCriterion("balance in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<BigDecimal> values) {
            addCriterion("balance not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("balance between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("balance not between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andStatisticsDateIsNull() {
            addCriterion("statistics_date is null");
            return (Criteria) this;
        }

        public Criteria andStatisticsDateIsNotNull() {
            addCriterion("statistics_date is not null");
            return (Criteria) this;
        }

        public Criteria andStatisticsDateEqualTo(Date value) {
            addCriterionForJDBCDate("statistics_date =", value, "statisticsDate");
            return (Criteria) this;
        }

        public Criteria andStatisticsDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("statistics_date <>", value, "statisticsDate");
            return (Criteria) this;
        }

        public Criteria andStatisticsDateGreaterThan(Date value) {
            addCriterionForJDBCDate("statistics_date >", value, "statisticsDate");
            return (Criteria) this;
        }

        public Criteria andStatisticsDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("statistics_date >=", value, "statisticsDate");
            return (Criteria) this;
        }

        public Criteria andStatisticsDateLessThan(Date value) {
            addCriterionForJDBCDate("statistics_date <", value, "statisticsDate");
            return (Criteria) this;
        }

        public Criteria andStatisticsDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("statistics_date <=", value, "statisticsDate");
            return (Criteria) this;
        }

        public Criteria andStatisticsDateIn(List<Date> values) {
            addCriterionForJDBCDate("statistics_date in", values, "statisticsDate");
            return (Criteria) this;
        }

        public Criteria andStatisticsDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("statistics_date not in", values, "statisticsDate");
            return (Criteria) this;
        }

        public Criteria andStatisticsDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("statistics_date between", value1, value2, "statisticsDate");
            return (Criteria) this;
        }

        public Criteria andStatisticsDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("statistics_date not between", value1, value2, "statisticsDate");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
        }
    }

    /**
     * 类注释
     * Criteria
     * 数据库表：product_statistics
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
     * 数据库表：product_statistics
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