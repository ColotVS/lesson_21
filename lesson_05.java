public class lesson_05 extends Animal {
    //Напиши шесть классов: Animal (животное), Cow (корова), Pig (свинья), Sheep (овца), Bull (бык) и Goat (козел).
    //Унаследуй корову, свинью, овцу, быка и козла от животного.
    public static void main(String[] args) {
        Cow cow = new Cow();
        cow.move();
        Pig pig = new Pig();
        pig.move();
        Sheep sheep = new Sheep();
        sheep.move();
        Bull bull = new Bull();
        bull.move();
        Goat goat = new Goat();
        goat.move();
    }
}
class Animal{
    public void move(){
        System.out.println("Я хожу");
    }
}
class Cow extends Animal{

}
class Pig extends Animal{

}
class Sheep extends Animal{

}
class Bull extends Animal{

}
class Goat extends Animal{

}
