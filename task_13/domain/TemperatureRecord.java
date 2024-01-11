package com.globant.levelling.reportgenerator.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TemperatureRecord {
    private LocalDateTime timeStamp;
    private double temperature;

    public TemperatureRecord() {

    }

    // Getters & Setters

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public TemperatureRecord(double temperature, LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
        this.temperature = temperature;
    }

    public LocalDateTime getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(LocalDateTime timeStamp) {
        this.timeStamp = timeStamp;
    }
}
