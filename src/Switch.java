import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe por favor o dia da semana");
        int diaDaSemana = scanner.nextInt();

        switch (diaDaSemana) {
            default:
                System.out.println("Opção inválida");
            case 1:
                System.out.println("Segunda-feira");
                break;
            case 2:
                System.out.println("Terça-feira");
                break;
            case 3:
                System.out.println("Quarta-feira");
                break;
            case 4:
                System.out.println("Quinta-feira");
                break;
            case 5:
                System.out.println("Sexta-feira");
                break;
            case 6:
                System.out.println("Sábado");
                break;
            case 7:
                System.out.println("Domingo");
                break;

        }

    }
}
