import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class proj {
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> nameToPhone = new HashMap<>();
                                                                      
        addNumberPhone("Bogdan Titamirov", 459479, nameToPhone);
        addNumberPhone("Nina Anatolevna", 515556, nameToPhone);
        addNumberPhone("Ira Dobrau", 52522, nameToPhone);
        addNumberPhone("Nikita Torov", 65246, nameToPhone);
        addNumberPhone("Alexander Malkov", 579544, nameToPhone);
        printPhoneBook(nameToPhone);
        
        searchByKey(nameToPhone);
    }
    public static String dataInputString() {
        Scanner scan1 = new Scanner(System.in);
        String data = scan1.nextLine();
        scan1.close();
        return data;
    }

    public static int dataInputInt() {
        Scanner scan2 = new Scanner(System.in);
        int data;
        if (scan2.hasNextLine()) {
            data = scan2.nextInt();
        } else
            data = 0;
        scan2.close();
        return data;
    }

    public static void addNumberPhone(String key, int value, Map<String, ArrayList<Integer>> map) {
                                                                                                   
                                                                                                  
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }

    public static void addNewNumberPhone(Map<String, ArrayList<Integer>> map) {
        System.out.println("Введите имя контакта!");
        String key = dataInputString();
        System.out.println("Введите номер контакта!");
        int value = dataInputInt();
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }

    public static void printPhoneBook(Map<String, ArrayList<Integer>> list) {
        for (Map.Entry<String, ArrayList<Integer>> entry : list.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

    public static void searchByKey(Map<String, ArrayList<Integer>> list) {
        System.out.println("Введите имя контакта!");
        String key = dataInputString();

        if (list.containsKey(key)) {
            System.out.printf("Номер телефона: " + list.get(key));
        } else {
            System.out.println("Контакт не найден");
        }
    }

}