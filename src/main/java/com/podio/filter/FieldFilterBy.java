package com.podio.filter;

public abstract class FieldFilterBy<T> implements FilterBy<T> {

	private final long fieldId;

	public FieldFilterBy(long fieldId) {
		super();
		this.fieldId = fieldId;
	}

	@Override
	public final String getKey() {
		return Long.toString(fieldId);
	}
}
