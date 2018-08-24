import java.util.Scanner;
import java.util.Random;
import java.util.*;

public class ThreeDiceScorer extends ThreeDice{

public int dice1, dice2, dice3;


public ThreeDiceScorer(int d1, int d2, int d3){
super(d1,d2,d3);
dice1= d1;
dice2= d2;
dice3= d3;

}
//***************************************
public int Three_dices(){
  return (super.getDie1()+ super.getDie2()+ super.getDie3());
}
public int show(){
  if(super.allDifferent()==true){
    printResult();
   return Three_dices();
  }

  if(super.pair()==true){
  return  (Three_dices()+ 20);
  }

  if(super.threeSame()==true){
    printResult();

    return (Three_dices() + 60);

  }

  if(super.runOfThree()==true){
    printResult();
    return (Three_dices()+ 40);
  }

  return Three_dices();
}
}
