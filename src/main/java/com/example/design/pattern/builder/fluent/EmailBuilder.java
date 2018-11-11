package com.example.design.pattern.builder.fluent;

public class EmailBuilder {

	public static Builder builder() {
		return new EmailBuilder.Builder();
	}

	public static class Builder

	{
		private Email instance = new Email();

		private Builder() {
		}

		public Builder from(String from) {
			instance.setFrom(from);
			return this;
		}

		public Builder to(String to) {
			instance.setTo(to);
			return this;
		}

		public Builder subject(String subject) {
			instance.setSubject(subject);
			return this;
		}

		public Builder content(String content) {
			instance.setContent(content);
			return this;
		}

		public Builder mimeType(String mimeTypeName) {
			instance.setMimeType(mimeTypeName);
			return this;
		}

		public Email build() {
			return instance;
		}
	}
}
