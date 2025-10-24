package OOPSConcepts;

import java.util.HashMap;
import java.util.HashSet;

class Account {
	private String name;
	private String accountNumber;
	private double balance;

	public Account(String name, String accountNumber, double balance) {
		this.name = name;
		this.accountNumber = accountNumber;
		this.balance = balance;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		amount += balance;
	}

	public void withdraw(double amount) {
		amount -= balance;
	}

	public String getAccountDetails() {
		return name + ", " + accountNumber + "," + balance;
	}
}

class Bank{
	
	private HashMap<Integer, Account> accounts = new HashMap<>();
	
	public int addAccount(Account account) {
		accounts.put(account.getAccountDetails(), account);
	}
	
	
}

public class AccountInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
