package de.styxhcr.properties.model;

import de.styxhcr.properties.definitions.SingleProperty;
import de.styxhcr.properties.model.meta.HobbySingleProperties;

public class Hobby {
	private String name;

	private boolean dangerous;

	public Hobby(final String name, final boolean isDangerous) {
		super();
		this.name = name;
		this.dangerous = isDangerous;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isDangerous() {
		return dangerous;
	}

	public void setDangerous(boolean dangerous) {
		this.dangerous = dangerous;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder();
		for (final SingleProperty<Hobby> oneProperty : HobbySingleProperties
				.values()) {
			sb.append(oneProperty.getName()).append(": ")
					.append(oneProperty.get(this)).append("\n");
		}
		return sb.toString();
	}
}
