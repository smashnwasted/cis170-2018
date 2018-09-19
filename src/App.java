//Namespace - Keeping objects unique.
//Translate to a folder.
//Helps you organize 'like' code
//package firstJavaProject

// App is the entry point to our application
public class App {
	
	public static void main(String[] args)
	{
		User u1 = new User();
		u1.setFirstName("Ryan");
		u1.setLastName("Parrish");
		u1.setEmail("ryanparrish@yup.com");
		u1.setUserName("smashnwasted");
		
		User u2 = new User();
		u2.setFirstName("Dave");
		u2.setLastName("Dangle");
		u2.setEmail("shouldawouldacoulda@yup.com");
		u2.setUserName("DingleDangle213");
		
		User u3 = new User();
		u3.setFirstName("Robin");
		u3.setLastName("Williams");
		u3.setEmail("L@stlaugh@yup.com");
		u3.setUserName("HaHaorD13");
		
		System.out.println(u1.getUserName());
		System.out.println(u2.getUserName());
		System.out.println(u3.getUserName());
		
		// for loop
		for (int x = 0; x < 100; x++) {
			
			//Prompt user to guess a letter.
			//Prompt user with mask of word(recalculate mask)
			//Prompt user with input
			//repeat...
			System.out.println(x);
		} //increment counter
	}
	
}
