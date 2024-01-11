package main.com.globant.levelling.session_3.task_14.service.impl;

import main.com.globant.levelling.session_3.task_14.domain.TemperatureRecord;
import main.com.globant.levelling.session_3.task_14.service.interfaces.ITemperatureConvert;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class TemperatureReportConverter implements ITemperatureConvert {
    private static final double CONVERSION_FACTOR = 33.8D;
//    Constructor
    public TemperatureReportConverter() {
    }

    @Override
    public List<TemperatureRecord> convertToCelsiusRecord(Collection<TemperatureRecord> recordFahrenheit) {
        List<TemperatureRecord> recordsCelsius = new ArrayList<>();

        for (TemperatureRecord record : recordFahrenheit) {
            if (record.getTemperature() != null) {
                double celsius = convertToFahrenheitToCelsius(record.getTemperature());
                TemperatureRecord celsiusRecord = new TemperatureRecord(record.getDate(), record.getTime(), celsius);
                recordsCelsius.add(celsiusRecord);
            }
        }

        return recordsCelsius;
    }

    public double convertToFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}










/*
//    Constructor

    public TemperatureReportConverter() {
    }

    @Override
    public List<TemperatureRecord> convertToCelsiusRecord(Collection<TemperatureRecord> recordFahrenheit) {
        List<TemperatureRecord> recordsCelsius = new ArrayList<>();

        for (TemperatureRecord record : recordFahrenheit) {
            if (record.getTemperature() != null) {
                double celsius = convertToFahrenheitToCelsius(record.getTemperature());
                TemperatureRecord celsiusRecord = new TemperatureRecord(record.getDate(), record.getTime(), celsius);
                recordsCelsius.add(celsiusRecord);
            }
        }

        return recordsCelsius;
    }

    public double convertToFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
*/

