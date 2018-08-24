import java.util.*;
import java.util.Scanner;
public class Game {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Input the number of rounds to play : ");
int Rounds = input.nextInt();
while(Rounds<0){
  System.out.print("Input the number of rounds again : ");
 Rounds = input.nextInt();}
SetUpGame game = new SetUpGame(Rounds);
game.DisplayResults();
}


}
