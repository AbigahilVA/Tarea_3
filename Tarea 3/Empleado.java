public class Empleado {

    private String nombres;
    private String apellidos;
    private String fNac;
    private int edad;
    private String dpi;
    private String codigo;
    private String puesto;
    private static String sexo;
    private static String tipoSangre;
    private float estatura;

    public Empleado(String nombres, String apellidos, String fNac, int edad,
                    String dpi, String codigo, String puesto,
                    String sexo, String tipoSangre, float estatura) {
                        
        this.nombres    = nombres;
        this.apellidos  = apellidos;
        this.fNac       = fNac;
        this.edad       = edad;
        this.dpi        = dpi;
        this.codigo     = codigo;
        this.puesto     = puesto;
        Empleado.sexo       = sexo;
        Empleado.tipoSangre = tipoSangre;
        this.estatura   = estatura;
    }

    public void actualizar(String nuevoPuesto) {
        this.puesto = nuevoPuesto;
    }

    public void consultar() {
    }

    public int consultarEdad() {
        return this.edad;
    }

    public void actualizarPuesto(String nuevoPuesto) {
        this.puesto = nuevoPuesto;
    }
}