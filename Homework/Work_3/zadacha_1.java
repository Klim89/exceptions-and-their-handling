package Homework.Work_3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class zadacha_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите фамилию имя и отчество, используя пробел: ");
        String fullName = scanner.nextLine();

        System.out.println("Введите дату рождения, формат dd.mm.yyyy: ");
        String birthDate = scanner.nextLine();

        System.out.println("Введите номер телефона: ");
        String phoneNumber = scanner.nextLine();

        System.out.println("Введите пол м/ж: ");
        char gender = scanner.next().charAt(0);

        scanner.close();

        /*
         * Проверяем количество введенных данных, если не совпадает с требуемым,
         * выбрасываем исключение IllegalArgumentException.
         */
        String[] fullNameParts = fullName.split(" ");
        if (fullNameParts.length != 3) {
            throw new IllegalArgumentException("Неверный формат ФИО");
        }

        String[] birthDateParts = birthDate.split("\\.");
        if (birthDateParts.length != 3) {
            throw new IllegalArgumentException("Неверный формат даты рождения");
        }

        if (phoneNumber.isEmpty()) {
            throw new IllegalArgumentException("Введите номер телефона");
        }

        /*
         * Проверяем формат данных,R
         * если формат неверный, выбрасываем исключение.
         */
        String lastName = fullNameParts[0];
        String firstName = fullNameParts[1];
        String middleName = fullNameParts[2];
        int day, month, year;
        try {
            day = Integer.parseInt(birthDateParts[0]);
            month = Integer.parseInt(birthDateParts[1]);
            year = Integer.parseInt(birthDateParts[2]);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Неверный формат даты рождения!");
        }

        String formattedPhoneNumber = phoneNumber.replaceAll("[^0-9]+", "");
        if (formattedPhoneNumber.length() != 11) {
            throw new IllegalArgumentException("Неверный формат номера телефона!");
        }

        /*
         * Создаем строку в необходимом формате и записываем ее в файл
         */
        String dataString = lastName + ";" + firstName + ";" + middleName + ";" +
                day + "." + month + "." + year + ";" +
                formattedPhoneNumber + ";" + gender + "\n";
        try (FileWriter writer = new FileWriter(lastName + ".txt", true)) {
            writer.write(dataString);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Данные записаны в файл " + lastName + ".txt");
    }
}