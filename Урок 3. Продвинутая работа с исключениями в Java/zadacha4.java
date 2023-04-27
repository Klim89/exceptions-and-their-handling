// Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4. 
// При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
// Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать. 
// Если в каком-то элементе массива преобразование не удалось 
// (например, в ячейке лежит символ или текст вместо числа), 
// должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке 
// лежат неверные данные.
// В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException 
// и MyArrayDataException и вывести результат расчета (сумму элементов, при условии что подали на вход корректный массив).

public class zadacha4 {
    public static int SumStringMatrics(String[][] arr) throws MyArrayDataException, ArraySize {
        int sum = 0;
        if (arr.length != 4 || arr[0].length != 4) {
            throw new ArraySize();
        } else {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    try {
                        sum += Integer.parseInt(arr[i][j]);
                    } catch (NumberFormatException e) {
                        throw new MyArrayDataException(i, j);
                    }
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String[][] arr = {
                {"1", "2", "3", "a"},
                { "5", "6", "7", "8" },
                { "9", "10", "11", "12" },
                { "13", "14", "15", "16" }
        };
        zadacha4 sum = new zadacha4();
        try {
            System.out.println(SumStringMatrics(arr));
        } catch (ArraySize | MyArrayDataException e) {
            System.out.println(e);
        }
    }
}