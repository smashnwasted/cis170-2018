package FilesandLists;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class UserService {
	
	public List<Users> loadUsers() throws IOException 
	{
		List<Users> users = new ArrayList<Users>();
		
		File f = new File("C:\\Users\\sryanparrish\\Home\\cis170-2018\\FilesandLists\\src\\UserList");
		System.out.println("Does this file exist? " + f.exists());
		
		
		
		if  (f.exists()) {
			
			BufferedReader br = new BufferedReader(new FileReader(f));
			
			String st;
			while((st = br.readLine()) != null) {
				
				
				String [] splitNames = st.split(" ");
				Users u = new Users();
				u.setFirstName(splitNames[0]);
				
				if (splitNames.length> 2) 
				{
					u.setMiddleName(splitNames[1]);
					u.setLastName(splitNames[2]);
				}
				else 
				{
					u.setLastName(splitNames[1]);
				}
				
				users.add(u);
			}
		}
		return users;
	}
}
