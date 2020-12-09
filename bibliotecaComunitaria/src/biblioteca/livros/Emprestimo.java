package biblioteca.livros;
import biblioteca.pessoas.Cliente;

/* @author Luam */

public class Emprestimo {
    private String CPF;
    private String idLivro;
    private String dataEmprestimo;
    private String dataDevolucao;

    public Emprestimo(String CPF, String idLivro, String dataEmprestimo, String dataDevolucao) {
        this.CPF= CPF;
        this.idLivro = idLivro;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
    }
    
    public String getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(String dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getIdLivro() {
        return idLivro;
    }

    public void setIdLivro(String idLivro) {
        this.idLivro = idLivro;
    }

    

    public String getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(String dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    
     @Override
    public String toString() {
        return ("CPF: " + this.getCPF() + " - " + "IdLivro: " + this.getIdLivro()
                + " - " + "Data de Emprestimo: " + this.getDataEmprestimo() +
                " - " + "Data de Devolução: " + this.getDataDevolucao());
    }
    // checar devolução
    
    
    
}
