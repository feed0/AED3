package B_FileStreams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ex2 {
    public static void main(String[] args) throws IOException {
        FileReader in = new FileReader("src\\B_FileStreams\\file2.txt");
        int value, total = 0, spaces = 0;
        while ((value = in.read()) != - 1) {
            System.out.println(value+": "+(char) value);
            total++;
            if (Character.isWhitespace((char) value))
                spaces++;
        }
        in.close();
        System.out.println("Chars: " + total +
                "\nWhitespaces: " + spaces);
    }
}
