package Sistema_estacionamento;

import java.util.Scanner;

public class principal {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        Estacionamento estacionamento = new Estacionamento();
        while(opcao !=4) {
            System.out.println(" SISTEMA DE ESTACIONAMENTO");
            System.out.println(" [1] - CADASTRAR VEICULOS");
            System.out.println(" [2] - INFORMAÇOES DOS VEICULOS");
            System.out.println(" [3] - QUANTIDADE DE VEICULOS");
            System.out.println(" [4] - SAIR DO SISTEMA");

            System.out.println("Escolha uma das opçôes: ");
            opcao = sc.nextInt();

            switch (opcao){

                case 1:
                    estacionamento.cadastrar();
                    break;

                case 2:
                    System.out.println("Os veiculos no Estacionamento são: ");
                    estacionamento.exibir();
                    break;

                case 3:
                    estacionamento.tamanho();
                    break;
            }
        }
        System.out.println("====================================");
        System.out.println("Sistema fiinalizado");
    }
}
