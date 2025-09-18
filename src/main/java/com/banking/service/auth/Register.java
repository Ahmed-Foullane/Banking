package com.banking.service.auth;

import com.banking.model.Client;
import com.banking.repository.PersonRepository;

public class Register {
	private final PersonRepository personRepository;

	public Register() {
		this.personRepository = PersonRepository.getInstance();
	}

	public boolean registerClient(String clientId, String firstName, String lastName, String email, String password) {
		if (personRepository.emailExists(email)) {
			return false;
		}
		Client client = new Client(clientId, firstName, lastName, email, password);
		return personRepository.add(client);
	}
}