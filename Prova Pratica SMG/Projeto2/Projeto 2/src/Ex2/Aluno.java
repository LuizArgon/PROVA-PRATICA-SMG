package Ex2;

public class Aluno {
    public String nomeAluno;
    public int numMatricula;
    public double nota1;
    public double nota2;
    public double notaTrabalho;
    public double media;
    
    public Aluno(String nomeAluno, int numMatricula, double nota1, double nota2, double notaTrabalho) {
        this.nomeAluno = nomeAluno;
        this.numMatricula = numMatricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.notaTrabalho = notaTrabalho;
    }

    public double calcularMedia(){
        media = (((nota1*2.5)+(nota2*2.5)+(notaTrabalho*2))/7);
        System.out.println("A média final do aluno foi: " + media);
        return media;
    }

    public void calcularFinal(){
        double precisaFinal = 140 - media;
        System.out.println("o Aluno precisa da seguinte nota para passar no exame: " + precisaFinal);
    }



    
    
}
