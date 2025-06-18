import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        double salario;
        double imposto;
        double inss;

        Scanner leitura = new Scanner(System.in);
        System.out.print("Digite o valor do seu salario: R$ ");
        salario = leitura.nextDouble();

        if (salario < 1000) {
            imposto = 0;
            inss = 0;
        } else if (salario < 2000) {
            imposto = salario * 0.10;
            inss = salario * 0.11;
        } else if (salario < 3000) {
            imposto = salario * 0.20;
            inss = salario * 0.11;
        } else {
            imposto = salario * 0.20;
            inss = salario * 0.11;
        }

        System.out.println("\nResumo:");
        System.out.printf("Salário informado: R$ %.2f%n", salario);
        System.out.printf("Imposto de Renda a pagar: R$ %.2f%n", imposto);
        System.out.printf("Valor do INSS a pagar: R$ %.2f%n", inss);

        leitura.close();
    }
}
