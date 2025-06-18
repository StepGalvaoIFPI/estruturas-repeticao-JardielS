public class Conta {
    private static int numero = 1000;
    private static double imp = 0.01;
    private int numeroConta;
    private double saldo;
    private String nome;


    public Conta(String nome) {
        setNome(nome);
        this.numeroConta = ++Conta.numero;
    
}
    public void depositar(double valor) {
        this.saldo += valor;
    }
    public void sacar(double valor) {
        this.saldo -= valor;
        this.saldo -= (valor * Conta.imp);
    }
    public double getSaldo() {
        return this.saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public int getNumeroConta() {
        return numeroConta;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    @Override
    public String toString() {
        return "=========Conta===========" +
        "\nNúmero da Conta: " + this.numeroConta + 
        "\nNome: " + nome +
        "\nSaldo: " + saldo +
        "\n==========================";
    }
    
   
}