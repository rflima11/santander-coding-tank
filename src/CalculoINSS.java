/*

Um funcionário deseja saber qual o valor líquido anual que recebe da sua empresa. Para tal cálculo é necessário considerar que o funcionário
recebe o salário + décimo terceiro + férias e não esqueça de considerar o desconto do inss, não vamos trabalhar com imposto de renda nesse momento.
O inss tem desconto com base no valor mensal que o funcionário recebe e para isso vamos utilizar a regra a seguir:
de 0 até 1212.00 -> 7,5%.
de 1212.01 até 2427,35 -> 9%.
de 2427,36 até 3641,03 -> 12%.
de 3641,04 até 7087,22 -> 14%.
acima de 7087,22 deve ser descontado o teto de 900 reais.

O resultado final apresentado ao funcionário deve ter o salário anual bruto, total anual de inss descontado e o salário anual líquido final.
 */

import java.util.Scanner;

public class CalculoINSS {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o seu salário: ");

        double salario = scanner.nextDouble();

        double ferias = salario + (salario * 0.33);
        double decimoTerceiro = salario;
        double salarioBruto = (salario * 11) + ferias + decimoTerceiro;
        double inss = 0;
        if (salario > 0 && salario <= 1212.00) {
            inss = 0.075;
        }

        double descontoInssAnual = salarioBruto * inss;

    }
}
