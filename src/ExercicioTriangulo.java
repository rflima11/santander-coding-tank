import java.util.Scanner;

public class ExercicioTriangulo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numeroLinhas = scanner.nextInt();

        for (int i = numeroLinhas; i > 0 ; i--){
            String caracter = "";
            for (int k = i; k > 0; k--) {
                caracter = caracter + "*";
            }
            System.out.println(caracter);
        }


    }



}
