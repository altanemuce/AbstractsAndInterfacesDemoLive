package Live.business.concretes;

import Live.business.abstracts.CustomerService;
import Live.entities.concretes.Customer;

public abstract  class BaseCustomerManager implements CustomerService {

	@Override
	public void save(Customer customer) {
		System.out.println("Saved to db " +customer.getFirstName());
		
	}

	

}
