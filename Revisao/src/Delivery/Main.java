package Delivery;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        String menu = """
              ----- Menu_pedido -----
              [1]- pizza(40R$)
              [2]- coca(13R$)
              [3]- x-tudo(24R$)
              [4]- coxinha(4R$)
              [5]- finalizar pedido
              """;

        Scanner sc = new Scanner(System.in);
Pedido lista = new Pedido();
       int op = 0;
       while (op!=5){
               System.out.println(menu);
       op = sc.nextInt();

       switch (op){
           case 1:
               System.out.println("pizza adicionada");
               Produto pizza = new Produto("pizza",40);
               lista.adicionar(pizza);
               break;

           case 2:
               System.out.println("coca adicionada");
               Produto coca = new Produto("coca",13);
               lista.adicionar(coca);
               break;

           case 3:
               System.out.println("x-tudo adicionado");
               Produto  x = new Produto("x-tudo",24);
               lista.adicionar(x);
               break;

           case 4:
               System.out.println("coxinha adicionada");
               Produto coxinha = new Produto("coxinha",4);
               lista.adicionar(coxinha);
               break;

       }}


        lista.exibir();
        System.out.print("o preço total do seu pedido foi: ");
        System.out.println(lista.soma());
    }

}
