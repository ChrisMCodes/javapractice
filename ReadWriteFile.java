import java.io.*;
import java.util.Scanner;
import java.io.FileWriter;

public class ReadWriteFile {
    public static void main(String[] args) throws IOException {
        File file = new File("hello.txt");
        file.createNewFile();
        Scanner sc = new Scanner(System.in);
        Scanner in = new Scanner(file);
        in.useDelimiter(",");
        FileWriter fw = new FileWriter(file);
        String name;

        System.out.println("PLEASE ENTER YOUR NAME: ");
        name = sc.next();

        fw.write(name + ",");

        for (int i = 65; i < 91; i++) {
            char c = (char) i;
            fw.write(c + ",");
        }

        fw.close();
        sc.close();

        while (in.hasNext()) {
            System.out.println(in.next());
        }

        in.close();

    }
}
