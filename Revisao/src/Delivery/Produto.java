package Delivery;

public class Produto {
private String nome;
private int preco;

public Produto(String nome, int preco){
    this.nome = nome;
    this.preco = preco;
}

    public int getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return  "nome: "+nome + " ,preço: "+preco;
    }
}

