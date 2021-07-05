import java.time.LocalDate;

import Abstract.BaseCustomerManager;
import Concrete.NeroCustomerManager;
import Entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer (18, "Murat", "Yildirim", LocalDate.of(1998,8,7) , "213564897");
		
		BaseCustomerManager customerManager = new NeroCustomerManager() {
		};
		
	    try {
		customerManager.Save(customer);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
