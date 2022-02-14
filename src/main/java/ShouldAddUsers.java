import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ShouldAddUsers {
    public static void addUsers() throws IOException {
        Scanner s = new Scanner(System.in);
        File f1 = new File("data.txt");
        FileWriter fw = new FileWriter("data.txt", true);

        //phone
        System.out.print("Enter Phone No.: ");
        String phone = s.next();
        Scanner sc = new Scanner(f1);
        while (sc.hasNextLine()) {
            String t = sc.nextLine();
            if (phone.equals(t)) {
                System.out.println("User already exists");
                return;
            }
        }
        fw.write(phone + "\n");
        System.out.println();
        //First name
        System.out.print("Enter first name: ");
        String firstname = s.next();
        fw.write(firstname + " ");
        System.out.println();
        //Last Name
        System.out.print("Enter last name: ");
        String lastname = s.next();
        fw.write(lastname + " ");
        System.out.println();
        //Email
        System.out.print("Enter email: ");
        String email = s.next();
        fw.write(email + " ");
        System.out.println();
        fw.write("\n");
        System.out.println("User Data Saved Successfully");
        fw.close();

    }
}
