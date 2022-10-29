

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Locale.Category;

import javax.swing.text.View;


public class myModel implements model{
    phonebook pb;
    json st;
    
    public myModel() throws IOException {
        pb = new phonebook();
        st = new json();
    }


    public phonebook fillPhonebook(String string) {
        Contact.Builder contact1 = new Contact.Builder()
        .withName("name1")
        .withphNumber("123")
        .withComment(null)
        .withCategory(null);
        Contact.Builder contact2 = new Contact.Builder()
        .withName("name2")
        .withphNumber("321")
        .withComment(null)
        .withCategory(null);       
        return pb;
    }

    @Override
    public String getPhonebook() {
        // TODO Auto-generated method stub
        return pb.view();
    }

    @Override
    public ArrayList<Contact> getcontactList() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void Import() throws IOException, ParseException {
        st.Import(pb);
        
    }

    @Override
    public void Export() throws IOException {
        st.Export(pb);
        
    }

    @Override
    public phonebook fillPhonebook(View view) {
        // TODO Auto-generated method stub
        return null;
    }
    public void load() {
        // try {
        //     File file = new File(path);
        //     FileReader fr = new FileReader(file);
        //     BufferedReader reader = new BufferedReader(fr);
        //     String fname = reader.readLine();
        //     while (fname != null) {
        //         String lname = reader.readLine();
        //         String description = reader.readLine();
        //         this.currentBook.add(new Contact(fname, lname, description));
        //         fname = reader.readLine();
        //     }
        //     reader.close();
        //     fr.close();
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }
    }

    public void save() {

    //     try (FileWriter writer = new FileWriter(path, false)) {
    //         for (int i = 0; i < currentBook.count(); i++) {
    //             Contact contact = currentBook.getCotact(i);
    //             writer.append(String.format("%s\n", contact.firstName));
    //             writer.append(String.format("%s\n", contact.lastName));
    //             writer.append(String.format("%s\n", contact.description));
    //         }
    //         writer.flush();
    //         writer.close();
    //     } catch (IOException ex) {
    //         System.out.println(ex.getMessage());
    //     }
     }


    public Object currentContact() {
        return null;
    }


    public Object currentBook() {
        return null;
    }


    public Object getData() {
        return null;
    }

    
}
