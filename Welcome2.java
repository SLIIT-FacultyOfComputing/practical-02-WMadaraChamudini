import java.util.Scanner;

public class Welcome2{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Part 1: String Concatenation
        System.out.println("Part 1: String Concatenation");
        System.out.print("Enter your first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter your middle name: ");
        String middleName = scanner.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = scanner.nextLine();

        String fullName = lastName + ", " + firstName + " " + middleName;
        System.out.println("Full name: " + fullName);

        // Part 2: String Comparison
        System.out.println("\nPart 2: String Comparison");
        System.out.print("Enter another full name to compare: ");
        String anotherFullName = scanner.nextLine();

        if (fullName.equalsIgnoreCase(anotherFullName)) {
            System.out.println("The names are the same.");
        } else {
            System.out.println("The names are different.");
        }

        // Part 3: String Modification
        System.out.println("\nPart 3: String Modification");
        String modifiedFullName = fullName.replace('a', '@').replace('e', '3').toUpperCase();
        System.out.println("Modified full name: " + modifiedFullName);

        // Part 4: String Splitting
        System.out.println("\nPart 4: String Splitting");
        String[] nameComponents = fullName.split(",\\s+");
        String lastNameSplit = nameComponents[0];
        String firstNameSplit = nameComponents[1].split("\\s+")[0];
        String middleNameSplit = nameComponents[1].split("\\s+")[1];

        System.out.println("Last Name: " + lastNameSplit);
        System.out.println("First Name: " + firstNameSplit);
        System.out.println("Middle Name: " + middleNameSplit);

        // Part 5: String Trimming
        System.out.println("\nPart 5: String Trimming");
        System.out.print("Enter a string with leading and trailing spaces: ");
        String stringWithSpaces = scanner.nextLine();
        String trimmedString = stringWithSpaces.trim();
        System.out.println("Trimmed string: " + trimmedString);

        // Part 6: Additional Manipulations
        System.out.println("\nPart 6: Additional Manipulations");
        int vowelCount = countVowels(fullName);
        System.out.println("Number of vowels in full name: " + vowelCount);

        scanner.close();
    }

    // Helper method to count vowels
    private static int countVowels(String str) {
        int count = 0;
        for (char c : str.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }
        return count;
    }
}

