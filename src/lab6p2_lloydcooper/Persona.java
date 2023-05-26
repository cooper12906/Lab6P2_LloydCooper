package lab6p2_lloydcooper;

public class Persona {
    private String ID;
    private String nombre;
    private int edad;
    private char sexo;
    private String estadoCivil;
    private double altura;
    private double peso;

    public Persona() {
    }

    public Persona(String ID, String nombre, int edad, char sexo, String estadoCivil, double altura, double peso) {
        this.ID = ID;
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.estadoCivil = estadoCivil;
        this.altura = altura;
        this.peso = peso;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Persona:" + 
                "\nID:" + ID + 
                "\nNombre:" + nombre + 
                "\nEdad:" + edad + 
                "\nSexo" + sexo + 
                "\nEstado civil:" + estadoCivil + 
                "\nAltura:" + altura + 
                "\nPeso:" + peso;
    }
    
    
}
