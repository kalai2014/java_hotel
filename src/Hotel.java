//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;


public class Hotel {
    public static void main(String[] args) {

        System.out.println("Hotel Booking Management");
        System.out.println("Please select your preferred choice");
        System.out.println("1. Register Account");
        System.out.println("2. Book Reservation");
        System.out.println("3. Generate Bill");
        System.out.println("4. Feedback");
        System.out.println("Enter your option:");
        Scanner scanner = new Scanner(System.in);
        int options = scanner.nextInt();

        switch (options){
            case 1:
                registerAccount();
                break;
            case 2:
                bookReservation();
                break;
            case 3:
                generateBill();
                break;
            case 4:
                feedback();
                break;
            default:
                System.out.println("enter a valid option");
        }

    }
    static void registerAccount(){
//
        try {

            File folder = new File("Accounts");
            folder.mkdir();

            int randomNum = (int) (Math.random() * 10000);
            String fileName = "ACC_" + randomNum + ".json";

            File file = new File(folder, fileName);
            file.createNewFile();

            Scanner info = new Scanner(System.in);
            System.out.print("Enter first name: ");
            String firstName = info.nextLine();
            System.out.print("Enter phone number: ");
            String phoneNumber = info.nextLine();
            System.out.print("Enter email ID: ");
            String emailId = info.nextLine();
            System.out.print("Enter address: ");
            String address = info.nextLine();


            FileWriter Writer = new FileWriter(file);
            Writer.write("{\n");
            Writer.write("\"firstname\": \"" + firstName + "\",\n");
            Writer.write("\"phoneNumber\": \"" + phoneNumber + "\",\n");
            Writer.write("\"emailId\": \"" + emailId + "\",\n");
            Writer.write("\"address\": \"" + address + "\"\n");
            Writer.write("}\n");
            Writer.close();

            System.out.println("Account registered in " + fileName);
        } catch (IOException e) {
            System.out.println("Error creating account: " + e.getMessage());
        }
    }
    private static void feedback() {
    }

    private static void generateBill() {
    }

    private static void bookReservation() {
    }


}
