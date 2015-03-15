package home.contact.service.impl;

import home.contact.dao.inpl.ContactDao;
import home.contact.dao.inpl.HobbyDao;
import home.contact.dao.inpl.MessageDao;
import home.contact.dao.inpl.PlaceDao;
import home.contact.model.Contact;
import home.contact.model.Hobby;
import home.contact.model.MessageContact;
import home.contact.model.Place;
import home.contact.service.InterfaceJavaContactService;

import java.time.LocalDate;
import java.util.*;

/**
 * Created by Aleksandr on 07.03.2015.
 */
public class JavaContactService implements InterfaceJavaContactService {
    private ContactDao contactDao;
    private HobbyDao hobbyDao;
    private PlaceDao placeDao;
    private MessageDao messageDao;

    @Override
    public void createContact(String name, String lastName, LocalDate birthDay) {
        contactDao.addContact(new Contact(name, lastName, birthDay));
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
//        if (contactDao.getListFriend().containsKey(contact.getIdContact())){
        Map<Integer, Set<Contact>> map = new HashMap<Integer, Set<Contact>>();
        map = contactDao.getListFriend();
//            contactSet = contactDao.getListFriend().get(contact.getIdContact());
        contactSet = map.get(contact.getIdContact());
        System.out.println("+++++++++++++++ "+ contact.getIdContact()+"++++++++++++++++++++++++++");
//        }else {
//            System.out.println("List friend not found");
//        }
        return contactSet;
    }

    @Override
    public List<MessageContact> getConversation(Contact contactOne, Contact contactTwo) {
        return messageDao.getConversation(contactOne, contactTwo);
    }

    public ContactDao getContactDao() {
        return contactDao;
    }

    public void setContactDao(ContactDao contactDao) {
        this.contactDao = contactDao;
    }

    public HobbyDao getHobbyDao() {
        return hobbyDao;
    }

    public void setHobbyDao(HobbyDao hobbyDao) {
        this.hobbyDao = hobbyDao;
    }

    public PlaceDao getPlaceDao() {
        return placeDao;
    }

    public void setPlaceDao(PlaceDao placeDao) {
        this.placeDao = placeDao;
    }

    public MessageDao getMessegeDao() {
        return messageDao;
    }

    public void setMessegeDao(MessageDao messegeDao) {
        this.messageDao = messegeDao;
    }
}
