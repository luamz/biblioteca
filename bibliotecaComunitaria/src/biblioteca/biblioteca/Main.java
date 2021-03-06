package biblioteca.biblioteca;

import biblioteca.excecoes.*;
import biblioteca.menu.Menu;

/* @author Luam */

public class Main {
    public static Sistema sistema;
    public static void main(String[] args){
        sistema = Unidade.leitorUnidades(); // Lê as unidades para memória
        sistema.carregarUnidades(); // Carrega o conteúdo dessas unidades
        try{
            Menu.iniciar(sistema); // Inicia o Menu
        }catch(LivroNaoExistenteException | ClienteInexistenteException | FuncionarioInexistenteException | UnidadeInexistenteException e){
            System.out.println(e.getMessage());
        }
    }
}
