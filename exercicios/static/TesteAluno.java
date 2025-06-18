public class TesteAluno {
    public static void main(String[] args) {
        Aluno[] aluno = new Aluno[3];
        aluno[0] = new Aluno("João",6.0);
        aluno[1] = new Aluno("Maria",7.0);
        aluno[2] = new Aluno("Pedro",8.0);
        aluno[0].calcularMediaFinal();
        aluno[1].calcularMediaFinal();
        aluno[2].calcularMediaFinal();
        System.out.println(aluno[0].toString());
        System.out.println(aluno[1].toString());
        System.out.println(aluno[2].toString());

    }
    
}
