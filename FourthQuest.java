/* Q4) WAP using java 8:

Collect all  even numbers from a list using stream
Given a list of objects of following class:
           class Employee{
           String fullName;
           Long salary;
           String city;
           }

          Get list of all unique firstNames of employees where their salary is less than 5000 and who live in delhi.
          Note: Full name is concatenation of first name, middle name and last name with single space in between. */

import java.util.Arrays;
import java.util.List;

public class FourthQuest {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream().filter(value -> value % 2 == 0).forEach(System.out::println);
    }
}