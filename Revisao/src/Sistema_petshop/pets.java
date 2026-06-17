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

       
        sc.nextLine();

        for(int i = 0; i < x; i++){

            System.out.print("Qual o nome do pet: ");
            String nome = sc.nextLine(); 

            System.out.print("Qual a idade dele (ex: 2 anos): ");
            String idade = sc.nextLine(); 

            int op = 0;
            System.out.println("Informe a especie: [1] - cachorro, [2] - Gato, [3] - passaro");
            op = sc.nextInt();
            sc.nextLine(); 

            switch (op){
                case 1:
                    pets.add(new Cachorro(nome, idade));
                    break;
                case 2:
                    pets.add(new Gato(nome, idade));
                    break;
                case 3:
                    pets.add(new Passaro(nome, idade));
                    break;
                default:
                    System.out.println("Opção inválida");
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
