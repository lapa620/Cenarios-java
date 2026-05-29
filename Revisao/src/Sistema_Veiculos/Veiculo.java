package Sistema_Veiculos;

public abstract class Veiculo {
    private String modelo;
    private int velociadade;

   public Veiculo(String modelo, int velocidade){
        this.modelo = modelo;
        this.velociadade = velocidade;
    }
    public abstract void buzina();

    public int getVelociadade() {
        return velociadade;
    }

    public String getModelo() {
        return modelo;
    }
}
