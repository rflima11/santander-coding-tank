import java.util.Random;

public class Aula05 {

    public static void main(String[] args) {

        // ESCREVENDO UM MONTE DE CÓDIGO
//        System.out.println("INICIANDO A EXECUÇÃO NO MÉTODO MAIN");
//        int resultado = multiplicar(20, 10);
//        System.out.println("O RESULTADO FOI: " + resultado);

//        double resultadoDivisao = dividir(10,0);
//        System.out.println("O RESULTADO FOI: " + resultadoDivisao);

        // 3! 3x2x1 = 6
//        int resultado = fatorial(4);
//        System.out.println("O RESULTADO FOI: " + resultado);

        encontrarNumeroAleatorio(3);

    }

    public static void somar(int numero1, int numero2) {
        System.out.println(numero1 + numero2);
    }

    public static int multiplicar(int numero1, int numero2) {
        return numero1 * numero2;
    }

    public static double dividir(int numero1, int numero2) {
        if (numero2 == 0) {
            System.out.println("Não é possível fazer uma divisão por 0");
        }
        return numero1 / numero2;
    }

    public static boolean verificarSeSaoIguais(int numero1, int numero2) {
        return numero1 == numero2;
    }

    // 3! 3 x 2 x 1
    public static int fatorial(int numero) {
        if (numero > 0) {
            return numero * (fatorial(numero - 1));
        }
        return 1;
    }

     public static boolean encontrarNumeroAleatorio(int n) {
        Random random = new Random();
        int b = random.nextInt(10);
        System.out.println("EXECUTANDO A FUNÇÃO");
        if (n == b) {
            System.out.println("ENCONTREI O NÚMERO IGUAL");
            return true;
        }
        return encontrarNumeroAleatorio(n);
    }


}
