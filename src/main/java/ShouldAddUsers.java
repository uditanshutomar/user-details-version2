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
        /*
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
        */
        String phoneregex = "^[0-9]{10}$";
        boolean checkphone = false;

        while (checkphone == false) {
            System.out.print("Enter Phone No.: ");
            String phone = s.next();
            boolean result = phone.matches(phoneregex);
            if (result == false) {
                System.out.println("Please enter a valid Phone No.");
            } else {
                checkphone = true;
                Scanner sc = new Scanner(f1);
                while (sc.hasNextLine()) {
                    String t = sc.nextLine();
                    if (phone.equals(t)) {
                        System.out.println("User already exists");
                        return;
                    }
                }
                fw.write(phone + "\n");
            }
        }

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

        String emailregex = "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$";
        boolean check = false;

        while (check == false) {
            System.out.print("Enter email: ");
            String email = s.next();
            boolean result = email.matches(emailregex);
            if (result == false) {
                System.out.println("Please enter a valid Email");
            } else {
                check = true;
                fw.write(email + " ");
            }
        }

        System.out.println();
        fw.write("\n");
        System.out.println("User Data Saved Successfully");
        fw.close();


    }
}
