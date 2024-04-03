public class lesson_09 {
    //Скрой все внутренние переменные класса Cat.
    Cat2 cat = new Cat2("Барсик",7,3.5f);
}
class Cat2 {
    private String name;
    private int age;
    private float weight;

    public Cat2() {
    }

    public Cat2(String name, int age, float weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
}
