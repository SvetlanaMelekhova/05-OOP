package by.htp.task07.customer;

public class Main {

	public static void main(String[] args) {

		Account account = new Account();
		Bank bank = new Bank();
		CustomerLogic logic = new CustomerLogic();
		CustomerView print = new CustomerView();

		Customer client1 = new Customer("Мелехова", "Светлана", "Александровна", "MN2023645");
		client1.addNewAccount(new Account(124412546, 58864, 5000, "BYN"));
		client1.addNewAccount(new Account(124235346, 68897, -150, "BYN"));
		client1.addNewAccount(new Account(110412259, 56987, 10000, "BYN"));
		client1.addNewAccount(new Account(124235346, 47996, 2500, "BYN"));
		client1.addNewAccount(new Account(124235346, 58998, -350, "BYN"));

		Customer client2 = new Customer("Пупкин", "Василий", "Александрович", "MP1465873");
		client1.addNewAccount(new Account(124469946, 68264, -6000, "BYN"));
		client1.addNewAccount(new Account(985222546, 58691, 560, "BYN"));

		bank.add(client1);
		bank.add(client2);

		//print.printAllCustomers(bank);
		print.printCustomer(client1);

		/*
		 * vl.printClients(logic.allClients(bank));
		 * vl.printSearchClients(logic.searchClients(bank, "MN2023645"), "MN2023645");
		 * vl.printAccountsClients(logic.searchAccounts(client, "MN2023645"),
		 * "MN2023645"); vl.printSortAccountsClients(logic.sortAccounts(client),
		 * "MN2023645"); vl.printSummMoney(client, "BYN");
		 * vl.printSummMoneyPositive(client, "BYN"); vl.printSummMoneyNegative(client,
		 * "BYN");
		 */
	}

}
