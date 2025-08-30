import java.util.*;

public class RockPaperScissors {
    static String getComputerChoice() {
        String[] choices = { "rock", "paper", "scissors" };
        return choices[new Random().nextInt(3)];
    }

    static String findWinner(String user, String comp) {
        if (user.equals(comp))
            return "Draw";
        if ((user.equals("rock") && comp.equals("scissors")) ||
                (user.equals("scissors") && comp.equals("paper")) ||
                (user.equals("paper") && comp.equals("rock"))) {
            return "User";
        }
        return "Computer";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userWins = 0, compWins = 0, draws = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter rock/paper/scissors: ");
            String user = sc.next().toLowerCase();
            String comp = getComputerChoice();

            System.out.println("Computer: " + comp);
            String winner = findWinner(user, comp);
            System.out.println("Result: " + winner);

            if (winner.equals("User"))
                userWins++;
            else if (winner.equals("Computer"))
                compWins++;
            else
                draws++;
        }
        sc.close();

        System.out.println("  ");
        System.out.println("--- Stats ---");
        System.out.println("User wins: " + userWins);
        System.out.println("Computer wins: " + compWins);
        System.out.println("Draws: " + draws);
        System.out.printf("User Win %%: %.2f%%\n", (userWins / 5.0) * 100);
    }
}
