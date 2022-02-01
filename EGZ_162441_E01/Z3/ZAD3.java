package EGZ_162441_E01.Z3;

import java.io.File;
import java.util.Arrays;

public class ZAD3 {
    public static void main(String[] args) {
        String path = "C:\\Users\\Grzegorz\\Desktop\\moje";
        System.out.println(Arrays.toString(zwrocWszystkiePliki(path)));
    }

    public static String[] zwrocWszystkiePliki(String path){
        File file = new File(path);
        return file.list((dir, name) -> true);
    }
}
