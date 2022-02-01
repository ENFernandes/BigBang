package org.academiadecodigo.bootcamp;

import java.util.Scanner;

public class CoffeShop {

    Scanner sc = new Scanner(System.in);
    Payments pay = new Payments();
    ProdutosE cafe = ProdutosE.COFFE;
    ProdutosE beer = ProdutosE.BEER;

    public void tasco(Client client) {
        System.out.println("Cafe ou Fino "+client.getName()+"?");
        System.out.printf("\n1-Cafe\n2-Fino\nOpção: ");
        int op = sc.nextInt();
        switch (op){
            case 1:
                pay.Payments(client,cafe);
                break;
            case 2:
                pay.Payments(client,beer);
                break;
            default:
                System.out.printf("Não te esqueças da carteira");
                break;
        }
    }
}
