import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class proj_2 {
    public static void main(String[] args) {
        Map<String, Integer> nameMap = new HashMap<>();
        String[] employeeNames = { "Иван",
                "Петр",
                "Ирина",
                "Юра",
                "Иван",
                "Ирина",
                "Иван",
                "Ирина",
                "Светлана",
                "Петр",
                "Светлана",
                "Иван" };
        for (int i = 0; i < employeeNames.length; i++) {
            if (nameMap.containsKey(employeeNames[i])) {
                nameMap.replace(employeeNames[i], nameMap.get(employeeNames[i]) + 1);
            } else {
                nameMap.put(employeeNames[i], 1);
            }
        }
        System.out.println(nameMap);

       
        Map<String, Integer> sortedMap = nameMap.entrySet().stream()
                .sorted(Comparator.comparingInt(Map.Entry::getValue))
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> {
                            throw new AssertionError();
                        },
                        LinkedHashMap::new));

        sortedMap.entrySet().forEach(System.out::println);

    }

}