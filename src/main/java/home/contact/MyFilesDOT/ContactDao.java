package home.contact.MyFilesDOT;

import home.contact.CoreMyCpring.Contact;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aleksandr on 07.03.2015.
 */
public class ContactDao {
    private List<Contact> contactlist = new ArrayList<Contact>();

    public void addContact(Contact contact){
        contactlist.add(contact);
    }

    public void deleteContact(Contact contact){
        for (int i = 0; i < contactlist.size(); i++) {
            if (contactlist.get(i).equals(contact)) contactlist.remove(i);
        }
    }

    public void addFriendShip(Contact name, Contact nameFriend){

    }

    public void removeFriendship(Contact name, Contact nameFriend){

    }

    public int countContact(){
        return contactlist.size();
    }

    public void setContactlist(List<Contact> contactlist) {
        this.contactlist = contactlist;
    }

    @Override
    public String toString() {
        return "ContactDaoList=\n" + contactlist;
    }
}
