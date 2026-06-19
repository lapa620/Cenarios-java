package Sistema_Locadora;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Locadora {
    Scanner sc = new Scanner(System.in);
        private List<Filme> listaFilme;

        public Locadora(){
            this.listaFilme = new ArrayList<>();
        }

        public void cadastrar(){
            System.out.println("Escolha quantos Filmes quer cadastrar: ");
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            sc.nextLine();
            for(int i =0; i  !=x; i++ ){

                System.out.print(" qual o titulo do filme: ");
                String Titulo = sc.nextLine();
                System.out.print("Qual o genero do filme: ");
                String Genero = sc.nextLine();
                System.out.print("Quando foi lançado(ano): ");
                String ano = sc.nextLine();
                Filme filme = new Filme(Titulo,Genero,ano);
                listaFilme.add(filme);

            }
        }

        public void exibir(){
          int i=  listaFilme.size();
            System.out.println("---------------------------");
            for(int x=0; x<i; x++) {
                Filme f = listaFilme.get(x);
                System.out.println(x+1 + " - Titulo: "+f.getTitulo());
            }
        }

        public void infoFilme(){
            exibir();
            System.out.println("qual filme voce quer ver sobre, coloque o numero do filme");
            int x =sc.nextInt();
            x=x-1;
            System.out.println("---------------------------");
                Filme f = listaFilme.get(x);
                System.out.println( "- Titulo: "+f.getTitulo());
                System.out.println( "- Genero: "+f.getGenero());
                 System.out.println("- Lançamento: "+f.getLancamento());

            }
        }





