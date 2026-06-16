package Sistema_estacionamento;
import SIstema_Escola.Aluno;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Estacionamento {
    private List<Veiculos> listaCarros;

    public Estacionamento(){
        this.listaCarros = new ArrayList<>();
    }

    public void cadastrar(){
        System.out.println("Escolha quantos veiculos cadastrar: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i =0; i  !=x; i++ ){
            System.out.print(" qual modelo do veiculo: ");
            String modelo = sc.next();
            System.out.print("Qual a placa dele: ");
            String placa = sc.next();

            Veiculos veiculo = new Veiculos(modelo,placa);
            listaCarros.add(veiculo);

        }
    }


    public void tamanho(){
        int x = listaCarros.size();

        System.out.println("O numero de carros nesse estacionamento é "+x);
    }

    public void exibir(){
        for (Veiculos a : listaCarros) {
            System.out.println("---------------------------");
            System.out.print("Modelo: ");
            System.out.println( a.getModelo());
            System.out.print("Placa:  ");
            System.out.println(a.getPlaca());
            System.out.println("----------------------------");

        }

    }

}
