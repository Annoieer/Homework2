package homework_2.functions;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionsFunc {
    public static List<Integer> deleteDuplicates(List<Integer> list) {
        return list.stream().distinct().collect(Collectors.toList());
    }

    public static Integer findThirdMaxInt(List<Integer> list) {
        list.sort(Collections.reverseOrder());
        return list.get(2);
    }

    public static Integer findUniqThirdMaxInt(List<Integer> list) {
        return findThirdMaxInt(deleteDuplicates(list));
    }

    public static String findLongestString(List<String> list) {
        return Collections.max(list, Comparator.comparing(String::length));
    }
}
