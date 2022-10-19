import java.util.Scanner;

public class MediaNotas {

    public static void main(String[] args) {

        /*
         * Receber do usuário 5 notas e no fim calculará a média do usuário
         * informando se ele foi aprovado ou não
         * necessário média 7 para aprovação
         *
         */

        Scanner scanner = new Scanner(System.in);
        double notas[] = new double[5];
        int contador = 0;
        while (contador < notas.length) {
            System.out.println("Informe a " + (contador + 1) + " nota");
            double valorNotaInformada = scanner.nextDouble();
            notas[contador] = valorNotaInformada;
            contador++;
        }
        double somatorioNotas = 0;
        for (int i = 0; i < notas.length; i++) {
            somatorioNotas += notas[i];
        }

        double media = somatorioNotas / notas.length;
        String mensagem = media >= 7 ? "Parabéns, você foi aprovado com média " + media : "Infelizmente você não passou, sua média foi " + media;
        System.out.println(mensagem);












    }
}
