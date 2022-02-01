package org.academiadecodigo.bootcamp;

import java.util.Scanner;

class SMarket {

    Scanner sc = new Scanner(System.in);
    Payments pay = new Payments();
    ProdutosE queijo = ProdutosE.CHEESE;
    ProdutosE fiambre = ProdutosE.HAM;
    ProdutosE pao = ProdutosE.BREAD;

    public void SMercado(Client client) {
        System.out.println("Temos queijo, fiambre e pão, tu que queres " + client.getName() + "?");
        System.out.printf("\n1-Queijo\n2-Fiambre\n3-Pão\nOpção: ");
        int op = sc.nextInt();
        switch (op) {
            case 1:
                pay.Payments(client,queijo);
                break;
            case 2:
                pay.Payments(client,fiambre);
                break;
            case 3:
                pay.Payments(client,pao);
                break;
            default:
                System.out.printf("Não te esqueças da carteira");
                break;
        }
    }
}
