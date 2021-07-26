package co.com.reto;

import java.util.Objects;

public class Conductor extends  Jugador {
    private final String nombre;

    public Conductor(String userName,String nombre) {
        super(userName, nombre);
        this.nombre = Objects.requireNonNull(nombre) ;
    }

    public Integer lanzarDado() {
        return (int)((Math.random()*6)+1);
    }

    public String nombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Conductor{" +
                "username='" + userName() + '\'' +
                '}';
    }
}
