package co.com.reto;

public class Podium {
    private Conductor primer;
    private Conductor segundo;
    private Conductor tercer;

    public void asigarPrimerLugar(Conductor conductor){
        this.primer = conductor;
    }

    public void asigarSegundoLugar(Conductor conductor){
        this.segundo = conductor;
    }

    public void asigarTercerLugar(Conductor conductor){
        this.tercer = conductor;
    }

    public Conductor primerLugar() {
        return primer;
    }

    public Conductor segundoLugar() {
        return segundo;
    }

    public Conductor tercerLugar() {
        return tercer;
    }

    @Override
    public String toString() {
        return "Podium{" +
                "primer=" + primer +
                ", segundo=" + segundo +
                ", tercer=" + tercer +
                '}';
    }
}
