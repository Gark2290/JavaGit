/*
  Just a quick exercises I did.  I heard that people a few years ago liked to ask this question to career candidates
  in order to weed out people who weren't really worth the time.  So I figured I would give it a quick shot.  Also,
  I am adding this comment to see how pushing and pulling and updating documents works on GitHub.
*/

public class FizzBuzz{
	public static void main(String[] Args){
	
		for(int i=1; i <=100; i++){
			if((i%5 == 0) && (i%3 == 0))
			   System.out.println("FizzBuzz");
			else if(i%5 == 0)
			    System.out.println("Buzz");
		    else if(i%3 == 0)
				System.out.println("Fizz");
			else
				System.out.println(i);
				}

}
}