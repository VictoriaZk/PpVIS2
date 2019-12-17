package model;

public class Money {
    public int counter;

    public Money(){}

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void addMoney(int money){
        this.counter+=money;
    }

}
