package com.podio.filter;

import java.util.List;

import com.podio.common.CSVUtil;

public abstract class BaseIntListFilterBy implements FilterBy<List<Long>> {

	@Override
	public final String format(List<Long> values) {
		return CSVUtil.toCSV(values);
	}
}
