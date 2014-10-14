package de.styxhcr.properties.model.meta;

import java.util.Set;

import de.styxhcr.properties.definitions.CollectionProperty;
import de.styxhcr.properties.model.Hobby;
import de.styxhcr.properties.model.Person;

/**
 * This file actually should be generated. For value objects a handcoded
 * properties enum of course is an option.
 * 
 * @author aschilling
 *
 */
public enum PersonCollectionProperties implements CollectionProperty<Person> {

	Hobbies {

		public String getName() {
			return "Hobbies";
		}

		public String getJavaName() {
			return "hobbies";
		}

		public Set<?> get(Person bean) {
			return bean.getHobbies();
		}

		public void set(Person bean, Set<?> value) {
			bean.setHobbies((Set<Hobby>) value);
		}

		public Class<?> getPropertyClass() {
			return Set.class;
		}

		public Class<?> getElementClass() {
			return Hobby.class;
		}
	};

	public Class<Person> getBeanClass() {
		return Person.class;
	}

}
