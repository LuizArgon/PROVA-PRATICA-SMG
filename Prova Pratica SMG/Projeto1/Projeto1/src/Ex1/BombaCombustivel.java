package Ex1;

import java.util.Scanner;

public class BombaCombustivel {
    public static String tipoCombustivel;
    public static double valorLitro;
    public static double totalCombustivel;
    public static double quantiaAbastecida;

    BombaCombustivel(){
        tipoCombustivel = "Alcool";
        valorLitro = 5.50;
        totalCombustivel = 100.0;
    }

    public void statusBomba(){
        System.out.println("Abastecendo com: " + tipoCombustivel);
        System.out.println("Valor do litro: " + valorLitro);
        System.out.println("Total na bomba: " + totalCombustivel);
    }
    
    public static void abastecerPorValor(){
        System.out.println("\nQual o valor a ser abastecido?\n");
        Scanner leitor = new Scanner(System.in);
        double valorPago = leitor.nextDouble();

        if ((valorPago/valorLitro) <= totalCombustivel){
            quantiaAbastecida = (valorPago/valorLitro);
            totalCombustivel -= quantiaAbastecida;
            System.out.println("Foram abastecidos: " + quantiaAbastecida);
            System.out.println("Valor a pagar: " + valorPago);
            System.out.println("Restante na bomba: " + totalCombustivel);
        } else {
            System.out.println("Sem combustivel suficiente na bomba!");
        }        
    }

    public static void abastecerPorLitro(){    
        System.out.println("\nQual a quantidade a ser abastecida?\n");
        Scanner leitor = new Scanner(System.in);
        double quantiaAbastecida = leitor.nextDouble();


        if (quantiaAbastecida <= totalCombustivel){
            double valorAPagar = (quantiaAbastecida*valorLitro);
            totalCombustivel -= quantiaAbastecida;
            System.out.println("Foram abastecidos: " + quantiaAbastecida);
            System.out.println("Valor a pagar: " + valorAPagar);
            System.out.println("Restante na bomba: " + totalCombustivel);
        } else {
            System.out.println("Sem combustivel suficiente na bomba!");
        } 

    }

    public static void alterarValor(){
        System.out.println("\nQual o novo valor do litro?\n");
        Scanner leitor = new Scanner(System.in);
        double novoValorLitro = leitor.nextDouble();

        valorLitro = novoValorLitro;
        System.out.println("Valor do litro atualizado para: R$" + valorLitro);
    }

    public static void alterarCombustivel(){
        System.out.println("\nQual o novo tipo do combustivel?\n");
        Scanner leitor = new Scanner(System.in);
        String novoTipoCombustivel = leitor.next();
        tipoCombustivel = novoTipoCombustivel;
        System.out.println("Tipo do combustivel atualizado para: R$" + valorLitro);
    }

    public static void alterarQuantidadeCombustivel(){
        System.out.println("\nQual a nova quantidade de combustivel na bomba?\n");
        Scanner leitor = new Scanner(System.in);
        double novaQuantidadeCombustivel = leitor.nextDouble();
        totalCombustivel = novaQuantidadeCombustivel;
        System.out.println("Combustivel na bomba atualizado para: " + totalCombustivel);
    }
}