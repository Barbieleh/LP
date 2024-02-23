import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("horas do primeiro intervalo: ");
        int horas1 = scanner.nextInt();
        System.out.println("minutos do primeiro intervalo: ");
        int minutos1 = scanner.nextInt();
        System.out.println("segundos do primeiro intervalo: ");
        int segundos1 = scanner.nextInt();

        System.out.println("horas do segundo intervalo: ");
        int horas2 = scanner.nextInt();
        System.out.println("minutos do segundo intervalo: ");
        int minutos2 = scanner.nextInt();
        System.out.println("segundos do segundo intervalo: ");
        int segundos2 = scanner.nextInt();

        int somaHoras = horas1 + horas2;
        int somaMinutos = minutos1 + minutos2;
        int somaSegundos = segundos1 + segundos2;

        int difHoras = horas1 - horas2;
        int difMinutos = minutos1 - minutos2;
        int difSegundos = segundos1 - segundos2;

        // Exiba os resultados
        System.out.println("Soma dos intervalos: " + somaHoras + " horas, " + somaMinutos + " minutos, " + somaSegundos + " segundos");
        System.out.println("Diferença dos intervalos: " + difHoras + " horas, " + difMinutos + " minutos, " + difSegundos + " segundos");
    }
}
