package com.podio.filter;

public class FieldSortBy implements SortBy {

	private final long fieldId;

	public FieldSortBy(long fieldId) {
		super();
		this.fieldId = fieldId;
	}

	@Override
	public String getKey() {
		return Integer.toString(fieldId);
	}
}
