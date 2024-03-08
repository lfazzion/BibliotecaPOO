public class Usuario {
    private String nomeUsuario;
    private int numero;

    public Usuario(String nomeUsuario, int numero) {
        this.nomeUsuario = nomeUsuario;
        this.numero = numero;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}