package com.podio.conversation;

import java.util.List;

public class ConversationCreate {

	private final String subject;

	private final String text;

	private final List<Long> participants;

	public ConversationCreate(String subject, String text,
			List<Long> participants) {
		super();
		this.subject = subject;
		this.text = text;
		this.participants = participants;
	}

	public String getSubject() {
		return subject;
	}

	public String getText() {
		return text;
	}

	public List<Long> getParticipants() {
		return participants;
	}
}
