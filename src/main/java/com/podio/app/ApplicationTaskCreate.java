package com.podio.app;

import java.util.Arrays;
import java.util.List;

public class ApplicationTaskCreate extends ApplicationTaskBase {

	private static final long serialVersionUID = 1L;

	private List<Long> responsible;

	public ApplicationTaskCreate() {
		super();
	}

	public ApplicationTaskCreate(String text, Long... responsible) {
		this(text, Arrays.asList(responsible));
	}

	public ApplicationTaskCreate(String text, List<Long> responsible) {
		super(text);
		this.responsible = responsible;
	}

	public List<Long> getResponsible() {
		return responsible;
	}

	public void setResponsible(List<Long> responsible) {
		this.responsible = responsible;
	}
}
