import java.util.Scanner;

public class ExercicioIdade {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe por favor a data de nascimento: ");
        int anoNascimento = scan.nextInt();
        int anoAtual = 2022;

        int idade = anoAtual - anoNascimento;

        System.out.println("A sua idade é de " + idade);
    }

}
