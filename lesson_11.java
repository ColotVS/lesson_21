public class lesson_11 {
    //Скрой все внутренние переменные класса Cat, а также методы, позволяющие менять внутреннее состояние объектов класса Cat.
}
class Cat4 {
    private String name;
    private int age;
    private int weight;

    public Cat4(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }
}
