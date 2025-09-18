package com.banking.repository;

import com.banking.model.Manager;
import com.banking.model.Person;

import java.util.HashSet;
import java.util.Optional;

public class PersonRepository {
	private static final PersonRepository INSTANCE = new PersonRepository();

	private final HashSet<Person> persons;

	private PersonRepository() {
		this.persons = new HashSet<>();
		createDefaultManager();
	}

	public static PersonRepository getInstance() {
        return INSTANCE;
	}

	private void createDefaultManager() {
		Manager defaultManager = new Manager(
				"1234",
				"ahmed",
				"foullane",
				"manager@bank.com",
				"admin123"
		);
		persons.add(defaultManager);
	}

	public boolean add(Person person) {

        return persons.add(person);
	}

	public boolean remove(Person person) {

        return persons.remove(person);
	}

	public int count() {
		return persons.size();
	}

	public boolean emailExists(String email) {
		return findByEmail(email).isPresent();
	}

	public Optional<Person> findByEmail(String email) {
		for (Person person : persons) {
			if (person.getEmail().equals(email)) {
				return Optional.of(person);
			}
		}
		return Optional.empty();
	}
}


