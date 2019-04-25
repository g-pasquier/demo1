package com.starter.demo;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Logger;
import java.util.stream.Collectors;

/**
 * 
 * @author frup70473
 *
 */
public class App {

	private static Logger logger = Logger.getAnonymousLogger();

	private static class Employee {
		private int age;
		private String name;

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		@Override
		public String toString() {
			return "[age=" + age + ", name=" + name + "]";
		}

		public Employee(int age, String name) {
			super();
			this.age = age;
			this.name = name;
		}
	}

	public static void main(String... args) {

		manageEmployees();

		new DemoService().makeBoards();

	}

	private static void manageEmployees() {

		List<Employee> employees = Arrays.asList(new Employee(22, "Paul"), new Employee(22, "Eric"),
		        new Employee(27, "Giannis"), new Employee(19, "Julia"));
		List<Employee> results = employees.stream()
		        .sorted(Comparator.comparing(Employee::getAge, (a1, a2) -> a1 - a2).thenComparing(Employee::getName))
		        .collect(Collectors.toList());
		logger.info("" + results);
	}

}
