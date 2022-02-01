package org.academiadecodigo.bootcamp;

public class Client {

    private String name;
    private int CC;
    private int contact;

    Bank conta = new Bank();
    public Client (String name, int cc, int contact) {
        this.setName(name);
        this.setContact(contact);
        this.setCC(cc);
    }

    public String getName()
    {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getCC() {
        return CC;
    }
    public void setCC(int CC)
    {
        this.CC = CC;
    }

    public int getContact() {
        return contact;
    }
    public void setContact(int contact) {
        this.contact = contact;
    }

    public void addMoneyBanck(float money)
    {
        conta.setBanck(conta.getBanck()+money);
    }
    public boolean dedMoneyBank(float money) {
        if(conta.getBanck()-money>=0) {
            conta.setBanck(conta.getBanck() - money);
            return true;
        }
        else {
            System.out.println("\noperação negada");
            return false;
        }
    }

    public void addMoneyWallet(float money)
    {
        conta.setWallet(conta.getWallet()+money);
    }
    public boolean dedMoneyWallet(float money) {
        if(conta.getWallet()-money>=0) {
            conta.setWallet(conta.getWallet() - money);
            return true;
        }
        else {
            System.out.println("\nNão tens dinheiro na carteira");
            return false;
        }
    }

    public float getBanck() {
        return conta.getBanck();
    }
    public float getWallet(){
        return conta.getWallet();
    }




}
