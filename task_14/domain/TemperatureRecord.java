package main.com.globant.levelling.session_3.task_14.domain;

import java.time.LocalDate;
import java.time.LocalTime;

public class TemperatureRecord {
//    Atributos
    protected LocalDate date;
    protected LocalTime time;
    protected double temperatura;

//    Metodo Constructor


    public TemperatureRecord(LocalDate date, LocalTime time) {
        this.date = date;
        this.time = time;
    }

    public TemperatureRecord(LocalDate date, LocalTime time, double temperature) {
        this.date = date;
        this.time = time;
        this.temperatura = temperature;
    }


    //    Metodos
    public LocalDate getDate() {
        return date;
    }

    public LocalTime getTime() {
        return time;
    }


    public Double getTemperature() {
        return temperatura;
    }

}
