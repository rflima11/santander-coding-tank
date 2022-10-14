import java.util.Objects;

/**
 *
 *
 */
public class Revisao {

    public static void main(String[] args) {
        // Declarando variável textoUm
        String textoUm = "Hello World!";

        // long, double, int, short, byte, char, boolean
        int idade = 10;
        byte numeroByte = 127;
        double numeroDouble = 127.5;
        float numeroFloat = 42.5F;
        short idadeShort = 32767;
        long numeroGrandaoLong = 9_223_372_036_854_775_806L;
        char valorChar = 66;
        boolean verdadeiro = true;
        boolean falso = false;


//       ARRAYS
//
        int[] arrayInt = new int[3];
        arrayInt[0] = 1;
        arrayInt[1] = 2;
        arrayInt[2] = 3;

//        System.out.println(arrayInt[4]);

        String[] arrayString = new String[3];
        arrayString[0] = "String 1";
        arrayString[1] = "String 2";
        arrayString[2] = "String 3";

        String stringTeste = "TESTE TELEFONE";
        stringTeste = "ABACATE";

        char[] arrayChar = stringTeste.toCharArray();
        String[] arraySplit = stringTeste.split(" ");
        System.out.println(arraySplit[0]);

        // OPERADORES

        // + - / *
        int numero1 = 10;
        int numero2 = 21;
        int resultadoSoma = numero1 + numero2;
//        System.out.println(resultadoSoma);
//        System.out.println(numero2 - numero1);
//        System.out.println(numero2 * numero1);
//        System.out.println(numero2 / numero1);

        // %
        int resto = numero2 % 2;

//        System.out.println(String.format("O resultado da divisao de %d e de %d é: %d", numero2, numero1, resto));

        // < > <= >= == !=
        int numero3 = 10;
        int numero4 = 11;
        boolean isNumeroDezMaiorQueOnze = numero3 > numero4;
        boolean isOnzeMenorQueDez = numero4 < numero3;
        boolean isMenorIgual = numero4 <= numero3;
        boolean isMaiorIgual = numero4 >= numero3;
        boolean isIgual = numero3 == numero4;
        boolean isDiferente = numero3 != numero4;

        String texto2 = "OLÁ!";
        String texto3 = "Olá!";
//        System.out.println(isDiferente);


        // operadores lógicos && (AND) || (OR) ! (NEGAÇÃO)
        int idadeCandidato = 35;
        double expectativaSalarial = 5000;
        boolean isAprovadoNoProcesso = !(idadeCandidato >= 30 || expectativaSalarial <= 5000);
        boolean isVerdadeiro = false;

//        System.out.println(!isVerdadeiro);

        // atribuicao = += -= *= /= %=
        double salario = 4000;
//        System.out.println(salario);

//        salario += 400;
//        salario *= 2;
//        salario -= 200;
//        salario /= 2;
//        salario %= 2;
//        System.out.println(salario);

        //incremento e decremento
        int contador = 1;
//        System.out.println(--contador);

    }
}
