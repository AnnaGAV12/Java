package homework5;

import java.util.HashMap;
import java.util.Map;

public class program {
    public static void main(String[] args) {
        // 1. Объявить и инициализировать словарь hashMap<String, String>
        Map<String, String> javaLessonsMap = new HashMap<>();
        System.out.println(
                "Задание №1\nСловарь по курсу лекций\"Знакомство с JAVA\"");
        System.out.println();

        // 2. Добавить в словарь 10 пар "Ключ - Значение". Автор и название книги например.
        System.out.println("Задание №2\nНаполняем словарь информацией:");
        javaLessonsMap.put(" 1", "Знакомство с языком программирования Java");
        javaLessonsMap.put(" 2", "Почему вы не можете не использовать API");
        javaLessonsMap.put(" 3", "Коллекции JAVA: Введение");
        javaLessonsMap.put(" 4", "Хранение и обработка данных ч1: приоритетные коллекции");
        javaLessonsMap.put(" 5", "Хранение и обработка данных ч2: множество коллекций Map");
        
        javaLessonsMap.forEach((a, b) -> System.out.println("Номер лекции: " + a + ". Тема: " + b));
        System.out.println();

        // 3. Пройти по словарю и добавить к значениям символ "!"
        System.out.println("Задание №3\nДобавить к значениям символ ! ");
        javaLessonsMap.replaceAll((a, b) -> b + "!");
        javaLessonsMap.forEach((a, b) -> System.out.println("Номер лекции: " + a + ". Тема: " + b));
        System.out.println();

        // 4. Добавить нового автора и название книги если соответствующего ключа не было.
        System.out.println("Задание №4\nДобавляем 6 лекцию и его тему в словарь:");
        javaLessonsMap.computeIfAbsent(" 6", b -> getNewValue());
        javaLessonsMap.forEach((a, b) -> System.out.println("Номер лекции: " + a + ". Тема: " + b));
        System.out.println();

        // 5. Если ключ, указанный в запросе, имеется, вырезать из соответствующего
        // ключу значения первое слово.
        System.out.println("Задание №5\nУдаляем слово \"Знакомство\" из темы первой лекции:");
        javaLessonsMap.computeIfPresent(" 1", (a, b) -> b.replaceFirst("Знакомство", ""));
        javaLessonsMap.forEach((a, b) -> System.out.println("Номер лекции: " + a + ". Тема: " + b));
        System.out.println();
    }

    // 4
    public static String getNewValue() {
        return "Хранение и обработка данных ч3: множество коллекций Set";
    }
}