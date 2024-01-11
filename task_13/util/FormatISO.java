package com.globant.levelling.reportgenerator.util;

import java.time.LocalDateTime;
import java.time.Month;

public class FormatISO {
    LocalDateTime localDateTime;
    public FormatISO(LocalDateTime localDateTime){
        this.localDateTime = localDateTime;
    }

    public String formatedData(){
        return String.format("%04d-%02d-%02d %02d:%02d:%02d:%04d",
                localDateTime.getYear(),
                localDateTime.getMonthValue(),
                localDateTime.getDayOfMonth(),
                localDateTime.getHour(),
                localDateTime.getMinute(),
                localDateTime.getSecond(),
                localDateTime.getNano()
        );
    }

    public static void main(String[] args) {

        FormatISO formatISO = new FormatISO(LocalDateTime.of(2024, Month.JANUARY,8,10,0,0));
        System.out.println(formatISO.formatedData());
    }
}
