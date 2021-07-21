package com.podio.item.filter;

public class FilterAppField extends FilterFieldValue<Long[]> {

    private final Long[] values;

    public FilterAppField(long fieldId, Long... ids) {
        super(fieldId);
        values = ids;
    }

    @Override
    public Long[] getValues() {
        return this.values;
    }
}
