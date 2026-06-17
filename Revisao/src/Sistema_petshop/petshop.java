package Sistema_petshop;

import Sistema_estacionamento.Estacionamento;

import java.util.Scanner;

public class petshop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao = 0;
        pets Pets = new pets();
        while (opcao != 4) {
            System.out.println("=================================");
            System.out.println(" SISTEMA DE PETSHOP");
            System.out.println(" [1] - CADASTRAR ANIMAL");
            System.out.println(" [2] - INFORMAÇOES DOS ANMAIS");
            System.out.println(" [3] - SAIR DO SISTEMA");
            System.out.println("=================================");

            System.out.println("Escolha uma das opçôes: ");
            opcao = sc.nextInt();

            switch (opcao){
                case 1:
                    Pets.cadastrar();
                    break;

                case 2:
                    Pets.exibir();
            }
        }

    }
}
