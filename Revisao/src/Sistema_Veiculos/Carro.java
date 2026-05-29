package Sistema_Veiculos;

public class Carro extends Veiculo {
    public Carro(String modelo, int velocidade){
        super(modelo, velocidade);
    }

    @Override
    public void buzina() {
        System.out.println("buzina de carro");
    }


}
