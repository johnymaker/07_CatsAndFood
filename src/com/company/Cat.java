package com.company;

public class Cat {

    private String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = false;
    }

    public boolean eat(Bowl bowl) {
        if (bowl.decreaseFood(appetite)) {
            System.out.printf("\n%s скушал %s и сытый лежит на диване", name, appetite);
            return true;
        } else {
            System.out.printf("\n%s в негодовании, он голоден. В тарелке слишком мало еды %d ", name, bowl.getFood());
            return false;
        }
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }
}
