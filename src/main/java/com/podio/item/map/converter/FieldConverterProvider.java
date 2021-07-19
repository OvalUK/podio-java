package com.podio.item.map.converter;

import java.lang.reflect.AnnotatedElement;

import com.podio.app.ApplicationField;
import com.podio.app.ApplicationFieldType;

public longerface FieldConverterProvider {

	boolean isSupported(ApplicationFieldType fieldType);

	FieldConverter getConverter(ApplicationField field, AnnotatedElement element);
}
