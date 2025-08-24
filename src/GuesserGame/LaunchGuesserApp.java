package GuesserGame;
import java.util.*;
class Guesser{
int guessedNumber;

 int guessingNumber(){
     System.out.println("Guesser ! Please guess the number:");
        Scanner sc = new Scanner(System.in);
        guessedNumber = sc.nextInt();
        return guessedNumber;
}

}
class Player
{
    int guessedNumber;

    int guessingNumber()
    {
        System.out.println("Player! Please Guess a number between 1 to 10 ");
        Scanner scan=new Scanner(System.in);
        guessedNumber= scan.nextInt();
        return guessedNumber;
    }

}




class Umpire{
    int numFromGuesser;
    int numFromP1;
    int numFromP2;
    int numFromP3;
  void collectNumfromGuesser(){
     Guesser guesser = new Guesser();
      numFromGuesser = guesser.guessingNumber();
 }
  void  collectNumFromPlayers(){
      Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

         numFromP1=  p1.guessingNumber();
        numFromP2=  p2.guessingNumber();
        numFromP3=  p3.guessingNumber();
    }
    void compare()
    {
        if(numFromGuesser == numFromP1)
        {
            if( numFromGuesser == numFromP1 && numFromGuesser == numFromP2){
                System.out.println("All three Player correct !Game tied");
            }else if( numFromGuesser == numFromP2){
                System.out.println("Player 1 and Player 2 guessed correct");
            }else if(numFromGuesser == numFromP3){
                System.out.println("Player 1 and Player 3 Guessed correct");
            }
            else {
                System.out.println("Player 1 won the Game");
            }
        } else if ( numFromGuesser == numFromP2) {
            if(numFromGuesser == numFromP3)
            System.out.println("Player 2 won the Game");
        } else if (numFromGuesser == numFromP3) {
            System.out.println("Player 3 Won the Game ");

        }
        else{
            System.out.println("Game Lost Try Again");
        }
    }

}

public class LaunchGuesserApp {
    public static void main(String[] args) {
        System.out.println("game Started ");
       Umpire u = new Umpire();
       u.collectNumfromGuesser();
       u.collectNumFromPlayers();
       u.compare();
        System.out.println("Game Completed ");
    }

}
