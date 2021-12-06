package com.company;

public class Bowl {

    private int food;

    public Bowl(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int amount) {
        if (food - amount >= 0) {
            food -= amount;
            return true;
        } else {
            return false;
        }
    }

    public void putFood(int amount) {
        food += amount;
        System.out.printf("\n-\nВ тарелку добавили еды +%d. Всего %d\n-", amount, food);
    }

    public int getFood() {
        return food;
    }
}
