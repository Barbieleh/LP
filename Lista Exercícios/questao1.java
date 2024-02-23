/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas;

import java.util.Scanner;

public class Questao1 {
    
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("nota da prova 1:" );
        double nota1 = scanner.nextDouble();
        System.out.println("nota da prova 2:" );
        double nota2 = scanner.nextDouble();
        System.out.println("nota da prova 3:" );
        double nota3 = scanner.nextDouble();
        
        
        double mediaNotas = (nota1 + nota2 + nota3)/3;
        System.out.println("Sua média é: "+ mediaNotas);
        
        if (mediaNotas>=7)
        {
            System.out.println("Situação: APROVADO");
        } else {
            System.out.println("Digite a nota da recuperação: ");
            double recuperacao = scanner.nextDouble();

            double mediaFInal = (mediaNotas + recuperacao ) /2;
            System.out.println("Media Final: "+ mediaNotas);

            if (mediaFInal>=5)
            {
                System.out.println("Situação: APROVADO APÓS RECUPERAÇÃO");
                return;
            }

            System.out.println("Situação: REPROVADO.");
        }
   
    }
    
}
