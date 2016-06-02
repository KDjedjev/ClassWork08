class User {
	private String email;
	private String password;

	public User(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email.length() < 5 && !email.contains("@") && !email.contains(".")) {
			throw new IllegalArgumentException("Email must contain @ and .,and cannot be smaller than 5 symbols");
		}
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		if (password.length() < 6 && !password.matches("*.[0-9].*")) {
			throw new IllegalArgumentException("Password must be longer");
		}
		this.password = password;
	}
}

public class Main {

	public static void main(String[] args) {
		User mitko = new User("jirw" , "tawe2");
		User shibil = new User("wewe","rwrwr");
		User kotkov = new User("kotkov@abv.bg","gospod21");
		try {
			mitko.setEmail("georgipetrov@abv.bg");
			System.out.println("Correct email");
			mitko.setPassword("23242");
			System.out.println("Correct password");
		}catch (IllegalArgumentException exception){
			System.out.println(exception.getMessage());
		}
}

}
