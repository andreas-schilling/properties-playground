package de.styxhcr.properties.definitions;

public interface Property<T> {

	String getName();

	String getJavaName();

	Class<T> getBeanClass();

	Class<?> getPropertyClass();
}