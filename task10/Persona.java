package session_4.task10;

public abstract class Persona {
//    Atributos
    protected int codigoPersona;
    protected boolean activo;
    protected String nombreORazonSocial;
    Direccion[] direcciones;
    NumeroTelefono[] telefonos;

//    Metodos

    public int getCodigoPersona() {
        return codigoPersona;
    }

    public boolean getActivo() {
        return activo;
    }

    public String getNombreORazonSocial() {
        return nombreORazonSocial;
    }

    public int calcularEdad(){
        return 0;
    }
}
