/*
Garrett Knott
Counting Vowels
10/06/2013

This is an exercise that ask the user to input whatever word they want.
The program will then take the input and find out how many vowels are in the program

So if the word "hello" is input, the program will output "hello has 2 vowels"
*/

import java.util.Scanner;

public class vowels{
	public static void main(String[] args){

	//Initialization of the variables that will be used.
	//character will contain each individual character in order to compare them
	//vowelcount will increment for every vowel in the word
	int i;
	char character;
	int vowelcount = 0;
	
	//Create scanner object to store variables.  Store input in variable "input"
	//Store variable in input.  Find length of variable and subtract by 1, since arrays start at 0.
	Scanner in = new Scanner(System.in);
	String input;
	input = in.next();
	int length = input.length() - 1;
	
	//Cycle through each character of the string, store it in the variable "character".
	//Check if the character is a vowel.  This is case sensitive.  Capital letters can be added.
	for(i=0;i<=length;i++)
	{
	character = input.charAt(i);
	if(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u')
	   vowelcount = vowelcount + 1;
	}
	System.out.println("The amount of vowels in the word " + input + " is: " + vowelcount);
	
	
	
	}
}