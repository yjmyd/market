package com.sell.market.utils;

import com.alibaba.fastjson.JSONArray;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.Minutes;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author liudan@huimin100.cn
 * @Title SettlPurchaseController
 * @Copyright: Copyright (c) 2017
 * @Description: 日期处理类
 * @Company: huimin.cn
 * @Created on 2017/9/7 19:26
 */
public class JodaDateUtils {

  private static final Logger logger = LoggerFactory.getLogger(JodaDateUtils.class);
  public static final DateTimeFormatter shortDateFormatter = DateTimeFormat.forPattern("yyyyMMdd");
  public static final DateTimeFormatter shortDateFormatter1 = DateTimeFormat.forPattern("yyMMdd");
  public static final DateTimeFormatter shortDateFormatter2 = DateTimeFormat
      .forPattern("yyyy/MM/dd");
  public static final DateTimeFormatter dateFormatter = DateTimeFormat.forPattern("yyyy-MM-dd");
  public static final DateTimeFormatter dateYearMonthFormatter = DateTimeFormat
      .forPattern("yyyy-MM");
  public static final DateTimeFormatter dateTimeFormatter = DateTimeFormat
      .forPattern("yyyy-MM-dd HH:mm");
  public static final DateTimeFormatter longDateTimeFormatter = DateTimeFormat
      .forPattern("yyyyMMddHHmmss");
  public static final DateTimeFormatter dateTimeFormatter2 = DateTimeFormat
      .forPattern("yyyy-MM-dd HH:mm:ss");
  public static final DateTimeFormatter timeFormatter = DateTimeFormat.forPattern("HH:mm:ss");
  public static final DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

  public static final long ONE_DAY = 24L * 60 * 60 * 1000;
  public static final long ONE_HOUR = 60L * 60 * 1000;
  public static final long ONE_MINUTE = 60L * 1000;

  public static DateTime parseDate(String dateStr, DateTimeFormatter formatter) {
    return parseDate(dateStr, formatter, true);

  }

  public static DateTime parseDate(String dateStr, DateTimeFormatter formatter, boolean isLog) {
    DateTime dateTime = null;
    try {
      dateTime = formatter.parseDateTime(dateStr);
    } catch (Exception e) {
      if (isLog) {
        logger.error("Error in parse date: " + dateStr + "! ", e);
      }
    }
    return dateTime;
  }

  public static String formateShortDate(long msec) {
    DateTime dateTime = new DateTime(msec);
    return formatDate(dateTime, dateFormatter);
  }

  /**
   * 解析格式如"14:00"的时间
   */
  public static DateTime parseTime(String timeStr) {
    return parseDate(timeStr, timeFormatter);
  }

  /**
   * 解析格式如"2014-06-24"的日期
   */
  public static DateTime parseDate(String dateStr) {
    return parseDate(dateStr, dateFormatter);
  }

  /**
   * 解析格式如"20140624"的日期
   */
  public static DateTime parseShortDate(String dateStr) {
    return parseDate(dateStr, shortDateFormatter);
  }

  /**
   * 解析格式如"2014/06/24"的日期
   */
  public static DateTime parseShortDate2(String dateStr) {
    return parseDate(dateStr, shortDateFormatter2);
  }

  /**
   * 解析格式如"2014-06-24 08:30"的时间
   */
  public static DateTime parseDateTime(String dateTimeStr) {
    return parseDate(dateTimeStr, dateTimeFormatter);
  }

  /**
   * 解析格式如"201411301630"的时间
   */
  public static DateTime parseLongDateTime(String dateTimeStr) {
    return parseDate(dateTimeStr, longDateTimeFormatter);
  }

  /**
   * 解析格式如"2015-01-27 13:34:12"的时间
   */
  public static DateTime parseDateTime2(String dateTimeStr) {
    return parseDate(dateTimeStr, dateTimeFormatter2);
  }

  public static boolean isValidDateString(String dateStr) {
    return parseDate(dateStr, dateFormatter, false) != null;
  }

  /**
   * HHmm -> HH:mm
   */
  public static String transformTimeInt(String timeIntStr) {
    if (StringUtils.isEmpty(timeIntStr)) {
      return "";
    }
    if (timeIntStr.length() != 4 || timeIntStr.indexOf(":") != -1) {
      return timeIntStr;
    }
    return (new StringBuffer()).append(timeIntStr.substring(0, 2)).append(":")
        .append(timeIntStr.substring(2)).toString();
  }

