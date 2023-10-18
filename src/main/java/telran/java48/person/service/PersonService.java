package telran.java48.person.service;

import telran.java48.person.dto.PersonDto;

public interface PersonService {
	Boolean addPerson(PersonDto personDto);
	
	PersonDto findPersonById(Integer id);

}
