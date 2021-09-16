package pro.sky.java.course1;

public class Main {

    public static void main(String[] args) {
        // Задание 1
        task1();
        // Задание 2
        task2();
        // Задание 3
        task3();
        // Задание 4
        task4();
        // Задание 5
        task5();
        // Задание 6
        task6();
        // Задание 7
        task7();
        // Задание 8
        task8();

    }

    private static void task8() {
        String letters = "aabccddefgghiijjkk";
        char[] symbol = letters.toCharArray();
        for (int i = 0; i < letters.length(); i++) {
            for (int i2 = i + 1; i2 < letters.length(); i2++) {
                if (symbol[i] == symbol[i2]) {
                    System.out.print(symbol[i2]);
                }
            }
        }
        System.out.println();
    }

    private static void task7() {
        String first = "135";
        String second = "246";
        StringBuilder correct = new StringBuilder();
        for (int i = 0; i < first.length(); i++) {
            correct.append(first.charAt(i)).append(second.charAt(i));
        }
        System.out.println("Данные строки – " + correct);
    }

    private static void task6() {
        String fullName = "ivanov ivan ivanovich";
        String correctName = "";
        correctName = correctName + fullName.substring(0, 1).toUpperCase();
        for (int i = 1; i < fullName.length(); i++) {
            if (" ".equals(fullName.substring(i - 1, i)))
                correctName = correctName + fullName.substring(i, i + 1).toUpperCase();
            else
                correctName = correctName + fullName.charAt(i);
        }
        System.out.println("Верное написание ФИО сотрудника с заглавных букв – " + correctName);
    }

    private static void task5() {
        String fullName = "Ivanov Ivan Ivanovich";
        String[] name = fullName.split(" ");
        String lastName = name[0];
        String firstName = name[1];
        String middleName = name[2];
        System.out.println("Имя сотрудника – " + firstName);
        System.out.println("Фамилия сотрудника – " + lastName);
        System.out.println("Отчество сотрудника – " + middleName);
    }

    private static void task4() {
        String fullName = "Иванов Семён Семёнович";
        String name = fullName.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника – " + name);
    }

    private static void task3() {
        String fullName = "Ivanov Ivan Ivanovich";
        String passName = fullName.replace(" ", ";");
        System.out.println("Данные ФИО сотрудника для административного отдела – " + passName);
    }

    private static void task2() {
        String fullName = "Ivanov Ivan Ivanovich";
        String fullNameUp = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета – " + fullNameUp);
    }

    private static void task1() {
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника – " + fullName);
    }
}
