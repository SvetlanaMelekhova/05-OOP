package by.htp.task07.customer;

public class Account {

	private int numberOfCreditCard;
	private int numberOfBankAccount;
	private long accountBalance;
	private boolean statusAccount;
	private String currentAccount;

	public Account() {

	}
	
	public Account ( int numberOfCreditCard, int numberOfBankAccount, long accountBalance, String currentAccount) {
		super();
		this.numberOfCreditCard = numberOfCreditCard;
		this.numberOfBankAccount = numberOfBankAccount;
		this.accountBalance = accountBalance;
		this.currentAccount = currentAccount;
		
	}

	public int getNumberOfCreditCard() {
		return numberOfCreditCard;
	}

	public void setNumberOfCreditCard(int numberOfCreditCard) {
		this.numberOfCreditCard = numberOfCreditCard;
	}

	public int getNumberOfBankAccount() {
		return numberOfBankAccount;
	}

	public void setNumberOfBankAccount(int numberOfBankAccount) {
		this.numberOfBankAccount = numberOfBankAccount;
	}

	public long getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(long accountBalance) {
		this.accountBalance = accountBalance;
	}

	public boolean isStatusAccount() {
		return statusAccount;
	}

	public void setStatusAccount(boolean statusAccount) {
		this.statusAccount = statusAccount;
	}

	public String getCurrentAccount() {
		return currentAccount;
	}

	public void setCurrentAccount(String currentAccount) {
		this.currentAccount = currentAccount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (accountBalance ^ (accountBalance >>> 32));
		result = prime * result + ((currentAccount == null) ? 0 : currentAccount.hashCode());
		result = prime * result + numberOfBankAccount;
		result = prime * result + numberOfCreditCard;
		result = prime * result + (statusAccount ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (accountBalance != other.accountBalance)
			return false;
		if (currentAccount == null) {
			if (other.currentAccount != null)
				return false;
		} else if (!currentAccount.equals(other.currentAccount))
			return false;
		if (numberOfBankAccount != other.numberOfBankAccount)
			return false;
		if (numberOfCreditCard != other.numberOfCreditCard)
			return false;
		if (statusAccount != other.statusAccount)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Account [numberOfCreditCard=" + numberOfCreditCard + ", numberOfBankAccount=" + numberOfBankAccount
				+ ", accountBalance=" + accountBalance + ", statusAccount=" + statusAccount + ", currentAccount="
				+ currentAccount + "]";
	}
	
	
}