public class Contact {
    String name;
    String phNumber;
    String comment;
    Contact.category category;

    enum category{
        FAMILY,
        WORK,
        FRIEND,
        ANOTHER
    }

    protected void Contact(String name, String phNumber, String comment, category category) {
        this.name = name;
        this.phNumber = phNumber;
        this.comment = comment;
        this.category = category;
    }
    public static class Builder {
        private Contact newContact;
    
        public Builder() {
            newContact = new Contact();
        }
        public Builder withName(String name){
            newContact.name = name;
            return this;
        }
        public Builder withphNumber(String phNumber){
            newContact.phNumber = phNumber;
            return this;
        }
        public Builder withComment(String comment){
            newContact.comment = comment;
            return this;
        }
        public Builder withCategory(category category){
            newContact.category = category;
            return this;
        }
        }
        // public String setName(){

        // }
        public String getPhone() {
            return phNumber;
        }
        public String getName(){
            return name;
        }
        public Contact.category getCategory(){
            return category;
        }
    }

