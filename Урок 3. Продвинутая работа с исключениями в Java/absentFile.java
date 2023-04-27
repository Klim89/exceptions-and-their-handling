import java.io.FileNotFoundException;

public class absentFile extends FileNotFoundException {
    public absentFile() {
        super("Такого файла нет!");
    }
}