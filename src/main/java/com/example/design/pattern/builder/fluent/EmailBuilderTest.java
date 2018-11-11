package com.example.design.pattern.builder.fluent;

public class EmailBuilderTest {

	public static void main(String[] args) {

		Email email =EmailBuilder.builder()
		.from("harshadgaikwad@gmail.com")
		.to("test@gmail.com")
		.content("Test Email")
		.subject("Testing Builder Desing Pattern")
		.build();
		
		System.out.println("Email : "+email);

	}

}
