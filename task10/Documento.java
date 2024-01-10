package session_4.task10;

enum tipoDocumento{
    CC,CE,NIT;
}

public abstract class Documento{
//    Atributos
    private tipoDocumento tipo;
    private boolean activo;
    private int numero;
    Persona [] personas;

//    ¿Porque en el diagrama aparece un atributo -activo:numero? ¿Esta bien realizadas las clases junto con su navegabilidad?

//    Metodos
    public int getNumero() {
        return numero;
    }

    public boolean getActivo() {
        return activo;
    }
}
