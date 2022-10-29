import java.util.ArrayList;

public interface View {
    
    String getName();
    void setName(String value);
    String getPhone();
    void setPhone(String value);
    public void printPhonebook(Object object);
    public String menu();
    public void nextContact(ArrayList<Contact> contacts, Integer ptr);
    public void prevContact(ArrayList<Contact> contacts, Integer ptr);
    void getData();
    
    }
