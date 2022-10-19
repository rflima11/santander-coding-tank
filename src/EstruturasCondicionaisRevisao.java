import java.util.Scanner;

public class EstruturasCondicionaisRevisao {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor, informe sua nota: ");
        int nota = scanner.nextInt();

//        String mensagem = nota >= 6 ? "Parabéns, você está aprovado" : "Você está reprovado"; // (condicao) ? verdadeiro : falso;

        String mensagem;
        if (nota >= 6) {
            mensagem = "Parabéns, você está aprovado";
        } else {
            mensagem = "Você está reprovado";
        }

        System.out.println(mensagem);





    }

}
