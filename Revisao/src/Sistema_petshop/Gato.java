package Sistema_petshop;

public class Gato extends Animal{
    public Gato(String nome, String idade){
        super(nome, idade);
    }

    @Override
    public void fazersom() {
        System.out.println("miauuuuuuuuuuuu");
    }
}
