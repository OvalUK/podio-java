package com.podio.filter;

public class DateFieldFilterBy extends BaseDateFilterBy {
	
	private final long fieldId;

	public DateFieldFilterBy(long fieldId) {
		super();
		this.fieldId = fieldId;
	}

	@Override
	public final String getKey() {
		return Integer.toString(fieldId);
	}

}
