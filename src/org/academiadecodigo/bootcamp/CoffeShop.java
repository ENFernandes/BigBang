package org.academiadecodigo.bootcamp;

public class CoffeShop {

    public static String shop="CoffeShop";

    /*Produtos coffe = new Produtos("Coffe", shop, 0.5f,100);
    Produtos beer = new Produtos("Beer", shop, 1f,200);
    Produtos tabaco = new Produtos("Tabaco", shop,5f,50);*/

    ProdutosE cafe = ProdutosE.COFFE;
    ProdutosE beer = ProdutosE.BEER;
    
    public CoffeShop()
    {
        System.out.printf("\n\n" + beer.getName() + " Preço: "+ beer.getPrice()+"€");
        beer.setQuant(beer.getQuant()-1);
        System.out.printf("\n\nQ beer: "+beer.getQuant());

    }

}
