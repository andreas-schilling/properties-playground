package de.styxhcr.properties.model;

import java.util.Set;

import org.joda.beans.Bean;
import org.joda.beans.BeanDefinition;
import org.joda.beans.MetaBean;
import org.joda.beans.Property;

import de.styxhcr.properties.definitions.SingleProperty;
import de.styxhcr.properties.model.meta.PersonSingleProperties;

@BeanDefinition
public class Person implements Bean {
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

	@Override
	public MetaBean metaBean() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <R> Property<R> property(String propertyName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<String> propertyNames() {
		// TODO Auto-generated method stub
		return null;
	}
}
