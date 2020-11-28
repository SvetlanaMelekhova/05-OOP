package by.htp.task07.customer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/*1. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.*/

public class CustomerLogic {
	
	// Список всех клиентов банка
	
		public List<Customer> allClients (Bank bank){
			List <Customer> customers = new ArrayList <Customer>();
			
			for(Customer customer: bank.getCustomers()) {
				 customers.add(customer);
			}
			return customers;
		}
		
		//Поиск клиента по серии паспорта
		public List<Customer> searchClients(Bank bank, String passportId){
			List<Customer> listClients = new ArrayList<Customer>();
			
			for(Customer customer: bank.getCustomers()) {
				if(customer.getPassportId().equalsIgnoreCase(passportId)) {
					listClients.add(customer);
				}
			}
			return listClients; 
		}
		
		
		//Поиск всех счетов клиента 
		public List<Customer> searchAccounts(Customer customer, String passportId){
			List<Customer> listAccounts = new ArrayList<Customer>();
			
			for(Customer customer : customer.getAccounts()) {
				if(client.getPassportIdClient().equalsIgnoreCase(passportIdClient)) {
					listAccounts.add(i);
				}
			}
			return listAccounts;
		}
		
		//Сортировка всех счетов клиента 
		public List<Account> sortAccounts(Client client){
			List<Account> listAccounts = client.getAccounts();
			
			listAccounts.sort(new Comparator<Account>(){
				@Override
				public int compare(Account o1, Account o2) {
					if(o1.getAmountMoney() >= o2.getAmountMoney()) {
						return 1;
					} else {
						return -1;
					}
				}
			});
			return listAccounts;
		}
		
		//Сумма на всех счетах клиента
		public int sumAllOfAccounts(Client client){
			int sum = 0;
			List<Account> listAccounts = client.getAccounts();
			
			for(Account i: listAccounts) {
				if(!i.isStatusAccount()) {
					sum += i.getAmountMoney();
				}
			}
			return sum;
		}
		
		//Сумма на всех счетах клиента с положительным балансом
		public int sumAllOfPositiveAccounts(Client client){
			int sum = 0;
			List<Account> listAccounts = client.getAccounts();
			
			for(Account i: listAccounts) {
				if(i.getAmountMoney() > 0) {
					if(!i.isStatusAccount()) {
						sum += i.getAmountMoney();
					}
				}
			}
			return sum;
		}
		
		//Сумма на всех счетах клиента с отрицательным балансом
		public int sumAllOfNegativeAccounts(Client client){
			int sum = 0;
			List<Account> listAccounts = client.getAccounts();
			
			for(Account i: listAccounts) {
				if(i.getAmountMoney() < 0) {
					if(!i.isStatusAccount()) {
						sum += i.getAmountMoney();
					}
				}
			}
			return sum;
		}

}
