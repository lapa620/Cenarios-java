package SIstema_Escola;

import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        int[] nota = new int[4];

    Scanner sc = new Scanner(System.in);
    Escola sistema = new Escola();
        int escolha = 0;
        while(escolha != 3){
        System.out.println("---------------------------------------------");
        System.out.println("    Sistema escolar ");
        System.out.println(" [1] cadastrar alunos");
        System.out.println(" [2] mostrar notas de todos os alunos");
        System.out.println(" [3] Sair do sistema ");
        System.out.println("--------------------------------------------");
        escolha = sc.nextInt();

        switch (escolha){

                case 1:
                    System.out.println("Quantos alunos você quer cadastrar: ");
                    int quantidadeAlunos = sc.nextInt();
                    sc.nextLine();

                    for (int i = 0; i < quantidadeAlunos; i++) {
                        System.out.println("Digite o nome do aluno: ");
                        String name = sc.nextLine();


                        for (int x = 0; x < 4; x++) {
                            System.out.println("Digite a nota " + (x + 1) + ": ");
                            nota[x] = sc.nextInt();
                        }
                        sc.nextLine();
                        System.out.println("Digite a turma do aluno: ");
                        String turma = sc.nextLine();
                        Aluno alunoNovo = new Aluno(name, nota, turma);
                        sistema.adicionar(alunoNovo);
                    }
                    break;

                case 2:

                    sistema.exibir();
                    break;
            }
        }}

    }

