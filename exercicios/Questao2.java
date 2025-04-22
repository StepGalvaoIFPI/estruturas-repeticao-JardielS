import java.util.Scanner;

public class Questao2{
    public static void main(String[] args) {
        float altura;
        float largura;
        float perimetro;
        float area;
        Scanner entrada = new Scanner(System.in);
        altura = entrada.nextFloat();
        largura = entrada.nextFloat();
        area = altura * largura; 
        perimetro = 2 * (altura + largura);
        System.out.println("Perímetro: " + perimetro);
}

}
        System.out.println("Area: " + area);
                             
