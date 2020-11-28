package by.htp.task07.customer;

import java.util.List;

public class CustomerView {
	
public CustomerView () {
		
	}
	
	public void printCustomer (Customer customer) {
		
		System.out.println ("Информация о клиенте: " + customer.toString());
		
	}
	
	public void printAllCustomers (Bank bank) {
		
		List <Customer> customers;
		customers = bank.getCustomers();
		
		for (Customer customer : customers) {
			
			System.out.println(customer.toString());
			
		}
	}

}
