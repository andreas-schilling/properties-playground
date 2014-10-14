package de.styxhcr.properties.meta;

import com.google.common.base.Function;

public class PropertyFunctions {
	public static <T, P> Function<T, P> extract(final SingleProperty<T> property) {
		return new Function<T, P>() {
			@Override
			public P apply(T input) {
				return (P) property.get(input);
			}
		};
	}
}
