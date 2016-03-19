package week6_Friday;

import java.io.Serializable;

public class BankAccount implements Serializable {

	private static final long serialVersionUID = 3082824294495118640L;

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public int getID() {
		return ID;
	}

	public double getBalance() {
		return balance;
	}

	public double getInterest() {
		return interest;
	}

	private String firstName, lastName;
	private int age, ID;
	@SuppressWarnings("unused")
	private boolean isSimple;
	private double balance, interest;
	private String[] operationHistory;

	BankAccount(String fName, String lName, int age, boolean isSimple, double balance, double interest)
			throws InvalidPersonException {

		if (fName.equals(""))
			throw new InvalidPersonException("Invalid first name !");
		if (lName.equals(""))
			throw new InvalidPersonException("Invalid last name !");
		if (age > 150 || age < 0)
			throw new InvalidPersonException("Invalid person age !");
		firstName = fName;
		lastName = lName;
		this.age = age;
		ID = IDCounter.getID();
		this.isSimple = isSimple;
		this.balance = balance;
		this.interest = interest;
		operationHistory = new String[5];
		for (int i = 0; i < 5; i++)
			operationHistory[i] = new String("");
	}

	private void trackOperations(String message) {
		int addTo = 4;
		if (operationHistory[addTo].equals("")) {
			addTo = 0;
			while (addTo < 5 && !operationHistory[addTo].equals(""))
				addTo++;
			operationHistory[addTo] = message;
		} else {
			String[] newHistory = new String[6];
			newHistory[4] = message;

			for (int i = 3; i >= 0; i--)
				newHistory[i] = operationHistory[i + 1];

			operationHistory = newHistory;
		}

	}

	public void withdraw(double ammount) throws InvalidWithdrawException {
		if (ammount > balance)
			throw new InvalidWithdrawException("Insufficients funds !");
		if (interest > 0.01)
			throw new InvalidWithdrawException("Interest is too high !");
		balance -= ammount;

		String message = "Withdrawn " + ammount + ".";
		trackOperations(message);

	}

	public void deposit(double ammount) {
		balance += ammount;
		String message = "Deposited " + ammount + ".";
		trackOperations(message);

	}

	public void printOperations() {
		for (int i = 0; i < 5; i++)
			if (operationHistory[i].length() > 0)
				System.out.println(operationHistory[i]);
	}

}
