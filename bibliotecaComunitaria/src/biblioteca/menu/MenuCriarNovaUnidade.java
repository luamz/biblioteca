package biblioteca.menu;

import biblioteca.arquivo.Copiador;
import biblioteca.arquivo.Criador;
import biblioteca.arquivo.Leitor;
import biblioteca.biblioteca.Sistema;
import biblioteca.biblioteca.Unidade;
import biblioteca.biblioteca.Util;
import java.io.File;
import java.util.Scanner;

/* @author Luam
 */
public class MenuCriarNovaUnidade {
    public static void iniciar(Sistema sistema, Scanner teclado){
        // CRIA NOVA UNIDADE
        
        teclado.nextLine();
        System.out.println("\nDigite o nome da unidade: ");
        String nome = teclado.nextLine();
        System.out.println("\nDigite a rua: ");
        String rua = teclado.nextLine();
        System.out.println("\nDigite o bairro: ");
        String bairro = teclado.nextLine();
        System.out.println("\nDigite o cep: ");
        String cep = teclado.nextLine();
        System.out.println("\nDigite a cidade: ");
        String cidade = teclado.nextLine();
        System.out.println("\nDigite o estado: ");
        String estado = teclado.nextLine();
        
        
        sistema.criarUnidade(nome, rua, bairro, cep, cidade, estado);
        sistema = Leitor.leitorUnidades();
        
        System.out.printf("\nUnidade %s criada!\n\n", nome);
        
        Unidade aux = sistema.buscarUnidade(nome);
        Util.imprimir(sistema.getUnidades());
        
        
        // CARREGA OS ARQUIVOS DESSA NOVA UNIDADE
        System.out.println("\nDigite o diretório dos arquivos fonte da nova unidade:");
        String caminho = teclado.nextLine();
       
        File estanteFonte = new File(caminho + "\\estantes.csv");
        File estanteDest = new File(aux.getPath() + "\\estantes.csv");
        Copiador.copiarArquivo(estanteFonte, estanteDest);
        
        File autoresFonte = new File(caminho + "\\autores.csv");
        File autoresDest = new File(aux.getPath() + "\\autores.csv");
        Copiador.copiarArquivo(autoresFonte, autoresDest);
        
        File livrosFonte = new File(caminho + "\\livros.csv");
        File livrosDest = new File(aux.getPath() + "\\livros.csv");
        Copiador.copiarArquivo(livrosFonte, livrosDest);
        
        File emprestimosFonte = new File(caminho + "\\emprestimos.csv");
        File emprestimosDest = new File(aux.getPath() + "\\emprestimos.csv");
        Copiador.copiarArquivo(emprestimosFonte, emprestimosDest);
        
        File clientesFonte = new File(caminho + "\\clientes.csv");
        File clientesDest = new File(aux.getPath() + "\\clientes.csv");
        Copiador.copiarArquivo(clientesFonte, clientesDest);
        
        File funcionariosFonte = new File(caminho + "\\funcionarios.csv");
        File funcionariosDest = new File(aux.getPath() + "\\funcionarios.csv");
        Copiador.copiarArquivo(funcionariosFonte, funcionariosDest);
        
        System.out.printf("\nUnidade %s carregada! ", nome);
    }
}