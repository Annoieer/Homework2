package homework_2.functions;

import homework_2.constants.EmployeePositionEnum;
import homework_2.objects.Employee;
import org.apache.commons.lang.RandomStringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CreatingFunc {
    public static List<Integer> createTestIntList() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 8; i++) {
            list.add((int) (Math.random() * 30) + 1);
        }
        list.add(list.get(2));
        list.add(list.get(5));
        Collections.shuffle(list);
        return list;
    }

    public static List<String> createTestStringList() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int length = (int) (Math.random() * 16) + 5;
            list.add(RandomStringUtils.randomAlphabetic(length));
        }
        Collections.shuffle(list);
        return list;
    }

    public static List<Employee> createTestEmployeeList() {
        return new ArrayList<>(Arrays.asList(
                new Employee("David1", (int) ((Math.random() * 40) + 20), EmployeePositionEnum.ENGINEER.getPosition()),
                new Employee("David2", (int) ((Math.random() * 40) + 20), EmployeePositionEnum.REPORTER.getPosition()),
                new Employee("David3", (int) ((Math.random() * 40) + 20), EmployeePositionEnum.DIRECTOR.getPosition()),
                new Employee("David4", (int) ((Math.random() * 40) + 20), EmployeePositionEnum.ENGINEER.getPosition()),
                new Employee("David5", (int) ((Math.random() * 40) + 20), EmployeePositionEnum.ENGINEER.getPosition()),
                new Employee("David6", (int) ((Math.random() * 40) + 20), EmployeePositionEnum.MECHANIC.getPosition()),
                new Employee("David7", (int) ((Math.random() * 40) + 20), EmployeePositionEnum.ENGINEER.getPosition())
                ));
    }

    public static String createRandomString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            int length = (int) (Math.random() * 5) + 2;
            String randomWord = RandomStringUtils.randomAlphabetic(length);
            stringBuilder.append(randomWord).append(" ");
            while (Math.random() > 0.5) {
                stringBuilder.append(randomWord).append(" ");
            }
        }
        return stringBuilder.toString();
    }

    public static String[] createTestStringLinesList() {
        String[] lines = new String[10];
        for (int i = 0; i < 10; i++) {
            lines[i] = createRandomString();
        }
        return lines;
    }
}
