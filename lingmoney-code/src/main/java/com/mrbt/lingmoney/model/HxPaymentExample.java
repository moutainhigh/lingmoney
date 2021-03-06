package com.mrbt.lingmoney.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HxPaymentExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hx_payment
     *
     * @mbggenerated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hx_payment
     *
     * @mbggenerated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hx_payment
     *
     * @mbggenerated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hx_payment
     *
     * @mbggenerated
     */
    protected int limitStart = -1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table hx_payment
     *
     * @mbggenerated
     */
    protected int limitEnd = -1;

    /**
     *  构造查询条件,hx_payment
     */
    public HxPaymentExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *  设置排序字段,hx_payment
     *
     * @param orderByClause 排序字段
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *  获取排序字段,hx_payment
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *  设置过滤重复数据,hx_payment
     *
     * @param distinct 是否过滤重复数据
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *  是否过滤重复数据,hx_payment
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *  获取当前的查询条件实例,hx_payment
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * ,hx_payment
     *
     * @param criteria 过滤条件实例
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * ,hx_payment
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *  创建一个查询条件,hx_payment
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *  内部构建查询条件对象,hx_payment
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *  清除查询条件,hx_payment
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * ,hx_payment
     *
     * @param limitStart
     */
    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    /**
     * ,hx_payment
     */
    public int getLimitStart() {
        return limitStart;
    }

    /**
     * ,hx_payment
     *
     * @param limitEnd
     */
    public void setLimitEnd(int limitEnd) {
        this.limitEnd=limitEnd;
    }

    /**
     * ,hx_payment
     */
    public int getLimitEnd() {
        return limitEnd;
    }

    /**
     * 类注释
     * GeneratedCriteria
     * 数据库表：hx_payment
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

        public Criteria andBwIdIsNull() {
            addCriterion("bw_id is null");
            return (Criteria) this;
        }

        public Criteria andBwIdIsNotNull() {
            addCriterion("bw_id is not null");
            return (Criteria) this;
        }

        public Criteria andBwIdEqualTo(String value) {
            addCriterion("bw_id =", value, "bwId");
            return (Criteria) this;
        }

        public Criteria andBwIdNotEqualTo(String value) {
            addCriterion("bw_id <>", value, "bwId");
            return (Criteria) this;
        }

        public Criteria andBwIdGreaterThan(String value) {
            addCriterion("bw_id >", value, "bwId");
            return (Criteria) this;
        }

        public Criteria andBwIdGreaterThanOrEqualTo(String value) {
            addCriterion("bw_id >=", value, "bwId");
            return (Criteria) this;
        }

        public Criteria andBwIdLessThan(String value) {
            addCriterion("bw_id <", value, "bwId");
            return (Criteria) this;
        }

        public Criteria andBwIdLessThanOrEqualTo(String value) {
            addCriterion("bw_id <=", value, "bwId");
            return (Criteria) this;
        }

        public Criteria andBwIdLike(String value) {
            addCriterion("bw_id like", value, "bwId");
            return (Criteria) this;
        }

        public Criteria andBwIdNotLike(String value) {
            addCriterion("bw_id not like", value, "bwId");
            return (Criteria) this;
        }

        public Criteria andBwIdIn(List<String> values) {
            addCriterion("bw_id in", values, "bwId");
            return (Criteria) this;
        }

        public Criteria andBwIdNotIn(List<String> values) {
            addCriterion("bw_id not in", values, "bwId");
            return (Criteria) this;
        }

        public Criteria andBwIdBetween(String value1, String value2) {
            addCriterion("bw_id between", value1, value2, "bwId");
            return (Criteria) this;
        }

        public Criteria andBwIdNotBetween(String value1, String value2) {
            addCriterion("bw_id not between", value1, value2, "bwId");
            return (Criteria) this;
        }

        public Criteria andChannelFlowIsNull() {
            addCriterion("channel_flow is null");
            return (Criteria) this;
        }

        public Criteria andChannelFlowIsNotNull() {
            addCriterion("channel_flow is not null");
            return (Criteria) this;
        }

        public Criteria andChannelFlowEqualTo(String value) {
            addCriterion("channel_flow =", value, "channelFlow");
            return (Criteria) this;
        }

        public Criteria andChannelFlowNotEqualTo(String value) {
            addCriterion("channel_flow <>", value, "channelFlow");
            return (Criteria) this;
        }

        public Criteria andChannelFlowGreaterThan(String value) {
            addCriterion("channel_flow >", value, "channelFlow");
            return (Criteria) this;
        }

        public Criteria andChannelFlowGreaterThanOrEqualTo(String value) {
            addCriterion("channel_flow >=", value, "channelFlow");
            return (Criteria) this;
        }

        public Criteria andChannelFlowLessThan(String value) {
            addCriterion("channel_flow <", value, "channelFlow");
            return (Criteria) this;
        }

        public Criteria andChannelFlowLessThanOrEqualTo(String value) {
            addCriterion("channel_flow <=", value, "channelFlow");
            return (Criteria) this;
        }

        public Criteria andChannelFlowLike(String value) {
            addCriterion("channel_flow like", value, "channelFlow");
            return (Criteria) this;
        }

        public Criteria andChannelFlowNotLike(String value) {
            addCriterion("channel_flow not like", value, "channelFlow");
            return (Criteria) this;
        }

        public Criteria andChannelFlowIn(List<String> values) {
            addCriterion("channel_flow in", values, "channelFlow");
            return (Criteria) this;
        }

        public Criteria andChannelFlowNotIn(List<String> values) {
            addCriterion("channel_flow not in", values, "channelFlow");
            return (Criteria) this;
        }

        public Criteria andChannelFlowBetween(String value1, String value2) {
            addCriterion("channel_flow between", value1, value2, "channelFlow");
            return (Criteria) this;
        }

        public Criteria andChannelFlowNotBetween(String value1, String value2) {
            addCriterion("channel_flow not between", value1, value2, "channelFlow");
            return (Criteria) this;
        }

        public Criteria andOldChannelFlowIsNull() {
            addCriterion("old_channel_flow is null");
            return (Criteria) this;
        }

        public Criteria andOldChannelFlowIsNotNull() {
            addCriterion("old_channel_flow is not null");
            return (Criteria) this;
        }

        public Criteria andOldChannelFlowEqualTo(String value) {
            addCriterion("old_channel_flow =", value, "oldChannelFlow");
            return (Criteria) this;
        }

        public Criteria andOldChannelFlowNotEqualTo(String value) {
            addCriterion("old_channel_flow <>", value, "oldChannelFlow");
            return (Criteria) this;
        }

        public Criteria andOldChannelFlowGreaterThan(String value) {
            addCriterion("old_channel_flow >", value, "oldChannelFlow");
            return (Criteria) this;
        }

        public Criteria andOldChannelFlowGreaterThanOrEqualTo(String value) {
            addCriterion("old_channel_flow >=", value, "oldChannelFlow");
            return (Criteria) this;
        }

        public Criteria andOldChannelFlowLessThan(String value) {
            addCriterion("old_channel_flow <", value, "oldChannelFlow");
            return (Criteria) this;
        }

        public Criteria andOldChannelFlowLessThanOrEqualTo(String value) {
            addCriterion("old_channel_flow <=", value, "oldChannelFlow");
            return (Criteria) this;
        }

        public Criteria andOldChannelFlowLike(String value) {
            addCriterion("old_channel_flow like", value, "oldChannelFlow");
            return (Criteria) this;
        }

        public Criteria andOldChannelFlowNotLike(String value) {
            addCriterion("old_channel_flow not like", value, "oldChannelFlow");
            return (Criteria) this;
        }

        public Criteria andOldChannelFlowIn(List<String> values) {
            addCriterion("old_channel_flow in", values, "oldChannelFlow");
            return (Criteria) this;
        }

        public Criteria andOldChannelFlowNotIn(List<String> values) {
            addCriterion("old_channel_flow not in", values, "oldChannelFlow");
            return (Criteria) this;
        }

        public Criteria andOldChannelFlowBetween(String value1, String value2) {
            addCriterion("old_channel_flow between", value1, value2, "oldChannelFlow");
            return (Criteria) this;
        }

        public Criteria andOldChannelFlowNotBetween(String value1, String value2) {
            addCriterion("old_channel_flow not between", value1, value2, "oldChannelFlow");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIsNull() {
            addCriterion("payment_type is null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIsNotNull() {
            addCriterion("payment_type is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeEqualTo(Integer value) {
            addCriterion("payment_type =", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotEqualTo(Integer value) {
            addCriterion("payment_type <>", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThan(Integer value) {
            addCriterion("payment_type >", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("payment_type >=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThan(Integer value) {
            addCriterion("payment_type <", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeLessThanOrEqualTo(Integer value) {
            addCriterion("payment_type <=", value, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeIn(List<Integer> values) {
            addCriterion("payment_type in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotIn(List<Integer> values) {
            addCriterion("payment_type not in", values, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeBetween(Integer value1, Integer value2) {
            addCriterion("payment_type between", value1, value2, "paymentType");
            return (Criteria) this;
        }

        public Criteria andPaymentTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("payment_type not between", value1, value2, "paymentType");
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

        public Criteria andPaymentDateIsNull() {
            addCriterion("payment_date is null");
            return (Criteria) this;
        }

        public Criteria andPaymentDateIsNotNull() {
            addCriterion("payment_date is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentDateEqualTo(Date value) {
            addCriterion("payment_date =", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateNotEqualTo(Date value) {
            addCriterion("payment_date <>", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateGreaterThan(Date value) {
            addCriterion("payment_date >", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateGreaterThanOrEqualTo(Date value) {
            addCriterion("payment_date >=", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateLessThan(Date value) {
            addCriterion("payment_date <", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateLessThanOrEqualTo(Date value) {
            addCriterion("payment_date <=", value, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateIn(List<Date> values) {
            addCriterion("payment_date in", values, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateNotIn(List<Date> values) {
            addCriterion("payment_date not in", values, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateBetween(Date value1, Date value2) {
            addCriterion("payment_date between", value1, value2, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andPaymentDateNotBetween(Date value1, Date value2) {
            addCriterion("payment_date not between", value1, value2, "paymentDate");
            return (Criteria) this;
        }

        public Criteria andFeeAmtIsNull() {
            addCriterion("fee_amt is null");
            return (Criteria) this;
        }

        public Criteria andFeeAmtIsNotNull() {
            addCriterion("fee_amt is not null");
            return (Criteria) this;
        }

        public Criteria andFeeAmtEqualTo(BigDecimal value) {
            addCriterion("fee_amt =", value, "feeAmt");
            return (Criteria) this;
        }

        public Criteria andFeeAmtNotEqualTo(BigDecimal value) {
            addCriterion("fee_amt <>", value, "feeAmt");
            return (Criteria) this;
        }

        public Criteria andFeeAmtGreaterThan(BigDecimal value) {
            addCriterion("fee_amt >", value, "feeAmt");
            return (Criteria) this;
        }

        public Criteria andFeeAmtGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("fee_amt >=", value, "feeAmt");
            return (Criteria) this;
        }

        public Criteria andFeeAmtLessThan(BigDecimal value) {
            addCriterion("fee_amt <", value, "feeAmt");
            return (Criteria) this;
        }

        public Criteria andFeeAmtLessThanOrEqualTo(BigDecimal value) {
            addCriterion("fee_amt <=", value, "feeAmt");
            return (Criteria) this;
        }

        public Criteria andFeeAmtIn(List<BigDecimal> values) {
            addCriterion("fee_amt in", values, "feeAmt");
            return (Criteria) this;
        }

        public Criteria andFeeAmtNotIn(List<BigDecimal> values) {
            addCriterion("fee_amt not in", values, "feeAmt");
            return (Criteria) this;
        }

        public Criteria andFeeAmtBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee_amt between", value1, value2, "feeAmt");
            return (Criteria) this;
        }

        public Criteria andFeeAmtNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("fee_amt not between", value1, value2, "feeAmt");
            return (Criteria) this;
        }

        public Criteria andBankFlowIsNull() {
            addCriterion("bank_flow is null");
            return (Criteria) this;
        }

        public Criteria andBankFlowIsNotNull() {
            addCriterion("bank_flow is not null");
            return (Criteria) this;
        }

        public Criteria andBankFlowEqualTo(String value) {
            addCriterion("bank_flow =", value, "bankFlow");
            return (Criteria) this;
        }

        public Criteria andBankFlowNotEqualTo(String value) {
            addCriterion("bank_flow <>", value, "bankFlow");
            return (Criteria) this;
        }

        public Criteria andBankFlowGreaterThan(String value) {
            addCriterion("bank_flow >", value, "bankFlow");
            return (Criteria) this;
        }

        public Criteria andBankFlowGreaterThanOrEqualTo(String value) {
            addCriterion("bank_flow >=", value, "bankFlow");
            return (Criteria) this;
        }

        public Criteria andBankFlowLessThan(String value) {
            addCriterion("bank_flow <", value, "bankFlow");
            return (Criteria) this;
        }

        public Criteria andBankFlowLessThanOrEqualTo(String value) {
            addCriterion("bank_flow <=", value, "bankFlow");
            return (Criteria) this;
        }

        public Criteria andBankFlowLike(String value) {
            addCriterion("bank_flow like", value, "bankFlow");
            return (Criteria) this;
        }

        public Criteria andBankFlowNotLike(String value) {
            addCriterion("bank_flow not like", value, "bankFlow");
            return (Criteria) this;
        }

        public Criteria andBankFlowIn(List<String> values) {
            addCriterion("bank_flow in", values, "bankFlow");
            return (Criteria) this;
        }

        public Criteria andBankFlowNotIn(List<String> values) {
            addCriterion("bank_flow not in", values, "bankFlow");
            return (Criteria) this;
        }

        public Criteria andBankFlowBetween(String value1, String value2) {
            addCriterion("bank_flow between", value1, value2, "bankFlow");
            return (Criteria) this;
        }

        public Criteria andBankFlowNotBetween(String value1, String value2) {
            addCriterion("bank_flow not between", value1, value2, "bankFlow");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(BigDecimal value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(BigDecimal value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(BigDecimal value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(BigDecimal value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<BigDecimal> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<BigDecimal> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andSubmitDetailStatusIsNull() {
            addCriterion("submit_detail_status is null");
            return (Criteria) this;
        }

        public Criteria andSubmitDetailStatusIsNotNull() {
            addCriterion("submit_detail_status is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitDetailStatusEqualTo(Integer value) {
            addCriterion("submit_detail_status =", value, "submitDetailStatus");
            return (Criteria) this;
        }

        public Criteria andSubmitDetailStatusNotEqualTo(Integer value) {
            addCriterion("submit_detail_status <>", value, "submitDetailStatus");
            return (Criteria) this;
        }

        public Criteria andSubmitDetailStatusGreaterThan(Integer value) {
            addCriterion("submit_detail_status >", value, "submitDetailStatus");
            return (Criteria) this;
        }

        public Criteria andSubmitDetailStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("submit_detail_status >=", value, "submitDetailStatus");
            return (Criteria) this;
        }

        public Criteria andSubmitDetailStatusLessThan(Integer value) {
            addCriterion("submit_detail_status <", value, "submitDetailStatus");
            return (Criteria) this;
        }

        public Criteria andSubmitDetailStatusLessThanOrEqualTo(Integer value) {
            addCriterion("submit_detail_status <=", value, "submitDetailStatus");
            return (Criteria) this;
        }

        public Criteria andSubmitDetailStatusIn(List<Integer> values) {
            addCriterion("submit_detail_status in", values, "submitDetailStatus");
            return (Criteria) this;
        }

        public Criteria andSubmitDetailStatusNotIn(List<Integer> values) {
            addCriterion("submit_detail_status not in", values, "submitDetailStatus");
            return (Criteria) this;
        }

        public Criteria andSubmitDetailStatusBetween(Integer value1, Integer value2) {
            addCriterion("submit_detail_status between", value1, value2, "submitDetailStatus");
            return (Criteria) this;
        }

        public Criteria andSubmitDetailStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("submit_detail_status not between", value1, value2, "submitDetailStatus");
            return (Criteria) this;
        }

        public Criteria andSubmitChannelFlowIsNull() {
            addCriterion("submit_channel_flow is null");
            return (Criteria) this;
        }

        public Criteria andSubmitChannelFlowIsNotNull() {
            addCriterion("submit_channel_flow is not null");
            return (Criteria) this;
        }

        public Criteria andSubmitChannelFlowEqualTo(String value) {
            addCriterion("submit_channel_flow =", value, "submitChannelFlow");
            return (Criteria) this;
        }

        public Criteria andSubmitChannelFlowNotEqualTo(String value) {
            addCriterion("submit_channel_flow <>", value, "submitChannelFlow");
            return (Criteria) this;
        }

        public Criteria andSubmitChannelFlowGreaterThan(String value) {
            addCriterion("submit_channel_flow >", value, "submitChannelFlow");
            return (Criteria) this;
        }

        public Criteria andSubmitChannelFlowGreaterThanOrEqualTo(String value) {
            addCriterion("submit_channel_flow >=", value, "submitChannelFlow");
            return (Criteria) this;
        }

        public Criteria andSubmitChannelFlowLessThan(String value) {
            addCriterion("submit_channel_flow <", value, "submitChannelFlow");
            return (Criteria) this;
        }

        public Criteria andSubmitChannelFlowLessThanOrEqualTo(String value) {
            addCriterion("submit_channel_flow <=", value, "submitChannelFlow");
            return (Criteria) this;
        }

        public Criteria andSubmitChannelFlowLike(String value) {
            addCriterion("submit_channel_flow like", value, "submitChannelFlow");
            return (Criteria) this;
        }

        public Criteria andSubmitChannelFlowNotLike(String value) {
            addCriterion("submit_channel_flow not like", value, "submitChannelFlow");
            return (Criteria) this;
        }

        public Criteria andSubmitChannelFlowIn(List<String> values) {
            addCriterion("submit_channel_flow in", values, "submitChannelFlow");
            return (Criteria) this;
        }

        public Criteria andSubmitChannelFlowNotIn(List<String> values) {
            addCriterion("submit_channel_flow not in", values, "submitChannelFlow");
            return (Criteria) this;
        }

        public Criteria andSubmitChannelFlowBetween(String value1, String value2) {
            addCriterion("submit_channel_flow between", value1, value2, "submitChannelFlow");
            return (Criteria) this;
        }

        public Criteria andSubmitChannelFlowNotBetween(String value1, String value2) {
            addCriterion("submit_channel_flow not between", value1, value2, "submitChannelFlow");
            return (Criteria) this;
        }

        public Criteria andDaysIsNull() {
            addCriterion("days is null");
            return (Criteria) this;
        }

        public Criteria andDaysIsNotNull() {
            addCriterion("days is not null");
            return (Criteria) this;
        }

        public Criteria andDaysEqualTo(Integer value) {
            addCriterion("days =", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotEqualTo(Integer value) {
            addCriterion("days <>", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysGreaterThan(Integer value) {
            addCriterion("days >", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("days >=", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysLessThan(Integer value) {
            addCriterion("days <", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysLessThanOrEqualTo(Integer value) {
            addCriterion("days <=", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysIn(List<Integer> values) {
            addCriterion("days in", values, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotIn(List<Integer> values) {
            addCriterion("days not in", values, "days");
            return (Criteria) this;
        }

        public Criteria andDaysBetween(Integer value1, Integer value2) {
            addCriterion("days between", value1, value2, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("days not between", value1, value2, "days");
            return (Criteria) this;
        }
    }

    /**
     * 类注释
     * Criteria
     * 数据库表：hx_payment
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
     * 数据库表：hx_payment
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