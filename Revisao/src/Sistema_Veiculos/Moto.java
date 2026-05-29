package Sistema_Veiculos;

public class Moto extends Veiculo {

    public Moto(String modelo, int velocidade){
        super(modelo, velocidade);
    }

    @Override
    public void buzina() {
        System.out.println("Buzina de moto");

    }

}
