package learn.java;

public class Main {
    public static void main(String[] args) {
        // here animal1 object is instantiate with Animal class & referred to Animal class
        // so only Animal class variables & method can be accessed by animal1 object
        Animal animal1 = new Animal();
        System.out.println(animal1.toString());
        animal1.sleep(10);

        System.out.println();

        // here animal2 object is instantiate with Animal class & referred to Animal class
        // so only Animal class variables & method can be accessed by animal2 object
        Animal animal2 = new Animal("Mammal", 4, "soil");
        System.out.println(animal2.toString());
        animal2.sleep(5);

        System.out.println();

        // here animal3 object is instantiate with Cat class & referred to Animal class
        // so only Animal class variables & method can be accessed by animal3 object
        // also as Cat class is child class, and we are creating object with no argument constructor
        // child class constructor will call super() by default & then the rest of the line of child class constructor
        Animal animal3 = new Cat();
        System.out.println(animal3.toString());
        animal3.sleep(15);

        System.out.println();

        // here animal4 object is instantiate with Cat class & referred to Animal class
        // so only Animal class variables & method can be accessed by animal4 object
        // also we can't access Cat class members like isEatable, heart, run() etc.
        Animal animal4 = new Cat("Mammal", 4, "Soil", false, 9);
        System.out.println(animal4.toString());

        System.out.println();

        // here animal5 object is instantiate with Cat class & referred to Cat class
        // so both Animal & Cat class variables & method can be accessed by animal5 object
        // also we can access Cat class members like isEatable, heart, run() etc.
        Cat animal5 = new Cat("Mammal", 4, "Soil", false, 9);
        System.out.println(animal5.toString() + " class is " + animal5.getAnimalClass() + " & legs " + animal5.getLegs() + " & living place " + animal5.getLivingPlace());
        animal5.run(10);

        System.out.println();

        // here animal6 object is instantiate with Cat class & referred to Cat class
        // also both Animal & Cat class variables & method can be accessed by animal6 object as Cat class this is a child class of Animal
        Cat animal6 = new Cat();
        animal6.setAnimalClass("Mammal");
        animal6.setEatable(false);
        System.out.println(animal6.toString() + " class is " + animal6.getAnimalClass() + " & eatable is " + animal6.isEatable());
    }
}
