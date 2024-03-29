package de.styxhcr.properties.model.meta;

import de.styxhcr.properties.definitions.SingleProperty;
import de.styxhcr.properties.model.Person;

/**
 * This file actually should be generated. For value objects a handcoded
 * properties enum of course is an option.
 * 
 * @author aschilling
 *
 */
public enum PersonSingleProperties implements SingleProperty<Person> {
	FirstName {
		public String getName() {
			return "First Name";
		}

		public String getJavaName() {
			return "firstName";
		}

		public Object get(Person bean) {
			return bean.getFirstName();
		}

		public void set(Person bean, Object value) {
			bean.setFirstName((String) value);
		}

		public Class<?> getPropertyClass() {
			return String.class;
		}
	},

	LastName {
		public String getJavaName() {
			return "lastName";
		}

		public String getName() {
			return "Last Name";
		}

		public Object get(Person bean) {
			return bean.getLastName();
		}

		public void set(Person bean, Object value) {
			bean.setLastName((String) value);
		}

		public Class<?> getPropertyClass() {
			return String.class;
		}
	};

	public Class<Person> getBeanClass() {
		return Person.class;
	}
}
