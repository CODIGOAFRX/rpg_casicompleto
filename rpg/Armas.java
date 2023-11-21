package rpg;

public class Armas {
    private String Nombre;
    private int Ataque;

    // constructor
    public Armas(String nombre, int ataque) {
        this.Nombre = nombre;
        this.Ataque = ataque;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getAtaque() {
        return Ataque;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setAtaque(int ataque) {
        Ataque = ataque;
    }

    @Override
    public String toString() {
        String mensajeArmas = "Nombre : " + Nombre + "\n" + "Ataque : " + Ataque + "\n";
        return mensajeArmas;
    }

}
