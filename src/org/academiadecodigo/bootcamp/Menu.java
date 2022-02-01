package org.academiadecodigo.bootcamp;
import java.util.Scanner;
public class Menu {
    static boolean first = true;
    CoffeShop coffe = new CoffeShop();
    SMarket sMarket = new SMarket();
    ATM atm = new ATM();
    Scanner sc = new Scanner(System.in);
    public void menu(Client client) {
        if(first){
            System.out.println("Hello " + client.getName() + " escolhe o que queres fazer:");
            first = false;
        }else {
            System.out.printf("");
        }
        System.out.printf("Só para que conste tens agora na carteira: "+client.getWallet());
        System.out.printf("\n1- Super mercado da esquina\n2- Tasco\n3- ATM\n4- Sair\nOpção: ");
        int op = sc.nextInt();

        switch (op) {
            case 1:
                sMarket.SMercado(client);
                break;
            case 2:
                coffe.tasco(client);
                break;
            case 3:
                System.out.printf("Numero CC:");
                int cc = sc.nextInt();
                int cont = 2;
                while (cont != 0) {
                    if (client.getCC() == cc) {
                        atm.ATM(client);
                    } else {
                        cont--;
                        System.out.printf("So tens mais " + cont + " tentativas");
                        System.out.printf("\nNumero CC:");
                        cc = sc.nextInt();
                    }
                }
                System.out.printf("Provavelmente és um Guna de matosinhos por isso Adeus");
                System.exit(666);
                break;
            case 4:
                System.exit(69);
                break;
            default:
                System.out.println("Opção não é valida");
                menu(client);
                break;
        }

    }
}
