public class Questao1{
    public static void main(String[] args) {
        float base;
        float area;
        float altura;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a base do triângulo: ");
        base = scanner.nextFloat();
        altura = scanner.nextFloat();
        area = (base * altura) / 2;
        System.out.println("A área do triângulo é: " + area);
        
}

}
