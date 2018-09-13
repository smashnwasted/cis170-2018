
public class User 
{
	private String userName;
	private String email;
	private String firstName;
	private String lastName;
	
	//Method Signature consists of...
	//Accessor - public, private or protect.
	//Return type - Any type or void for nothing
	//Method name - make it good so people know what the method does
	//Argument list - parameters passes to the method

	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastrName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
