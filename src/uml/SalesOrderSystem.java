package uml;

import java.util.Scanner;

public class SalesOrderSystem {
	Scanner input = new Scanner(System.in);

	public void firstPage() {
		int opt;
		System.out.println("Welcome to Sales Order System!");
		System.out.println("Please Choose The Option:");
		System.out.println("1 = Login");
		System.out.println("2 = Register");
		System.out.print("Your Choice: ");
		opt = input.nextInt();
		if (opt == 1) {
			loginPage();
		} else if (opt == 2) {
			registerPage();
		} else {
			System.out.println("Please Only Enter the obove option!");
		}

	}

	public void registerPage() {
		int type;
		String username, password;
		System.out.println("Register\n_____");
		System.out.println("1 = Seller");
		System.out.println("2 = Customer");
		System.out.println("Type of User:");
		type = input.nextInt();
		System.out.println("Username: ");
		username = input.nextLine();
		//TODO check repeat username;
		System.out.println("Password: ");
		password = input.nextLine();
		if (type == 1) {
			String shopname;
			System.out.println("Shop Name: ");
			shopname = input.nextLine();
			Seller newUser = new Seller(username, password, type, shopname);
			//TODO save new user to database
		} else if (type == 2) {
			String name, address, contact;
			System.out.println("Name: ");
			name = input.nextLine();
			System.out.println("Address: ");
			address = input.nextLine();
			System.out.println("Contact No: ");
			contact = input.nextLine();
			Customer newUser = new Customer(username, password, type, name, address, contact);
			//TODO save new user to database
		} else {
			System.out.println("Please Only Enter the obove option!");
		}
		System.out.println("");
	}

	public void loginPage() {
		String username, password;
		System.out.println("Login\n_____");
		System.out.println("Username: ");
		username = input.nextLine();
		System.out.println("Password: ");
		password = input.nextLine();
		User user = new User(username, password);
		User userLogin;
		if (user.login(username, password)) {
			if (user.getType() == 1) {// seller
				// TODO create Seller obj from database
				userLogin = new Seller();
				// userLogin = database.getUser();
				sellerMenu();
			} else if (user.getType() == 2) {// customer
				// TODO create Customer obj from database
				userLogin = new Customer();
				// userLogin = database.getUser();
				customerMenu();
			}
		} else {
			System.out.println("Fail To Login!");
		}
	}

	public void customerMenu() {
		//TODO view all order(including current exist and historical done), add new order
	}

	public void sellerMenu() {
		//TODO add new item, modify item
	}

	public static void main(String[] args) {
		SalesOrderSystem sale = new SalesOrderSystem();
		sale.firstPage();
	}

}
