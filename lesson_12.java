public class lesson_12 {
    //Скрой все внутренние переменные класса Cat и Dog.
    //Также скрой все методы, кроме тех, с помощью которых эти классы взаимодействуют друг с другом.
    public static void main(String[] args) {
        Cat5 cat = new Cat5("Vaska", 5);
        Dog5 dog = new Dog5("Sharik", 4);

        cat.isDogNear(dog);
        dog.isCatNear(cat);
    }
}
class Cat5 {
    private String name;
    private int speed;

    public Cat5(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    private String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isDogNear(Dog5 dog) {
        return this.speed > dog.getSpeed();
    }
}

class Dog5 {
    private String name;
    private int speed;

    public Dog5(String name, int speed) {
        this.name = name;
        this.speed = speed;
    }

    private String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public boolean isCatNear(Cat5 cat) {
        return this.speed > cat.getSpeed();
    }
}

