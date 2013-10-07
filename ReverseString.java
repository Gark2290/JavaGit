/*
Garrett Knott
Reversing Strings
10/06/2013

This is an exercise that ask the user to input whatever word they want.
The program will then take the input and reverse it and output it to the screen.

So the word "hello" will be reversed to "olleh"
*/

import java.util.Scanner;

public class ReverseString{
	public static void main(String[] args){
	
	//Initialization of the variables that will be used.
	//The variable input will contain the input of the string
	//The variable length will contain the length of the input.
	String input;
	int length;
		
	//Create scanner object that takes in input
	//Ask for input
	//Store input in the variable "input"
	Scanner in = new Scanner(System.in);
	System.out.print("Enter a word here: ");
	input = in.next();
	
	//Use built in length method, to find length of string.
	//Subtract 1 from the length because arrays start at 0
	//Use a for loop to cycle through the string from the end to the beginning.  Printing each character one by one.
	//The charAt() method allows to access each character 1 by 1
	length = (word.length())-1;
	for(int i = length; i >= 0; i--)
	{
	System.out.print(word.charAt(i));
	}
	
	
	
	}
}