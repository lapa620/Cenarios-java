package Sistema_Veiculos;

public class Caminhao extends Veiculo {
    public Caminhao(String modelo, int velocidade){
        super(modelo, velocidade);
    }

    @Override
    public void buzina() {
        System.out.println("Buzina de caminhão");
    }
}
