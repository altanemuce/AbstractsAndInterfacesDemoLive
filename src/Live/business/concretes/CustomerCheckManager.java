package Live.business.concretes;


import Live.business.abstracts.PersonCheckService;
import Live.entities.concretes.Customer;

public class CustomerCheckManager implements PersonCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
	}

}
