package Ex1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        BombaCombustivel bomba1 = new BombaCombustivel();
        System.out.println("\n1)Abastecer por valor \n2)Abastecer por litro \n3)Alterar valor \n4)Alterar Combustivel \n5)Alterar quantidade combustivel \n6) Sair");
        Scanner leitor = new Scanner(System.in);
        int opcao = leitor.nextInt();

        do{
            if (opcao == 1){
                BombaCombustivel.abastecerPorValor();
            } else if (opcao == 2) {
                BombaCombustivel.abastecerPorLitro();
            } else if (opcao == 3) {
                BombaCombustivel.alterarValor();
            } else if (opcao == 4) {
                BombaCombustivel.alterarCombustivel();
            } else if (opcao == 5) {
                BombaCombustivel.alterarQuantidadeCombustivel();
            } else if (opcao == 6 ){
                System.out.println("Saindo.....");
            } else {
                System.out.println("Opcao invalida");
            }
            System.out.println("\n1)Abastecer por valor \n2)Abastecer por litro \n3)Alterar valor \n4)Alterar Combustivel \n5)Alterar quantidade combustivel \n6)Sair");
            opcao = leitor.nextInt();
        } while ( opcao != 6 );    
    }
}