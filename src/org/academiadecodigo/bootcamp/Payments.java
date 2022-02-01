package org.academiadecodigo.bootcamp;
import java.util.Objects;
import java.util.Scanner;

public class Payments {
    Scanner sc = new Scanner(System.in);

    public void Payments(Client client, ProdutosE teste) {
        Menu menu = new Menu();
        System.out.println("\nSão " + teste.getPrice() + "€ pelo " + teste.getName());
        System.out.printf("Forma de pagamento:\n1-Dinheiro\n2-MB\nOpção: ");
        int op = sc.nextInt();
        switch (op) {
            case 1:
                if (client.dedMoneyWallet(teste.getPrice())) {
                    System.out.println("Obrigado volte sempre");
                    teste.setQuant(teste.getQuant() - 1);
                    menu.menu(client);
                } else
                    Payments(client,teste);
                break;
            case 2:
                if (client.dedMoneyBank(teste.getPrice())) {
                    System.out.println("Obrigado volte sempre");
                    menu.menu(client);
                } else
                    Payments(client,teste);
                break;
            default:
                System.out.println("Paga o que deves boi!!");
                Payments(client,teste);
                break;
        }
    }
}
