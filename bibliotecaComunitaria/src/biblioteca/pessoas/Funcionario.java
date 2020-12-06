/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca.pessoas;

/**
 *
 * @author victoria
 */
public class Funcionario extends Pessoa{
    
    protected float salario;
    protected String cargo;

    protected void cadastro(String nome, String nascimento, String telefone, float salario, String cargo){
        
        super.cadastro(nome, nascimento, telefone);
        this.salario = salario;
        this.cargo = cargo;
    
    }
    
    @Override
    public void excluir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString() {
        return ("Nome: " + this.nome + " - " + "Nascimento: " + this.nascimento + " - " + "Telefone: " + this.telefone + " - " + "Cargo: " + this.cargo);
    }
    
    protected void ajusteSalario(){}
}