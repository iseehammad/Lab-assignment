public class Main {
    public static void main(String[] args) {
        // Create an Artist object
        Artist artist1 = new Artist("Vincent van Gogh");

        // Create two Artwork objects
        Artwork artwork1 = new Artwork("Starry Night", 1889, artist1);
        Artwork artwork2 = new Artwork("Sunflowers", 1888); // Default artist

        // Display initial artwork details
        System.out.println("Original Artwork Details:");
        artwork1.displayInformation();
        artwork2.displayInformation();

        // Encapsulation: Set title and year for the second artwork
        artwork2.setTitle("Sunflowers");
        artwork2.setYear(1888);

        // Display updated artwork details
        System.out.println("\nUpdated Artwork Details:");
        artwork2.displayInformation();

        // Copy Operations
        Artwork shallowCopy = artwork1.shallowCopy();
        Artwork deepCopy = artwork1.deepCopy();

        // Display copied artworks
        System.out.println("\nShallow Copy Details:");
        shallowCopy.displayInformation();
        System.out.println("Deep Copy Details:");
        deepCopy.displayInformation();

        // Modify the original artwork's artist name
        artist1 = new Artist("Pablo Picasso"); // Change the artist's name

        // Display details again to see the effect of deep vs shallow copy
        System.out.println("\nAfter Modifying Original Artwork's Artist:");
        artwork1.displayInformation();
        shallowCopy.displayInformation(); // Should show the old name
        deepCopy.displayInformation(); // Should show the original name
    }
}
