package com.mrbt.lingmoney.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WalletSellPayExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wallet_sell_pay
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wallet_sell_pay
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wallet_sell_pay
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wallet_sell_pay
     *
     * @mbg.generated
     */
    protected int limitStart = -1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table wallet_sell_pay
     *
     * @mbg.generated
     */
    protected int limitEnd = -1;

    /**
     *  构造查询条件,wallet_sell_pay
     */
    public WalletSellPayExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *  设置排序字段,wallet_sell_pay
     *
     * @param orderByClause 排序字段
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *  获取排序字段,wallet_sell_pay
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *  设置过滤重复数据,wallet_sell_pay
     *
     * @param distinct 是否过滤重复数据
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *  是否过滤重复数据,wallet_sell_pay
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *  获取当前的查询条件实例,wallet_sell_pay
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * ,wallet_sell_pay
     *
     * @param criteria 过滤条件实例
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * ,wallet_sell_pay
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *  创建一个查询条件,wallet_sell_pay
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *  内部构建查询条件对象,wallet_sell_pay
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *  清除查询条件,wallet_sell_pay
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * ,wallet_sell_pay
     *
     * @param limitStart
     */
    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    /**
     * ,wallet_sell_pay
     */
    public int getLimitStart() {
        return limitStart;
    }

    /**
     * ,wallet_sell_pay
     *
     * @param limitEnd
     */
    public void setLimitEnd(int limitEnd) {
        this.limitEnd=limitEnd;
    }

    /**
     * ,wallet_sell_pay
     */
    public int getLimitEnd() {
        return limitEnd;
    }

    /**
     * 类注释
     * GeneratedCriteria
     * 数据库表：wallet_sell_pay
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

        public Criteria andPCodeIsNull() {
            addCriterion("p_code is null");
            return (Criteria) this;
        }

        public Criteria andPCodeIsNotNull() {
            addCriterion("p_code is not null");
            return (Criteria) this;
        }

        public Criteria andPCodeEqualTo(String value) {
            addCriterion("p_code =", value, "pCode");
            return (Criteria) this;
        }

        public Criteria andPCodeNotEqualTo(String value) {
            addCriterion("p_code <>", value, "pCode");
            return (Criteria) this;
        }

        public Criteria andPCodeGreaterThan(String value) {
            addCriterion("p_code >", value, "pCode");
            return (Criteria) this;
        }

        public Criteria andPCodeGreaterThanOrEqualTo(String value) {
            addCriterion("p_code >=", value, "pCode");
            return (Criteria) this;
        }

        public Criteria andPCodeLessThan(String value) {
            addCriterion("p_code <", value, "pCode");
            return (Criteria) this;
        }

        public Criteria andPCodeLessThanOrEqualTo(String value) {
            addCriterion("p_code <=", value, "pCode");
            return (Criteria) this;
        }

        public Criteria andPCodeLike(String value) {
            addCriterion("p_code like", value, "pCode");
            return (Criteria) this;
        }

        public Criteria andPCodeNotLike(String value) {
            addCriterion("p_code not like", value, "pCode");
            return (Criteria) this;
        }

        public Criteria andPCodeIn(List<String> values) {
            addCriterion("p_code in", values, "pCode");
            return (Criteria) this;
        }

        public Criteria andPCodeNotIn(List<String> values) {
            addCriterion("p_code not in", values, "pCode");
            return (Criteria) this;
        }

        public Criteria andPCodeBetween(String value1, String value2) {
            addCriterion("p_code between", value1, value2, "pCode");
            return (Criteria) this;
        }

        public Criteria andPCodeNotBetween(String value1, String value2) {
            addCriterion("p_code not between", value1, value2, "pCode");
            return (Criteria) this;
        }

        public Criteria andTIdIsNull() {
            addCriterion("t_id is null");
            return (Criteria) this;
        }

        public Criteria andTIdIsNotNull() {
            addCriterion("t_id is not null");
            return (Criteria) this;
        }

        public Criteria andTIdEqualTo(Integer value) {
            addCriterion("t_id =", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotEqualTo(Integer value) {
            addCriterion("t_id <>", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThan(Integer value) {
            addCriterion("t_id >", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("t_id >=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThan(Integer value) {
            addCriterion("t_id <", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdLessThanOrEqualTo(Integer value) {
            addCriterion("t_id <=", value, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdIn(List<Integer> values) {
            addCriterion("t_id in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotIn(List<Integer> values) {
            addCriterion("t_id not in", values, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdBetween(Integer value1, Integer value2) {
            addCriterion("t_id between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andTIdNotBetween(Integer value1, Integer value2) {
            addCriterion("t_id not between", value1, value2, "tId");
            return (Criteria) this;
        }

        public Criteria andSellMoneyIsNull() {
            addCriterion("sell_money is null");
            return (Criteria) this;
        }

        public Criteria andSellMoneyIsNotNull() {
            addCriterion("sell_money is not null");
            return (Criteria) this;
        }

        public Criteria andSellMoneyEqualTo(BigDecimal value) {
            addCriterion("sell_money =", value, "sellMoney");
            return (Criteria) this;
        }

        public Criteria andSellMoneyNotEqualTo(BigDecimal value) {
            addCriterion("sell_money <>", value, "sellMoney");
            return (Criteria) this;
        }

        public Criteria andSellMoneyGreaterThan(BigDecimal value) {
            addCriterion("sell_money >", value, "sellMoney");
            return (Criteria) this;
        }

        public Criteria andSellMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("sell_money >=", value, "sellMoney");
            return (Criteria) this;
        }

        public Criteria andSellMoneyLessThan(BigDecimal value) {
            addCriterion("sell_money <", value, "sellMoney");
            return (Criteria) this;
        }

        public Criteria andSellMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("sell_money <=", value, "sellMoney");
            return (Criteria) this;
        }

        public Criteria andSellMoneyIn(List<BigDecimal> values) {
            addCriterion("sell_money in", values, "sellMoney");
            return (Criteria) this;
        }

        public Criteria andSellMoneyNotIn(List<BigDecimal> values) {
            addCriterion("sell_money not in", values, "sellMoney");
            return (Criteria) this;
        }

        public Criteria andSellMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sell_money between", value1, value2, "sellMoney");
            return (Criteria) this;
        }

        public Criteria andSellMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("sell_money not between", value1, value2, "sellMoney");
            return (Criteria) this;
        }

        public Criteria andPlatMoneyIsNull() {
            addCriterion("plat_money is null");
            return (Criteria) this;
        }

        public Criteria andPlatMoneyIsNotNull() {
            addCriterion("plat_money is not null");
            return (Criteria) this;
        }

        public Criteria andPlatMoneyEqualTo(BigDecimal value) {
            addCriterion("plat_money =", value, "platMoney");
            return (Criteria) this;
        }

        public Criteria andPlatMoneyNotEqualTo(BigDecimal value) {
            addCriterion("plat_money <>", value, "platMoney");
            return (Criteria) this;
        }

        public Criteria andPlatMoneyGreaterThan(BigDecimal value) {
            addCriterion("plat_money >", value, "platMoney");
            return (Criteria) this;
        }

        public Criteria andPlatMoneyGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("plat_money >=", value, "platMoney");
            return (Criteria) this;
        }

        public Criteria andPlatMoneyLessThan(BigDecimal value) {
            addCriterion("plat_money <", value, "platMoney");
            return (Criteria) this;
        }

        public Criteria andPlatMoneyLessThanOrEqualTo(BigDecimal value) {
            addCriterion("plat_money <=", value, "platMoney");
            return (Criteria) this;
        }

        public Criteria andPlatMoneyIn(List<BigDecimal> values) {
            addCriterion("plat_money in", values, "platMoney");
            return (Criteria) this;
        }

        public Criteria andPlatMoneyNotIn(List<BigDecimal> values) {
            addCriterion("plat_money not in", values, "platMoney");
            return (Criteria) this;
        }

        public Criteria andPlatMoneyBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("plat_money between", value1, value2, "platMoney");
            return (Criteria) this;
        }

        public Criteria andPlatMoneyNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("plat_money not between", value1, value2, "platMoney");
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

        public Criteria andRedeemTypeIsNull() {
            addCriterion("redeem_type is null");
            return (Criteria) this;
        }

        public Criteria andRedeemTypeIsNotNull() {
            addCriterion("redeem_type is not null");
            return (Criteria) this;
        }

        public Criteria andRedeemTypeEqualTo(Integer value) {
            addCriterion("redeem_type =", value, "redeemType");
            return (Criteria) this;
        }

        public Criteria andRedeemTypeNotEqualTo(Integer value) {
            addCriterion("redeem_type <>", value, "redeemType");
            return (Criteria) this;
        }

        public Criteria andRedeemTypeGreaterThan(Integer value) {
            addCriterion("redeem_type >", value, "redeemType");
            return (Criteria) this;
        }

        public Criteria andRedeemTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("redeem_type >=", value, "redeemType");
            return (Criteria) this;
        }

        public Criteria andRedeemTypeLessThan(Integer value) {
            addCriterion("redeem_type <", value, "redeemType");
            return (Criteria) this;
        }

        public Criteria andRedeemTypeLessThanOrEqualTo(Integer value) {
            addCriterion("redeem_type <=", value, "redeemType");
            return (Criteria) this;
        }

        public Criteria andRedeemTypeIn(List<Integer> values) {
            addCriterion("redeem_type in", values, "redeemType");
            return (Criteria) this;
        }

        public Criteria andRedeemTypeNotIn(List<Integer> values) {
            addCriterion("redeem_type not in", values, "redeemType");
            return (Criteria) this;
        }

        public Criteria andRedeemTypeBetween(Integer value1, Integer value2) {
            addCriterion("redeem_type between", value1, value2, "redeemType");
            return (Criteria) this;
        }

        public Criteria andRedeemTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("redeem_type not between", value1, value2, "redeemType");
            return (Criteria) this;
        }

        public Criteria andFinancUserIsNull() {
            addCriterion("financ_user is null");
            return (Criteria) this;
        }

        public Criteria andFinancUserIsNotNull() {
            addCriterion("financ_user is not null");
            return (Criteria) this;
        }

        public Criteria andFinancUserEqualTo(String value) {
            addCriterion("financ_user =", value, "financUser");
            return (Criteria) this;
        }

        public Criteria andFinancUserNotEqualTo(String value) {
            addCriterion("financ_user <>", value, "financUser");
            return (Criteria) this;
        }

        public Criteria andFinancUserGreaterThan(String value) {
            addCriterion("financ_user >", value, "financUser");
            return (Criteria) this;
        }

        public Criteria andFinancUserGreaterThanOrEqualTo(String value) {
            addCriterion("financ_user >=", value, "financUser");
            return (Criteria) this;
        }

        public Criteria andFinancUserLessThan(String value) {
            addCriterion("financ_user <", value, "financUser");
            return (Criteria) this;
        }

        public Criteria andFinancUserLessThanOrEqualTo(String value) {
            addCriterion("financ_user <=", value, "financUser");
            return (Criteria) this;
        }

        public Criteria andFinancUserLike(String value) {
            addCriterion("financ_user like", value, "financUser");
            return (Criteria) this;
        }

        public Criteria andFinancUserNotLike(String value) {
            addCriterion("financ_user not like", value, "financUser");
            return (Criteria) this;
        }

        public Criteria andFinancUserIn(List<String> values) {
            addCriterion("financ_user in", values, "financUser");
            return (Criteria) this;
        }

        public Criteria andFinancUserNotIn(List<String> values) {
            addCriterion("financ_user not in", values, "financUser");
            return (Criteria) this;
        }

        public Criteria andFinancUserBetween(String value1, String value2) {
            addCriterion("financ_user between", value1, value2, "financUser");
            return (Criteria) this;
        }

        public Criteria andFinancUserNotBetween(String value1, String value2) {
            addCriterion("financ_user not between", value1, value2, "financUser");
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

        public Criteria andTfIdIsNull() {
            addCriterion("tf_id is null");
            return (Criteria) this;
        }

        public Criteria andTfIdIsNotNull() {
            addCriterion("tf_id is not null");
            return (Criteria) this;
        }

        public Criteria andTfIdEqualTo(Integer value) {
            addCriterion("tf_id =", value, "tfId");
            return (Criteria) this;
        }

        public Criteria andTfIdNotEqualTo(Integer value) {
            addCriterion("tf_id <>", value, "tfId");
            return (Criteria) this;
        }

        public Criteria andTfIdGreaterThan(Integer value) {
            addCriterion("tf_id >", value, "tfId");
            return (Criteria) this;
        }

        public Criteria andTfIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("tf_id >=", value, "tfId");
            return (Criteria) this;
        }

        public Criteria andTfIdLessThan(Integer value) {
            addCriterion("tf_id <", value, "tfId");
            return (Criteria) this;
        }

        public Criteria andTfIdLessThanOrEqualTo(Integer value) {
            addCriterion("tf_id <=", value, "tfId");
            return (Criteria) this;
        }

        public Criteria andTfIdIn(List<Integer> values) {
            addCriterion("tf_id in", values, "tfId");
            return (Criteria) this;
        }

        public Criteria andTfIdNotIn(List<Integer> values) {
            addCriterion("tf_id not in", values, "tfId");
            return (Criteria) this;
        }

        public Criteria andTfIdBetween(Integer value1, Integer value2) {
            addCriterion("tf_id between", value1, value2, "tfId");
            return (Criteria) this;
        }

        public Criteria andTfIdNotBetween(Integer value1, Integer value2) {
            addCriterion("tf_id not between", value1, value2, "tfId");
            return (Criteria) this;
        }

        public Criteria andInterestIsNull() {
            addCriterion("interest is null");
            return (Criteria) this;
        }

        public Criteria andInterestIsNotNull() {
            addCriterion("interest is not null");
            return (Criteria) this;
        }

        public Criteria andInterestEqualTo(BigDecimal value) {
            addCriterion("interest =", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestNotEqualTo(BigDecimal value) {
            addCriterion("interest <>", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestGreaterThan(BigDecimal value) {
            addCriterion("interest >", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("interest >=", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestLessThan(BigDecimal value) {
            addCriterion("interest <", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestLessThanOrEqualTo(BigDecimal value) {
            addCriterion("interest <=", value, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestIn(List<BigDecimal> values) {
            addCriterion("interest in", values, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestNotIn(List<BigDecimal> values) {
            addCriterion("interest not in", values, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interest between", value1, value2, "interest");
            return (Criteria) this;
        }

        public Criteria andInterestNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("interest not between", value1, value2, "interest");
            return (Criteria) this;
        }
    }

    /**
     * 类注释
     * Criteria
     * 数据库表：wallet_sell_pay
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
     * 数据库表：wallet_sell_pay
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