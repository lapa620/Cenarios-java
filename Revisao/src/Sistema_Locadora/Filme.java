package Sistema_Locadora;

public class Filme {
    private String titulo;
    private String genero;
    private String lancamento;

    public Filme(String titulo, String genero, String lancamento){
        this.titulo = titulo;
        this.genero = genero;
        this.lancamento = lancamento;

    }

    public String getGenero() {
        return genero;
    }

    public String getLancamento() {
        return lancamento;
    }

    public String getTitulo() {
        return titulo;
    }
}
