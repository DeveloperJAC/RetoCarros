package co.com.reto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;

class JuegoTest {

    @Test
    void configurarJuego(){
        var pista = new Pista(60);
        var jugadores = new HashSet<Jugador>();
        jugadores.add(new Jugador("@AndersonCarmona","Anderson Carmona"));
        jugadores.add(new Jugador("@PedroDiaz","Pedro Diaz"));
        jugadores.add(new Jugador("@LauraMontoya","Laura Montoya"));
        jugadores.add(new Jugador("@AndresSuarez","Andres Suarez"));
        jugadores.add(new Jugador("@NicolasCarmona","Nicolas Carmona"));
        jugadores.add(new Jugador("@PaulaPerez","Paula Perez"));
        jugadores.add(new Jugador("@PipeAmigo","Pipe Amigo"));
        jugadores.add(new Jugador("@JuanCarmona","Juan Carmona"));
        jugadores.add(new Jugador("@NataliaGomez","Natalia Gomez"));
        var juego = new Juego(pista, jugadores);

        Assertions.assertEquals(null ,juego.podium.primerLugar());
        Assertions.assertEquals(null ,juego.podium.segundoLugar());
        Assertions.assertEquals(null ,juego.podium.tercerLugar());

        Assertions.assertEquals(9, juego.pista().carriles().size());

        juego.pista().carriles().forEach(carril -> Assertions.assertEquals((int)carril.posicion(), 0));
    }

    @Test
    void iniciarJuego() {
        var pista = new Pista(60);
        var jugadores = new HashSet<Jugador>();
        jugadores.add(new Jugador("@AndersonCarmona", "Anderson Carmona"));
        jugadores.add(new Jugador("@PedroDiaz", "Pedro Diaz"));
        jugadores.add(new Jugador("@LauraMontoya", "Laura Montoya"));
        jugadores.add(new Jugador("@AndresSuarez", "Andres Suarez"));
        jugadores.add(new Jugador("@NicolasCarmona", "Nicolas Carmona"));
        jugadores.add(new Jugador("@PaulaPerez", "Paula Perez"));
        jugadores.add(new Jugador("@PipeAmigo", "Pipe Amigo"));
        jugadores.add(new Jugador("@JuanCarmona", "Juan Carmona"));
        jugadores.add(new Jugador("@NataliaGomez", "Natalia Gomez"));
        var juego = new Juego(pista, jugadores);

        juego.iniciarJuego();
        Assertions.assertEquals(Juego.Estado.FINALIZADO, juego.estado());
        System.out.println(juego.podium);
    }

    @Test
    void finalizarJuego() {
    }

    @Test
    void guardarResultados() {
    }
}