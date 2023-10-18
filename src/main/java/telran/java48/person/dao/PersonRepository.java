package telran.java48.person.dao;

import org.springframework.data.repository.CrudRepository;

import telran.java48.person.model.Person;

public interface PersonRepository extends CrudRepository<Person, Integer>{

}
