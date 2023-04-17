// Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив. 
// Необходимо посчитать и вернуть сумму элементов этого массива. 
// При этом накладываем на метод 2 ограничения: метод может работать только 
// с квадратными массивами (кол-во строк = кол-ву столбцов), 
// и в каждой ячейке может лежать только значение 0 или 1. 
// Если нарушается одно из условий, метод должен бросить RuntimeException 
// с сообщением об ошибке.

public class zadacha3 {
    public static void main(String[] args) {
        System.out.println(SumBin(new int[][] { { 1, 0, 0 }, { 1, 1, 1 }, { 1, 0, 0 } }));
        System.out.println(SumBin(new int[][] { { 2, 0, 0 }, { 1, 1, 1 }, { 1, 0, 0 } }));
        System.out.println(SumBin(new int[][] { { 2, 0, 0 }, { 1, 1, 1 }, { 1, 0, 0 }, { 1, 1, 1 }, { 1, 0, 0 } }));
    }

    private static int SumBin(int[][] arr) {
        if (arr.length != arr[0].length) {
            throw new RuntimeException("Массив неквадратный");
        }
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] != 0 && arr[i][j] != 1) {
                    throw new RuntimeException("Массив небинарный" + " " + i + " " + j);
                }
                sum = sum + arr[i][j];
            }
        }
        return sum;
    }
}
