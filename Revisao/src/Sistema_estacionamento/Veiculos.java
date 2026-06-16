package Sistema_estacionamento;

public class Veiculos {
    private String modelo ;
    private String placa;

    public Veiculos(String modelo, String placa){
        this.placa = placa;
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

}
