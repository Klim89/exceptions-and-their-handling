// исправьте код

package Homework.Work_2;

public class zadacha_2 {
    public static void main(String[] args) {
        int intArray[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };// инициализировал массив
        try {
            int d = intArray[1]; // убрал число 0
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}