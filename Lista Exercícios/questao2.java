/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aulas;

import java.util.Scanner;
public class Questao2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o número de livros comprados:");
        int numeroLivros = scanner.nextInt();

        double descontoA = 0.25 * numeroLivros + 7.50;
        double descontoB = 0.50 * numeroLivros + 2.50;

        if (descontoA > descontoB) {
            System.out.println("O Critério A oferece um desconto total de: R$" + descontoA);
        } else {
            System.out.println("O Critério B oferece um desconto total de: R$" + descontoB);
        }
    }
}
