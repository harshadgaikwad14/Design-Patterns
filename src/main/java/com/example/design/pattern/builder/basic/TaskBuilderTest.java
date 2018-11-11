package com.example.design.pattern.builder.basic;

import java.util.Date;

public class TaskBuilderTest {

	public static void main(String[] args) {

		Task task = new TaskBuilder(5)
				.setDescription("Hello")
				.setSummary("Test")
				.setDueDate(new Date())
				.build();
		System.out.println(task);

	}

}
