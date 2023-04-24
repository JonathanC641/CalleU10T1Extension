import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many initial bacteria? ");
        int initial = input.nextInt();
        System.out.print("How many hours will the bacteria sit? ");
        int hours = input.nextInt();
        long bacteria = numBacteriaAlive(initial,hours);
        System.out.println("After " + hours + ", there will be " + bacteria + " bacteria");
    }

    public static long numBacteriaAlive(long initial, int hour) {
        // WRITE THIS METHOD to use RECURSION to find the number of bacteria!

        if (hour == 0){
            return initial;
        }else{
            long numberOfBacteriaLastHour = numBacteriaAlive(initial, hour - 1);
            return numberOfBacteriaLastHour + numberOfBacteriaLastHour * 2;
        }
    }
}

