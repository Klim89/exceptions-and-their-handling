// Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

package Homework.Work_2;

import java.util.Scanner;

public class zadacha_4 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String text = iScanner.nextLine();
        iScanner.close();
        if (text.isEmpty()) {
            throw new RuntimeException("Ввод пустых строк запрещен");
        } else {
            System.out.println(text);
        }
    }
}