package lab6p2_lloydcooper;

public class Gerente extends Persona {
    private String user;
    private String password;
    private String cargo;

    public Gerente() {
        super();
    }

    public Gerente(String user, String password, String cargo, String ID, String nombre, int edad, char sexo, String estadoCivil, double altura, double peso) {
        super(ID, nombre, edad, sexo, estadoCivil, altura, peso);
        this.user = user;
        this.password = password;
        this.cargo = cargo;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
}
