package SIstema_Escola;

public class Aluno {
    private String nome;
    private int[] notas;
    private String serie;

    public Aluno(String nome, int[] notas, String serie){
        this.nome = nome;
        this.notas = notas;
        this.serie  = serie;
    }

    public String getSerie() {
        return serie;
    }

    public String getNome() {
        return nome;
    }

    public int[] getNotas() {
        return notas;
    }

    public void media(int[]notas) {

        double soma = 0;
        for (int i = 0; i <= 3; i++) {
            soma = notas[i] + soma;
        }
        double Media = soma / 4;

        if(Media<6){
            System.out.println("A media do aluno foi "+Media+", ele foi reprovado  ");
            System.out.println("ELE TERA QUE REFAZER A "+getSerie());
            System.out.println("-------------------------------------------------------");
        }
        else {
            System.out.println("A media do aluno foi "+Media+", ele foi aprovado  ");
            System.out.println("PARABENSSSSSSSSSSSSSSS");
            System.out.println("------------------------------------------------------");
        }

    }

}
