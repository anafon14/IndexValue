/**
 * Name: Ana Luiza Fonseca Teixeira
 * Teacher: Mr. Hardman 
 * Assignment 5, Program #1 
 * Date Last Modified: 11/24/2016
 */

import java.util.Scanner;

public class IndexValue {


	public static void main(String[] args) {
		
		Scanner userInput = new Scanner(System.in);
		
		int[] values = {0, 12, 65, 45, 89, 5, 2, 54, 100, 99, 25, 18, 1};
		int userValue;
		int index = -1;
		
		System.out.print("The Array: ");
		
		//Code to display all values
		for(int i = 0; i < values.length; i++){
			
			System.out.print( values[i] + " ");
			
		}
		
		System.out.println();
		System.out.println("\nWhat value do you want the index of?");
		userValue = userInput.nextInt();
		
		for(int i = 0; i < values.length; i++){
			
			if(userValue == values[i]){
				index = i;
			}
		
		}
		
		if (index == -1){
			
			System.out.println("The element cannot be found in the array!");
			
		} else {
				
			System.out.println("The index of the number " + userValue + " is " + index + "!");
				
		}
		
		userInput.close();

	}

}
