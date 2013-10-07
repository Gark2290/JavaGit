/*
Garrett Knott
Palindrome
10/06/2013

This is an exercise that ask the user to input whatever word they want.
The program will then take the word and check if it is a Palindrome.

A palindrome is a word that is spelled the the same way both forward and backwards.

So if the word "racecar" is input, the program will output "racecar is a palindrome".
*/

import java.util.Scanner;

public class palindrome{
	public static void main(String[] args){
	
		//Creating the input variable and the reverse input variable.
		//Creating the Scanner object to take in the input
		//Creating the length variable to take in the length of the input word.
		String input;
		String rinput = "";	
		Scanner in = new Scanner(System.in);
		int length;
		
		//Storing the word into the variable "input".
		//Reversing the input and storing it into the "rinput" string utilizing the for loop.
		input = in.next();
		length = input.length() - 1;
		for(int i = length; i >= 0; i--)
		    rinput = rinput + input.charAt(i);
			
		//Comparing input to rinput utilizing the equal() method.
		if(input.equals(rinput))
		   System.out.println(input + " is a palindrome");
		else
		   System.out.println(input + " is not a palindrome");
		
	}
}