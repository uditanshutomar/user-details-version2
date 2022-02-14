import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ShouldUpdateUserDetails {
    public static void updateUserDetails() throws IOException {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your phone no.: ");
        String a = s.next();
        System.out.println();
        File f2 = new File("temporary.txt");
        File f1 = new File("data.txt");
        f2.createNewFile();
        FileWriter fo2 = new FileWriter("temporary.txt", true);
        Scanner sc = new Scanner(f1);
        boolean bo = false;
        while (sc.hasNextLine()) {
            String t = sc.nextLine();
            if (a.equals(t)) {
                bo = true;
                fo2.write(t + "\n");
                System.out.println("Present Saved Data: " + sc.nextLine());
                System.out.print("Enter updated first name: ");
                String firstname = s.next();
                fo2.write(firstname + " ");
                System.out.println();

                System.out.print("Enter updated Last name: ");
                String lastname = s.next();
                fo2.write(lastname + " ");
                System.out.println();

                System.out.print("Enter updated Email: ");
                String email = s.next();
                fo2.write(email + " ");
                System.out.println();
                fo2.write("\n");
            } else {
                fo2.write(t + "\n");
            }
        }

        if (bo == false) {
            System.out.println("No user found" + "\n" + "Please register user first");
        }
        fo2.close();

    }
}
