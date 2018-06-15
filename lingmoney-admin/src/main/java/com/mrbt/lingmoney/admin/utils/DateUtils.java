package com.mrbt.lingmoney.admin.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;

import com.mrbt.lingmoney.utils.AppCons;

/**
 * 日期辅助类  
 * 
 * @author lzp
 * 
 */
public class DateUtils {
	public static SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
	public static SimpleDateFormat sfM = new SimpleDateFormat("yyyy-MM");
	public static SimpleDateFormat sft = new SimpleDateFormat(
			"yyyy-MM-dd HH:mm:ss");

	private static SimpleDateFormat sfBiz = new SimpleDateFormat(
			"yyyyMMddHHmmss");
	public static SimpleDateFormat sf_m = new SimpleDateFormat("yyyyMMdd");
	
	public static SimpleDateFormat sf_t = new SimpleDateFormat("HHmmss");
	
	
	/**
	 * 返回当前时间
	 */
	public static String getTimeStr(){
		return sf_t.format(new Date());
	}
	/**
	 * 返回订单生成日期 yyyyMMdd
	 */
	public static String getDateStr(){
		return sf_m.format(new Date());
	}

	/**
	 * 购买的交易码日期(pattren='yyyyMMddHHmmss')
	 * 
	 * @param dt
	 * @return
	 */
	public static String getDateStrByBiz(Date dt) {
		return sfBiz.format(dt);
	}

	/**
	 * 生成日期类的字符串(pattren='yyyy-MM-dd')
	 * 
	 * @param dt
	 * @return
	 */
	public static String getDtStr(Date dt) {
		return getDtStr(dt, "yyyy-MM-dd");
	}

	/**
	 * 生成日期类的字符串(pattren='yyyy-MM-dd')
	 * 
	 * @param dt
	 * @return
	 */
	public static String getDtStr(Date dt, String pattren) {
		sf.applyPattern(pattren);
		return sf.format(dt);
	}
	
	
	public static String getDtStr(Date dt,SimpleDateFormat st) {
		return st.format(dt);
	}
	


