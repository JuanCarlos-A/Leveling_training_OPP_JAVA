package session_4.task12.erp;


import java.sql.Time;

public class Shift {
    private Type type;
    private Time startHour;
    private Time finishHour;

}

enum Type {
    DAY,
    NIGHT
}
