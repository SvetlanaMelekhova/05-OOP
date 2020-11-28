package by.htp.task07.customer;

import java.util.List;



/*1. �����. ������ ����� ����� ��������� ������ � �����. ��������� ����������� ����������/������������� �����. ����������� ����� � ���������� ������. ���������� ����� ����� �� ������. ���������� ����� �� ���� ������, ������� ������������� � ������������� ������� ��������.*/

public class CustomerView {
	
public CustomerView () {
		
	}
	
	public void printCustomer (Customer customer) {
		
		System.out.println ("���������� � �������: " + customer.toString());
		
	}
	
	public void printAllCustomers (Bank bank) {
		
		List <Customer> customers;
		customers = bank.getCustomers();
		
		for (Customer customer : customers) {
			
			System.out.println(customer.toString());
			
		}
	}

}
