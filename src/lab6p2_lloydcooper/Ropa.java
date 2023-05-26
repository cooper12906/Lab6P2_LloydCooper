    package lab6p2_lloydcooper;

public class Ropa extends Objetos {
    private int talla;
    private String tipoTela;
    private String paísElaboración;

    public Ropa(String color, String descripción, String marca, String personaIngreso,
            int talla, String tipoTela, String paísElaboración) {
        super(color, descripción, marca, personaIngreso);
        this.talla = talla;
        this.tipoTela = tipoTela;
        this.paísElaboración = paísElaboración;
    }

    // Getters y setters para los atributos adicionales
    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getTipoTela() {
        return tipoTela;
    }

    public void setTipoTela(String tipoTela) {
        this.tipoTela = tipoTela;
    }

    public String getPaísElaboración() {
        return paísElaboración;
    }

    public void setPaísElaboración(String paísElaboración) {
        this.paísElaboración = paísElaboración;
    }
}
