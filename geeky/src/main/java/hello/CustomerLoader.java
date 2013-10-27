package hello;

import java.util.Arrays;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CustomerLoader implements InitializingBean {

	@Autowired
	CustomerRepository customers;

	@Override
	public void afterPropertiesSet() throws Exception {
		customers.save(new Customer("Homer", "Simpson"));
		customers.save(new Customer("Peter", "Griffin"));
		customers.save(new Customer("Stewie", "Griffin"));
		customers.save(new Customer("Ivan", "Ivanov"));
		customers.save(new Customer("Petio", "Petev"));
		Customer customerKiro = new Customer("Kiril", "Gavrailov");
		Customer customerVladi = new Customer("Vladislav", "Iliev");
		customers.save(Arrays.asList(customerKiro, customerVladi));
	}

}
