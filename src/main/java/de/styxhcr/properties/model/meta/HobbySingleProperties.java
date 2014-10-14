package de.styxhcr.properties.model.meta;

import de.styxhcr.properties.definitions.SingleProperty;
import de.styxhcr.properties.model.Hobby;

/**
 * This file actually should be generated. For value objects a handcoded
 * properties enum of course is an option.
 * 
 * @author aschilling
 *
 */
public enum HobbySingleProperties implements SingleProperty<Hobby> {
	Name{

		@Override
		public Object get(Hobby bean) {
			return bean.getName();
		}

		@Override
		public void set(Hobby bean, Object value) {
			bean.setName((String) value);
		}

		@Override
		public String getName() {
			return "Hobby Name";
		}

		@Override
		public String getJavaName() {
			return "name";
		}

		@Override
		public Class<?> getPropertyClass() {
			return String.class;
		}
	},
	
	Dangerous {

		@Override
		public Object get(Hobby bean) {
			return bean.isDangerous();
		}

		@Override
		public void set(Hobby bean, Object value) {
			bean.setDangerous((boolean) value);
		}

		@Override
		public String getName() {
			return "Dangerous Hobby";
		}

		@Override
		public String getJavaName() {
			return "dangerous";
		}

		@Override
		public Class<?> getPropertyClass() {
			return Boolean.class;
		}
		
	};
	
	public Class<Hobby> getBeanClass() {
		return Hobby.class;
	}
}
