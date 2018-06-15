package com.mrbt.lingmoney.model;

import java.io.Serializable;
import java.util.Date;

public class WorldCupMatchInfo implements Serializable {
    /**
     * 数据ID
     * 表字段 : world_cup_match_info.id
     */
    private Integer id;

    /**
     * 比赛日期
     * 表字段 : world_cup_match_info.match_date
     */
    private Date matchDate;

    /**
     * 比赛时间
     * 表字段 : world_cup_match_info.match_time
     */
    private Date matchTime;

    /**
     * 小组
     * 表字段 : world_cup_match_info.group_name
     */
    private String groupName;

    /**
     * 比赛队伍左
     * 表字段 : world_cup_match_info.left_team
     */
    private String leftTeam;

    /**
     * 比赛队伍右
     * 表字段 : world_cup_match_info.right_team
     */
    private String rightTeam;

    /**
     * 
     * 表字段 : world_cup_match_info.left_score
     */
    private Integer leftScore;

    /**
     * 
     * 表字段 : world_cup_match_info.right_score
     */
    private Integer rightScore;

    /**
     * 
     * 表字段 : world_cup_match_info.left_image
     */
    private String leftImage;

    /**
     * 
     * 表字段 : world_cup_match_info.right_image
     */
    private String rightImage;

    /**
     * 比赛结果,0未比三，1平，2left胜，3，right胜
     * 表字段 : world_cup_match_info.game_result
     */
    private Integer gameResult;

    /**
     * 竞猜状态，0初始状态，1开始竞猜，2已竞猜
     * 表字段 : world_cup_match_info.guess_status
     */
    private Integer guessStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table world_cup_match_info
     *
     * @mbg.generated
     */
    private static final long serialVersionUID = 1L;

    /**
     * 获取 数据ID 字段:world_cup_match_info.id
     *
     * @return world_cup_match_info.id, 数据ID
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置 数据ID 字段:world_cup_match_info.id
     *
     * @param id the value for world_cup_match_info.id, 数据ID
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取 比赛日期 字段:world_cup_match_info.match_date
     *
     * @return world_cup_match_info.match_date, 比赛日期
     */
    public Date getMatchDate() {
        return matchDate;
    }

    /**
     * 设置 比赛日期 字段:world_cup_match_info.match_date
     *
     * @param matchDate the value for world_cup_match_info.match_date, 比赛日期
     */
    public void setMatchDate(Date matchDate) {
        this.matchDate = matchDate;
    }

    /**
     * 获取 比赛时间 字段:world_cup_match_info.match_time
     *
     * @return world_cup_match_info.match_time, 比赛时间
     */
    public Date getMatchTime() {
        return matchTime;
    }

    /**
     * 设置 比赛时间 字段:world_cup_match_info.match_time
     *
     * @param matchTime the value for world_cup_match_info.match_time, 比赛时间
     */
    public void setMatchTime(Date matchTime) {
        this.matchTime = matchTime;
    }

    /**
     * 获取 小组 字段:world_cup_match_info.group_name
     *
     * @return world_cup_match_info.group_name, 小组
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * 设置 小组 字段:world_cup_match_info.group_name
     *
     * @param groupName the value for world_cup_match_info.group_name, 小组
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName == null ? null : groupName.trim();
    }

    /**
     * 获取 比赛队伍左 字段:world_cup_match_info.left_team
     *
     * @return world_cup_match_info.left_team, 比赛队伍左
     */
    public String getLeftTeam() {
        return leftTeam;
    }

    /**
     * 设置 比赛队伍左 字段:world_cup_match_info.left_team
     *
     * @param leftTeam the value for world_cup_match_info.left_team, 比赛队伍左
     */
    public void setLeftTeam(String leftTeam) {
        this.leftTeam = leftTeam == null ? null : leftTeam.trim();
    }

    /**
     * 获取 比赛队伍右 字段:world_cup_match_info.right_team
     *
     * @return world_cup_match_info.right_team, 比赛队伍右
     */
    public String getRightTeam() {
        return rightTeam;
    }

