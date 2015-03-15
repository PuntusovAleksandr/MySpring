package home.contact.dao.inpl;

import home.contact.dao.InterfaceContactDao;
import home.contact.model.Contact;

import java.util.*;

/**
 * Created by Aleksandr on 07.03.2015.
 */
public class ContactDao implements InterfaceContactDao {
    private List<Contact> contactlist = new ArrayList<Contact>();
    private Map<Integer, Set<Contact>> listFriend = new HashMap<Integer, Set<Contact>>();
    private Set<Contact> contactFriendShipList;


    @Override
    public void addContact(Contact contact) {
        contactlist.add(contact);
        contact.setIdContact(contactlist.size() + 1);
        System.out.println("===============" + contact.getIdContact()+"============");
        listFriend.put(contact.getIdContact(), new HashSet<Contact>());
    }

    @Override
    public void deleteContact(Contact contact) {
        contactlist.remove(contact.getIdContact());
    }

    @Override
    public void addFriendShip(Contact contactOne, Contact contactTwo) {
            if ((listFriend.get(contactOne.getIdContact()))==null){
                contactFriendShipList = new HashSet<Contact>();
                contactFriendShipList.add(contactTwo);
                listFriend.put(contactOne.getIdContact(), contactFriendShipList);
            }else {
//                contactFriendShipList = new HashSet<>();
                contactFriendShipList = listFriend.get(contactOne.getIdContact());
                contactFriendShipList.add(contactTwo);
                listFriend.put(contactOne.getIdContact(), contactFriendShipList);
            }
    }

    @Override
    public void removeFriendship(Contact contactOne, Contact contactTwo) {
        contactFriendShipList  = new HashSet<Contact>();
        contactFriendShipList = listFriend.get(contactOne.getIdContact());
        contactFriendShipList.remove(contactTwo);
        listFriend.put(contactOne.getIdContact(), contactFriendShipList);
    }

    @Override
    public int countContact(){
        return contactlist.size();
    }

    @Override
    public String toString() {
        return "ContactDao{" +
                "contactlist=" + contactlist +
                ", listFriend=" + listFriend +
                ", contactFriendShipList=" + contactFriendShipList +
                '}';
    }

    public List<Contact> getContactlist() {
        return contactlist;
    }

    public void setContactlist(List<Contact> contactlist) {
        this.contactlist = contactlist;
    }

    public Map<Integer, Set<Contact>> getListFriend() {
        return listFriend;
    }

    public void setListFriend(Map<Integer, Set<Contact>> listFriend) {
        this.listFriend = listFriend;
    }

    public Set<Contact> getContactFriendShipList() {
        return contactFriendShipList;
    }

    public void setContactFriendShipList(Set<Contact> contactFriendShipList) {
        this.contactFriendShipList = contactFriendShipList;
    }
}
