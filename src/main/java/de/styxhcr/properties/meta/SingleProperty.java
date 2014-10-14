package de.styxhcr.properties.meta;

public interface SingleProperty<T> extends Property<T> {
	Object get(T bean);
	
	void set(T bean, Object value);
}
