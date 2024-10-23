import java.util.List;

public class Zoo {

    /**
     * Feeds different bird sections of the zoo.
     *
     * @param list list of birds of particular type.
     */
    public static void feed(List<? extends Bird> list) {
        // TODO fix method declaration
        System.out.println("Feeding birds");
        // TODO feed birds in the cycle
        for (Bird bird : list) {
            // Call eat method to simulate feeding
            bird.eat();
        }
    }

    /**
     * Adds birds to a flying section of the zoo.
     *
     * @param list list of birds of particular type.
     * @param bird a new bird.
     */
    public static <T extends FlyingBird> void acceptBird(List<? super FlyingBird> list, FlyingBird bird) {
        // TODO fix method declaration
        System.out.println("Accepting a bird to a section");
        // TODO check flying bird wings
        // TODO add a bird to the list and print it
        bird.checkWings(); // Check the wings of the flying bird
        list.add(bird); // Add the bird to the list
        System.out.println(bird); // Print the bird's name
    }

    /**
     * Adds bird to the general list.
     *
     * @param list    list of birds.
     * @param newBird bird to add.
     */
    public static void registerBird(List<Bird> list, Bird newBird) {
        // TODO fix method declaration
        System.out.println("Adding a bird to the birds list");
        // TODO add a bird to list
        // TODO print birds in the cycle
        list.add(newBird); // Add the bird to the list
        for (Bird bird : list) {
            System.out.println(bird); // Print each bird in the list
        }
    }
}