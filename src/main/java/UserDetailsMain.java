import java.util.*;
import java.io.*;

public class UserDetailsMain {
    public static void main(String args[]) {

        File fl = new File("data.txt");
        try {
            fl.createNewFile();

            System.out.println("Choose the type of operation" + "\n" + "Press 1 to insert data" + "\n" + "Press 2 to update data");
            Scanner s = new Scanner(System.in);

            int a = s.nextInt();
            if (a == 1) {
                ShouldAddUsers.addUsers();
            } else if (a == 2) {
                ShouldUpdateUserDetails.updateUserDetails();
                ShouldDeleteTemporaryFile.del();
            } else {
                System.out.println("Please Enter a valid Input");
            }

        } catch (IOException a) {
            //System.out.println("Failed to create file");

        }
    }
}
