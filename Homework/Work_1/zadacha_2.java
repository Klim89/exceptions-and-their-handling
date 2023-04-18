// * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий 
// новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же 
// ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя. Важно: 
// При выполнении метода единственное исключение, которое пользователь может увидеть - 
// RuntimeException, т.е. ваше.
package Homework.Work_1;

import java.util.Random;

public class zadacha_2 {
    public static void main(String[] args) {
        int[] firstArray = getArray(10);
        int[] secondArray = getArray(12);
        int[] resArray = resArrays(firstArray, secondArray);
        printArray(firstArray);
        System.out.println();
        printArray(secondArray);
        System.out.println();
        printArray(resArray);
        // System.out.println();
        // printArray(resArrays(null, secondArray));
    }

    public static int[] resArrays(int[] firstArray, int[] secondArray) {
        if (firstArray == null || secondArray == null)
            throw new RuntimeException("Отсутствует массив");
        if (firstArray.length != secondArray.length)
            throw new RuntimeException("Массивы не равны");
        int[] resultArray = new int[firstArray.length];
        for (int i = 0; i < resultArray.length; i++) {
            resultArray[i] = firstArray[i] / secondArray[i];
        }
        return resultArray;
    }

    public static int[] getArray(int length) {
        int[] array = new int[length];
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            array[i] = random.nextInt(10);
        }
        return array;
    }

    public static void printArray(int[] array) {
        for (int v : array) {
            System.out.printf(v + " ");
        }
    }
}