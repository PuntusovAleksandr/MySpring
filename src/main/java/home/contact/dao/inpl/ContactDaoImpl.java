package home.contact.dao.inpl;

import home.contact.dao.ContactDao;
import home.contact.model.Contact;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Created by Aleksandr on 07.03.2015.
 */

@Component
public class ContactDaoImpl implements ContactDao {
    private List<Contact> contactlist;
    private  int id = 0;
    @Override
    public void addContact(Contact contact) {
        if (contactlist == null) contactlist = new ArrayList<Contact>();
        contactlist.add(contact);
        ++id;
        contact.setIdContact(id);
        System.out.println("===============" + contact.getIdContact() + "============");
    }

    @Override
    public void deleteContact(Contact contact) {
        contactlist.remove(contact);
    }

    @Override
    public void addFriendShip(Contact contactOne, Contact contactTwo) {
        Set<Contact> l = contactOne.getFriends();
        l.add(contactTwo);
        l = contactTwo.getFriends();
        l.add(contactOne);
    }

    @Override
    public void removeFriendship(Contact contactOne, Contact contactTwo) {
        Set<Contact> l = contactOne.getFriends();
        l.remove(contactTwo);
        l = contactTwo.getFriends();
        l.remove(contactOne);
    }

    @Override
    public int countContact() {
        return contactlist.size();
    }

    @Override
    public String toString() {
        return "ContactDaoImpl{" +
                "contactlist=" + contactlist +
                '}';
    }

    public List<Contact> getContactlist() {
        return contactlist;
    }

    @Override
    public int getIdContact(Contact contact) {
        return contact.getIdContact();
    }

    @Override
    public Set<Contact> getFriends(Contact contact) {
        return contact.getFriends();
    }

    public void setContactlist(List<Contact> contactlist) {
        this.contactlist = contactlist;
    }
}

