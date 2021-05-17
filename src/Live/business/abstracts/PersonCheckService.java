package Live.business.abstracts;

import Live.entities.concretes.Customer;

public interface PersonCheckService {
	
	boolean checkIfRealPerson(Customer customer);

}
