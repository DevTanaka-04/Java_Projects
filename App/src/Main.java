
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Enter number of dice to roll: ");
        int dice = input.nextInt();

        for (int i = 0; i < dice; i++) {
            int roll = random.nextInt(6);
            System.out.println("You rolled " + roll);
        }

    }
    static void printDie(int roll){

    }
}