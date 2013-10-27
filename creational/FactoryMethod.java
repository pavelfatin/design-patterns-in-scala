public interface Animal {}

private class Dog implements Animal {}

private class Cat implements Animal {}

public class AnimalFactory {
    public static Animal createAnimal(String kind) {
        if ("cat".equals(kind)) return new Cat();
        if ("dog".equals(kind)) return new Dog();
        throw new IllegalArgumentException();
    }
}

AnimalFactory.createAnimal("dog");
