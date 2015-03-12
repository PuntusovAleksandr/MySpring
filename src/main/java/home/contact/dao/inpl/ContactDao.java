package home.contact.dao.inpl;

import home.contact.model.Contact;
import home.contact.dao.InterfaceContactDao;

import java.util.*;

/**
 * Created by Aleksandr on 07.03.2015.
 */
public class ContactDao implements InterfaceContactDao {
    private List<Contact> contactlist = new ArrayList<Contact>();
    private List<List <Contact>> contactFriendShipList ;

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
    //сомнения по поводу этого метода
    public void addFriendShip(Contact contactOne, Contact contactTwo) {
        if (contactFriendShipList == null) contactFriendShipList = new ArrayList<List<Contact>>();
        for (int i = 0; i < contactlist.size(); i++) {

            if (contactFriendShipList.get(i).equals(contactOne)) {
                contactFriendShipList.get(i).add(contactTwo);

            }
        }
    }

    @Override
    //сомнения по поводу этого метода
    public void removeFriendship(Contact contactOne, Contact contactTwo) {
        if (contactFriendShipList == null) contactFriendShipList = new ArrayList<List<Contact>>();
        for (int i = 0; i < contactlist.size(); i++) {
            if (contactlist.get(i).equals(contactOne)) {
                for (int j = 0; j < contactFriendShipList.get(i).size(); j++) {
                    if (contactFriendShipList.get(i).get(j).getFirstName().equals(contactTwo)){
                        contactFriendShipList.get(i).remove(j);
                    }
                }
            }
        }
    }

    public int countContact(){
        return contactlist.size();
    }

    public void setContactlist(List<Contact> contactlist) {
        this.contactlist = contactlist;
    }

    public List<Contact> getContactlist() {
        return contactlist;
    }

    public List<List<Contact>> getContactFriendShipList() {
        return contactFriendShipList;
    }

    @Override
    public String toString() {
        return "ContactDao : " +
                "contactlist= " + contactlist +
                ", contactFriendShipList= " + contactFriendShipList;
    }
}
