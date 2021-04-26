package homework;

public class Main {

	public static void main(String[] args) {
		Course course1 = new Course(
				1, 
				"Yazýlým Geliþtirici Yetiþtirme Kampý",
				"C# + Angular",
				"Engin Demiroð"
				);
		
		Course course2 = new Course(
				1, 
				"Yazýlým Geliþtirici Yetiþtirme Kampý",
				"Java + React",
				"Engin Demirog"
				);
		
		Course course3 = new Course(
				1, 
				"Programlamaya Giriþ Ýçin Temel Kurs",
				"Programlama",
				"Engin Demirog"
				);
		
		Course[] courses = {course1 , course2 , course3 };
		
		for (Course course : courses) {
			System.out.println(course.name);
		}
		
		User user1 = new User(6,445687,"Feyza ", "feyza@gmail.com");
		User user2 = new User(7,125874,"Gizem ", "gizem@gmail.com");
		
		User[] users= {user1, user2};
		
		for (User user : users) {
			System.out.println(user.name);
		}
		
		CourseManager courseManager = new CourseManager();
		
		courseManager.Add(course2);
		
		UserManager userManager = new UserManager();
		
		userManager.Delete(user1);

	}

}
