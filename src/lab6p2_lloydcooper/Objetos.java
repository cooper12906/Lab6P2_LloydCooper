package lab6p2_lloydcooper;

public class Objetos {
    private String color;
    private String descripción;
    private String marca;
    private String personaIngreso;

    public Objetos(String color, String descripción, String marca, String personaIngreso) {
        this.color = color;
        this.descripción = descripción;
        this.marca = marca;
        this.personaIngreso = personaIngreso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDescripción() {
        return descripción;
    }

    public void setDescripción(String descripción) {
        this.descripción = descripción;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPersonaIngreso() {
        return personaIngreso;
    }

    public void setPersonaIngreso(String personaIngreso) {
        this.personaIngreso = personaIngreso;
    }
}

