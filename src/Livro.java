public class Livro {

    private String nomeLivro, autor;
    private int ano, codigoLivro;

    public Livro(String nomeLivro, String autor, int ano, int codigoLivro) {
        this.nomeLivro = nomeLivro;
        this.autor = autor;
        this.ano = ano;
        this.codigoLivro = codigoLivro;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    public int getCodigoLivro() {
        return codigoLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setCodigoLivro(int codigoLivro) {
        this.codigoLivro = codigoLivro;
    }
}