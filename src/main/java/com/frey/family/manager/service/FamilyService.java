package com.frey.family.manager.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.frey.family.manager.model.FamilyPerson;

@Service
public class FamilyService {

	private static Map<Long, FamilyPerson> personList = new HashMap();
	private static Long index = 4L;

	static {
		FamilyPerson person1 = new FamilyPerson(1L, "Sean", "Connery", "sean.connery@bond.com");
		FamilyPerson person2 = new FamilyPerson(2L, "Roger", "Moore", "roger.moore@007.com");
		FamilyPerson person3 = new FamilyPerson(3L, "Pierce", "Brosnan", "pierce.brosnan@james.com");
		FamilyPerson person4 = new FamilyPerson(4L, "Daniel", "Craig", "daniel.craig@astonmartin.com");
		personList.put(1L, person1);
		personList.put(2L, person2);
		personList.put(3L, person3);
		personList.put(4L, person4);
	}

	public static List<FamilyPerson> getAllPersons() {
		return new ArrayList<>(personList.values());
	}

	public static FamilyPerson getPersonDetails(Long personId) {
		return personList.get(personId);
	}

	public static FamilyPerson addPerson(FamilyPerson person) {
		index += 1;
		person.setId(index);
		personList.put(index, person);
		return person;
	}
	
	public static FamilyPerson updatePerson(Long personId, FamilyPerson person) {
		person.setId(personId);
		personList.put(personId, person);
		return person;
	}
	
	public static FamilyPerson deletePerson(Long personId) {
		return personList.remove(personId);
	}
}
