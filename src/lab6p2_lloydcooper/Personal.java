package lab6p2_lloydcooper;

public class Personal extends Persona {
    private String ocupacion;
    private String horarioTrabajo;
    private int tiempoLaborando;
    private double sueldo;

    public Personal() {
        super();
    }

    public Personal(String ocupacion, String horarioTrabajo, int tiempoLaborando, double sueldo, String ID, String nombre, int edad, char sexo, String estadoCivil, double altura, double peso) {
        super(ID, nombre, edad, sexo, estadoCivil, altura, peso);
        this.ocupacion = ocupacion;
        this.horarioTrabajo = horarioTrabajo;
        this.tiempoLaborando = tiempoLaborando;
        this.sueldo = sueldo;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getHorarioTrabajo() {
        return horarioTrabajo;
    }

    public void setHorarioTrabajo(String horarioTrabajo) {
        this.horarioTrabajo = horarioTrabajo;
    }

    public int getTiempoLaborando() {
        return tiempoLaborando;
    }

    public void setTiempoLaborando(int tiempoLaborando) {
        this.tiempoLaborando = tiempoLaborando;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    
}
