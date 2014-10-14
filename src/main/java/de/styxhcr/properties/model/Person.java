package de.styxhcr.properties.model;

import java.util.Set;

import com.google.common.base.Objects;
import com.google.common.base.Strings;

import de.styxhcr.properties.definitions.SingleProperty;
import de.styxhcr.properties.model.meta.PersonSingleProperties;

public class Person {
	private String firstName;

	private String lastName;

	private Set<Hobby> hobbies;

	public Person(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Set<Hobby> getHobbies() {
		return hobbies;
	}

	public void setHobbies(Set<Hobby> hobbies) {
		this.hobbies = hobbies;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		for (final SingleProperty<Person> oneProperty : PersonSingleProperties
				.values()) {
			sb.append(oneProperty.getName()).append(": ")
					.append(oneProperty.get(this)).append("\n");
		}
		return sb.toString();
	}
}
