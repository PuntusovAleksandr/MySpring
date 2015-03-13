package home.contact.dao;

import home.contact.model.Contact;
import home.contact.model.Hobby;

import java.util.Set;

/**
 * Created by Aleksandr on 11.03.2015.
 */
public interface InterfaceHobbyDao {
    public void addHobby(Hobby title);
    public Set<Contact> getAiiContactsWithHobby(Hobby title);
}
