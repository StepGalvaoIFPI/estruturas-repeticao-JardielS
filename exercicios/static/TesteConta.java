public class TesteConta {
    public static void main(String[] args) {
        Conta c[] = new Conta[2];
        c[0] = new Conta("Maria");
        c[1] = new Conta("Fernando");

        c[0].depositar(1000);
        c[0].sacar(100);

        c[1].depositar(2000);
       
        System.out.println(c[0].toString());
        System.out.println(c[1].toString());
    }
    
}

