import java.util.Scanner;

public class ExerciciosArrays {
    /*
    Achar o maior número dentre os números que o usuário informou e imprimir na tela
     */
    public static void main(String[] args) {

        System.out.println("Quantos números você deseja informar?");
        Scanner scanner = new Scanner(System.in);
        int quantidadeNumeros = scanner.nextInt();
        int[] numerosInformados = new int[quantidadeNumeros];
        int maiorValorEncontrado = -2147483648;

        for(int i = 0; i < numerosInformados.length; i++) {
            System.out.println("Informe o " + (i + 1) + " valor") ;
            int valorRecebido = scanner.nextInt();
            numerosInformados[i] = valorRecebido;
            if (numerosInformados[i] > maiorValorEncontrado) {
                maiorValorEncontrado = numerosInformados[i];
            }

        }

        System.out.println("O maior valor encontrado foi: " + maiorValorEncontrado);






    }


}
