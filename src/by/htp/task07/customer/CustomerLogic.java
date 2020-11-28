package by.htp.task07.customer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CustomerLogic {
	
	
		public List<Customer> allClients (Bank bank){
			List <Customer> customers = new ArrayList <Customer>();
			
			for(Customer customer: bank.getCustomers()) {
				 customers.add(customer);
			}
			return customers;
		}
		
		
		public List<Customer> searchClients(Bank bank, String passportId){
			List<Customer> listClients = new ArrayList<Customer>();
			
			for(Customer customer: bank.getCustomers()) {
				if(customer.getPassportId().equalsIgnoreCase(passportId)) {
					listClients.add(customer);
				}
			}
			return listClients; 
		}
		
		
		public List<Customer> searchAccounts(Customer customer, String passportId){
			List<Customer> listClients = new ArrayList<Customer>();
			
			for(Account account : customer.getAccounts()) {
				if(customer.getPassportId().equalsIgnoreCase(passportId)) {
					listClients.add(customer);
				}
			}
			return listClients;
		}
		
		
		public List<Account> sortAccounts(Customer customer){
			List<Account> listAccounts = customer.getAccounts();
			
			listAccounts.sort(new Comparator<Account>(){
				@Override
				public int compare(Account o1, Account o2) {
					if(o1.getAccountBalance() >= o2.getAccountBalance()) {
						return 1;
					} else {
						return -1;
					}
				}
			});
			return listAccounts;
		}
		
		
		public int sumAllOfAccounts(Customer customer){
			int sum = 0;
			List<Account> listAccounts = customer.getAccounts();
			
			for(Account i: listAccounts) {
				if(!i.isStatusAccount()) {
					sum += i.getAccountBalance();
				}
			}
			return sum;
		}
		
		
		public int sumAllOfPositiveAccounts(Customer customer){
			int sum = 0;
			List<Account> listAccounts = customer.getAccounts();
			
			for(Account i: listAccounts) {
				if(i.getAccountBalance() > 0) {
					if(!i.isStatusAccount()) {
						sum += i.getAccountBalance();
					}
				}
			}
			return sum;
		}
		
		
		public int sumAllOfNegativeAccounts(Customer customer){
			int sum = 0;
			List<Account> listAccounts = customer.getAccounts();
			
			for(Account i: listAccounts) {
				if(i.getAccountBalance() < 0) {
					if(!i.isStatusAccount()) {
						sum += i.getAccountBalance();
					}
				}
			}
			return sum;
		}

}
