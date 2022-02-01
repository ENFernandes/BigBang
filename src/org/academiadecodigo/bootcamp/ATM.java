package org.academiadecodigo.bootcamp;

import java.util.Scanner;

public class ATM {
    public void ATM(Client client){
        Scanner sc = new Scanner(System.in);
        Menu menu=new Menu();
        System.out.printf("\n\nATM\nEscolha uma das seguintes opções:");
        System.out.printf("\n1-Extrato da conta\n2-Levantar Dinheiro\n3-Depositar Dinheiro\n4-Sair\nOpção:");
        int op = sc.nextInt();

        switch (op)
        {
            case 1:
                System.out.printf("\n\nO seu saldo atual é: "+client.getBanck());
                ATM(client);
                break;
            case 2:
                System.out.printf("Quanto dinheiro pretende levantar: ");
                float money = sc.nextFloat();
                client.dedMoneyBank(money);
                client.addMoneyWallet(money);
                break;
            case 3:
                System.out.printf("Quanto dinheiro quer depositar: ");
                float money1 = sc.nextFloat();
                client.addMoneyBanck(money1);
                break;
            case 4:
                System.out.printf("\n\n\n");
                menu.menu(client);
                break;
            default:
                System.out.printf("Opção invalida");
                ATM(client);
                break;
        }


    }
}