    /**
     * 设置 比赛队伍右 字段:world_cup_match_info.right_team
     *
     * @param rightTeam the value for world_cup_match_info.right_team, 比赛队伍右
     */
    public void setRightTeam(String rightTeam) {
        this.rightTeam = rightTeam == null ? null : rightTeam.trim();
    }

    /**
     * 获取  字段:world_cup_match_info.left_score
     *
     * @return world_cup_match_info.left_score, 
     */
    public Integer getLeftScore() {
        return leftScore;
    }

    /**
     * 设置  字段:world_cup_match_info.left_score
     *
     * @param leftScore the value for world_cup_match_info.left_score, 
     */
    public void setLeftScore(Integer leftScore) {
        this.leftScore = leftScore;
    }

    /**
     * 获取  字段:world_cup_match_info.right_score
     *
     * @return world_cup_match_info.right_score, 
     */
    public Integer getRightScore() {
        return rightScore;
    }

    /**
     * 设置  字段:world_cup_match_info.right_score
     *
     * @param rightScore the value for world_cup_match_info.right_score, 
     */
    public void setRightScore(Integer rightScore) {
        this.rightScore = rightScore;
    }

    /**
     * 获取  字段:world_cup_match_info.left_image
     *
     * @return world_cup_match_info.left_image, 
     */
    public String getLeftImage() {
        return leftImage;
    }

    /**
     * 设置  字段:world_cup_match_info.left_image
     *
     * @param leftImage the value for world_cup_match_info.left_image, 
     */
    public void setLeftImage(String leftImage) {
        this.leftImage = leftImage == null ? null : leftImage.trim();
    }

    /**
     * 获取  字段:world_cup_match_info.right_image
     *
     * @return world_cup_match_info.right_image, 
     */
    public String getRightImage() {
        return rightImage;
    }

    /**
     * 设置  字段:world_cup_match_info.right_image
     *
     * @param rightImage the value for world_cup_match_info.right_image, 
     */
    public void setRightImage(String rightImage) {
        this.rightImage = rightImage == null ? null : rightImage.trim();
    }

    /**
     * 获取 比赛结果,0未比三，1平，2left胜，3，right胜 字段:world_cup_match_info.game_result
     *
     * @return world_cup_match_info.game_result, 比赛结果,0未比三，1平，2left胜，3，right胜
     */
    public Integer getGameResult() {
        return gameResult;
    }

    /**
     * 设置 比赛结果,0未比三，1平，2left胜，3，right胜 字段:world_cup_match_info.game_result
     *
     * @param gameResult the value for world_cup_match_info.game_result, 比赛结果,0未比三，1平，2left胜，3，right胜
     */
    public void setGameResult(Integer gameResult) {
        this.gameResult = gameResult;
    }

    /**
     * 获取 竞猜状态，0初始状态，1开始竞猜，2已竞猜 字段:world_cup_match_info.guess_status
     *
     * @return world_cup_match_info.guess_status, 竞猜状态，0初始状态，1开始竞猜，2已竞猜
     */
    public Integer getGuessStatus() {
        return guessStatus;
    }

    /**
     * 设置 竞猜状态，0初始状态，1开始竞猜，2已竞猜 字段:world_cup_match_info.guess_status
     *
     * @param guessStatus the value for world_cup_match_info.guess_status, 竞猜状态，0初始状态，1开始竞猜，2已竞猜
     */
    public void setGuessStatus(Integer guessStatus) {
        this.guessStatus = guessStatus;
    }

    /**
     * ,world_cup_match_info
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", matchDate=").append(matchDate);
        sb.append(", matchTime=").append(matchTime);
        sb.append(", groupName=").append(groupName);
        sb.append(", leftTeam=").append(leftTeam);
        sb.append(", rightTeam=").append(rightTeam);
        sb.append(", leftScore=").append(leftScore);
        sb.append(", rightScore=").append(rightScore);
        sb.append(", leftImage=").append(leftImage);
        sb.append(", rightImage=").append(rightImage);
        sb.append(", gameResult=").append(gameResult);
        sb.append(", guessStatus=").append(guessStatus);
        sb.append("]");
        return sb.toString();
    }
}