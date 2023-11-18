package rpg;

public class Enemigo {
    private String Nombre;
    private int Ataque;

    // constructor
    public Enemigo(String nombre,int ataque) {
        this.Nombre = nombre;
        this.Ataque = ataque;
    }
    // getters

    public String getNombre() {
        return Nombre;
    }

    public int getAtaque() {
        return Ataque;
    }

    // setters
    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setAtaque(int ataque) {
        Ataque = ataque;
    }

    @Override
    public String toString() {
        String mensajeEnemigo = "Nombre : " + Nombre + "\n" +"Ataque : " + Ataque + "\n";
        return mensajeEnemigo;
    }

}// class enemigo
