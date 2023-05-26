package lab6p2_lloydcooper;

public class Zapatos extends Objetos {
    private int talla;
    private String descripcionSuela;
    private int comodidad;

    public Zapatos(String color, String descripción, String marca, String personaIngreso,
            int talla, String descripcionSuela, int comodidad) {
        super(color, descripción, marca, personaIngreso);
        this.talla = talla;
        this.descripcionSuela = descripcionSuela;
        this.comodidad = comodidad;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public String getDescripcionSuela() {
        return descripcionSuela;
    }

    public void setDescripcionSuela(String descripcionSuela) {
        this.descripcionSuela = descripcionSuela;
    }

    public int getComodidad() {
        return comodidad;
    }

    public void setComodidad(int comodidad) {
        this.comodidad = comodidad;
    }
}
