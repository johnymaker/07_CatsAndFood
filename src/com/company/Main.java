package com.company;

public class Main {

    public static void main(String[] args) {

        Cat[] cats = {
                new Cat("Tom", 20),
                new Cat("Barsik", 12),
                new Cat("Zhora", 20),
                new Cat("Murzik", 9)
        };

        Bowl bowl = new Bowl(60);

        for (Cat cat : cats) {
            if (!cat.eat(bowl)) {
                bowl.putFood(20);
                cat.eat(bowl);
            };
        }
        System.out.printf("\n-\nВ тарелке осталось %d еды", bowl.getFood());
    }
}
