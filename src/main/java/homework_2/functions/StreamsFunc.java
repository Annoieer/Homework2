package homework_2.functions;

import homework_2.constants.EmployeePositionEnum;
import homework_2.objects.Employee;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamsFunc {
    public static List<Integer> deleteDuplicates(List<Integer> list) {
        return list.stream().distinct().collect(Collectors.toList());
    }

    public static Integer findThirdMaxInt(List<Integer> list) {
        return list.stream()
                .sorted(Comparator.reverseOrder())
                .skip(2)
                .findFirst()
                .map(Integer::new)
                .orElse(null);
    }

    public static Integer findUniqThirdMaxInt(List<Integer> list) {
        return list.stream()
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(2)
                .findFirst()
                .map(Integer::new)
                .orElse(null);
    }

    public static String findLongestString(List<String> list) {
        return list.stream().max(Comparator.comparingInt(String::length)).orElse(null);
    }

    public static List<String> getThreeOldestEngineers(List<Employee> employees) {
        return employees.stream()
                .filter(employee -> Objects.equals(employee.getPosition(), EmployeePositionEnum.ENGINEER.getPosition()))
                .sorted((p1, p2) -> p2.getAge().compareTo(p1.getAge()))
                .map(Employee::getName)
                .limit(3)
                .collect(Collectors.toList());
    }

    public static double getAverageEngineersAge(List<Employee> employees) {
        return employees.stream()
                .mapToInt(Employee::getAge)
                .average()
                .orElse(-1);
    }

    public static HashMap<String, Long> getHashMapOfStrMatches(String text) {
        List<String> parts = new ArrayList<>(Arrays.asList(text.split(" ")));
        return new HashMap<>(parts.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
    }

    public static void sortStringsByLength(List<String> stringList) {
        stringList.stream()
                .sorted(Comparator.comparing(String::length).thenComparing(Function.identity()))
                .forEach(System.out::println);
    }

    public static String findLongestWordInStringArray(String[] stringArray) {
        List<String> words = new ArrayList<>();
        Arrays.stream(stringArray).forEach(i -> words.addAll(Arrays.asList(i.split(" "))));
        return words.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse(null);
    }
}
