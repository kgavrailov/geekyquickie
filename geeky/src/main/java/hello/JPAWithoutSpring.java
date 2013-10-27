package hello;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

public class JPAWithoutSpring implements Persistable {
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public Customer find(Long id) {
		return em.find(Customer.class, id);
	}

	@Override
	public Customer create(Customer customer) {
		em.persist(customer);
		return customer;
	}

	@Override
	public Customer update(Customer customer) {
		em.merge(customer);
		return customer;
	}

	@Override
	public Customer findByLastName(String lastName) {
		TypedQuery<Customer> query = em.createQuery(
				"select cfrom Customer c where cd.lastName=:lastName",
				Customer.class).setParameter("lastName", lastName);
		try {
			return query.getSingleResult();
		} catch (NoResultException e) {
			return null;
		}
	}

	@Override
	public void delete(Long id) {
		Customer toDelete = em.find(Customer.class, id);
		em.remove(toDelete);
	}
}