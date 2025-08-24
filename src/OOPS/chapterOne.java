

package OOPS;
class Playing{
    int id;
    int sport;
    int net;
    String Name;

    void warmup(){
        System.out.println("Player is warming Up");
    }
    void starter(){
        System.out.println("Player is Starting the game");
    }
    void leading(){
        System.out.println("Player is eading the Game");
    }
    void referee(){
        System.out.println("Coach is here to lead a game");
    }
}





public class chapterOne {
    public static void main(String[] args) {
      Playing pl = new Playing();
      pl.leading();
      pl.starter();
      pl.warmup();
      pl.referee();

    }
}
