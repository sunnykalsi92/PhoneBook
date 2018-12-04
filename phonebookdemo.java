import java.util.ArrayList;

import javax.swing.JOptionPane;
public class phonebookdemo {

    /**
     * @param args
     */
    public static void main(String[] args) {
        phonebook myPhoneBook = new phonebook(null, null);
        ArrayList <phonebook> contact = new ArrayList<phonebook>();
        contact.add( new phonebook("Robert","555-555-555"));
        contact.add( new phonebook("Jim","478-124-7235"));
        contact.add( new phonebook("Greg", "478-454-7605"));
        contact.add( new phonebook("Greg", "478-454-7605"));
        contact.add( new phonebook("Greg", "478-454-7605"));

        for (int x = 0; x < contact.size(); x++){
    }

}
}