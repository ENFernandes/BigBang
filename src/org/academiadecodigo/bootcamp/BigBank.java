package org.academiadecodigo.bootcamp;

import java.util.Scanner;

public class BigBank {

    public static void main(String[] args) {
        Client clients = new Client("Elder", 13721058, 915779269);
        Menu menu=new Menu();
        menu.menu(clients);
    }
}
