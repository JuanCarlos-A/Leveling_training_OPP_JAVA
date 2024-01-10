package session_4.task10;

import java.time.LocalDate;

public class CedulaCiudadania extends Documento {
    //    Atributos
    private LocalDate fechaNacimiento;
    private LocalDate fechaEmision;
    private String depCiudadEmision;

//    Metodos

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public String getDepCiudadEmision() {
        return depCiudadEmision;
    }
}