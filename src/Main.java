public class Main {
    private static String dogName;
    private static String catName;

    public static void main(String[] args) {
        dogName = Input.getStringInput(" Enter dog's name :");
        Dog dog = new Dog(dogName);

        catName = Input.getStringInput(" Enter cat's name :");
        Cat cat = new Cat(catName);

        catName = Input.getStringInput(" Enter cat's name :");
        Cat cat1 = new Cat(catName);

        dogName = Input.getStringInput(" Enter dog's name :");
        Dog dog1 = new Dog(dogName);

        int dogRunDistance = Input.getIntInput(" Enter dog's distance for running :");
        dog.run(dogRunDistance);

        int dogSwimDistance = Input.getIntInput(" Enter dog's distance for swimming :");
        dog.swim(dogSwimDistance);

        int catRunDistance = Input.getIntInput(" Enter cat's distance for running ; ");
        cat.run(catRunDistance);

        System.out.println("Quantity animals is : " + Animals.getAnimalCount());
        System.out.println("Quantity dogs is : " + Dog.getDogCount());
        System.out.println("Quantity cats is : " + Cat.getCatCount());

    }
}
