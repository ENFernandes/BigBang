package org.academiadecodigo.bootcamp;

public class Client {

    private String name;
    private int CC;
    private int contact;
    Bank conta = new Bank();

    public float getSaldo() {
        return conta.getMoney();
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

    public Client (String name, int cc, int contact)
    {
        this.setName(name);
        this.setContact(contact);
        this.setCC(cc);
    }

    public void addMoney(float money)
    {
        conta.setMoney(conta.getMoney()+money);
    }

    public void dedMoney(float money)
    {
        if(conta.getMoney()-money>=0) {
            conta.setMoney(conta.getMoney() - money);
        }
        else {
            System.out.printf("\noperação negada");
        }
    }






}
