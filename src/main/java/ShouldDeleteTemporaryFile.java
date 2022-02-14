import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ShouldDeleteTemporaryFile {
    public static void del() throws IOException {
        File fe = new File("temporary.txt");
        Scanner s = new Scanner(fe);
        FileWriter f1 = new FileWriter("data.txt", true);
        FileWriter f2 = new FileWriter("data.txt");
        PrintWriter p2 = new PrintWriter(f2);
        p2.print("");
        p2.close();

        while (s.hasNextLine()) {
            f1.write(s.nextLine() + "\n");
        }
        f1.close();
        fe.delete();
    }
}
