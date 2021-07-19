package com.podio.filter;

import java.util.List;

import com.podio.common.CSVUtil;

public class StateFieldFilterBy extends FieldFilterBy<List<String>> {

	public StateFieldFilterBy(long fieldId) {
		super(fieldId);
	}

	@Override
	public String format(List<String> values) {
		return CSVUtil.toCSV(values);
	}
}
