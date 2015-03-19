package home.contact.dao.inpl;

import home.contact.dao.ContactDao;
import home.contact.model.Contact;

import java.util.*;

/**
 * Created by Aleksandr on 07.03.2015.
 */
public class ContactDaoImpl implements ContactDao {
    private List<Contact> contactlist;
//    private Map<Integer, Set<Contact>> listFriend = new HashMap<Integer, Set<Contact>>();
    //TODO излишне тут
    // private Set<Contact> contactFriendShipList;


    @Override
    public void addContact(Contact contact) {
        if (contactlist == null) contactlist = new ArrayList<Contact>();
        contactlist.add(contact);
        contact.setIdContact(contactlist.size() + 1);
        System.out.println("===============" + contact.getIdContact() + "============");
//        listFriend.put(contact.getIdContact(), new HashSet<Contact>());
    }

    @Override
    public void deleteContact(Contact contact) {
        contactlist.remove(contact.getIdContact() - 1);
    }

    @Override
    public void addFriendShip(Contact contactOne, Contact contactTwo) {
        //TODO Когда ты добавляешь дружбу для первогоконтакта - ты также должен добавить дружбу и второму
        //А метод get щ\здесь можно заменить на contains, в таком случае тебе не нужно сравнивать еще и с null
        Set<Contact> l = new HashSet<Contact>();
        l = contactOne.getFriends();
        l.add(contactTwo);
        l = contactTwo.getFriends();
        l.add(contactOne);
    }

    @Override
    public void removeFriendship(Contact contactOne, Contact contactTwo) {
        //TODO Аналогично и тут, удалять дружбу нужно у обоих
        //contactFriendShipList  = new HashSet<Contact>();
        Set<Contact> l = new HashSet<Contact>();
        l = contactOne.getFriends();
        l.remove(contactTwo);
        l = contactTwo.getFriends();
        l.remove(contactOne);
    }

    @Override
    public int countContact() {
        return contactlist.size();
    }

    @Override
    public String toString() {
        return "ContactDaoImpl{" +
                "contactlist=" + contactlist +
                '}';
    }

    public List<Contact> getContactlist() {
        return contactlist;
    }

    public void setContactlist(List<Contact> contactlist) {
        this.contactlist = contactlist;
    }
}

