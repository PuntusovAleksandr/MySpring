package home.contact.service.impl;

import home.contact.dao.ContactDao;
import home.contact.dao.HobbyDao;
import home.contact.dao.MessageDao;
import home.contact.dao.PlaceDao;
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

	//TODO замени реализации тут на интерфейсы и работай через них - ?
    private ContactDao contactDao;
    private HobbyDao hobbyDao;
    private PlaceDao placeDao;
    private MessageDao messageDao;



    @Override
    public void createContact(String name, String lastName, LocalDate birthDay) {
        contactDao.addContact(new Contact(name, lastName, birthDay));
    }
    @Override
    public void createContact(String name, String lastName) {
        contactDao.addContact(new Contact(name, lastName));
    }

    @Override
    public void addHobby(String description, String title) {
        hobbyDao.addHobby(new Hobby(title, description));
    }

    @Override
    public void addPlace(String title, String description , double longitude, double latitude) {
        placeDao.addPlace(new Place(title , description,longitude, latitude ));
    }

    @Override
    public void addFriendShip(Contact contactOne, Contact contactTwo) {
        contactDao.addFriendShip(contactOne, contactTwo);
    }

    @Override
    public Set<Contact> getFriendList(Contact contact) {
        Set<Contact> contactSet = new HashSet<Contact>();
        contactSet = (Set<Contact>) contact.getFriends();
        return contactSet;
    }

    @Override
    public List<Message> getConversation(Contact contactOne, Contact contactTwo) {
        return messageDao.getConversation(contactOne, contactTwo);
    }



    public void setContactDaoImpl(ContactDaoImpl contactDaoImpl) {
        this.contactDao = contactDaoImpl;
    }

    public HobbyDaoImpl getHobbyDaoImpl() {
        return (HobbyDaoImpl) hobbyDao;
    }

    public void setHobbyDaoImpl(HobbyDaoImpl hobbyDaoImpl) {
        this.hobbyDao = hobbyDaoImpl;
    }

    public PlaceDaoImpl getPlaceDaoImpl() {
        return (PlaceDaoImpl) placeDao;
    }

    public void setPlaceDaoImpl(PlaceDaoImpl placeDaoImpl) {
        this.placeDao = placeDaoImpl;
    }

    public MessageDaoImpl getMessageDaoImpl() {
        return (MessageDaoImpl) messageDao;
    }

    public void setMessageDaoImpl(MessageDaoImpl messageDaoImpl) {
        this.messageDao = messageDaoImpl;
    }

    @Override
    public String toString() {
        return "JavaContactService{" +
                "contactDaoImpl=" + contactDao +
                ", hobbyDaoImpl=" + hobbyDao +
                ", placeDaoImpl=" + placeDao +
                ", messageDaoImpl=" + messageDao +
                '}';
    }
}
