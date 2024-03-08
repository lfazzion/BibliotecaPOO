
import java.util.Scanner;

public class Biblioteca {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o nome do livro: ");
        String nomeLivro = scan.nextLine();
        System.out.println("Digite o nome do autor: ");
        String nomeAutor = scan.nextLine();
        System.out.println("Digite o ano do livro: ");
        int ano = scan.nextInt();
        System.out.println("Digite o codigo do livro: ");
        int codigoLivro = scan.nextInt();
        scan.nextLine();
        System.out.println("Digite o genero: ");
        String genero = scan.nextLine();
        System.out.println("Digite o ano de nascimento do autor: ");
        int nascimento = scan.nextInt();
        scan.nextLine();
        System.out.println("Digite seu nome: ");
        String nomeUsuario = scan.nextLine();
        System.out.println("Digite o seu codigo: ");
        int numero = scan.nextInt();
        System.out.println("Digite a data de emprestimo: ");
        int dataEmprestimo = scan.nextInt();
        System.out.println("Digite o codigo de emprestimo: ");
        int codigoEmprestimo = scan.nextInt();
        System.out.println("Digite a data da devolução: ");
        int dataDevolucao = scan.nextInt();
        System.out.println("Digite o codigo da devolução: ");
        int codigoDevolucao = scan.nextInt();


        Livro l1 = new Livro(nomeLivro, nomeAutor, ano, codigoLivro);
        Autor a1 = new Autor(nomeAutor, genero, nascimento);
        Usuario u1 = new Usuario(nomeUsuario, numero);
        Emprestimo e1 = new Emprestimo(dataEmprestimo, codigoEmprestimo);
        Devolucao d1 = new Devolucao(dataDevolucao, codigoDevolucao);

        System.out.println("nome: " + l1.getNomeLivro() + ", autor: " + l1.getAutor() + ", ano: " + l1.getAno() + " , codigo: " + l1.getCodigoLivro());
        System.out.println("nome: " + a1.getNomeAutor() + ", genero: " + a1.getGenero() + ", data nascimento: " + a1.getNascimento());
        System.out.println("nome: " + u1.getNomeUsuario() + ", numero: " + u1.getNumero());
        System.out.println("emprestimo data: " + e1.getDataEmprestimo() + ", codigo do emprestimo: " + e1.getCodigoEmprestimo());
        System.out.println("data da devolução: " + d1.getDataDevolucao() + ", codigo de devolucao:  " + d1.getCodigoDevolucao());
    }

}