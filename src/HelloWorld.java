
public class HelloWorld 

{
	//test commit 2
	// an object is 2 things.
	// 1. Actions. Methods.
	// 2. Attributes. Variables.
	private String name = "Ryan";
	
	// Main Method. Starts the program.
	// Method signature - what makes this method unique. Defines the method.
	public static void main(String[] args) 
	{
		HelloWorld hw = new HelloWorld();
		hw.sayHello();
	}
	//this method says hello when called
	private void sayHello()
	{
		// Prints to the console.
		System.out.println("Hello World");
		System.out.println("This is another line");
	}
}
