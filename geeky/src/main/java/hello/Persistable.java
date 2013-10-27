package hello;

public interface Persistable {
	Customer find(Long id);
	Customer create(Customer customer);
	Customer update(Customer customer);
	Customer findByLastName(String lastName);
	void delete(Long id);
}
