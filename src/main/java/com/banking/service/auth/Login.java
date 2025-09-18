package com.banking.service.auth;
import com.banking.model.Person;
import com.banking.repository.PersonRepository;
import java.util.Optional;

public class Login {
    private final PersonRepository personRepository;

    public Login() {
        this.personRepository = PersonRepository.getInstance();
    }

    public boolean addPerson(Person person) {
        return personRepository.add(person);
    }

    public boolean removePerson(Person person) {
        return personRepository.remove(person);
    }

    public int getTotalPersons() {
        return personRepository.count();
    }

    public boolean emailExists(String email) {
        return personRepository.emailExists(email);
    }

    public Optional<Person> findPersonByEmail(String email) {
        return personRepository.findByEmail(email);
    }

    public Person authenticate(String email, String password) {
        Optional<Person> person = personRepository.findByEmail(email);
        if (person.isPresent() && person.get().getPassword().equals(password)) {
            return person.get();
        }
        return null;
    }
}