  /**
   * yyyyMMdd -> yyyy-MM-dd
   */
  public static String transformDateInt(String dateIntStr) {
    if (StringUtils.isEmpty(dateIntStr)) {
      return "";
    }
    if (dateIntStr.length() != 8) {
      return dateIntStr;
    }
    return dateIntStr.substring(0, 4) + "-" + dateIntStr.substring(4, 6) + "-" + dateIntStr
        .substring(6);
  }


  /**
   * 时间差，返回差值分钟数
   */
  public static int getTimeInterval(DateTime d1, DateTime d2) {
    return Minutes.minutesBetween(d1, d2).getMinutes();
  }

  /**
   * 将string型date转long
   */
  public static long parseString2TimeLong(String dateStr, DateTimeFormatter formatter) {
    long datelong = 0;
    try {
      DateTime dateTime = parseDate(dateStr, formatter);
      if (null != dateTime) {
        datelong = dateTime.getMillis();
      }
    } catch (Exception e) {
      logger.error("Error in parse date long: " + datelong + "! ", e);
    }
    return datelong;
  }


  /**
   * 将long型date转string
   */
  public static String parseLong2String(long datelong, DateTimeFormatter formatter) {
    DateTime dateTime = null;
    try {
      dateTime = new DateTime(datelong);
      if (null == formatter) {
        formatter = dateFormatter;
      }
      return dateTime.toString(formatter);

    } catch (Exception e) {
      logger.error("Error in parse date long: " + datelong + "! ", e);
    }
    return null;
  }


  /**
   * 转换成格式【yyyy年MM月dd日HH:mm】
   *
   * @return 2014年12月22日14:48
   * @date 2014-12-22 下午2:48:23
   */
  public static String getCNDate(Date date) {
    DateTime dt = new DateTime(date);
    String cnDate = dt.toString("yyyy年MM月dd日HH:mm");
    return cnDate;
  }

  /**
   * 用指定格式，格式化java.util.Date
   *
   * @param date java.util.Date
   */
  public static String formatDate(Date date, DateTimeFormatter formatter) {
    if (null == date) {
      return "";
    }
    DateTime datetime = new DateTime(date.getTime());
    return formatDate(datetime, formatter);
  }

  public static Date fromStringToDate(String time) {
    if (StringUtils.isBlank(time)) {
      return null;
    }
    Date date = null;
    try {
      date = dateFormat.parse(time);
    } catch (ParseException e) {
      e.printStackTrace();
    }
    return date;
  }

  public static String fromDateToString(Date time) {
    if (time == null) {
      return null;
    }
    return dateFormat.format(time);
  }

  /**
   * 格式化java.util.Date 为 “yyyy-MM-dd HH:mm”
   *
   * @param date java.util.Date
   */
  public static String formatDateTime(Date date) {
    return formatDate(date, dateTimeFormatter);
  }

  /**
   * 格式化java.util.Date 为 “yyyy-MM-dd HH:mm:ss”
   *
   * @param date java.util.Date
   */
  public static String formatDateTime2(Date date) {
    return formatDate(date, dateTimeFormatter2);
  }

  /**
   * 格式化java.util.Date 为 “yyyyMMdd”
   *
   * @param date java.util.Date
   */
  public static String formatshortDate(Date date) {
    return formatDate(date, shortDateFormatter);
  }

  /**
   * 将日期转为YYMMdd格式的字符串
   */
  public static String formatshortDate1(Date date) {
    return formatDate(date, shortDateFormatter1);
  }

  /**
   * 格式化java.util.Date 为 “yyyy/MM/dd”
   *
   * @param date java.util.Date
   */
  public static String formatshortDate2(Date date) {
    return formatDate(date, shortDateFormatter2);
  }

  /**
   * 格式化java.util.Date 为 “yyyy-MM-dd”
   *
   * @param date java.util.Date
   */
  public static String formatDate(Date date) {
    return formatDate(date, dateFormatter);
  }

  public static String formatYeanMonthDate(Date date) {
    return formatDate(date, dateYearMonthFormatter);
  }

  /**
   * 将日期转为YYYY-MM-dd格式的字符串
   */
  public static String formatDate(DateTime datetime) {
    return formatDate(datetime, dateFormatter);
  }

  /**
   * 将日期转为YYYY-MM-dd格式的字符串
   */
  public static String formatShortDate(DateTime datetime) {
    return formatDate(datetime, shortDateFormatter);
  }

