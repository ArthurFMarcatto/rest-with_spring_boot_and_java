package br.com.fmarc.services;

public class GreetingService {
	private final long id;
	private final String content;
	
	public GreetingService (long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}
