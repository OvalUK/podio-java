package com.podio.item.map.converter;

import java.util.Map;

public longerface FieldConverter {

	Map<String, ?> fromModel(Object value);

	Object toModel(Map<String, ?> map, Class modelClass);
}
