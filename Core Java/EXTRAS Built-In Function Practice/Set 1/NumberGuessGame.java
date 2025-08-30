import java.util.*;

public class NumberGuessGame {
    static int guessNum(int low, int high) {
        return new Random().nextInt(high - low + 1) + low;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int low = 1, high = 100;
        String feedback;
        int g;
        System.out.println("Think of a number between 1 and 100.");
        do {
            g = guessNum(low, high);
            System.out.println("Is it " + g + "? (high/low/correct)");
            feedback = sc.next();
            if (feedback.equalsIgnoreCase("high"))
                high = g - 1;
            else if (feedback.equalsIgnoreCase("low"))
                low = g + 1;
        } while (!feedback.equalsIgnoreCase("correct"));
        System.out.println("Got it!");

        sc.close();
        
    }
}
