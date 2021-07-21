package com.podio.item.filter;

public class FilterCategoryField extends FilterFieldValue<Long[]> {
    private final Long[] values;

    public FilterCategoryField(long fieldId, Long... ids) {
        super(fieldId);
        values = ids;
    }

    @Override
    public Long[] getValues() {
        return this.values;
    }
}
