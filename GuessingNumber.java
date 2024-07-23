import java.util.*;
public class GuessingNumber {
    public static void main(String[] args) {
        Random random=new Random();
        int randomNumber= random.nextInt(1,100);
        Scanner s=new Scanner(System.in);

        System.out.println("********************** GUESSING NUMBER GAME **********************");
        System.out.println("You have 10 choices.Upon guessing correctly in less than 10 choices you will win.Otherwise you loose this game.");

        int choices=10;

        while(choices>0){
            System.out.println("Enter your guessed number : ");
            int guessed=s.nextInt();
            if(guessed==randomNumber){
                System.out.println("Congratulations,You guessed correct number.");
                System.out.println("Your score is : "+choices*10);
                break;
            } else if (guessed > randomNumber) {
                System.out.println("You guessed Greater Than the correct number.");
            } else if (guessed < randomNumber) {
                System.out.println("You guessed Smaller Than the correct number.");
            }
            choices--;
        }
         if(choices==0){
            System.out.println("Sorry you lose this game.Better Luck Next Time");
        }
    }
}
