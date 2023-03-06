package B_FileStreams;

import java.io.FileInputStream;
import java.io.IOException;

public class Ex1 {
    public static void main(String[] args) throws IOException {
        FileInputStream in = new FileInputStream("src\\B_FileStreams\\file1.txt");
        int value, total = 0;
        while ((value = in.read()) != -1) {
            System.out.println((char)value+": "+value);
            total++;
        }
        in.close();
        System.out.printf("\nTotal: %d bytes", total);
    }
}
