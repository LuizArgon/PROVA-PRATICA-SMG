package Ex3;

public class Ingresso {
    public double valor;

    Ingresso(double valor) {
        this.valor = valor;
    }

    public void imprimirValor(){
        System.out.println("\nValor do ingresso: " + valor);
        double valorVIP = valor*1.15;
        System.out.println("Valor do ingresso VIP: " + valorVIP);
        System.out.println("Diferença entre os dois : " + (valorVIP-valor));
    }
}