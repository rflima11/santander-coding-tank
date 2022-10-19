import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class ExercicioMatriz {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String[][] informacoes = new String[2][2];

        for(int i = 0; i < informacoes.length; i++) {
            System.out.println("Informe seu nome: ");
            String nome = scanner.next();

            for(int j = 0; j < informacoes[i].length; j++) {
                System.out.println("Informe seu sobrenome");
                String sobrenome = scanner.next();
                informacoes[i][j] = nome + " " + sobrenome;
                System.out.println(informacoes[i][j]);
            }
        }

        String b = "";
        String c = "";
        boolean a = b.equals(c);
    }
}
