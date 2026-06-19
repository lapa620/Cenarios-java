package Sistema_Locadora;

import Sistema_estacionamento.Estacionamento;

import java.util.Scanner;

public class Main {

        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int opcao = 0;
            Locadora locadora = new Locadora();
            while(opcao !=4) {
                System.out.println(" SISTEMA DE LOCADORA");
                System.out.println(" [1] - CADASTRAR FILMES");
                System.out.println(" [2] - CATALAGO");
                System.out.println(" [3] - INFORMAÇÕES DO FILME");
                System.out.println(" [4] - SAIR DO SISTEMA");

                System.out.println("Escolha uma das opçôes: ");
                opcao = sc.nextInt();

                switch (opcao){

                    case 1:
                        locadora.cadastrar();
                        break;

                    case 2:
                        System.out.println("Os filmes no catalago são: ");
                        locadora.exibir();
                        break;

                    case 3:
    locadora.infoFilme();
                        break;
                }
            }
            System.out.println("====================================");
            System.out.println("Sistema fiinalizado");
        }
    }


