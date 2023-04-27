public class MyArrayDataException extends Exception{
    public MyArrayDataException(int i ,int j) {
        super("В ячейке с индексами " + i + " " + j + "нет числовых данных");
    }
}