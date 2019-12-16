package model;

public class Money {
    public int counter;

    public Money(){}

    //узнать сколько денег
    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void addMoney(int money){
        this.counter+=money;
    }

    //??????
    public int takeMoney(int money){
        return 0;
    }
}
