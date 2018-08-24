import java.util.Scanner;

public class SetUpGame{
  // Create a MD array as an objec from ThreeDiceScorer
protected ThreeDiceScorer [][] GameField;
//*************************************************************************
// Create a constructor thst will take one parameter Rounds as an integer.
public SetUpGame(int Rounds){
 int Num_Of_Players= 2;
    GameField = new ThreeDiceScorer[Num_Of_Players][Rounds];

for(int j=0; j<Num_Of_Players; j++){
  for(int i=0; i<Rounds; i++){
    GameField[j][i]= new ThreeDiceScorer(roll(),roll(), roll());
      }
    }
  }
//*****************************MY METHODS***********************************
// A method to Roll the dice
  public static int roll(){
      int dice= (int)(Math.random()*6+1);
  return dice;
  }
//****************************************************************
// A method to calculate and print all the results.
public void DisplayResults(){
// I will Initialize three integers(to zero) two for the loops and one for the max score per round.
int j,i, Highest_Score;
// Two integers variables will be created to set up the loopps for the maximum score per round and total wins.
int Number_Of_Players= GameField.length;
int number_Of_Rounds= GameField[1].length;
// WE NEED TO CREATE TWO MORE ARRAYS THAT THE POINTS AND TOTAL WINS WILL BE STORED IN.
int Points[]= new int[Number_Of_Players];
int Total_Wins[]= new int [Number_Of_Players];
// The new arrays need to be Initialized to zero
for(j=0; j<Number_Of_Players; j++){
Points[j]=0;
Total_Wins[j]=0;
}

for (i = 0; i < number_Of_Rounds; i++) {
System.out.print("Round " + (i+1) + " ");
for (j= 0; j< Number_Of_Players; j++) {
System.out.print(" Player " + (j+1) + ": ");
System.out.print(GameField[j][i].getDie1() + " " + GameField[j][i].getDie2() + " " + GameField[j][i].getDie3());
System.out.printf(" Points: %2d  :", GameField[j][i].show());
Points[j] += GameField[j][i].show();
      }
   }
// find out the max points per round
i=0;
j=0;
Highest_Score = GameField[0][i].show();
for(j=1; j<=Number_Of_Players; j++){
  if(GameField[0][i].show()>GameField[1][i].show()){
  Highest_Score = GameField[0][i].show();}
  else{
    Highest_Score= GameField[1][i].show();
  }
}
// New array to store the number of players that have the max score.
  int[] TopPlayer = new int[Number_Of_Players];
  int counter = 0;
  for (j = 0; j < Number_Of_Players; j++) {
  if (Highest_Score == GameField[j][i].show()) {
  TopPlayer[counter] = j;
  counter++;
}
      }


  if (counter > 1)
  { System.out.println(" Tie!!!");
     } else
  {
         System.out.println(" The winner for this round is player " + (TopPlayer[0]+1));
         Total_Wins[TopPlayer[0]]++;
             }


System.out.println("Overall wins:");
for (j = 0; j < Number_Of_Players; j++) {
  System.out.print(" Player " + (j+1) + ": " + Total_Wins[j]);
     }

System.out.println();
// The total points for the both players.
System.out.println("Total points:");
for (j = 0; j < Number_Of_Players; j++) {
System.out.print(" Player " + (j+1) + ": " + Points[j]);
             }
 System.out.println();
// find out the average number of points for each player (per round).
System.out.println("Average points per round:");
for (j = 0; j < Number_Of_Players; j++) {
  if (number_Of_Rounds > 0)
  { System.out.printf(" Player " + (j+1) + ": %.1f", (1.0*Points[j]/number_Of_Rounds) );
} else {
   System.out.printf(" Player " + (j+1) + ": %.1f", 0.0 ); }
             }
System.out.println();
//******************************************************
Highest_Score = Points[0];
for (j = 1; j < Number_Of_Players; j++)
{ Highest_Score = Math.max(Highest_Score, Points[j]); }
 TopPlayer = new int[Number_Of_Players];
 counter = 0;
for (i = 0; i < Number_Of_Players; i++) {
if (Highest_Score == Points[i]) {
TopPlayer[counter] = i;
counter++;
}
}

if (counter > 1) //** If there is more than one player winner..
{ System.out.println("Overall points winner is tied!"); }

else //** ... else print out the points winner.
{ System.out.println("Overall points winner is player " + (TopPlayer[0]+1) + "."); }


  }

}
