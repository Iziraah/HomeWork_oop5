import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;

import javax.swing.text.View;

public interface model {
    public phonebook fillPhonebook(View view);
    public String getPhonebook();
    public ArrayList<Contact> getcontactList();
    public void Import() throws IOException, ParseException;
    public void Export() throws IOException;
}

