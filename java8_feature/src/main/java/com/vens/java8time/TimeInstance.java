package com.vens.java8time;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.temporal.ChronoUnit;

/**
 * @author LuZhiqing
 * @Description:
 * @date 2018/10/23
 */
public class TimeInstance {
    public static void main(String[] args) {
        LocalDate today=LocalDate.now();
        int year = today.getYear();
        int month = today.getMonthValue();
        int day=today.getDayOfMonth();
        System.out.printf("Year : %d  Month : %d  day : %d t %n", year, month, day);
        //处理特定的日期
        LocalDate dayOfbirth=LocalDate.of(1995,03,20);
        //判断两个日期是否相等
        today.equals(dayOfbirth);
        //检查周期性事件
        MonthDay monthDay = MonthDay.of(dayOfbirth.getMonth(),dayOfbirth.getDayOfMonth());
        MonthDay birthDay= MonthDay.of(today.getMonth(),today.getDayOfMonth());
        if(monthDay.equals(birthDay)){
            System.out.println("happay birth day!!!");
        }

        //获取当前时间
        LocalTime time=LocalTime.now();
        //加一个小时
        LocalTime newTime=time.plusHours(1);
        //计算一周后的日期
        LocalDate nextWeek=today.plus(1,ChronoUnit.WEEKS);
        //计算一年后的日期
        LocalDate previous=today.minus(1,ChronoUnit.YEARS);
        //时钟类
        Clock clock=Clock.systemUTC();
        Clock defaultClock=Clock.systemDefaultZone();
        //基于时钟作比较
        today.equals(LocalDate.now(clock));
        //如何判断早于晚于
        today.isAfter(dayOfbirth);

        //https://blog.csdn.net/zhao_tuo/article/details/78626053



    }
}
