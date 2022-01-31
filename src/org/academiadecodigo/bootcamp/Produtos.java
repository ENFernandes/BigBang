package org.academiadecodigo.bootcamp;

public class Produtos {
    private String name;
    private float price;
    private String shop;
    private int stock;

    public void setStock(int stock) {
        this.stock = stock;
    }
    public int getStock() {
        return stock;
    }

    public void setShop(String shop) {
        this.shop = shop;
    }
    public String getShop() {
        return shop;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }

    public Produtos(String name,String shop, Float price,int stock)
    {
        this.setName(name);
        this.setShop(shop);
        this.setPrice(price);
        this.setStock(stock);
    }
    public void list(){
        getName();
        getPrice();
    }

}
