package co.com.reto;

import java.util.Objects;

public class Carro {
    private final Conductor conductor;
    private Integer recorrido;

    public Carro(Conductor conductor) {
        this.conductor = Objects.requireNonNull(conductor) ;
        this.recorrido = 0;
    }

    public void avanzar(){
        Integer dado = conductor.lanzarDado();
        this.recorrido = dado * 100; //avance en metros
    }

    public Conductor conductor() {
        return conductor;
    }

    public Integer recorrido() {
        return recorrido;
    }
}
