package rpg;

public class Jugador {
    private String Nombre;
    private int Salud, Ataque, Dinero, Keys;

    // constructor

    public Jugador(String nombre, int salud, int ataque, int dinero, int keys) {
        this.Nombre = nombre;
        this.Salud = salud;
        this.Ataque = ataque;
        this.Dinero = dinero;
        this.Keys = keys;

    }

    // getters

    public String getNombre() {
        return Nombre;
    }

    public int getkeys() {
        return Keys;
    }

    public int getSalud() {
        return Salud;
    }

    public int getAtaque() {
        return Ataque;
    }

    public int getDinero() {
        return Dinero;
    }

    // setters

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setSalud(int salud) {
        Salud = salud;
    }

    public void setAtaque(int ataque) {
        Ataque = ataque;
    }

    public void setkeys(int keys) {
        Keys = keys;
    }

    public void setDinero(int dinero) {
        Dinero = dinero;
    }

    @Override
    public String toString() {
        String mensaje = "Nombre : " + Nombre + "\n" + "Salud :  " + Salud + "\n" + "Ataque : " + Ataque + "\n"
                + "Dinero :  "
                + Dinero + " oros " + "\n" + "Llaves : " + Keys;
        return mensaje;
    }

    public int getKeys() {
        return Keys;
    }

    public void setKeys(int keys) {
        Keys = keys;
    }

}// cierre clase