package de.styxhcr.properties.meta;

public interface Property<T> {

	String getName();

	String getJavaName();

	Class<T> getBeanClass();

	Class<?> getPropertyClass();
}