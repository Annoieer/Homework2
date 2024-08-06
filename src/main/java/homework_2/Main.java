package homework_2;

import homework_2.functions.CreatingFunc;
import homework_2.functions.StreamsFunc;
import homework_2.objects.Employee;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Исходный массив чисел");
        List<Integer> integerList = CreatingFunc.createTestIntList();
        integerList.forEach(System.out::println);

        System.out.println("---------------------------------------------");

        System.out.println("Удаление дубликатов");
        List<Integer> integersWithoutDup = StreamsFunc.deleteDuplicates(integerList);
        integersWithoutDup.forEach(System.out::println);

        System.out.println("---------------------------------------------");

        System.out.println("Третье наибольшее число");
        System.out.println(StreamsFunc.findThirdMaxInt(integerList));

        System.out.println("---------------------------------------------");

        System.out.println("Третье наибольшее уникальное число");
        System.out.println(StreamsFunc.findUniqThirdMaxInt(integerList));

        System.out.println("---------------------------------------------");
        System.out.println("---------------------------------------------");

        System.out.println("Список всех сотрудников");
        List<Employee> employeeList = CreatingFunc.createTestEmployeeList();
        for (Employee employee : employeeList) {
            System.out.println(employee.getName() + '\t' + employee.getPosition() + '\t' + employee.getAge());
        }

        System.out.println("---------------------------------------------");

        System.out.println("Три самых старших инженера");
        List<String> engineers = StreamsFunc.getThreeOldestEngineers(employeeList);
        engineers.forEach(System.out::println);

        System.out.println("---------------------------------------------");

        System.out.println("Средний возраст инженеров");
        System.out.println(StreamsFunc.getAverageEngineersAge(employeeList));

        System.out.println("---------------------------------------------");
        System.out.println("---------------------------------------------");

        System.out.println("Исходный список слов");
        List<String> stringList = CreatingFunc.createTestStringList();
        stringList.forEach(System.out::println);

        System.out.println("---------------------------------------------");

        System.out.println("Самое длинное слово");
        System.out.println(StreamsFunc.findLongestString(stringList));

        System.out.println("---------------------------------------------");
        System.out.println("---------------------------------------------");

        System.out.println("Исходная строка");
        String strForMatch = CreatingFunc.createRandomString();
        System.out.println(strForMatch);

        System.out.println("---------------------------------------------");

        System.out.println("HashMap с количеством вхождений");
        HashMap<String, Long> hashMap = StreamsFunc.getHashMapOfStrMatches(strForMatch);
        for (String word : hashMap.keySet()) {
            System.out.println("Key:\t" + word + "\tValue:\t" + hashMap.get(word).toString());
        }

        System.out.println("---------------------------------------------");
        System.out.println("---------------------------------------------");

        System.out.println("Исходный список слов");
        stringList = CreatingFunc.createTestStringList();
        stringList.forEach(System.out::println);

        System.out.println("---------------------------------------------");

        System.out.println("Строки в порядке увеличения длины слова");
        StreamsFunc.sortStringsByLength(stringList);

        System.out.println("---------------------------------------------");
        System.out.println("---------------------------------------------");

        System.out.println("Исходный список строк");
        String [] linesList = CreatingFunc.createTestStringLinesList();
        Arrays.stream(linesList).forEach(System.out::println);

        System.out.println("---------------------------------------------");

        System.out.println("Одно из самых длинных слов");
        System.out.println(StreamsFunc.findLongestWordInStringArray(linesList));
    }
}
