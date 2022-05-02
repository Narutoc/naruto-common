package com.local.naruto.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class DateUtils {

    private static final String FULL_DATE_FORMAT = "yyyy-MM-dd HH:mm";
    private static final String YMD_DATE_FORMAT = "yyyy-MM-dd";

    public static String getUtcTime() {
        SimpleDateFormat dateFormatGmt = new SimpleDateFormat(FULL_DATE_FORMAT);
        dateFormatGmt.setTimeZone(TimeZone.getTimeZone("GMT"));
        return dateFormatGmt.format(new Date());
    }

    public static boolean compareDate(String start, String end) throws ParseException {
        DateFormat format = new SimpleDateFormat(FULL_DATE_FORMAT);
        Date startDate = format.parse(start);
        Date endDate = format.parse(end);
        return startDate.before(endDate);
    }
}
