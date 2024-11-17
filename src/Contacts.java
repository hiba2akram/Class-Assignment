

public class Contacts {
    private String name;
    private String  contactId;


     Contacts(String name, String contactId){
         this.name = name;
         this.contactId = contactId;
     }

    public String getContactId() {
        return contactId;
    }

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   public void displayContacts(){
       System.out.println("Contact ID: " + contactId + "Name: " + name);

    }






}