  /**
   * 将日期转为YYYY/MM/dd格式的字符串
   */
  public static String formatShortDate2(DateTime datetime) {
    return formatDate(datetime, shortDateFormatter2);
  }

  /**
   * 将日期转为HH:mm:ss格式的字符串
   */
  public static String formatTime(Date datetime) {
    return formatDate(datetime, timeFormatter);
  }

  /**
   * 将日期转为指定格式的字符串
   */
  public static String formatDate(DateTime datetime, DateTimeFormatter dateFormatter) {
    return dateFormatter.print(datetime);
  }


  /**
   * 计算date1和date2之间的跨天数 (默认取绝对值)
   *
   * @param date1 格式： yyyy-MM-dd
   * @param date2 格式： yyyy-MM-dd
   */
  public static int daysBetween(String date1, String date2) {
    return daysBetween(date1, date2, true);
  }

  /**
   * 计算date1和date2之间的跨天数
   *
   * @param date1 格式： yyyy-MM-dd
   * @param date2 格式： yyyy-MM-dd
   * @param abs 是否对跨天数取绝对值
   */
  public static int daysBetween(String date1, String date2, boolean abs) {
    if (StringUtils.isEmpty(date1) || StringUtils.isEmpty(date2)) {
      return 0;
    }
    try {
      DateTime d1 = parseDate(date1);
      DateTime d2 = parseDate(date2);
      long t1 = d1.getMillis();
      long t2 = d2.getMillis();
      long interval = t2 - t1;
      if (abs) {
        interval = Math.abs(interval);
      }
      return (int) (interval / (1000 * 60 * 60 * 24));
    } catch (Exception e) {
      return 0;
    }
  }

  /***
   * 判断一个日期是否在2个日期直接，包含开始和结束日期。
   * @param middleDate 中间日期
   * @param dayStartDate 开始日期
   * @param dayEndDate 结束日期
   * @return true or false
   */
  public static boolean dayBetweenDayAndDay(String middleDate, String dayStartDate,
      String dayEndDate) {
    boolean flag = false;
    if (StringUtils.isBlank(middleDate) || StringUtils.isBlank(dayStartDate) || StringUtils
        .isBlank(dayEndDate)) {
      return flag;
    }
    DateTime mDate = parseDate(middleDate);
    DateTime sDate = parseDate(dayStartDate);
    DateTime eDate = parseDate(dayEndDate);
    long t1 = mDate.getMillis();
    long t2 = sDate.getMillis();
    long t3 = eDate.getMillis();
    if (t1 >= t2 && t1 <= t3) {
      flag = true;
    }
    return flag;
  }

  /**
   * 2015-01-25 -> (int)20150115
   */
  public static int getDateInt(String date) {
    return Integer.parseInt(date.replaceAll("-", ""));
  }

  /**
   * 将短整形的日期(20150128) 转为 普通日期格式(2015-01-28)
   */
  public static String shortDate2Normal(String shortDate) {
    if (null == shortDate || "".equals(shortDate.trim())) {
      return null;
    }
    try {
      DateTime datetime = parseDate(shortDate, shortDateFormatter);
      return formatDate(datetime, JodaDateUtils.dateFormatter);
    } catch (Exception e) {
      logger.error("invalid input date format. input: {}", shortDate);
    }
    return null;
  }

  public static void main(String[] args) {
////		double a = 13/60;
////		double b = (13*100.0)/(60*100);
////		System.out.println(a);
////		System.out.println(b);
////		long datelong = DateTime.now().getMillis();
////		String dateStr = "2015-01-20";
////		String shortDateStr = "20150915";
////		System.out.println(datelong);
////		System.out.println(parseLong2String(datelong, dateFormatter));
////		System.out.println(parseString2Long("2014-11-30", dateFormatter));
////		System.out.println(parseLongDateTime("20141130163059"));
////		System.out.println(parseString2Long("20141130", shortDateFormatter));
////		System.out.println(DateUtils.parseString2TimeLong(shortDateStr, DateUtils.shortDateFormatter));
////		System.out.println(StringUtils.replace(dateStr, "-", ""));
////		System.out.println(parseDate("2015-01-21 12:55"));
////		System.out.println(shortDate2Normal("20150128"));
////		System.out.println(getCNDate(new Date()));
////		System.out.println(DateUtils.parseDateTime("2015-01-28 22:46").toDate());
////		System.out.println(DateUtils.parseDate("2015-01-21 12:55", DateUtils.dateTimeFormatter).toDate());
////		System.out.println(formatDateTime(new Date()));
////        System.out.println(formatStartDate("2017-10-10"));
////        System.out.println(formatEndDate("2017-10-11"));
////        System.out.println(compareDate("2017-07-13 00:00:00","2017-07-14 00:00:00"));
////        System.out.println(JodaDateUtils.isValidDataTimeHours("00:00"));
////        System.out.println(dayBetweenDayAndDay("2017-07-25","2017-07-21","2017-07-25"));
////        System.out.println(parseDateTime2("2017-07-25 00:00:00").toDate());
////        Date stopTime = JodaDateUtils.parseDateTime2("2017-08-08 00:00:00").toDate();
////        Date dd = JodaDateUtils.parseDate(JodaDateUtils.formatDate(new Date())).toDate();
////        System.out.println(stopTime);
////        System.out.println(dd);
////        System.out.println(stopTime.compareTo(dd));
//        System.out.println(getBeforeFirstMonthdate(-1));
////        System.out.println(getBfLastDayMonthDate(0));
////        System.out.println(formatYeanMonthDate(new Date())+"-10");
    System.out.println(getMonthList());
  }


