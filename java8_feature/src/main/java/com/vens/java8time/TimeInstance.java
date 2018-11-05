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
        //�����ض�������
        LocalDate dayOfbirth=LocalDate.of(1995,03,20);
        //�ж����������Ƿ����
        today.equals(dayOfbirth);
        //����������¼�
        MonthDay monthDay = MonthDay.of(dayOfbirth.getMonth(),dayOfbirth.getDayOfMonth());
        MonthDay birthDay= MonthDay.of(today.getMonth(),today.getDayOfMonth());
        if(monthDay.equals(birthDay)){
            System.out.println("happay birth day!!!");
        }

        //��ȡ��ǰʱ��
        LocalTime time=LocalTime.now();
        //��һ��Сʱ
        LocalTime newTime=time.plusHours(1);
        //����һ�ܺ������
        LocalDate nextWeek=today.plus(1,ChronoUnit.WEEKS);
        //����һ��������
        LocalDate previous=today.minus(1,ChronoUnit.YEARS);
        //ʱ����
        Clock clock=Clock.systemUTC();
        Clock defaultClock=Clock.systemDefaultZone();
        //����ʱ�����Ƚ�
        today.equals(LocalDate.now(clock));
        //����ж���������
        today.isAfter(dayOfbirth);

        //https://blog.csdn.net/zhao_tuo/article/details/78626053



    }
}
