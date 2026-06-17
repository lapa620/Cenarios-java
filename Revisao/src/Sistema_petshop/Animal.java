package Sistema_petshop;

public abstract class Animal {
    private String nome;
    private String idade;

    public Animal(String nome, String idade){
        this.nome = nome;
        this.idade = idade;
    }

    public String getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public abstract void fazersom();
}
