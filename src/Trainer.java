public class Trainer {
    public static void trainPet(Trainable pet) {
        pet.performTrick();
    }

    public static void main(String[] args) {
        System.out.println("Training Session Started!");
        System.out.println("=============================");

        Trainable dog = new Dog("Buddy", 3);
        Trainable bird = new Bird("Tweety", 1);

        trainPet(dog);
        trainPet(bird);
    }
}
