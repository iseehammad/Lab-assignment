public class Artist {
    private String name;

    // Constructor
    public Artist(String name) {
        this.name = name;
    }

    // Getter
    public String getName() {
        return name;
    }

    // Display Information
    public void displayInformation() {
        System.out.println("Artist Name: " + name);
    }
}
