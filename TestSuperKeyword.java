class Animal{
    void eat(){
        System.out.println("Omnivore");
    }
}
class Lion extends Animal{
    void eat(){
        System.out.println("Non-vegetarian");
    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("Vegetarian");
        super.eat();
    }
}
class Dog extends Animal{
    void eat(){
        super.eat();
    }
}

public class TestSuperKeyword {
    public static void main(String[] args) {
            Lion l = new Lion();
            l.eat();

            Deer d = new Deer();
            d.eat();

            Dog d1 = new Dog();
            d1.eat();
    }
}