package application;

import model.entities.Account;
import model.exception.AccountException;

public class Program {
	public static void main(String []args) {
		Account account = new Account(8021, "Bob Brown", 200.00, 300.00);
		
		try {	
			account.withdraw(250.00);
			
		}catch (AccountException e) {
			System.out.println(e.getMessage());
		}
		
		
	}
}
