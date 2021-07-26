package co.com.reto;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Pista {
    private final Integer kilometros;
    private final Set<Carril> carriles;

    public Pista(Integer kilometros) {
        if(0 >= kilometros){
            throw new IllegalArgumentException("Los Kilometros de la pista no son validos");
        }
        this.kilometros = kilometros;
        this.carriles = new HashSet<>();
    }

    public void agregarCarril(Carril carril){
        Objects.requireNonNull(carril);
        this.carriles.add(carril);
    }

    public Integer kilometros() {
        return kilometros;
    }

    public Set<Carril> carriles() {
        return carriles;
    }
}
