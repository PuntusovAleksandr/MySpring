package home.contact.service;

import home.contact.model.Contact;
import home.contact.model.MessageContact;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

/**
 * Created by Aleksandr on 11.03.2015.
 */
public interface InterfaceJavaContactService {

    public void createContact (String name, String lastName, LocalDate birthDay);
    public void addHobby(String description, String title);
    public void addPlace(String title , String description , double longitude, double latitude);
    public void addFriendShip (Contact name, Contact lastName);
    public Set<Contact> getFriendList(Contact contact);
    public List<MessageContact> getConversation(Contact contact, Contact name );

}
