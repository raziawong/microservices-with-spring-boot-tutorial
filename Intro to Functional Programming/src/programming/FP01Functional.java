package programming;

import java.util.List;

public class FP01Functional {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(12,9,13,4,6,2,4,12,15);
        List<String> courses = List.of("Spring", "Spring Boot", "API", "Microservices", "AWS", "PCF", "Azure", "Docker", "Kubernetes");

        System.out.print("Print all numbers: ");
        printAllInList(numbers);

        System.out.print("\nPrint only even numbers: ");
        printEvenNumbersInList(numbers);

        System.out.print("\nPrint only odd numbers: ");
        printOddNumbersInList(numbers);

        System.out.print("\nPrint square of all even numbers: ");
        printSquaresOfEvenNumbersInList(numbers);

        System.out.print("\nPrint cube of all odd numbers: ");
        printCubesOfOddNumbersInList(numbers);

        System.out.print("\nPrint all courses: ");
        printAllInList(courses);

        System.out.print("\nPrint all courses containing the word \"Spring\": ");
        findStringInList(courses, "Spring");

        System.out.print("\nPrint all courses with at least 4 letters: ");
        findStringByLengthInList(courses, 4);

        System.out.print("\nPrint number of letters in each course: ");
        printNumberOfLettersInList(courses);
    }

//    private static boolean isEven(int number) {
//        return number % 2 == 0;
//    }

    private static void printAllInList(List<?> listing) {
        listing.stream().forEach(i -> System.out.print(i + " | "));
    }

    private static void printEvenNumbersInList(List<Integer> numbers) {
        numbers.stream()
                // .filter(FP01Functional::isEven) // using Method Reference
                .filter(num -> num % 2 == 0) // using Lambda expression
                .forEach(i -> System.out.print(i + " | "));
    }

    private static void printOddNumbersInList(List<Integer> numbers) {
        numbers.stream()
                .filter(num -> num % 2 != 0)
                .forEach(i -> System.out.print(i + " | "));
    }

    private static void printSquaresOfEvenNumbersInList(List<Integer> numbers) {
        numbers.stream()
                .filter(num -> num % 2 == 0)
                .map(num -> num * num)
                .forEach(i -> System.out.print(i + " | "));
    }

    private static void printCubesOfOddNumbersInList(List<Integer> numbers) {
        numbers.stream()
                .filter(num -> num % 2 != 0)
                .map(num -> num * num * num)
                .forEach(i -> System.out.print(i + " | "));
    }

    private static void findStringInList(List<String> strings, String targetStr) {
        strings.stream()
                .filter(str -> str.contains(targetStr))
                .forEach(str -> System.out.print(str + " | "));
    }

    private static void findStringByLengthInList(List<String> strings, int length) {
        strings.stream()
                .filter(str -> str.trim().length() >= length)
                .forEach(str -> System.out.print(str + " | "));
    }

    private static void printNumberOfLettersInList(List<String> strings) {
        strings.stream()
                .map(str -> str + " " + str.replace(" ", "").length())
                .forEach(str -> System.out.print(str + " | "));
    }
}
