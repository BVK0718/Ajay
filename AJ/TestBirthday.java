// TestBirthday.java
import java.util.Scanner;

public class TestBirthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Get user input for birthday
            System.out.println("Enter the date of birth (dd mm yyyy): ");
            int day = scanner.nextInt();
            int month = scanner.nextInt();
            int year = scanner.nextInt();

            // Test case with dynamic user input
            Birthday birthday = new Birthday(day, month, year);
            System.out.println("Date of Birth: " + birthday);

        } catch (WrongInputException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}