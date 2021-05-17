package Live.adapters;

import Live.business.abstracts.PersonCheckService;
import Live.entities.concretes.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements PersonCheckService {

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy client=new KPSPublicSoapProxy();
		boolean result=false;
		try { 
			client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),customer.getFirstName().toUpperCase(),customer.getLastName().toUpperCase(),customer.getDateOfBirth().getYear());
		}
		catch (Exception e) {
			System.out.println("Not a Valid person");
		}
		return result;
		
	}
	
	

}
