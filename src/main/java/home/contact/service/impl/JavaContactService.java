package home.contact.service.impl;

import home.contact.dao.inpl.ContactDaoImpl;
import home.contact.dao.inpl.HobbyDaoImpl;
import home.contact.dao.inpl.MessageDaoImpl;
import home.contact.dao.inpl.PlaceDaoImpl;
import home.contact.model.Contact;
import home.contact.model.Hobby;
import home.contact.model.Message;
import home.contact.model.Place;
import home.contact.service.ContactService;

import java.time.LocalDate;
import java.util.*;

/**
 * Created by Aleksandr on 07.03.2015.
 */
public class JavaContactService implements ContactService {

	//TODO замени реализации тут на интерфейсы и работай через них - ? не понял что надо делать - через xml?
    private ContactDaoImpl contactDaoImpl;
    private HobbyDaoImpl hobbyDaoImpl;
    private PlaceDaoImpl placeDaoImpl;
    private MessageDaoImpl messageDaoImpl;



    @Override
    public void createContact(String name, String lastName, LocalDate birthDay) {
        contactDaoImpl.addContact(new Contact(name, lastName, birthDay));
    }

    @Override
    public void addHobby(String description, String title) {
        hobbyDaoImpl.addHobby(new Hobby(title, description));
    }

    @Override
    public void addPlace(String title, String description , double longitude, double latitude) {
        placeDaoImpl.addPlace(new Place(title , description,longitude, latitude ));
    }

    @Override
    public void addFriendShip(Contact contactOne, Contact contactTwo) {
        contactDaoImpl.addFriendShip(contactOne, contactTwo);
    }

    @Override
    public Set<Contact> getFriendList(Contact contact) {
        Set<Contact> contactSet = new HashSet<Contact>();
        contactSet = (Set<Contact>) contact.getFriends();
        return contactSet;
    }

    @Override
    public List<Message> getConversation(Contact contactOne, Contact contactTwo) {
        return messageDaoImpl.getConversation(contactOne, contactTwo);
    }

    public ContactDaoImpl getContactDaoImpl() {
        return contactDaoImpl;
    }

    public void setContactDaoImpl(ContactDaoImpl contactDaoImpl) {
        this.contactDaoImpl = contactDaoImpl;
    }

    public HobbyDaoImpl getHobbyDaoImpl() {
        return hobbyDaoImpl;
    }

    public void setHobbyDaoImpl(HobbyDaoImpl hobbyDaoImpl) {
        this.hobbyDaoImpl = hobbyDaoImpl;
    }

    public PlaceDaoImpl getPlaceDaoImpl() {
        return placeDaoImpl;
    }

    public void setPlaceDaoImpl(PlaceDaoImpl placeDaoImpl) {
        this.placeDaoImpl = placeDaoImpl;
    }

    public MessageDaoImpl getMessageDaoImpl() {
        return messageDaoImpl;
    }

    public void setMessageDaoImpl(MessageDaoImpl messageDaoImpl) {
        this.messageDaoImpl = messageDaoImpl;
    }
}
