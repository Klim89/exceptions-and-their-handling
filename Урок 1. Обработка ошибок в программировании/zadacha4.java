// Реализуйте метод checkArray(Integer[] arr), 
// принимающий в качестве аргумента целочисленный одномерный массив. 
// Метод должен пройтись по каждому элементу и проверить что он не равен null. 
// А теперь реализуйте следующую логику:
// Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом пользователя
// Если null’ы встретились в нескольких ячейках, то идеально было бы все их “подсветить”

public class zadacha4 {
    public static void main(String[] args) {
        CheckArray(new Integer[] { 1, 2, 3, 4, 5, 6, 7 });
        CheckArray(new Integer[] { 1, null, 3, 4, null, 6, 7 });
    }

    public static void CheckArray(Integer[] array) {
        String errIndex = "";
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                errIndex = errIndex + " " + i;
            }
        }
        if (errIndex != "")
            throw new RuntimeException("Индексы ошибок" + errIndex);
        else
            System.out.println("Ошибок нет");
    }
}
