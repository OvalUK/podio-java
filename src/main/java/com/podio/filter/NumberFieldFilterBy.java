package com.podio.filter;

public class NumberFieldFilterBy extends FieldFilterBy<NumberInterval> {

	public NumberFieldFilterBy(long fieldId) {
		super(fieldId);
	}

	@Override
	public String format(NumberInterval value) {
		return value.getFrom() + "-" + value.getTo();
	}
}
