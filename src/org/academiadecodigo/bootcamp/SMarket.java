package org.academiadecodigo.bootcamp;

class SMarket {
    private static String shop="SMarket";
    Produtos queijo = new Produtos("Queijo", shop, 2.5f,100);
    Produtos fiambre = new Produtos("Fiambre", shop, 1.5f,200);
    Produtos pao = new Produtos("Pão", shop,0.10f,50);

    public static String getShop() {
        return shop;
    }

    public Produtos getFiambre() {
        return fiambre;
    }

    public Produtos getPao() {
        return pao;
    }

    public Produtos getQueijo() {
        return queijo;
    }
}
