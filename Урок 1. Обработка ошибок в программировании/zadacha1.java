// Реализуйте метод, принимающий в качестве аргумента целочисленный массив. 
// Если длина массива меньше некоторого заданного минимума, метод возвращает -1, 
// в качестве кода ошибки, иначе - длину массива.

public class zadacha1 {

    public static void main(String[] args) {
        int [] arr = new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println(sizeArray(arr, 15));  
    }

    public static int sizeArray(int[]arr, int min) {
        int a = arr.length;
        if (a < min) {
            return -1;
        }
        return a;
    }
}