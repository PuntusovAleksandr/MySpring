package home.contact.MyFilesDOT.inpl;

import home.contact.CoreMyCpring.Contact;
import home.contact.MyFilesDOT.InterfaceContactDao;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Aleksandr on 07.03.2015.
 */
public class ContactDao implements InterfaceContactDao {
    private List<Contact> contactlist = new ArrayList<Contact>();


    @Override
    public void addContact(Contact contact) {
        contactlist.add(contact);
    }

    @Override
    public void deleteContact(Contact contact) {
        for (int i = 0; i < contactlist.size(); i++) {
            if (contactlist.get(i).equals(contact)) contactlist.remove(i);
        }
    }

    @Override
    public void addFriendShip(Contact name, Contact nameFriend) {
        for (int i = 0; i <contactlist.size() ; i++) {

        }
    }

    @Override
    public void removeFriendship(Contact name, Contact nameFriend) {

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
