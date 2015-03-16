package home.contact.dao;

import home.contact.model.Contact;

/**
 * Created by Aleksandr on 11.03.2015.
 */
public interface InterfaceContactDao {

    public void addContact(Contact contact);
    public void deleteContact(Contact contact);
    public void addFriendShip(Contact contactOne, Contact contactTwo);
    public void removeFriendship(Contact contactOne, Contact contactTwo);
    public int countContact();



}
