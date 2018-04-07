package user;

public class User {
	private String userNameFirst;
//	private String userNameMiddle;
	private String userNameLast;
	private String userNameTotal;
	
	public void setUserNameFirst (String userNameFirst) {
		this.userNameFirst = userNameFirst;
	}
	
	public void setUserNameLast (String userNameLast) {
		this.userNameLast = userNameLast;
	}
	
	public void setUserNameTotal () {
		this.userNameTotal = this.userNameFirst + " " + this.userNameLast;
	}
	
	public String getUserNameFirst() {
		return userNameFirst;
	}
	
	public String getUserNameLast() {
		return userNameLast;
	}
	
	public String getUserNameTotal() {
		return userNameTotal;
	}
	
	
	public static void main (String[] args) {
//		User user = new User();
//		user.setUserNameFirst("Juan");
//		user.setUserNameLast("Pascua");
//		user.setUserNameTotal();
//		System.out.println(user.getUserNameTotal());
	}

}
