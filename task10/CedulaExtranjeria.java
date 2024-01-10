package session_4.task10;

import java.time.LocalDate;

public class CedulaExtranjeria extends Documento{
//    Atributos
    private LocalDate fechaNacimiento;
    private LocalDate fechaEmision;
    private LocalDate fechaVencimiento;
    private String nacionalidad;

//    Metodos

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }
}
