import java.util.ArrayList;
import java.util.Scanner;

public class newView implements View {
    Scanner sc;
    public newView(){
        sc = new Scanner(System.in);
    }
    @Override
    public String getName() {
        System.out.print("Name: ");
        return sc.nextLine();
    }

    @Override
    public void setName(String value) {
        System.out.printf("Name: %s\n", value);
        
    }

    @Override
    public String getPhone() {
        System.out.print("Phone: ");
        return sc.nextLine();
    }
    public void getData(){
        System.out.println("You are got the data");
    }

    @Override
    public void setPhone(String value) {
        System.out.printf("Phone: %s\n", value);
        
    }

    
    // public void printPhonebook(String pb) {
    //     System.out.println(pb);
    // }
    
    public String menu() {
        System.out.println("Phonebook\n1 - next, 2 - prev");
        sc = new Scanner(System.in);
        String cmd = sc.nextLine();
        System.out.println("\033[H\033[J");
        return cmd;
    }
    public void nextContact(ArrayList<Contact> contacts, Integer ptr) {
        System.out.println("Contact:" + contacts.get(ptr));
    }

        public void prevContact(ArrayList<Contact> contacts, Integer ptr) {
        System.out.println("Contact:" +contacts.get(ptr));
    }
        @Override
    public void printPhonebook(Object object) {
        System.out.println(object);
            
    }
    
}
