package com.podio.item.filter;

import org.codehaus.jackson.annotate.JsonProperty;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FilterLastEditOn extends Filter<FilterInterval> {

    /** non-static to allow for multi threading */
    private final DateFormat DATE_FORMAT = new SimpleDateFormat("yyyy-MM-dd");

    private final FilterInterval values;

    public FilterLastEditOn(Date from, Date to) {
        super("last_edit_on");
        values = new FilterInterval();
        values.setFrom(from != null ? DATE_FORMAT.format(from) : null);
        values.setTo(to != null ? DATE_FORMAT.format(to) : null);
    }

    @Override
    @JsonProperty("values")
    public FilterInterval getValues() {
        return values;
    }
}
