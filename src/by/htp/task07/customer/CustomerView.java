package by.htp.task07.customer;

import java.util.List;



/*1. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.*/

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
