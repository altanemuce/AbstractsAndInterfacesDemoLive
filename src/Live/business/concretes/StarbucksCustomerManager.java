package Live.business.concretes;

import Live.business.abstracts.PersonCheckService;
import Live.entities.concretes.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager {
	
	
	PersonCheckService personCheckService;

	public StarbucksCustomerManager(PersonCheckService personCheckService) {
		super();
		this.personCheckService = personCheckService;
	}

	@Override
	public void save(Customer customer) {
		
		if(personCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		}else
		{
			System.out.println("Not a Valid Person");
		}
		
	}
	
	
	
	
}
