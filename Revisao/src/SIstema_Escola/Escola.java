package SIstema_Escola;


import java.util.ArrayList;
import java.util.List;

public class Escola {
    private List<Aluno> listaAlunos;

    public Escola() {
        this.listaAlunos = new ArrayList<>();
    }

    public void adicionar(Aluno p){
        listaAlunos.add(p);
    }

    public void exibir(){
        System.out.println("As notas dos alunos  foram ");
        for (Aluno p : listaAlunos) {
            System.out.print("Nome: ");
            System.out.println( p.getNome());
            System.out.print("Turma: ");
            System.out.println(p.getSerie());
            p.media(p.getNotas());

        }
    }

    // Dentro da classe Escola:
    public int obterQuantidadeAlunos() {
        return this.listaAlunos.size();
    }

}
