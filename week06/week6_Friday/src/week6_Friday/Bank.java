package week6_Friday;

import java.util.Vector;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;
import java.util.Scanner;

public class Bank {

	private static Scanner sc;
	private Vector<BankAccount> accounts;

	Bank() {
		sc = new Scanner(System.in);
		accounts = new Vector<>();
		BankAccount b;
		ObjectInputStream ois = null;
		try {
			FileInputStream istream = new FileInputStream("bank_accounts.txt");
			ois = new ObjectInputStream(istream);
			while (true) {
				b = (BankAccount) ois.readObject();
				accounts.add(b);
			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (EOFException e) {

		} catch (StreamCorruptedException e) {
			try {
				if (ois != null)
					ois.close();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private void createAccount() {
		// String fName, String lName, int age, boolean isSimple, double
		// balance, double interest
		System.out.println("Input first name");
		String fName = sc.next();
		System.out.println("Input last name");
		String lName = sc.next();
		System.out.println("Input age");
		int age = sc.nextInt();
		boolean isSimple;
		System.out.println("Is the interest simple ? y/n");
		String isSimpleInput = sc.next();
		if (isSimpleInput.equals("y"))
			isSimple = true;
		else
			isSimple = false;

		System.out.println("Input balance");
		double balance = sc.nextDouble();
		System.out.println("Input interest");
		double interest = sc.nextDouble();
		try {
			BankAccount acc = new BankAccount(fName, lName, age, isSimple, balance, interest);
			accounts.add(acc);
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("bank_accounts.txt", true));
			oos.writeObject(acc);
			oos.close();
		} catch (InvalidPersonException e) {
			System.out.println("Invalid person information !");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	private int accountPrompt() {
		int accountID;
		System.out.println("Input bank account number.");
		accountID = sc.nextInt();
		int i = 0;
		while (i < accounts.size() && accountID != accounts.get(i).getID())
			i++;
		if (i == accounts.size()) {
			System.out.println("Invalid account number, please try again");
			return accountPrompt();
		} else
			return accountID;

	}

	private void showHistory() {

		int accountID = accountPrompt();
		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).getID() == accountID) {
				accounts.get(i).printOperations();
				return;
			}

		}
	}

	private void addMoney() {
		int accountID = accountPrompt();
		double ammount;
		System.out.println("Input deposit ammount");
		ammount = sc.nextDouble();
		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).getID() == accountID) {
				accounts.get(i).deposit(ammount);
				return;
			}
		}
	}

	private void withdrawMoney() {
		int accountID = accountPrompt();
		double ammount;
		System.out.println("Input withdraw ammount");
		ammount = sc.nextDouble();
		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).getID() == accountID) {
				try {
					accounts.get(i).withdraw(ammount);
					i = accounts.size();
				} catch (InvalidWithdrawException e) {
					System.out.println("An error occured, when you tried to withdraw!");
					System.out.println(e.getMessage());

				}

			}
		}

	}

	private void transferMoney() {
		System.out.println("Input from account ID");
		int fromAccountID = accountPrompt();
		System.out.println("Input to account ID");
		int toAccountID = accountPrompt();
		double ammount;
		System.out.println("Input transfer ammount");
		ammount = sc.nextDouble();
		boolean success = true;
		for (int i = 0; i < accounts.size(); i++) {
			if (accounts.get(i).getID() == fromAccountID)
				try {
					accounts.get(i).withdraw(ammount);
				} catch (InvalidWithdrawException e) {
					System.out.println("An error occured, trying to withdraw from the first account !");
					System.out.println(e.getMessage());
					success = false;

				}
		}

		if (success) {
			for (int i = 0; i < accounts.size(); i++) {
				if (accounts.get(i).getID() == toAccountID) {
					accounts.get(i).deposit(ammount);
				}
			}
		}

	}
	// private void calculateAmmount()
	// {
	// // ???
	// }

	public void commandLine() {
		String input = "";
		while (!input.equals("exit")) {
			System.out.println(
					"Input a command : create_bank_account, add_money, show_history, withdraw_money, transfer_money");
			sc = new Scanner(System.in);
			input = sc.next();
			if (input.equals("create_bank_account"))
				createAccount();
			else if (input.equals("show_history"))
				showHistory();
			else if (input.equals("add_money"))
				addMoney();
			else if (input.equals("withdraw_money"))
				withdrawMoney();
			else if (input.equals("transfer_money"))
				transferMoney();
		}
		sc.close();
	}

}
