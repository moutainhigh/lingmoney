package com.mrbt.lingmoney.admin.utils;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import com.mrbt.lingmoney.model.schedule.ScheduleJob;

/**
 * 
 * @Description: 计划任务执行处 无状态
 * @author 
 * @date 2016.12
 */
public class QuartzJobFactory implements Job {

	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
		ScheduleJob scheduleJob = (ScheduleJob) context.getMergedJobDataMap().get("scheduleJob");
		TaskUtils.invokMethod(scheduleJob);
	}
}
