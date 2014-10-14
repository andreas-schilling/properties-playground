package de.styxhcr.properties.model.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Set;

import org.junit.Test;

import com.google.common.base.Predicate;
import com.google.common.collect.Iterables;
import com.google.common.collect.Sets;

import de.styxhcr.properties.meta.PropertyPredicates;
import de.styxhcr.properties.model.Hobby;
import de.styxhcr.properties.model.Person;
import de.styxhcr.properties.model.meta.HobbySingleProperties;
import de.styxhcr.properties.model.meta.PersonCollectionProperties;
import de.styxhcr.properties.model.meta.PersonSingleProperties;

public class ModelTest {
	@Test
	public void testSinglePropertyAccess() {
		final Person person = new Person("John", "Doe");
		assertEquals("John", PersonSingleProperties.FirstName.get(person));
		assertEquals("Doe", PersonSingleProperties.LastName.get(person));
		System.out.println(person.toString());
	}

	@Test
	public void testCollectionPropertyAccess() {
		final Person person = new Person("John", "Doe");
		final Hobby cycling = new Hobby("Cycling", false);
		final Hobby climbing = new Hobby("Climbing", true);
		person.setHobbies(Sets.newHashSet(cycling, climbing));
		System.out.println(person.toString());
		
		assertEquals("John", PersonSingleProperties.FirstName.get(person));
		assertEquals("Doe", PersonSingleProperties.LastName.get(person));
		assertEquals(2, PersonCollectionProperties.Hobbies.get(person).size());
	}

	@Test
	public void testPropertyPredicates() {
		final Person person = new Person("John", "Doe");
		final Hobby cycling = new Hobby("Cycling", false);
		final Hobby climbing = new Hobby("Climbing", true);
		person.setHobbies(Sets.newHashSet(cycling, climbing));
		System.out.println(person.toString());		
		
		assertEquals("John", PersonSingleProperties.FirstName.get(person));
		assertEquals("Doe", PersonSingleProperties.LastName.get(person));
		Predicate<Hobby> isDangerousHobby = PropertyPredicates.propertyEquals(
				HobbySingleProperties.Dangerous, true);
		assertTrue(Iterables.any(
				(Set<Hobby>) PersonCollectionProperties.Hobbies.get(person),
				isDangerousHobby));
		assertEquals(false, Iterables.all(
				(Set<Hobby>) PersonCollectionProperties.Hobbies.get(person),
				isDangerousHobby));
	}
}
