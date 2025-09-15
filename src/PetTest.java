public class PetTest {
    public static void main(String[] args) {
        System.out.println("Welcome to the Pet Clinic!");
        System.out.println("============================");

        Pet dog = new Dog("Buddy", 3);
        Pet cat = new Cat("Whiskers", 2);
        Pet bird = new Bird("Tweety", 1);

        dog.displayInfo();
        dog.makeSound();

        System.out.println();

        cat.displayInfo();
        cat.makeSound();

        System.out.println();

        bird.displayInfo();
        bird.makeSound();
    }
}