  /**
   * 当前日期时间字符串 yyyy-MM-dd HH:mm
   */
  public static String getCurrentDateTime() {
    DateTime dateTime = new DateTime();
    return dateTime.toString(dateTimeFormatter);
  }

  /**
   * 当前日期时间字符串 yyyy-MM-dd HH:mm:ss
   */
  public static String getCurrentDateTime2() {
    DateTime dateTime = new DateTime();
    return dateTime.toString(dateTimeFormatter2);
  }

  /**
   * 当前日期时间字符串 yyyy-MM-dd
   */
  public static String getCurrentDate() {
    DateTime dateTime = DateTime.now();
    return dateTime.toString(dateFormatter);
  }


  /**
   * 获取类似于yyyy-MM-dd
   */
  public static String getShortDate(DateTime dateTime) {
    return dateTime.toString(dateFormatter);
  }


  public static boolean isValidDataTimeHours(String dateTime) {
    try {
      if (StringUtils.isBlank(dateTime)) {
        return false;
      }
      String hoursStr = dateTime.substring(0, 2);
      int hours = Integer.parseInt(hoursStr);
      if (hours < 0 || hours > 23) {
        return false;
      }
      String minutesStr = dateTime.substring(dateTime.length() - 2);
      int minutes = Integer.parseInt(minutesStr);
      if (minutes < 0 || minutes > 59) {
        return false;
      }

    } catch (Exception e) {
      return false;
    }
    return true;
  }

  /**
   * 格式化查询开始日期
   */
  public static String formatStartDate(String startDate) {
    if (StringUtils.isNotBlank(startDate)) {
      return startDate + " 00:00:00";
    }
    return startDate;
  }

  /**
   * 格式化查询结束日期
   */
  public static String formatEndDate(String endDate) {
    if (StringUtils.isNotBlank(endDate)) {
      return endDate + " 23:59:59";
    }
    return endDate;
  }

  public static String format10minNearEndDate(String endDate) {
    if (StringUtils.isNotBlank(endDate)) {
      return endDate + " 23:50:00";
    }
    return endDate;
  }

  /**
   * 获取当前时间 后两两个月的日期
   *
   * @param monthNum 后几个月
   */
  public static String twoMonthLaterDate(Integer monthNum) {
    Calendar c = Calendar.getInstance();
    c.add(Calendar.MONTH, monthNum);
    return formatDate(c.getTime(), dateFormatter);
  }

  /**
   * 判断两个时间大小
   */
  public static int compareDate(String date1, String date2) {
    try {
      DateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
      Date dt1 = df.parse(date1);
      Date dt2 = df.parse(date2);
      if (dt1.getTime() > dt2.getTime()) {
        return -1; //date1 在 date2 后
      } else if (dt1.getTime() < dt2.getTime()) {
        return 1; //date1 在 date2 前
      } else if (dt1.getTime() == dt2.getTime()) {
        return 2; //date1 在 date2 相等
      } else {
        return 0;//异常了
      }
    } catch (Exception ex) {
      ex.printStackTrace();
    }
    return 0;
  }


  /**
   * 获取传入日期的差值 比如获取传入日期前四天的日期 day=-4即可,反之亦然
   */
  public static String getSomeDayDate(String date, String day) {
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(parseDate(date).toDate());
    if (StringUtils.isNotBlank(day)) {
      calendar.add(Calendar.DATE, Integer.valueOf(day));
    } else {
      calendar.add(Calendar.DATE, 0);
    }
    return formatDate(calendar.getTime(), dateFormatter);
  }

