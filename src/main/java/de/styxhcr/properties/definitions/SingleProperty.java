package de.styxhcr.properties.definitions;

public interface SingleProperty<T> extends Property<T> {
	Object get(T bean);
	
	void set(T bean, Object value);
}
