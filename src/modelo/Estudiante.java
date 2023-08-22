package modelo;
    

public class Estudiante {
    
    private String nombres;
    private String apellidos;
    private String fechaNacimiento;
    private String correoInstitucional;
    private String correoPersonal;
    private long numeroCel;
    private long numeroFijo;
    private String programaAcad;

    public Estudiante(String nombres, String apellidos, String fechaNacimiento, String correoInstitucional, String correoPersonal, long numeroCel, long numeroFijo, String programaAcad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.correoInstitucional = correoInstitucional;
        this.correoPersonal = correoPersonal;
        this.numeroCel = numeroCel;
        this.numeroFijo = numeroFijo;
        this.programaAcad = programaAcad;
    }

    public Estudiante() {
    }

    public Estudiante(String correoInstitucional,String correoPersonal, long numeroCel, long numeroFijo, String programaAcad) {
        this.correoInstitucional = correoInstitucional;
        this.correoPersonal = correoPersonal;
        this.numeroCel = numeroCel;
        this.numeroFijo = numeroFijo;
        this.programaAcad = programaAcad;
    }
    
    
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getCorreoInstitucional() {
        return correoInstitucional;
    }

    public void setCorreoInstitucional(String correoInstitucional) {
        this.correoInstitucional = correoInstitucional;
    }

    public String getCorreoPersonal() {
        return correoPersonal;
    }

    public void setCorreoPersonal(String correoPersonal) {
        this.correoPersonal = correoPersonal;
    }

    public long getNumeroCel() {
        return numeroCel;
    }

    public void setNumeroCel(long numeroCel) {
        this.numeroCel = numeroCel;
    }

    public long getNumeroFijo() {
        return numeroFijo;
    }

    public void setNumeroFijo(long numeroFijo) {
        this.numeroFijo = numeroFijo;
    }

    public String getProgramaAcad() {
        return programaAcad;
    }

    public void setProgramaAcad(String programaAcad) {
        this.programaAcad = programaAcad;
    }

    @Override
    public String toString() {
        return "Nombres: " + nombres + "\nApellidos: " + apellidos + "\nFecha nacimiento: " + fechaNacimiento + 
                "\nCorreo institucional: " + correoInstitucional + "\nCorreo personal: " + correoPersonal + 
                "\nNúmero de teléfono celular: " + numeroCel + "\nNúmero de teléfono fijo: " + numeroFijo + 
                "\nPrograma académico: " + programaAcad;
    }
    
    
    
}
