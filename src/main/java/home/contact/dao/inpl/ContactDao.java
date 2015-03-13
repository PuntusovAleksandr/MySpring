package home.contact.dao.inpl;

import home.contact.model.Contact;
import home.contact.dao.InterfaceContactDao;

import java.util.*;

/**
 * Created by Aleksandr on 07.03.2015.
 */
public class ContactDao implements InterfaceContactDao {
    private List<Contact> contactlist = new ArrayList<Contact>();
    private Map<String, Set<Contact>> listFriend;
    private Set<Contact> contactFriendShipList;

    @Override
    public void addContact(Contact contact) {
        contactlist.add(contact);
    }

    @Override
    public void deleteContact(Contact contact) {
        for (int i = 0; i < contactlist.size(); i++) {
            if (contactlist.get(i).equals(contact)) contactlist.remove(i);
        }
    }

    @Override
    public void addFriendShip(Contact contactOne, Contact contactTwo) {
        String idContact = contactOne.getFirstName()+contactOne.getLastName();
        if (listFriend==null) {
            listFriend = new HashMap<String, Set<Contact>>();
            contactFriendShipList = new HashSet<Contact>();
            contactFriendShipList.add(contactTwo);
            listFriend.put(idContact, contactFriendShipList);
        } else {
            for (Map.Entry entry : listFriend.entrySet()){
                if (entry.getKey().equals(idContact)){
                    if (contactFriendShipList == null) contactFriendShipList = new HashSet<Contact>();
                        contactFriendShipList.add(contactTwo);
                }else {
                    contactFriendShipList = new HashSet<Contact>();
                    contactFriendShipList.add(contactTwo);
                    listFriend.put(idContact, contactFriendShipList);
                    break;
                }
            }
        }
    }

    @Override
    public void removeFriendship(Contact contactOne, Contact contactTwo) {
        String idContact = contactOne.getFirstName()+contactOne.getLastName();
        if (listFriend==null) System.out.println("Contact not found! ");
        for (int i = 0; i < listFriend.size(); i++) {
            if (listFriend.get(i).equals(contactOne)) listFriend.remove(i);
        }
    }

    @Override
    public int countContact(){
        return contactlist.size();
    }

    public void setContactlist(List<Contact> contactlist) {
        this.contactlist = contactlist;
    }

    public List<Contact> getContactlist() {
        return contactlist;
    }

    public Map<String, Set<Contact>> getListFriend() {
        return listFriend;
    }

    public void setListFriend(Map<String, Set<Contact>> listFriend) {
        this.listFriend = listFriend;
    }

    public Set<Contact> getContactFriendShipList() {
        return contactFriendShipList;
    }

    public void setContactFriendShipList(Set<Contact> contactFriendShipList) {
        this.contactFriendShipList = contactFriendShipList;
    }

    @Override
    public String toString() {
        return "ContactDao{" +
                "contactlist=" + contactlist +
                ", listFriend=" + listFriend +
                ", contactFriendShipList=" + contactFriendShipList +
                '}';
    }
}
