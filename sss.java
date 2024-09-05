import java.util.Scanner; // Import the Scanner class

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("whats up ");
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
        }

        Scanner myObj = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter username");
        String userName = myObj.nextLine(); // Read user input

        System.out.println("Hello, " + userName); // Output user input"

        Scanner myAge = new Scanner(System.in);
        System.out.println(" How old are you?");
        int age = myAge.nextInt();

        if (age > 21) {
            System.out.println("You can drink");
        } else {
            System.out.println("You can't drink");
        }
    }
}
