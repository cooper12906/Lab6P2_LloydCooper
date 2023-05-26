package lab6p2_lloydcooper;

public class ObjetosHogar extends Objetos {
    private String lugarCasa;
    private String instruccionesFuncionamiento;
    private int tiempoGarantía;

    public ObjetosHogar(String color, String descripción, String marca, String personaIngreso,
            String lugarCasa, String instruccionesFuncionamiento, int tiempoGarantía) {
        super(color, descripción, marca, personaIngreso);
        this.lugarCasa = lugarCasa;
        this.instruccionesFuncionamiento = instruccionesFuncionamiento;
        this.tiempoGarantía = tiempoGarantía;
    }

    // Getters y setters para los atributos adicionales
    public String getLugarCasa() {
        return lugarCasa;
    }

    public void setLugarCasa(String lugarCasa) {
        this.lugarCasa = lugarCasa;
    }

    public String getInstruccionesFuncionamiento() {
        return instruccionesFuncionamiento;
    }

    public void setInstruccionesFuncionamiento(String instruccionesFuncionamiento) {
        this.instruccionesFuncionamiento = instruccionesFuncionamiento;
    }

    public int getTiempoGarantía() {
        return tiempoGarantía;
    }

    public void setTiempoGarantía(int tiempoGarantía) {
        this.tiempoGarantía = tiempoGarantía;
    }
}
