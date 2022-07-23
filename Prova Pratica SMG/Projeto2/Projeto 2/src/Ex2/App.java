package Ex2;

public class App {
    public static void main(String[] args) throws Exception {
        Aluno aluno1 = new Aluno("Luiz Henrique", 52298650, 70, 70, 70);

        if(aluno1.calcularMedia() > 70){
            aluno1.calcularFinal();
        } else {
            System.out.println("Aluno aprovado!");
        }

    }
}
