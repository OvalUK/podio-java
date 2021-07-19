package com.podio.filter;

import java.util.List;

import com.podio.common.CSVUtil;

public class AppFieldFilterBy extends FieldFilterBy<List<Long>> {

	public AppFieldFilterBy(long fieldId) {
		super(fieldId);
	}

	@Override
	public final String format(List<Long> values) {
		return CSVUtil.toCSV(values);
	}
}
