package de.styxhcr.properties.definitions;

import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

public class PropertyPredicates {

	public static <T, P> Predicate<T> propertyEquals(
			final SingleProperty<T> property, final P value) {
		return Predicates.compose(Predicates.equalTo(value),
				PropertyFunctions.<T, P> extract(property));
	}
}
