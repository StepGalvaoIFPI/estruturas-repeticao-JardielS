public class questao03 {
    public static void main(String[] args) {
    float area;
    float comprimento; 
    float raio;
    Scanner entrada = new Scanner(System.in);
    System.out.print("Digite o raio: ");
    raio = entrada.nextFloat();
    area = (float) (Math.PI * raio * raio);
    System.out.printf("A área do círculo é: %.2f%n", area);
    comprimento = (float) (2 * Math.PI * raio);
    System.out.printf("O comprimento do círculo é: %.2f%n", comprimento);

    }
}
