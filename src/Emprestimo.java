public class Emprestimo {

    private int dataEmprestimo, codigoEmprestimo;

    public Emprestimo(int dataEmprestimo, int codigoEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
        this.codigoEmprestimo = codigoEmprestimo;
    }

    public int getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(int dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public int getCodigoEmprestimo() {
        return codigoEmprestimo;
    }

    public void setCodigoEmprestimo(int codigoEmprestimo) {
        this.codigoEmprestimo = codigoEmprestimo;
    }
}