package FilesandLists;

import java.io.IOException;
import java.util.List;

public class App {

	public static void main(String[] args) 
	{
		UserService ru = new UserService();
		
		
		try 
		{
			
			List<Users> users = ru.loadUsers();
			for (Users user : users) 
			{
				
				System.out.println(user.getFirstName() + " " + user.getLastName());
			}
		}
		catch(IOException e) 
		{
			e.printStackTrace();
		}
	}
	
}
