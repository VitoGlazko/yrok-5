import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class zzz {
    private final Map<String, List<String>> zzz;

    public zzz() {
        this.zzz = new HashMap<>();
    }

    // Добавление номера телефона
    public void add(String name, String phoneNumber) {
        zzz.computeIfAbsent(name, k -> new ArrayList<>()).add(phoneNumber);
    }

    // Получение списка телефонов по имени
    public List<String> get(String name) {
        return zzz.getOrDefault(name, new ArrayList<>());
    }

    public static void main(String[] args) {
        zzz phoneBook = new zzz();

        phoneBook.add("Иванов", "+1234567890");
        phoneBook.add("Иванов", "+0987654321");
        phoneBook.add("Петров", "+1111222233");

        System.out.println("Телефоны Иванова: " + phoneBook.get("Иванов"));
        System.out.println("Телефоны Петрова: " + phoneBook.get("Петров"));
    }
}