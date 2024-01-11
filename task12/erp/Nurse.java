package session_4.task12.erp;

public class Nurse extends  HealthProfessional {
    private Position position;
    private String speciality;
}

enum Position {
    CNA,
    LPN,
    RN,
    ARPN,
    NCS
}