package Fazenda_Virtual;

import javax.naming.Name;
import java.util.Scanner;

public class Fazendinha {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
int escolha = -1;
        while( escolha != 4) {
            System.out.println("-------------------------------------");
            System.out.println("       ---- Fazenda feliz ----");
            System.out.println("escolha qual animal voce quer ouvir: ");
            System.out.println("1 - Gato ");
            System.out.println("2 - Vaca");
            System.out.println("3 - Cachorro");
            System.out.println("4 - Sair");
            System.out.println("--------------------------------------");
            escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    Gato gato = new Gato("cat");
                    System.out.print("O Gato faz: ");
                    gato.Fazersom();
                    break;

                case 2:
                    Vaca vaca = new Vaca("cow");
                    vaca.getNome();
                    System.out.print("A "+ vaca.Nome + " faz: ");
                    vaca.Fazersom();
                    break;

                case 3:
                    Cachorro cachorro = new Cachorro("dog");
                    System.out.print("O Cachorro faz: ");
                    cachorro.Fazersom();
                    break;

                case 4:
                    System.out.println("Você saiu da fazenda");
                    break;

                 default:
                     System.out.println("Desculpe escolha outra opção essa é invalida");


            }
        }


    }
}