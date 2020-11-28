package by.htp.task07.customer;

import java.util.ArrayList;
import java.util.List;

/*1. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по всем счетам, имеющим положительный и отрицательный балансы отдельно.
*/
public class Bank {
	
	private List <Customer> customers;
	
	public Bank () {
		
		customers = new ArrayList <Customer> ();
		
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}
	
	public Customer getCustomers (int index) {
		if(index >= customers.size ()) {
			return null;
		}
		
		return customers.get (index);
	}
	
	public void add (Customer customer) {
		customers.add (customer);
	}
	
	public int size () {
		return customers.size();
	}

	public void remove (int i) {
		customers.remove (i);

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customers == null) ? 0 : customers.hashCode());
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
		Bank other = (Bank) obj;
		if (customers == null) {
			if (other.customers != null)
				return false;
		} else if (!customers.equals(other.customers))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Bank [customers=" + customers + "]";
	}
	
	

}
