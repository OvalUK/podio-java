package com.podio.filter;

import java.util.List;

import com.podio.common.CSVUtil;

public class MemberFieldFilterBy extends FieldFilterBy<List<Long>> {

	public MemberFieldFilterBy(long fieldId) {
		super(fieldId);
	}

	@Override
	public final String format(List<Long> values) {
		return CSVUtil.toCSV(values);
	}
}
