//Enter a Roman Number as input and convert it to an integer. (ex IX = 9) 
import java.util.HashMap;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a Roman Value: ");
        String roman = scanner.nextLine();
        scanner.close();

        int result = romanToInteger(roman);
        System.out.println(roman +" = "+ result);
    }

    public static int romanToInteger(String s) {
  
        HashMap<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int prevValue = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int currValue = romanMap.get(s.charAt(i));
            if (currValue >= prevValue) {
                result += currValue;
            } else {
                result -= currValue;
            }

            prevValue = currValue;
        }

        return result;
    }
}
