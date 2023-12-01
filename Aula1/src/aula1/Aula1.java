package aula1;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Aula1 {

    public static void main(String[] args) {
       
        String nome, mensagem = "";
        int idade;
        boolean ativo;
        
        /*
        Scanner s = new Scanner(System.in);
        System.out.println("Informe seu Nome: ");
        nome = s.next();
        System.out.println("Informe sua Idade: ");
        idade = s.nextInt();
        System.out.println("Usuario Ativo ou Inativo: ");
        ativo = s.nextBoolean();
        */
        
        //Função para abrir uma caixa de dialogo recebendo uma String.
        nome = JOptionPane.showInputDialog("Digite o nome: ");
        
        //Cria uma Variável do tipo String resposta para receber idade e situação;
        String resposta = JOptionPane.showInputDialog("Digite a idade");
        
        //Transforma a String resposta recebida em inteiro.
        idade = Integer.parseInt(resposta);
        
        //A String resposta recebe a situação
        resposta = JOptionPane.showInputDialog("Ativo or Inativo: ");
        
        //Transforma a String resposta recebida em Boolean.
        ativo = Boolean.parseBoolean(resposta);
       
        if(resposta.equalsIgnoreCase("Ativo")){ //verifica se resposta está recebendo a string "ativo".
            ativo = true;
        }else{
            ativo = false;
        }
        
        //sout + tab, funcionalidade para exibir uma mensagem.
        
        /*
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        */
        
        if (!ativo){
            mensagem = "Pessoa inativa no sistema";
        } else if (idade < 18) {
            mensagem = "Pessoa menor de idade";
        } else {
            mensagem = "Pessoa maior de idade";
        }
        
        //Função para exibir uma caixa de dialogo com a resposta
        JOptionPane.showMessageDialog(null,
                "Nome: " + nome + "\nIdade: " + idade + "\nSituação: " + mensagem);
        
        //System.out.println(mensagem);
    }
    
}
    
