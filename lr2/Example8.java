package lr2;

public class Example8 {
    public static void main(String[] args) {
        Dog dog = new Dog("Бобик", 3, "Лабрадор");
        Cat cat = new Cat("Мурка", 2, "Черный");
        Bird bird = new Bird("Кеша", 1, true);

        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
        dog.fetch();

    }
}

class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Животное издает звук");
    }

    public void info() {
        System.out.println("Имя: " + name + ", Возраст: " + age);
    }
}

class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Гав-гав!");
    }

    public void fetch() {
        System.out.println(name + " приносит палку!");
    }
}

class Cat extends Animal {
    private String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    public void makeSound() {
        System.out.println("Мяу-мяу!");
    }
}

class Bird extends Animal {
    private boolean canFly;

    public Bird(String name, int age, boolean canFly) {
        super(name, age);
        this.canFly = canFly;
    }

    @Override
    public void makeSound() {
        System.out.println("Чирик-чирик!");
    }
}

abstract class Shape {
    public abstract double getArea();
    public abstract double getPerimeter();
}


