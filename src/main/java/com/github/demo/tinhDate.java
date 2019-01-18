package com.github.demo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class tinhDate {
    public static void main(String[] args) {
        DateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yyyy");

        Date currentDate = new Date();
        Date date1 = null;
        Date date2 = null;

        try {
            String startDate = "01-01-2016";
            String endDate = "01-01-2017";

            date1 = simpleDateFormat.parse(startDate);
            date2 = simpleDateFormat.parse(endDate);

            long getDiff = date2.getTime() - date1.getTime();

            long getDaysDiff = getDiff / (24 * 60 * 60 * 1000);

            System.out.println("Differance between date " + startDate + " and " + endDate + " is " + getDaysDiff + " days.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
