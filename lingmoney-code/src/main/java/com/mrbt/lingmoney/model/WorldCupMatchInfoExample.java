package com.mrbt.lingmoney.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class WorldCupMatchInfoExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table world_cup_match_info
     *
     * @mbg.generated
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table world_cup_match_info
     *
     * @mbg.generated
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table world_cup_match_info
     *
     * @mbg.generated
     */
    protected List<Criteria> oredCriteria;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table world_cup_match_info
     *
     * @mbg.generated
     */
    protected int limitStart = -1;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table world_cup_match_info
     *
     * @mbg.generated
     */
    protected int limitEnd = -1;

    /**
     *  构造查询条件,world_cup_match_info
     */
    public WorldCupMatchInfoExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     *  设置排序字段,world_cup_match_info
     *
     * @param orderByClause 排序字段
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     *  获取排序字段,world_cup_match_info
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     *  设置过滤重复数据,world_cup_match_info
     *
     * @param distinct 是否过滤重复数据
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     *  是否过滤重复数据,world_cup_match_info
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     *  获取当前的查询条件实例,world_cup_match_info
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * ,world_cup_match_info
     *
     * @param criteria 过滤条件实例
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * ,world_cup_match_info
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     *  创建一个查询条件,world_cup_match_info
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     *  内部构建查询条件对象,world_cup_match_info
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     *  清除查询条件,world_cup_match_info
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * ,world_cup_match_info
     *
     * @param limitStart
     */
    public void setLimitStart(int limitStart) {
        this.limitStart=limitStart;
    }

    /**
     * ,world_cup_match_info
     */
    public int getLimitStart() {
        return limitStart;
    }

    /**
     * ,world_cup_match_info
     *
     * @param limitEnd
     */
    public void setLimitEnd(int limitEnd) {
        this.limitEnd=limitEnd;
    }

    /**
     * ,world_cup_match_info
     */
    public int getLimitEnd() {
        return limitEnd;
    }

    /**
     * 类注释
     * GeneratedCriteria
     * 数据库表：world_cup_match_info
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

        public Criteria andMatchDateIsNull() {
            addCriterion("match_date is null");
            return (Criteria) this;
        }

        public Criteria andMatchDateIsNotNull() {
            addCriterion("match_date is not null");
            return (Criteria) this;
        }

        public Criteria andMatchDateEqualTo(Date value) {
            addCriterionForJDBCDate("match_date =", value, "matchDate");
            return (Criteria) this;
        }

        public Criteria andMatchDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("match_date <>", value, "matchDate");
            return (Criteria) this;
        }

        public Criteria andMatchDateGreaterThan(Date value) {
            addCriterionForJDBCDate("match_date >", value, "matchDate");
            return (Criteria) this;
        }

        public Criteria andMatchDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("match_date >=", value, "matchDate");
            return (Criteria) this;
        }

        public Criteria andMatchDateLessThan(Date value) {
            addCriterionForJDBCDate("match_date <", value, "matchDate");
            return (Criteria) this;
        }

        public Criteria andMatchDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("match_date <=", value, "matchDate");
            return (Criteria) this;
        }

        public Criteria andMatchDateIn(List<Date> values) {
            addCriterionForJDBCDate("match_date in", values, "matchDate");
            return (Criteria) this;
        }

        public Criteria andMatchDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("match_date not in", values, "matchDate");
            return (Criteria) this;
        }

        public Criteria andMatchDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("match_date between", value1, value2, "matchDate");
            return (Criteria) this;
        }

        public Criteria andMatchDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("match_date not between", value1, value2, "matchDate");
            return (Criteria) this;
        }

        public Criteria andMatchTimeIsNull() {
            addCriterion("match_time is null");
            return (Criteria) this;
        }

        public Criteria andMatchTimeIsNotNull() {
            addCriterion("match_time is not null");
            return (Criteria) this;
        }

        public Criteria andMatchTimeEqualTo(Date value) {
            addCriterion("match_time =", value, "matchTime");
            return (Criteria) this;
        }

        public Criteria andMatchTimeNotEqualTo(Date value) {
            addCriterion("match_time <>", value, "matchTime");
            return (Criteria) this;
        }

        public Criteria andMatchTimeGreaterThan(Date value) {
            addCriterion("match_time >", value, "matchTime");
            return (Criteria) this;
        }

        public Criteria andMatchTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("match_time >=", value, "matchTime");
            return (Criteria) this;
        }

        public Criteria andMatchTimeLessThan(Date value) {
            addCriterion("match_time <", value, "matchTime");
            return (Criteria) this;
        }

        public Criteria andMatchTimeLessThanOrEqualTo(Date value) {
            addCriterion("match_time <=", value, "matchTime");
            return (Criteria) this;
        }

        public Criteria andMatchTimeIn(List<Date> values) {
            addCriterion("match_time in", values, "matchTime");
            return (Criteria) this;
        }

        public Criteria andMatchTimeNotIn(List<Date> values) {
            addCriterion("match_time not in", values, "matchTime");
            return (Criteria) this;
        }

        public Criteria andMatchTimeBetween(Date value1, Date value2) {
            addCriterion("match_time between", value1, value2, "matchTime");
            return (Criteria) this;
        }

        public Criteria andMatchTimeNotBetween(Date value1, Date value2) {
            addCriterion("match_time not between", value1, value2, "matchTime");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNull() {
            addCriterion("group_name is null");
            return (Criteria) this;
        }

        public Criteria andGroupNameIsNotNull() {
            addCriterion("group_name is not null");
            return (Criteria) this;
        }

        public Criteria andGroupNameEqualTo(String value) {
            addCriterion("group_name =", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotEqualTo(String value) {
            addCriterion("group_name <>", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThan(String value) {
            addCriterion("group_name >", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameGreaterThanOrEqualTo(String value) {
            addCriterion("group_name >=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThan(String value) {
            addCriterion("group_name <", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLessThanOrEqualTo(String value) {
            addCriterion("group_name <=", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameLike(String value) {
            addCriterion("group_name like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotLike(String value) {
            addCriterion("group_name not like", value, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameIn(List<String> values) {
            addCriterion("group_name in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotIn(List<String> values) {
            addCriterion("group_name not in", values, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameBetween(String value1, String value2) {
            addCriterion("group_name between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andGroupNameNotBetween(String value1, String value2) {
            addCriterion("group_name not between", value1, value2, "groupName");
            return (Criteria) this;
        }

        public Criteria andLeftTeamIsNull() {
            addCriterion("left_team is null");
            return (Criteria) this;
        }

        public Criteria andLeftTeamIsNotNull() {
            addCriterion("left_team is not null");
            return (Criteria) this;
        }

        public Criteria andLeftTeamEqualTo(String value) {
            addCriterion("left_team =", value, "leftTeam");
            return (Criteria) this;
        }

        public Criteria andLeftTeamNotEqualTo(String value) {
            addCriterion("left_team <>", value, "leftTeam");
            return (Criteria) this;
        }

        public Criteria andLeftTeamGreaterThan(String value) {
            addCriterion("left_team >", value, "leftTeam");
            return (Criteria) this;
        }

        public Criteria andLeftTeamGreaterThanOrEqualTo(String value) {
            addCriterion("left_team >=", value, "leftTeam");
            return (Criteria) this;
        }

        public Criteria andLeftTeamLessThan(String value) {
            addCriterion("left_team <", value, "leftTeam");
            return (Criteria) this;
        }

        public Criteria andLeftTeamLessThanOrEqualTo(String value) {
            addCriterion("left_team <=", value, "leftTeam");
            return (Criteria) this;
        }

        public Criteria andLeftTeamLike(String value) {
            addCriterion("left_team like", value, "leftTeam");
            return (Criteria) this;
        }

        public Criteria andLeftTeamNotLike(String value) {
            addCriterion("left_team not like", value, "leftTeam");
            return (Criteria) this;
        }

        public Criteria andLeftTeamIn(List<String> values) {
            addCriterion("left_team in", values, "leftTeam");
            return (Criteria) this;
        }

        public Criteria andLeftTeamNotIn(List<String> values) {
            addCriterion("left_team not in", values, "leftTeam");
            return (Criteria) this;
        }

        public Criteria andLeftTeamBetween(String value1, String value2) {
            addCriterion("left_team between", value1, value2, "leftTeam");
            return (Criteria) this;
        }

        public Criteria andLeftTeamNotBetween(String value1, String value2) {
            addCriterion("left_team not between", value1, value2, "leftTeam");
            return (Criteria) this;
        }

        public Criteria andRightTeamIsNull() {
            addCriterion("right_team is null");
            return (Criteria) this;
        }

        public Criteria andRightTeamIsNotNull() {
            addCriterion("right_team is not null");
            return (Criteria) this;
        }

        public Criteria andRightTeamEqualTo(String value) {
            addCriterion("right_team =", value, "rightTeam");
            return (Criteria) this;
        }

        public Criteria andRightTeamNotEqualTo(String value) {
            addCriterion("right_team <>", value, "rightTeam");
            return (Criteria) this;
        }

        public Criteria andRightTeamGreaterThan(String value) {
            addCriterion("right_team >", value, "rightTeam");
            return (Criteria) this;
        }

        public Criteria andRightTeamGreaterThanOrEqualTo(String value) {
            addCriterion("right_team >=", value, "rightTeam");
            return (Criteria) this;
        }

        public Criteria andRightTeamLessThan(String value) {
            addCriterion("right_team <", value, "rightTeam");
            return (Criteria) this;
        }

        public Criteria andRightTeamLessThanOrEqualTo(String value) {
            addCriterion("right_team <=", value, "rightTeam");
            return (Criteria) this;
        }

        public Criteria andRightTeamLike(String value) {
            addCriterion("right_team like", value, "rightTeam");
            return (Criteria) this;
        }

        public Criteria andRightTeamNotLike(String value) {
            addCriterion("right_team not like", value, "rightTeam");
            return (Criteria) this;
        }

        public Criteria andRightTeamIn(List<String> values) {
            addCriterion("right_team in", values, "rightTeam");
            return (Criteria) this;
        }

        public Criteria andRightTeamNotIn(List<String> values) {
            addCriterion("right_team not in", values, "rightTeam");
            return (Criteria) this;
        }

        public Criteria andRightTeamBetween(String value1, String value2) {
            addCriterion("right_team between", value1, value2, "rightTeam");
            return (Criteria) this;
        }

        public Criteria andRightTeamNotBetween(String value1, String value2) {
            addCriterion("right_team not between", value1, value2, "rightTeam");
            return (Criteria) this;
        }

        public Criteria andLeftScoreIsNull() {
            addCriterion("left_score is null");
            return (Criteria) this;
        }

        public Criteria andLeftScoreIsNotNull() {
            addCriterion("left_score is not null");
            return (Criteria) this;
        }

        public Criteria andLeftScoreEqualTo(Integer value) {
            addCriterion("left_score =", value, "leftScore");
            return (Criteria) this;
        }

        public Criteria andLeftScoreNotEqualTo(Integer value) {
            addCriterion("left_score <>", value, "leftScore");
            return (Criteria) this;
        }

        public Criteria andLeftScoreGreaterThan(Integer value) {
            addCriterion("left_score >", value, "leftScore");
            return (Criteria) this;
        }

        public Criteria andLeftScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("left_score >=", value, "leftScore");
            return (Criteria) this;
        }

        public Criteria andLeftScoreLessThan(Integer value) {
            addCriterion("left_score <", value, "leftScore");
            return (Criteria) this;
        }

        public Criteria andLeftScoreLessThanOrEqualTo(Integer value) {
            addCriterion("left_score <=", value, "leftScore");
            return (Criteria) this;
        }

        public Criteria andLeftScoreIn(List<Integer> values) {
            addCriterion("left_score in", values, "leftScore");
            return (Criteria) this;
        }

        public Criteria andLeftScoreNotIn(List<Integer> values) {
            addCriterion("left_score not in", values, "leftScore");
            return (Criteria) this;
        }

        public Criteria andLeftScoreBetween(Integer value1, Integer value2) {
            addCriterion("left_score between", value1, value2, "leftScore");
            return (Criteria) this;
        }

        public Criteria andLeftScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("left_score not between", value1, value2, "leftScore");
            return (Criteria) this;
        }

        public Criteria andRightScoreIsNull() {
            addCriterion("right_score is null");
            return (Criteria) this;
        }

        public Criteria andRightScoreIsNotNull() {
            addCriterion("right_score is not null");
            return (Criteria) this;
        }

        public Criteria andRightScoreEqualTo(Integer value) {
            addCriterion("right_score =", value, "rightScore");
            return (Criteria) this;
        }

        public Criteria andRightScoreNotEqualTo(Integer value) {
            addCriterion("right_score <>", value, "rightScore");
            return (Criteria) this;
        }

        public Criteria andRightScoreGreaterThan(Integer value) {
            addCriterion("right_score >", value, "rightScore");
            return (Criteria) this;
        }

        public Criteria andRightScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("right_score >=", value, "rightScore");
            return (Criteria) this;
        }

        public Criteria andRightScoreLessThan(Integer value) {
            addCriterion("right_score <", value, "rightScore");
            return (Criteria) this;
        }

        public Criteria andRightScoreLessThanOrEqualTo(Integer value) {
            addCriterion("right_score <=", value, "rightScore");
            return (Criteria) this;
        }

        public Criteria andRightScoreIn(List<Integer> values) {
            addCriterion("right_score in", values, "rightScore");
            return (Criteria) this;
        }

        public Criteria andRightScoreNotIn(List<Integer> values) {
            addCriterion("right_score not in", values, "rightScore");
            return (Criteria) this;
        }

        public Criteria andRightScoreBetween(Integer value1, Integer value2) {
            addCriterion("right_score between", value1, value2, "rightScore");
            return (Criteria) this;
        }

        public Criteria andRightScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("right_score not between", value1, value2, "rightScore");
            return (Criteria) this;
        }

        public Criteria andLeftImageIsNull() {
            addCriterion("left_image is null");
            return (Criteria) this;
        }

        public Criteria andLeftImageIsNotNull() {
            addCriterion("left_image is not null");
            return (Criteria) this;
        }

        public Criteria andLeftImageEqualTo(String value) {
            addCriterion("left_image =", value, "leftImage");
            return (Criteria) this;
        }

        public Criteria andLeftImageNotEqualTo(String value) {
            addCriterion("left_image <>", value, "leftImage");
            return (Criteria) this;
        }

        public Criteria andLeftImageGreaterThan(String value) {
            addCriterion("left_image >", value, "leftImage");
            return (Criteria) this;
        }

        public Criteria andLeftImageGreaterThanOrEqualTo(String value) {
            addCriterion("left_image >=", value, "leftImage");
            return (Criteria) this;
        }

        public Criteria andLeftImageLessThan(String value) {
            addCriterion("left_image <", value, "leftImage");
            return (Criteria) this;
        }

        public Criteria andLeftImageLessThanOrEqualTo(String value) {
            addCriterion("left_image <=", value, "leftImage");
            return (Criteria) this;
        }

        public Criteria andLeftImageLike(String value) {
            addCriterion("left_image like", value, "leftImage");
            return (Criteria) this;
        }

        public Criteria andLeftImageNotLike(String value) {
            addCriterion("left_image not like", value, "leftImage");
            return (Criteria) this;
        }

        public Criteria andLeftImageIn(List<String> values) {
            addCriterion("left_image in", values, "leftImage");
            return (Criteria) this;
        }

        public Criteria andLeftImageNotIn(List<String> values) {
            addCriterion("left_image not in", values, "leftImage");
            return (Criteria) this;
        }

        public Criteria andLeftImageBetween(String value1, String value2) {
            addCriterion("left_image between", value1, value2, "leftImage");
            return (Criteria) this;
        }

        public Criteria andLeftImageNotBetween(String value1, String value2) {
            addCriterion("left_image not between", value1, value2, "leftImage");
            return (Criteria) this;
        }

        public Criteria andRightImageIsNull() {
            addCriterion("right_image is null");
            return (Criteria) this;
        }

        public Criteria andRightImageIsNotNull() {
            addCriterion("right_image is not null");
            return (Criteria) this;
        }

        public Criteria andRightImageEqualTo(String value) {
            addCriterion("right_image =", value, "rightImage");
            return (Criteria) this;
        }

        public Criteria andRightImageNotEqualTo(String value) {
            addCriterion("right_image <>", value, "rightImage");
            return (Criteria) this;
        }

        public Criteria andRightImageGreaterThan(String value) {
            addCriterion("right_image >", value, "rightImage");
            return (Criteria) this;
        }

        public Criteria andRightImageGreaterThanOrEqualTo(String value) {
            addCriterion("right_image >=", value, "rightImage");
            return (Criteria) this;
        }

        public Criteria andRightImageLessThan(String value) {
            addCriterion("right_image <", value, "rightImage");
            return (Criteria) this;
        }

        public Criteria andRightImageLessThanOrEqualTo(String value) {
            addCriterion("right_image <=", value, "rightImage");
            return (Criteria) this;
        }

        public Criteria andRightImageLike(String value) {
            addCriterion("right_image like", value, "rightImage");
            return (Criteria) this;
        }

        public Criteria andRightImageNotLike(String value) {
            addCriterion("right_image not like", value, "rightImage");
            return (Criteria) this;
        }

        public Criteria andRightImageIn(List<String> values) {
            addCriterion("right_image in", values, "rightImage");
            return (Criteria) this;
        }

        public Criteria andRightImageNotIn(List<String> values) {
            addCriterion("right_image not in", values, "rightImage");
            return (Criteria) this;
        }

        public Criteria andRightImageBetween(String value1, String value2) {
            addCriterion("right_image between", value1, value2, "rightImage");
            return (Criteria) this;
        }

        public Criteria andRightImageNotBetween(String value1, String value2) {
            addCriterion("right_image not between", value1, value2, "rightImage");
            return (Criteria) this;
        }

        public Criteria andGameResultIsNull() {
            addCriterion("game_result is null");
            return (Criteria) this;
        }

        public Criteria andGameResultIsNotNull() {
            addCriterion("game_result is not null");
            return (Criteria) this;
        }

        public Criteria andGameResultEqualTo(Integer value) {
            addCriterion("game_result =", value, "gameResult");
            return (Criteria) this;
        }

        public Criteria andGameResultNotEqualTo(Integer value) {
            addCriterion("game_result <>", value, "gameResult");
            return (Criteria) this;
        }

        public Criteria andGameResultGreaterThan(Integer value) {
            addCriterion("game_result >", value, "gameResult");
            return (Criteria) this;
        }

        public Criteria andGameResultGreaterThanOrEqualTo(Integer value) {
            addCriterion("game_result >=", value, "gameResult");
            return (Criteria) this;
        }

        public Criteria andGameResultLessThan(Integer value) {
            addCriterion("game_result <", value, "gameResult");
            return (Criteria) this;
        }

        public Criteria andGameResultLessThanOrEqualTo(Integer value) {
            addCriterion("game_result <=", value, "gameResult");
            return (Criteria) this;
        }

        public Criteria andGameResultIn(List<Integer> values) {
            addCriterion("game_result in", values, "gameResult");
            return (Criteria) this;
        }

        public Criteria andGameResultNotIn(List<Integer> values) {
            addCriterion("game_result not in", values, "gameResult");
            return (Criteria) this;
        }

        public Criteria andGameResultBetween(Integer value1, Integer value2) {
            addCriterion("game_result between", value1, value2, "gameResult");
            return (Criteria) this;
        }

        public Criteria andGameResultNotBetween(Integer value1, Integer value2) {
            addCriterion("game_result not between", value1, value2, "gameResult");
            return (Criteria) this;
        }

        public Criteria andGuessStatusIsNull() {
            addCriterion("guess_status is null");
            return (Criteria) this;
        }

        public Criteria andGuessStatusIsNotNull() {
            addCriterion("guess_status is not null");
            return (Criteria) this;
        }

        public Criteria andGuessStatusEqualTo(Integer value) {
            addCriterion("guess_status =", value, "guessStatus");
            return (Criteria) this;
        }

        public Criteria andGuessStatusNotEqualTo(Integer value) {
            addCriterion("guess_status <>", value, "guessStatus");
            return (Criteria) this;
        }

        public Criteria andGuessStatusGreaterThan(Integer value) {
            addCriterion("guess_status >", value, "guessStatus");
            return (Criteria) this;
        }

        public Criteria andGuessStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("guess_status >=", value, "guessStatus");
            return (Criteria) this;
        }

        public Criteria andGuessStatusLessThan(Integer value) {
            addCriterion("guess_status <", value, "guessStatus");
            return (Criteria) this;
        }

        public Criteria andGuessStatusLessThanOrEqualTo(Integer value) {
            addCriterion("guess_status <=", value, "guessStatus");
            return (Criteria) this;
        }

        public Criteria andGuessStatusIn(List<Integer> values) {
            addCriterion("guess_status in", values, "guessStatus");
            return (Criteria) this;
        }

        public Criteria andGuessStatusNotIn(List<Integer> values) {
            addCriterion("guess_status not in", values, "guessStatus");
            return (Criteria) this;
        }

        public Criteria andGuessStatusBetween(Integer value1, Integer value2) {
            addCriterion("guess_status between", value1, value2, "guessStatus");
            return (Criteria) this;
        }

        public Criteria andGuessStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("guess_status not between", value1, value2, "guessStatus");
            return (Criteria) this;
        }
    }

    /**
     * 类注释
     * Criteria
     * 数据库表：world_cup_match_info
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
     * 数据库表：world_cup_match_info
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