package Fazenda_Virtual;

public abstract class  Animal {
    protected String Nome;

    public Animal(String Nome){
        this.Nome = Nome;
    }

    public String getNome(){
        return Nome;
    }
   public abstract void Fazersom();


}
