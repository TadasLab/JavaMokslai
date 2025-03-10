
public class Main {

    public static void main(String[] args) {
        // you can test how your classes work here

    Dog fido = new Dog("Fido");
    fido.bark();
    System.out.println("---------");
    Cat cat = new Cat();
    cat.purr();
    cat.eat();
    Cat garfield = new Cat("Garfield");
    garfield.purr();
    System.out.println("----------");
    NoiseCapable dog = new Dog();
    dog.makeNoise();
    NoiseCapable gato = new Cat();
    gato.makeNoise();
    }

}
