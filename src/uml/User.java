package uml;

public class User {
	private String username;
	private String password;
	private int type;//1 = seller, 2 == customer
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public User(String username, String password, int type) {
		super();
		this.username = username;
		this.password = password;
		this.type = type;
	}

	public boolean login(String username, String password) {
		if(username.equals(this.username)) {
			if(password.equals(this.password)) {
				//TODO check type of user login
				return true;
			}
		}
		return false;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
