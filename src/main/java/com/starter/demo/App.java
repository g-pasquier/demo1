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

        public String getName() {
            return name;
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

        // Employees
        displayEmployees();

        // on boards
        List<Board> boards = new BoardService().makeBoards(5);

        for (Board board : boards) {
            if (board instanceof FreestyleBoard) {
                logger.info("" + board);
            }
        }

    }

    private static void displayEmployees() {

        List<Employee> employees = Arrays.asList(new Employee(22, "Paul"), new Employee(22, "Eric"),
                new Employee(27, "Giannis"), new Employee(19, "Julia"));
        List<Employee> results = employees.stream().sorted(Comparator
                .comparing(Employee::getAge, (a1, a2) -> a1 - a2).thenComparing(Employee::getName))
                .collect(Collectors.toList());
        logger.info("" + results);
    }

}
