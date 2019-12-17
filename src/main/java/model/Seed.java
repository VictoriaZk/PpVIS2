package model;

import java.util.List;

public class Seed implements Something{
    private String name;
    private int count;

    public Seed(){}

    public Seed(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public List<Something> buy(Money money, String name){
        return null;
    }
}
