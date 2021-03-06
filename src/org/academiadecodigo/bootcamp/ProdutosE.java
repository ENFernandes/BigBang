package org.academiadecodigo.bootcamp;

public enum ProdutosE {
    COFFE ("Cafe", 1f,12),
    BEER ("Fino", 1f,12),
    CHEESE("Queijo", 2.5f, 10),
    HAM("Fimbre", 1.2f,3),
    BREAD("Bread",0.1f,40);
    private String name;
    private float price;
    private int quant;
    ProdutosE(String name, float price,int quant) {
        this.name=name;
        this.price=price;
        this.quant=quant;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public int getQuant() {
        return quant;
    }
    public void setQuant(int quant) {
        this.quant = quant;
    }
}
