package co.com.reto;

public class Carril {
    private final Carro carro;
    private final Pista pista;
    private Integer posicion;
    private Boolean finDelRecorrido;

    public Carril(Pista pista, Carro carro) {
        this.pista=pista;
        this.carro = carro;
        this.posicion = 0;
        this.finDelRecorrido = Boolean.FALSE;
    }

    public void cambiarPosicion(Integer posicion){
        if(Boolean.FALSE.equals(finDelRecorrido)){
            if( posicion <0){
                throw new IllegalArgumentException("La posición no puede ser negativa");
            }
            this.posicion = this.posicion + posicion;
        }
    }

    public void verificarLlegadaFinal(){
        if(this.posicion >= pista.kilometros()*1000){
            this.finDelRecorrido = Boolean.TRUE;
        }

    }

    public Carro carro() {
        return carro;
    }

    public Integer posicion() {
        return posicion;
    }

    public Boolean finDelRecorrido() {
        return finDelRecorrido;
    }

}

