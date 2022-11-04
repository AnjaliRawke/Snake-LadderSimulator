package com.bridgelabz;

public class SnakeAndLadder {
	public static void main(String[] args) {
		System.out.println("Start the Snake and Ladder Game");
		int positionFirstPlayer = 0, positionSecondPlayer = 0,count1=0,count2=0;
		int  NPCount1 = 0,LadderCount1=0,SnakeCount1=0;
		int  NPCount2 = 0,LadderCount2=0,SnakeCount2=0;
		boolean currentTurn = true;
		while(positionFirstPlayer != 100 && positionSecondPlayer != 100){
			 if(currentTurn == true){
		        System.out.println("Player 1 currently at Position "+ positionFirstPlayer);
		        int RollDice=(int)(Math.random()*6+1);
		        System.out.println("dice rolls by: "+RollDice);
		        int currentOption = (int)(Math.random()*3+1);
		        switch(currentOption)
        		{
        		case 1:
        		System.out.println("NO PLAY: "+positionFirstPlayer);
        		System.out.println("Player stays in the same position");
			    NPCount1++;
        		currentTurn = false;
        	 	break;
        		case 2:
        		System.out.println("LADDER: "+(RollDice+positionFirstPlayer));
        		System.out.println("Player moves ahead by: "+RollDice);
        		positionFirstPlayer = positionFirstPlayer + RollDice;
        		LadderCount1++;
        		break;
        		case 3:
        		System.out.println("SNAKE: "+(-RollDice+positionFirstPlayer));
        		System.out.println("Player moves behind by: "+RollDice);
        		positionFirstPlayer = positionFirstPlayer - RollDice;
        		SnakeCount1++;
        		currentTurn = false;
        		}
		       count1++;
        		if(positionFirstPlayer < 0){
        		    positionFirstPlayer = 0;
        		}
        		if(positionFirstPlayer > 100){
        		    positionFirstPlayer -= RollDice;
        		}
        		
		    }
		    else {
		        System.out.println("Player 2 currently at Position "+ positionSecondPlayer);
		        int RollDice=(int)(Math.random()*6+1);
		        System.out.println("dice rolls by: "+RollDice);
		        int currentOption = (int)(Math.random()*3+1);
		        switch(currentOption)
        		{
        		case 1:
        		System.out.println("NO PLAY: "+positionSecondPlayer);
        		System.out.println("Player stays in the same position");
        		NPCount2++;
        		currentTurn = true;
        	 	break;
        		case 2:
        		System.out.println("LADDER: "+(RollDice+positionSecondPlayer));
        		System.out.println("Player moves ahead by: "+RollDice);
        		positionSecondPlayer = positionSecondPlayer + RollDice;
        		LadderCount2++;
        		break;
        		case 3:
        		System.out.println("SNAKE: "+(-RollDice+positionSecondPlayer));
        		System.out.println("Player moves behind by: "+RollDice);
        		positionSecondPlayer = positionSecondPlayer - RollDice;
        		SnakeCount2++;
        		currentTurn = true;
        		}
		       count2++;
        		if(positionSecondPlayer < 0){
        		    positionSecondPlayer = 0;
        		}
        		if(positionSecondPlayer > 100){
        		    positionSecondPlayer -= RollDice;
        		}
		        
		    }
		    System.out.println(" ");
			}
		
		if(positionFirstPlayer == 100){
			System.out.println("First Player Rolled Dice "+count1+" times:"+" NO PLAY Came "+NPCount1+" times:"+" Ladder Came "+LadderCount1+" times:"+" Snake came "+SnakeCount1+" times" );
		    System.out.println("First Player won");
		}
		else {
			System.out.println("Second Player Rolled Dice "+count2+" times:"+" NO PLAY Came "+NPCount2+" times:"+" Ladder Came "+LadderCount2+" times:"+" Snake came "+SnakeCount2+" times" );
		    System.out.println("second Player won");
		}
		
	}
}

