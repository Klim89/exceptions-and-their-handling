/*Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение. 
Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
если вместо массива пришел null, метод вернет -3
придумайте свои варианты исключительных ситуаций и верните соответствующие коды ошибок.

Напишите метод, в котором реализуйте взаимодействие с пользователем. То есть, 
этот метод запросит искомое число у пользователя, вызовет первый, обработает 
возвращенное значение и покажет читаемый результат пользователю. Например, если вернулся -2, 
пользователю выведется сообщение: “Искомый элемент не найден”.*/

public class zadacha2 {

    public static void main(String[] args) {
        // Задача 1:
        int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int[] arr1 = null;
        // System.out.println(sizeArray(arr, 15));
        // Задача 2:
        printCodExeptions(Array(arr, 4, 1));
        printCodExeptions(Array(arr, 4, 11)); // -1
        printCodExeptions(Array(arr, 55, 1)); // -2
        printCodExeptions(Array(null, 4, 1)); // -3
    }

    public static int sizeArray(int[] arr, int min) {
        int a = arr.length;
        if (a < min) {
            return -1;
        }
        return a;
    }

    public static int Array(int[] arr, int value, int min) {
        if (arr == null) {
            return -3;
        }
        if (arr.length < min) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                return i;
            }
        }
        return -2;
    }

    public static void printCodExeptions(int cod) {
        if (cod == -3) {
            System.out.println("Вместо массива пришел null");
        } else if (cod == -2) {
            System.out.println("Искомый элемент не найден");
        } else if (cod == -1) {
            System.out.println("Длина массива меньше некоторого заданного минимума");
        } else
            System.out.println("Индекс =" + cod);
    }
}