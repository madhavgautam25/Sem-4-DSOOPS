class Animal{
    void sound(){
        System.out.println("Sound");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("Dog sound");
    }
    void eat(){
        System.out.println("Dog eating");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Cat sound");
    }
}
public class methodOverridingExample {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.sound();
        // a.eat();
    }

}
