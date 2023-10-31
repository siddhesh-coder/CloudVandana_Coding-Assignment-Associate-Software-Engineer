//Check if the input is pangram or not. (Pangram is a sentence that contains all the alphabet from a-z)

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        scanner.close();

        boolean isPangram = isPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        Set<Character> alphabetSet = new HashSet<>();

        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                alphabetSet.add(Character.toLowerCase(c)); 
            }
        }

        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (!alphabetSet.contains(ch)) {
                return false; 
            }
        }
        return true;
    }
}
