import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.xml.stream.events.Comment;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;



public class json {
    private String name = "pb.json";
    private File file;

    public void createJson() throws IOException{
        file = new File(this.name);
        file.createNewFile();
    }

   
    public void Export(phonebook pb) throws IOException {
        FileWriter fw = new FileWriter(this.name);
        fw.write(serialize(pb.contacts));
        fw.close();
    }
    public String serialize(List<Contact> contacts) {
        JSONObject contactsListJson = new JSONObject();
        JSONObject contactJson;
        
        for (Contact c : contacts) {
            contactJson = new JSONObject();
            contactJson.put("name", c.getName());
            contactJson.put("phonenumber", c.getPhone());
            contactJson.put("category", c.getCategory());
            
            // contactsListJson.put(contactJson);
        }
        return contactsListJson.toString();
    }


    public void Import(phonebook pb) {
        String content = "";
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            content += sc.nextLine();
        }
        sc.close();
        pb.contacts = deserialize(content);
    }
    public ArrayList<Contact> deserialize(String content) {
        ArrayList<Contact> contacts = new ArrayList<>();
        Contact.Builder builder = new Contact.Builder();
        JSONParser parser = new JSONParser();
        JSONObject contactJson = new JSONObject();
        JSONObject contactsListJson;
        try {
            contactsListJson = (JSONObject) parser.parse(content);
        } catch (org.json.simple.parser.ParseException e) {
            contactsListJson = null;
            e.printStackTrace();
        }

        Integer id = 1;
        while (contactJson != null) {
            contactJson = (JSONObject) contactsListJson.get(String.format("%d", id++));
            if (contactJson != null) {
                String name = (String) contactJson.get("name");
                String phonenumber = (String) contactJson.get("phonenumber");
                Contact.Builder contact = new Contact.Builder()
            .withName(name)
            .withphNumber(phonenumber)
            .withComment(content)
            .withCategory(null);
            }
        }
        return contacts;
    }
}
