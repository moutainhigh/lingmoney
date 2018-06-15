package com.mrbt.lingmoney.admin.controller.task;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mrbt.lingmoney.admin.service.bank.AccountRechargeService;
import com.mrbt.lingmoney.admin.service.schedule.ScheduleService;
import com.mrbt.lingmoney.mapper.AccountFlowMapper;
import com.mrbt.lingmoney.model.AccountFlow;
import com.mrbt.lingmoney.model.AccountFlowExample;
import com.mrbt.lingmoney.utils.PageInfo;
import com.mrbt.lingmoney.utils.ResultParame.ResultInfo;

/**
 * 自动查询充值结果
 * 
 * @author lihq
 * @date 2017年7月1日 下午3:20:59
 * @description
 * @version 1.0
 * @since 2017-04-12
 */
@Component
public class AutoQueryAccountRechargeResult {
	private static final Logger LOGGER = LogManager.getLogger(AutoQueryAccountRechargeResult.class);

	@Autowired
	private AccountFlowMapper accountFlowMapper;
	@Autowired
	private AccountRechargeService accountRechargeService;
	@Autowired
	private ScheduleService scheduleService;

	/**
	 * 执行方法
	 * @throws ParseException	ParseException
	 */	
	public void handelAccountRechargeResult() throws ParseException {
		LOGGER.info("自动查询充值结果定时任务开始执行。。。。");
		scheduleService.saveScheduleLog(null, "自动查询充值结果定时任务开始执行", null);
		
		AccountFlowExample example = new AccountFlowExample();
		example.createCriteria().andStatusEqualTo(0).andTypeEqualTo(0).andOperateTimeGreaterThan(new SimpleDateFormat("yyyy-MM-dd").parse("2017-07-01"));
		List<AccountFlow> list = accountFlowMapper.selectByExample(example);

		if (list != null && list.size() > 0) {
			for (AccountFlow accountFlow : list) {
				PageInfo pi = new PageInfo();
				try {
					pi = accountRechargeService.queryAccountRecharge(null, accountFlow.getNumber(), "PC");
				} catch (Exception e) {
					e.printStackTrace();
					pi.setCode(ResultInfo.SERVER_ERROR.getCode());
					pi.setMsg("自动查询充值结果查询失败，失败原因是" + e.getMessage());
				}

				if (pi.getCode() == ResultInfo.SUCCESS.getCode()) {
					LOGGER.info("处理成功");

					scheduleService.saveScheduleLog(null, "自动查询充值结果查询成功，充值记录编号：" + accountFlow.getId(), null);
				} else {
					LOGGER.info("处理失败");

					scheduleService.saveScheduleLog(null, "自动查询充值结果查询失败，充值记录编号：" + accountFlow.getId(), pi.getMsg());
				}
			}
		}

		LOGGER.info("自动查询充值结果定时任务执行完毕。。。。");
		scheduleService.saveScheduleLog(null, "自动查询充值结果定时任务开始执行", null);
	}

}
