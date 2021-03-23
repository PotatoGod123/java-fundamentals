import java.time.LocalDateTime;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int dogCount = 1;
        int catCount = 2;
        int turtleCount = 0;
        System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");
        System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");
        System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

        flipNHeads(1);
        flipNHeads(3);
        clock();
    }

    public static String pluralize(String animal, int number) {
        if (number == 0 || number > 1) {
            return animal + "s";
        }

        return animal;
    }

    public static void flipNHeads(int flips) {
        Random rand = new Random();
        int countOfHeads = 0;
        int countOfFlips = 0;

        while (countOfHeads < flips) {
            countOfFlips++;
            double randomNumber = rand.nextDouble();
            if (randomNumber >= .5) {
                System.out.println("heads");
                countOfHeads++;

            } else {
                System.out.println("tails");
                countOfHeads=0;
            }
        }

        System.out.println("It took" + " " + countOfFlips +" "+ pluralize("flip", countOfFlips) + " " + "to flip "
                + countOfHeads + " " + pluralize("head", countOfHeads) + " in a row.");
    }

    public static void clock(){
        
        int secondTracker = 61;
        while(true){
            LocalDateTime now= LocalDateTime.now();
            int hour = now.getHour();
            int minute = now.getMinute();
            int second = now.getSecond();

            

            if(secondTracker!=second){
                System.out.println(hour+":"+minute+":"+second);
            }
            secondTracker = second;
        }
    }

}