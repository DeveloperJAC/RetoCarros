package co.com.reto;

import java.util.Objects;
import java.util.Set;

public class Juego {
    private final Pista pista;
    private final Set<Jugador> jugadores;

    private Estado estado;
    public Podium podium;

    public Juego(Pista pista, Set<Jugador> jugadores) {
        this.pista = pista;
        this.jugadores = jugadores;
        this.estado = Estado.CONFIGURADO;
        this.podium = new Podium();

        if(3 > jugadores.size()){
            throw new IllegalArgumentException("Se debe crear el juego con minimo tres jugadores");
        }

        //Configurar los carriles al inicio
        //Todo: Pasarle el Nombre
        jugadores.forEach(jugador -> {
            var conductor = new Conductor(jugador.userName(), "");
            var carro = new Carro(conductor);
            pista.agregarCarril(new Carril(pista, carro));
        });
    }
    // en este metodo vamos inicializar el juego y cambiar sus estados

    public void iniciarJuego(){
        if(pista.carriles().size() < 3){
            throw new IllegalArgumentException("No se tiene Configurado los carriles");
        }
        this.estado = Estado.INICIADO;
        while (this.estado.equals(Estado.INICIADO)){
            pista.carriles().stream().filter(
                    carril -> Boolean.FALSE.equals(carril.finDelRecorrido())
            ).forEach(carril -> {
                var carro = carril.carro();
                carro.avanzar();
                carril.cambiarPosicion(carro.recorrido());
                carril.verificarLlegadaFinal();

                if(carril.finDelRecorrido()){
                    asignarGanador(carro.conductor());
                }
            });

            if (pista.carriles().stream().allMatch(carril -> Boolean.TRUE.equals(carril.finDelRecorrido()))){
                this.estado = Estado.FINALIZADO;
            }


        }
    }

    private void asignarGanador(Conductor conductor) {
        if (Objects.isNull(podium.primerLugar())){
            podium.asigarPrimerLugar(conductor);
        } else if (Objects.isNull(podium.segundoLugar())){
            podium.asigarSegundoLugar(conductor);
        } else if (Objects.isNull(podium.tercerLugar())){
            podium.asigarTercerLugar(conductor);
        }
    }


     //en este metodo vamos finalizat el juego y cambiar sus estados

    public void finalizarJuego(){
        this.estado = Estado.FINALIZADO;
        //Todo: logica para finalizar el juego

    }

    public void guardarResultados(){
        Objects.requireNonNull(podium.primerLugar());
        Objects.requireNonNull(podium.segundoLugar());
        Objects.requireNonNull(podium.tercerLugar());
    }


    //Generamos los get para consultar
    public Pista pista() {
        return pista;
    }

    public Set<Jugador> jugadores() {
        return jugadores;
    }

    public Estado estado() {
        return estado;
    }

    public Podium podium() {
        return podium;
    }

    public enum Estado {
        CONFIGURADO, INICIADO, FINALIZADO
    }


}
