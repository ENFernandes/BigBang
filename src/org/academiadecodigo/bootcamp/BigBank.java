package org.academiadecodigo.bootcamp;

public class BigBank {

    public static void main(String[] args) {
        Client clients = new Client("Elder",13721058,915779269);
        System.out.printf("Cliente: "+clients.getName() + "\ntem o CC: " + clients.getCC() + "\ncontacto Nª: "+clients.getContact() + "\nO Saldo do artista é: "+ clients.getSaldo());
        coffe();

        clients.addMoney(23.6f);
        System.out.printf("\n\nSaldo atual: "+clients.getSaldo());
        clients.dedMoney(1200f);
        System.out.printf("\n\nSaldo atual: "+clients.getSaldo());

    }
    public static void coffe()
    {
        CoffeShop coffe = new CoffeShop();
    }

}
