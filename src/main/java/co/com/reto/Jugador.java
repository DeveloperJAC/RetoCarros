package co.com.reto;

public class Jugador {
    private final String userName;
    private final String nombre;
    private Integer puntos;

    public Jugador(String userName, String nombre) {
        this.userName = userName;
        this.nombre = nombre;
        this.puntos = 0;
    }

    public void agregarPuntos(Integer puntos){
        this.puntos = this.puntos + puntos;
    }

    public String userName() {
        return userName;
    }

    public Integer puntos() {
        return puntos;
    }

    public String nombre() {
        return nombre;
    }
}
