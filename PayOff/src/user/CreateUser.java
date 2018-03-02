package user;
import java.io.IOException;


public class CreateUser {
	public static void main(String[] args) throws IOException {
		User user = new User();
		
		java.io.File file = new java.io.File("us.gif");
		file.createNewFile();
	}

}
