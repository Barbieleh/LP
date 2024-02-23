import java.util.Scanner;

public class questao4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("número inteiro maior ou igual a 0:");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("O número digitado não é válido. Por favor, insira um número inteiro maior ou igual a 0.");
            
        } else {
          
            int digitos = 0;
            while (numero != 0) 
            {
                numero = numero / 10;
                digitos++;
            }
            
            System.out.println("O número de dígitos de " + numero + " é: " + digitos);
        }
    }
}
