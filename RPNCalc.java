/*Garrett Knott
  RPN Calculator
  10/07/2013
  This is an exercise to make a Reverse Polish Notation Calculator.
  I did this as a C project in my multicore course as a warm up lab for the semester.
  So I just wanted to convert this to a Java program.
  
  The stack class in Java differed a little bit from the C++ stack API.
  So I had to change some things around.  On the other hand by doign this assignment
  I got to learn how to use the String Tokenizer and differnt forms of IO.
  
  Borrowed heavily from http://www.stacken.kth.se/~foo/rpn/#Java
*/

import java.util.Stack;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RPNCalc{
	public static void main(String[] args) throws IOException{
	
	InputStreamReader stream = new InputStreamReader(System.in);
	BufferedReader bf = new BufferedReader(stream);
	Stack<Double> rpnStack = new Stack<Double>();
	
	Double value, first, second;
	String token;
	
	System.out.println("Welcome to the Java RPN Calculator");
	System.out.println("Enter 'quit' in order to terminate the program.");
	System.out.println();
	
	while(true)
	{
	System.out.print(">>");
	String line = bf.readLine();
	if(line.equals("quit"))
	{
		System.exit(0);
	}
	StringTokenizer stok = new StringTokenizer(line," ",false);
	while(stok.hasMoreElements()){
	    token = stok.nextToken();
		if(token.equals("+") || token.equals("-") ||token.equals("/") ||token.equals("*"))
		{
		   second = ((Double)rpnStack.pop()).doubleValue();
		   first  = ((Double)rpnStack.pop()).doubleValue();
		   char character = token.charAt(0);
		   switch(character){
		   case '+': rpnStack.push(second + first); break;
		   case '-': rpnStack.push(first - second); break;
		   case '/': rpnStack.push(first/second);   break;
		   case '*': rpnStack.push(first*second);   break;
		   
		   }
		}
		else
		   rpnStack.push(Double.valueOf(token));
	}
	System.out.println((Double)rpnStack.pop());
	
	}
	
    }
}