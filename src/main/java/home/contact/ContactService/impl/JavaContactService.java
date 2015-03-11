package home.contact.ContactService.impl;

import home.contact.ContactService.InterfaceJavaContactService;
import home.contact.CoreMyCpring.Contact;
import home.contact.CoreMyCpring.MessageContact;
import home.contact.MyFilesDOT.inpl.ContactDao;
import home.contact.MyFilesDOT.inpl.HobbyDao;
import home.contact.MyFilesDOT.inpl.MessageDao;
import home.contact.MyFilesDOT.inpl.PlaceDao;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

/**
 * Created by Aleksandr on 07.03.2015.
 */
public class JavaContactService implements InterfaceJavaContactService {
    private ContactDao contactDao;
    private HobbyDao hobbyDao;
    private PlaceDao placeDao;
    private MessageDao messegeDao;

    @Override
    public void createContact(String name, String lastName, LocalDate birthDay) {

    }

    @Override
    public void addHobby(String description, String title) {

    }

    @Override
    public void addPlace(String description, String title, double longitude, double latitude) {

    }

    @Override
    public void addFriendShip(Contact name, Contact lastName) {

    }

    @Override
    public Set<Contact> getFriendList(Contact contact) {
        return null;
    }

    @Override
    public List<MessageContact> getConversation(Contact contact, Contact name) {
        return null;
    }


//
//    public void createContact (String name, String lastName, LocalDate birthDay){
//
//    }
//
//    public void addHobby(String description, String title){
//        hobbyDao = new HobbyDao();
//        Hobby hobby = new Hobby();
//        hobby.setDescription(description);
//        hobby.setTitle(title);
//        hobbyDao.addHobby(hobby);
//
//    }
//
//    @Override
//    public String toString() {
//        return "JavaContactService{" +
//                "contactDao=" + contactDao +
//                ", hobbyDao=" + hobbyDao +
//                ", placeDao=" + placeDao +
//                ", messegeDao=" + messegeDao +
//                '}';
//    }
//
//    public void addPlace(String description, String title, double longitude, double latitude){
//
//    }
//
//    public void addFriendShip (Contact name, Contact lastName){
//
//    }
//
//    public Set<Contact> getFriendList(Contact contact){
//        return null;
//    }
//
//
//    public List<MessageContact> getConversation(Contact contact, Contact name ){
//        return null;
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//    public ContactDao getContactDao() {
//        return contactDao;
//    }
//
//    public void setContactDao(ContactDao contactDao) {
//        this.contactDao = contactDao;
//    }
//
//    public HobbyDao getHobbyDao() {
//        return hobbyDao;
//    }
//
//    public void setHobbyDao(HobbyDao hobbyDao) {
//        this.hobbyDao = hobbyDao;
//    }
//
//    public PlaceDao getPlaceDao() {
//        return placeDao;
//    }
//
//    public void setPlaceDao(PlaceDao placeDao) {
//        this.placeDao = placeDao;
//    }
//
//    public MessageDao getMessegeDao() {
//        return messegeDao;
//    }
//
//    public void setMessegeDao(MessageDao messegeDao) {
//        this.messegeDao = messegeDao;
//    }


}
