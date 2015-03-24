package home.contact.service;

import home.contact.model.Contact;
import home.contact.model.Hobby;
import home.contact.model.Message;
import home.contact.model.Place;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

/**
 * Created by Aleksandr on 11.03.2015.
 */
public interface ContactService {

    public void createContact (String name, String lastName, LocalDate birthDay);
    public void createContact (String name, String lastName);
    public void addHobby(String description, String title);
    public void addPlace(String title , String description , double longitude, double latitude);
    public void addFriendShip (Contact name, Contact lastName);
    public Set<Contact> getFriendList(Contact contact);
    public List<Message> getConversation(Contact contact, Contact name );
    public List<Contact> getAllContact();
    public void addContact(Contact contact1);
    public void addPlace(Place dnepr);
    public Set<Hobby> getHobbyDaoImpl();
    public void deleteContact(Contact contact3);

    public int getIdContact(Contact contact1);
}
