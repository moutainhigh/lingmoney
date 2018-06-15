package com.mrbt.lingmoney.web2.controller.bank;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mrbt.lingmoney.service.bank.SingleBiddingResultService;
import com.mrbt.lingmoney.utils.PageInfo;
import com.mrbt.lingmoney.utils.ResultParame.ResultInfo;
import com.mrbt.lingmoney.web2.controller.BaseController;
import com.mrbt.lingmoney.web2.controller.common.CommonMethodUtil;

/**
 * 单笔投标结果查询
 * 
 * @author lihq
 * @date 2017年6月6日 上午9:42:53
 * @description
 * @version 1.0
 * @since 2017-04-12
 */
@Controller
@RequestMapping("/bank")
public class SingleBiddingResultController extends BaseController {
	private static final Logger LOGGER = LogManager.getLogger(SingleBiddingResultController.class);
	@Autowired
	private SingleBiddingResultService singleBiddingResultService;

	/**
	 * 用户发起投标结果查询请求
	 * 
	 * @param token
	 *            用户token
	 * @param number
	 *            交易流水号
	 * @return pageInfo
	 */
	@RequestMapping("/singleBiddingResult")
    public @ResponseBody Object singleBiddingResult(HttpServletRequest request, String number) {
		LOGGER.info("用户发起投标结果查询请求");
		PageInfo pageInfo = new PageInfo();
		String uId = null;
		try {
            uId = CommonMethodUtil.getUidBySession(request);
            if (StringUtils.isEmpty(uId)) {
                pageInfo.setResultInfo(ResultInfo.LOGIN_OVERTIME);
            } else {
				pageInfo = singleBiddingResultService.requestSingleBiddingResult(CLIENT_TYPE, APP_ID, uId, number);
            }

		} catch (Exception e) {
			pageInfo.setCode(ResultInfo.SERVER_ERROR.getCode());
			pageInfo.setMsg(ResultInfo.SERVER_ERROR.getMsg());
		}

		return pageInfo;
	}

}