  public static int getDateInterval(String startDate, String endDate)
      throws RuntimeException {
    SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    Calendar cal1 = Calendar.getInstance();
    Calendar cal2 = Calendar.getInstance();
    Date date1, date2;
    try {
      date1 = formatter.parse(startDate);
      date2 = formatter.parse(endDate);
      cal1.setTime(date1);
      cal2.setTime(date2);
      return cal2.get(Calendar.DAY_OF_YEAR)
          - cal1.get(Calendar.DAY_OF_YEAR);
    } catch (ParseException e) {
      throw new RuntimeException(e);
    }
  }

  /**
   * 根据传入日期获取指定天数（前后）时间
   *
   * @param num <0表示之前 ==0表示当天 >0表示之后
   */
  public static String getDateWithNum(Date date, int num) {
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(date);
    calendar.set(Calendar.DATE, calendar.get(Calendar.DATE) + num);
    return formatDateTime2(calendar.getTime());
  }

  /**
   * 获取上/下个月的第N天 几号
   *
   * @param difmonths “-” 取上几个月
   * @param difdays 几号
   */
  public static String getBfOrAfMonthDate(int difmonths, int difdays) {
    Calendar calendar = Calendar.getInstance();
    calendar.add(Calendar.MONTH, difmonths);
    calendar.set(Calendar.DAY_OF_MONTH, difdays);
    return formatDate(calendar.getTime(), dateFormatter);
  }

  /**
   * 获取月的最后一天
   *
   * @param expectMonth 预期月份，例：上一个月就传入-1，后一个月就传入1，当月就传0
   */
  public static String getBfLastDayMonthDate(int expectMonth) {
    Calendar calendar = Calendar.getInstance();
    int month = calendar.get(Calendar.MONTH);
    calendar.set(Calendar.MONTH, month + (expectMonth));
    calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
    return formatDate(calendar.getTime(), dateFormatter);
  }

  /**
   * 获取月的第一天
   *
   * @param expectMonth 预期月份，例：上一个月就传入-1，后一个月就传入1，当月就传0
   */
  public static String getBeforeFirstMonthdate(int expectMonth) {
    Calendar calendar = Calendar.getInstance();
    calendar.add(Calendar.MONTH, expectMonth);
    calendar.set(Calendar.DAY_OF_MONTH, 1);
    return formatDate(calendar.getTime(), dateFormatter);
  }

  public static long getDiffInTwoTime(String time1, String time2) {
    Date date1 = JodaDateUtils.fromStringToDate(time1);
    Date date2 = JodaDateUtils.fromStringToDate(time2);
    long l = date1.getTime() - date2.getTime();
    return l;
  }

  /**
   * 取得指定日期所在月
   *
   * @param date 指定日期
   */
  public static int getMonth(Date date) {
    Calendar c = new GregorianCalendar();
    c.setTime(date);
    return c.get(Calendar.MONTH) + 1;
  }

  /**
   * 取得指定日期的当前天
   *
   * @param date 指定日期
   */
  public static int getDate(Date date) {
    Calendar c = new GregorianCalendar();
    c.setTime(date);
    return c.get(Calendar.DATE);
  }
  /**
   * 功能：得到当前年份年初 格式为：xxxx-yy-zz (eg: 2007-01-01)<br>
   *
   * @return String
   * @author pure
   */
  public static String getYear() {
    Calendar localTime = Calendar.getInstance();
    int x = localTime.get(Calendar.YEAR);
    return x + "-01";
  }

  /**
   * 获取当年月份列表
   * @return
   */
  public static List getMonthList() {
    Date d1 = null;//定义起始日期
    List<String> month = new ArrayList();
    try {
      d1 = new SimpleDateFormat("yyyy-MM").parse(getYear());
      Date d2 = new SimpleDateFormat("yyyy-MM").parse(getBeforeFirstMonthdate(1));//定义结束日期
      Calendar dd = Calendar.getInstance();//定义日期实例
      dd.setTime(d1);//设置日期起始时间
      while (dd.getTime().before(d2)) {//判断是否到结束日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
        String str = sdf.format(dd.getTime());
        month.add(str);
        dd.add(Calendar.MONTH, 1);//进行当前日期月份加1
      }
    } catch (ParseException e) {
      e.printStackTrace();
    }
    return month;
  }

}
