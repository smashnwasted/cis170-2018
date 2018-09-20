package edu.parrish.java.week3;

public class Loops 
{
		//Example of a simple for loop
		public void forLoopSample() {
			
			for(int i = 0; i < 10; i++)
			{
				System.out.println(i);
			}
		}

		//Second example of writing a for loop
		public void LoopSample2() 
		{
			String word = "Cat";
			
			for(int i = 0; i < word.length(); i++) 
			{
				System.out.println(i);
				System.out.println(word.charAt(i));
			}
		}	
		
		
		//Idea for creating a Mask
		public void createMask() 
		{
			String word = "Horse";
			for(int i = 0; i < word.length(); i++) 
			{
				
				System.out.print("*");
			}
			
		}
		
		//Syntax for While Loops
		public void whileSample() 
		{
			int i = 0;
			
			while(i < 10) 
			{
				System.out.println(i); i++;
			}
			
		}
		
		//Boolean to test variable
		public boolean keeprunning(int i)
		{
			
			if( i > 0)
			{
				i--;
				return true;
				
			}
			
			else
			{
				return false;		
			}
		}
		
		//takes argument to test if the job is done
		public void whileSample2() 
		{
			
			int i = 10;
			while(keeprunning(i--)) 
			{
				System.out.println("working");
			}
			System.out.println("done");
		}
}



