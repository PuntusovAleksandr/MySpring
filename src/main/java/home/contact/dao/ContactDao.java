package home.contact.dao;

import home.contact.model.Contact;

import java.util.List;
import java.util.Set;

/**
 * Created by Aleksandr on 11.03.2015.
 */
public interface ContactDao {

    public void addContact(Contact contact);
    public void deleteContact(Contact contact);
    public void addFriendShip(Contact contactOne, Contact contactTwo);
    public void removeFriendship(Contact contactOne, Contact contactTwo);
    public int countContact();


    public List<Contact> getContactlist();

    public int getIdContact(Contact contact);

    public Set<Contact> getFriends(Contact contact);
}
