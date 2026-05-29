package Delivery;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    // CORREÇÃO 1 e 2: 'List' com L maiúsculo e 'Produto' com P maiúsculo
    private List<Produto> listaPedido;

    // CORREÇÃO 3: O construtor precisa ter o mesmo nome exato da classe (Pedido)
    public Pedido() {
        this.listaPedido = new ArrayList<>();
    }

    public void adicionar(Produto p){
        listaPedido.add(p);
    }

    public void exibir(){
        System.out.println("seu pedido foi");
            System.out.println(listaPedido);

    }

    public double soma() {
        double soma = 0;
        for (Produto p : listaPedido) {
            soma = soma + p.getPreco();
        }
        return soma;
    }

}
