//16 Класс String (Практика)
//        1. Создать класс StringTest с main методом
//        2. Создать произвольные строки разными вариантами:
//        1) Литерал
//        2) new
//        3) массив символов
//        4) из байтов
//        5) С помощью StringBuilder
//        3. Работа с строкой
//        1) Создать строку “Апельсин,Яблоко,Гранат,Груша”.
//        2) Воспользоваться методом split для извлечения всех названий фруктов в массив.
//        3) Найти и вывести на экран самое длинное название фрукта с преобразованием
//        всех символов в нижний регистр.
//        4) Создать «сокращенный» вариант названия фрукта. Получить подстроку из
//        первых 3-х символов названия фрукта. Вывести на экран.
//        5) Создать строку “ Я_новая_строка ”. (с такими же пробелами)
//        6) Преобразовать строку: Убрать лишние пробелы в начале и конце
//        7) Преобразовать строку: заменить все символы ‘_’ на пробелы.
//        8) Вывести окончательный вариант на экран.
//        9) Создать Scanner для ввода текста. Выводим на экран сообщение с текстом: «Вы
//        ввели: <ваш текст>»
//        10) Добавить проверку: если введенный текст начинается со слова “Запуск”,
//        выводим на экран «Запускаем процесс»
//        11)Добавить проверку: если введенный текст заканчивается на слово “завершен”,
//        выводим на экран «Процесс завершен»
//        12)Добавить проверку: если введенный текст содержит слово “ошибка” (с любым
//        регистром букв), выводим на экран «Произошла ошибка»
//        4. Создать StringBuilder:
//        1) Добавить в него все ранее созданные строки.
//        2) После каждой 3-й строки выполнять перенос на новую строку.
//        3) Развернуть содержимое задом на перед.
//        4) Собрать StringBuilder в строку. Вывести ее на экран.

import java.util.Arrays;
import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {
        String string0 = "ABC";

        String string1 = new String("ABC");

        char string2q[] = {'A', 'B', 'C'};
        String string2 = new String(string2q);
        System.out.println(string2);

//        String str1 = "ABC";
//        byte[] string3 = str1.getBytes();
//        System.out.println(Arrays.toString(string3));

        String str = "ABC";
        String string3 = new String(str.getBytes());
        System.out.println(string3);

        StringBuilder string4 = new StringBuilder("ABC");
        System.out.println(string4);


        String fruits = "Апельсин,Яблоко,Гранат,Груша";
        String[] fruits2 = fruits.split(",");

        int max = 0;
        for (String elements : fruits2) {
//            System.out.println(elements);
            if (elements.length() > max)
                max = elements.length();
        }
        for (String elements : fruits2) {
            if (elements.length() == max)
                System.out.println(elements.toLowerCase().substring(0,3));
        }
    String stringNew = " Я_новая_строка ";
        System.out.println(stringNew.trim().replace("_"," "));

        /**
         * 9) 10) 11) 12) Task
         */
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println("Вы ввели: " + s);
        if (s.contains("Запуск"))
            System.out.println("Запускаем процесс");
        if (s.contains("завершен"))
            System.out.println("Процесс завершен");
        if (s.equalsIgnoreCase("ошибка")) ;
        System.out.println("Произошла ошибка");

        /**
         * 4 Task
         */
        StringBuilder stringBuilder1 = new StringBuilder(string0);
        stringBuilder1.append(string1);
        stringBuilder1.append(string2);
        stringBuilder1.append("\n");
        stringBuilder1.append(string3);
        stringBuilder1.append(string4);

        System.out.println(stringBuilder1.reverse());
        System.out.println(stringBuilder1);



    }

}

