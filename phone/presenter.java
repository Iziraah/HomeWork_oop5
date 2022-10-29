import java.io.IOException;
import java.text.ParseException;

public class presenter {
    
    private myModel myModel;
    private View view;

    public presenter(View view, String pathDb) throws IOException {
        this.view = view;
        this.myModel = new myModel();
    }
    
    public void buttonClick(){
        view.printPhonebook(myModel.getData());
    }
    public void bullonClick1(){
        view.printPhonebook(myModel.getPhonebook());
    }
    public void bullonClick2() throws IOException{
        myModel.Export();
    }
    public void buttonClick1() throws IOException, ParseException {
        myModel.Import();
    }
    public void buttonClick2(){
        Boolean isCmd = true;
        Integer pointer = 0;
        while (isCmd) {
            switch (view.menu()) {
                case "1":
                    if (pointer == myModel.getcontactList().size()) pointer = 0;
                    view.nextContact(myModel.getcontactList(), pointer++);
                break;
                case "2":
                    if (pointer < 0) pointer = myModel.getcontactList().size() - 1;
                    view.prevContact(myModel.getcontactList(), pointer--);
                break;
                default:
                    isCmd = false;
                break;
            }
        }
    }

    public void LoadFromFile() {
        // model.load();

        // if (model.currentBook().count() > 0) {
        //     model.setCurrentIndex(0);
        //     var contact = model.currentContact();

        //     view.setName(contact.name);
        //     view.setLastName(contact.lastName);
        //     view.setDescription(contact.description);
        // }
    }

    public void add() {
        // model.currentBook().add(
        //         new Contact(view.getFirstName(), view.getLastName(), view.getDescription()));
    }

    public void remove() {
        // Contact contact = new Contact(view.getFirstName(), view.getLastName(), view.getDescription());
        // model.currentBook().remove(contact);

        // if (model.currentBook().count() < 1) {
        //     model.setCurrentIndex(-1);

        //     view.setFirstName("");
        //     view.setLastName("");
        //     view.setDescription("");
        // } else {
        //     model.setCurrentIndex(model.getCurrentIndex() - 1);
        //     if (model.getCurrentIndex() < 0)
        //         model.setCurrentIndex(0);

        //     Contact temp = model.currentContact();
        //     view.setFirstName(temp.firstName);
        //     view.setLastName(temp.lastName);
        //     view.setDescription(temp.description);
        // }
    }

    public void saveToFile() {
        // model.save();
    }

    public void next() {
        // if (model.currentBook().count() > 0) {
        //     if (model.getCurrentIndex() + 1 < model.currentBook().count()) {
        //         model.setCurrentIndex(model.getCurrentIndex() + 1);
        //         Contact contact = model.currentContact();
        //         view.setFirstName(contact.firstName);
        //         view.setLastName(contact.lastName);
        //         view.setDescription(contact.description);                
        //     }
        // }
    }

    public void prev() {
        // if (model.currentBook().count() > 0) {
        //     if (model.getCurrentIndex() - 1 > -1) {
        //         model.setCurrentIndex(model.getCurrentIndex() - 1);
        //         Contact contact = model.currentContact();
        //         view.setFirstName(contact.firstName);
        //         view.setLastName(contact.lastName);
        //         view.setDescription(contact.description);  
        //     }
        // }
    }
}