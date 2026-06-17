package Sistema_petshop;

import Sistema_estacionamento.Veiculos;

import java.util.ArrayList;
import java.util.Scanner;

public class pets {
    private ArrayList<Animal> pets;

    public pets(){
        this.pets = new ArrayList<>();
    }

    public void cadastrar(){
        System.out.println("-----------------------------------");
        System.out.println("Escolha quantos pets cadastrar: ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for(int i =0; i  !=x; i++ ){

            System.out.print(" qual nome do pet: ");
            String nome = sc.next();
            System.out.print("Qual a idade dele(informe se é em meses ou anos): ");
            String idade = sc.nextLine();
            sc.nextLine();


            int op=0;
            System.out.println("Informe a especie");
            System.out.println("[1] - cachorro");
            System.out.println("[2] - Gato");
            System.out.println("[3] - passaro");
           op = sc.nextInt();
            switch (op){
                case 1:
                    Cachorro pet = new Cachorro(nome, idade);
                    pets.add(pet);
                    break;

                case 2:
                    Gato gato = new Gato(nome, idade);
                    pets.add(gato);
                    break;

                case 3:
                    Passaro passaro = new Passaro(nome,idade);
                    pets.add(passaro);
                    break;

                default:
                    System.out.println("opção invalida");

            }



        }
    }




    public void exibir(){
        for (Animal a : pets) {
            System.out.println("---------------------------");
            System.out.print("Nome: ");
            System.out.println( a.getNome());
            System.out.print("Idade:  ");
            System.out.println(a.getIdade());
            System.out.print("ele gritando: ");
            a.fazersom();
            System.out.println("----------------------------");

        }

    }
}
