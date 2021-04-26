package homework;


public class UserManager {
	public void Add(User user)
	{
		System.out.println(user.name + "added");
	}
	
	public void Delete(User user) {
	    System.out.println(user.name + "removed");
	}
	
}