	/**
	 * 格式化字符串，(pattren='yyyy-MM-dd HH:mm:ss')
	 * 
	 * @param strDt
	 * @return
	 */
	public static Date parseDate(String strDt) {
		try {
			return sft.parse(strDt);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 判断是否是16点以前的今天
	 * 
	 * @param dt
	 * @return
	 */
	public static boolean isToDay(Date dt) {
		Calendar c = Calendar.getInstance();
		c.setTime(dt);
		int hour = c.get(Calendar.HOUR_OF_DAY);
		int second = c.get(Calendar.SECOND);
		int minute = c.get(Calendar.MINUTE);
		// 包含16点整的都算今天
		return hour < AppCons.TRAD_HOUR
				|| (hour == AppCons.TRAD_HOUR && second == 0 && minute == 0) ? true
				: false;
	}

	/**
	 * 获取交易日期
	 * 
	 * @param dt
	 * @return
	 */
	public static Date getTradeDate(Date dt, HashMap<String, String> holiday) {
		if (isToDay(dt)) {
			return getWorkDay(dt, holiday);
		} else {
			Calendar c = Calendar.getInstance();
			c.setTime(dt);
			c.add(Calendar.DAY_OF_YEAR, 1);
			// c.set(Calendar.HOUR_OF_DAY, 0);
			return getWorkDay(c.getTime(), holiday);
		}
	}

	/**
	 * 获取卖出的交易日期
	 * 
	 * @param dt
	 * @param holiday
	 * @return
	 */
	public static Date getSellTradeDate(Date dt, HashMap<String, String> holiday) {
		Date valueDt = getTradeDate(dt, holiday);
		if (dt.getTime() == valueDt.getTime()) {
			Calendar c = Calendar.getInstance();
			c.setTime(valueDt);
			c.add(Calendar.DAY_OF_YEAR, -1);
			return new Date(c.getTimeInMillis());
		}
		return valueDt;
	}

	/**
	 * 返回整日，不包含时间，分，秒
	 * 
	 * @param dt
	 * @return
	 */
	public static Date getDay(Date dt) {
		Calendar c = Calendar.getInstance();
		c.setTime(dt);
		c.set(Calendar.HOUR, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		return c.getTime();
	}

	/**
	 * 判断是否为工作日
	 * 
	 * @param dt
	 */
	public static int isWorkDay(Date dt) {
		Calendar c = Calendar.getInstance();
		c.setTime(dt);
		return c.get(Calendar.DAY_OF_WEEK);
	}

	/**
	 * 获取下一个工作日
	 * 
	 * @param dt
	 *            当前日期
	 * @param holiday
	 *            节假日的map
	 * @return 递归操作返回非节假日
	 */
	public synchronized static  Date getWorkDay(Date dt, HashMap<String, String> holiday) {
		int dIndex = isWorkDay(dt);
		
		 SimpleDateFormat private_sf = new SimpleDateFormat("yyyy-MM-dd");
		  System.out.println("SF" + private_sf.format(dt));
		if (dIndex != 1 && dIndex != 7 && !holiday.containsKey(private_sf.format(dt))) {
			return dt;
		} else {
			Calendar c = Calendar.getInstance();
			c.setTime(dt);
			int addDay = 1;
			// 周六+2天
			if (dIndex == 7) {
				addDay = 2;
			}
			c.add(Calendar.DAY_OF_YEAR, addDay);
			return getWorkDay(c.getTime(), holiday);
		}
	}

	/**
	 * 添加天数
	 * 
	 * @param dt
	 * @param day
	 * @return
	 */
	public static Date addDay(Date dt, Integer day) {
		Calendar c = Calendar.getInstance();
		c.setTime(dt);
		c.add(Calendar.DAY_OF_YEAR, (day == null || day == 0) ? 1 : day);
		return c.getTime();
	}

	/**
	 * 添加月
	 * 
	 * @param dt
	 * @param m
	 * @return
	 */
	public static Date addMonth(Date dt, Integer m) {
		Calendar c = Calendar.getInstance();
		c.setTime(dt);
		c.add(Calendar.MONTH, (m == null || m == 0) ? 1 : m);
		return c.getTime();
	}

	/**
	 * 添加周
	 * 
	 * @param dt
	 * @param w
	 * @return
	 */
	public static Date addWeek(Date dt, Integer w) {
		Calendar c = Calendar.getInstance();
		c.setTime(dt);
		c.add(Calendar.WEEK_OF_YEAR, (w == null || w == 0) ? 1 : w);
		return c.getTime();
	}

	/**
	 * 日期相减，目标日期-原日期=天数
	 * 
	 * @param src
	 * @param dest
	 * @return
	 */
	public static int dateDiff(Date src, Date dest) {
		return (int) ((dest.getTime() - src.getTime()) / (24 * 60 * 60 * 1000));
	}

	/**
	 * 相差的月数
	 * 
	 * @param src
	 * @param dest
	 * @return
	 */
	public static int DateDiffByMonth(Date src, Date dest) {
		Calendar cs = Calendar.getInstance();
		cs.setTime(src);
		Calendar ds = Calendar.getInstance();
		ds.setTime(dest);
		int m_begin = cs.get(Calendar.MONTH) + 1; // 获得合同开始日期月份
		int m_end = ds.get(Calendar.MONTH) + 1;
		return m_end - m_begin
				+ (ds.get(Calendar.YEAR) - cs.get(Calendar.YEAR)) * 12;
	}

	public static void main(String[] args) throws ParseException {
		// HashMap<String, String> holiday = new HashMap<String, String>();
		// holiday.put("2015-05-25", "asdf");
		// holiday.put("2015-05-26", "asdf");
		// holiday.put("2015-05-27", "asdf");
		// holiday));
		Date dt = sf.parse("2015-3-25");
		Date dt1 = sf.parse("2015-4-31");
	}
	
	public static String getDateStr(Date dt , SimpleDateFormat dateFormat)
	{
		return dateFormat.format(dt);
	}
}
