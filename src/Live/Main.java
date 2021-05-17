package Live;

import java.time.LocalDate;

import Live.adapters.MernisServiceAdapter;
import Live.business.concretes.BaseCustomerManager;
import Live.business.concretes.NeroCustomerManager;
import Live.business.concretes.StarbucksCustomerManager;
import Live.entities.concretes.Customer;

public class Main {

	public static void main(String[] args) {
		
		
		BaseCustomerManager customerManager=new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(new Customer(1,"altan","emuce",LocalDate.of(1995, 2, 23),"20542563108"));
		System.out.println();

	}

}
