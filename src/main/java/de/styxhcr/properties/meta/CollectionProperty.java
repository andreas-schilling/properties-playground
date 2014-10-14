package de.styxhcr.properties.meta;

import java.util.Set;

public interface CollectionProperty<T> extends Property<T> {
	Set<?> get(T bean);
	
	void set(T bean, Set<?> value);
	
	Class<?> getElementClass();
}
