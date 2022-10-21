import java.util.Random;
import java.util.Scanner;

public class MatrizesRev {

    public static void main(String[] args) {


        int[][] matrizAleatoria = new int[3][3];
        Scanner scanner = new Scanner(System.in);

        for(int linha = 0; linha < matrizAleatoria.length; linha++) {
            for(int coluna = 0; coluna < matrizAleatoria[linha].length; coluna++) {
                System.out.println("Insira o número da linha " + linha + " e coluna " + coluna);
                matrizAleatoria[linha][coluna] = scanner.nextInt();
            }

        }

        System.out.println("========================");


        for(int linha = 0; linha < matrizAleatoria.length; linha++) {
            for(int coluna = 0; coluna < matrizAleatoria[linha].length; coluna++) {
                    System.out.print(matrizAleatoria[linha][coluna] + " ");
                }
                System.out.println();

            }
        }









}
