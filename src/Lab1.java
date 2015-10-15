import java.util.Random;
import java.util.Scanner;


public class Lab1 {
public static void main(String[] args){
		
		
		Scanner input = new Scanner(System.in);
		
		
		Random 	dice = new Random();
		
		char decision = '0';
		int correct = 0;
		int times = 0;
		int even =0;
		int odd=0;
		
		System.out.println("Hey wanna play THE Dice Game, \nPress y to roll dice");
		decision = input.next().charAt(0);
		
		 char choice = Character.toUpperCase(decision);
		
		
		if(choice =='Y'){
			
			
			int randomDice;
			randomDice= 1 +dice.nextInt(6);
			
			System.out.println("Okay, So Guess the dice: Enter #(1-6)");
			int userGuess = input.nextInt();
			//int userGuess2 = 0;
			
			//System.out.printf("The dice was %d", randomDice);
				
						if(userGuess<=6)
						{
									
							do{
								
								randomDice= 1 +dice.nextInt(6);
									if(userGuess>0)
										{
			
										times++;
				
										}
									if((userGuess%2)==0)
				
											even++;
										
									else
										odd++;
									
			
									if(userGuess==randomDice)
										{
											correct++;
											System.out.println("Correct");
										
										
	
										}
									else
										{
										System.out.println("Sorry incorrect");
										}
									
									
									System.out.println("Play again, Guess#(1-6), If no type 0");
									userGuess = input.nextInt();
									
									
							  }while(userGuess>0);
									
									
							
									float percentage = (float) (correct*10 / times);
			
							System.out.printf("The number of times you played where:%d\n", times);
							System.out.printf("The times you answered correct %% were:%f\n",percentage);
							
			
						}
			
						else
						{
							System.out.println("Sorry invalid function");
						}
			
			
		}
		
				
		
		
		else{
			System.out.println("Sorry then leave");
		}
		
		
		
	}
}
