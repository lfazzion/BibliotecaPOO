public class Autor {

    private String nomeAutor, genero;
    private int nascimento;

    public Autor(String nomeAutor, String genero, int nascimento) {
        this.nomeAutor = nomeAutor;
        this.genero = genero;
        this.nascimento = nascimento;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getNascimento() {
        return nascimento;
    }

    public void setNascimento(int nascimento) {
        this.nascimento = nascimento;
    }
}