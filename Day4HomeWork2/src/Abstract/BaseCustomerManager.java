package Abstract;

import Entities.Customer;

public abstract class BaseCustomerManager implements ICostumerService {

	@Override
	public void Save(Customer customer) {
		System.out.println("Saved to Database : " + customer.getFirstName() + customer.getLastName());
		
	}

}
